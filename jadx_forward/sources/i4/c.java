package i4;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Comparator f369865f = new i4.a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f369866a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f369867b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f369868c;

    /* renamed from: d, reason: collision with root package name */
    public final i4.g[] f369869d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f369870e = new float[3];

    public c(int[] iArr, int i17, i4.g[] gVarArr) {
        i4.b bVar;
        this.f369869d = gVarArr;
        int[] iArr2 = new int[32768];
        this.f369867b = iArr2;
        int i18 = 0;
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i27 = iArr[i19];
            int b17 = b(android.graphics.Color.blue(i27), 8, 5) | (b(android.graphics.Color.red(i27), 8, 5) << 10) | (b(android.graphics.Color.green(i27), 8, 5) << 5);
            iArr[i19] = b17;
            iArr2[b17] = iArr2[b17] + 1;
        }
        int i28 = 0;
        for (int i29 = 0; i29 < 32768; i29++) {
            if (iArr2[i29] > 0) {
                int rgb = android.graphics.Color.rgb(b((i29 >> 10) & 31, 5, 8), b((i29 >> 5) & 31, 5, 8), b(i29 & 31, 5, 8));
                float[] fArr = this.f369870e;
                java.lang.ThreadLocal threadLocal = e3.b.f328575a;
                e3.b.a(android.graphics.Color.red(rgb), android.graphics.Color.green(rgb), android.graphics.Color.blue(rgb), fArr);
                if (c(rgb, fArr)) {
                    iArr2[i29] = 0;
                }
            }
            if (iArr2[i29] > 0) {
                i28++;
            }
        }
        int[] iArr3 = new int[i28];
        this.f369866a = iArr3;
        int i37 = 0;
        for (int i38 = 0; i38 < 32768; i38++) {
            if (iArr2[i38] > 0) {
                iArr3[i37] = i38;
                i37++;
            }
        }
        if (i28 <= i17) {
            this.f369868c = new java.util.ArrayList();
            while (i18 < i28) {
                int i39 = iArr3[i18];
                ((java.util.ArrayList) this.f369868c).add(new i4.i(android.graphics.Color.rgb(b((i39 >> 10) & 31, 5, 8), b((i39 >> 5) & 31, 5, 8), b(i39 & 31, 5, 8)), iArr2[i39]));
                i18++;
            }
            return;
        }
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(i17, f369865f);
        priorityQueue.offer(new i4.b(this, 0, this.f369866a.length - 1));
        while (priorityQueue.size() < i17 && (bVar = (i4.b) priorityQueue.poll()) != null) {
            int i47 = bVar.f369856b;
            int i48 = bVar.f369855a;
            if (((i47 + 1) - i48 > 1 ? 1 : i18) == 0) {
                break;
            }
            if (((i47 + 1) - i48 > 1 ? 1 : i18) == 0) {
                throw new java.lang.IllegalStateException("Can not split a box with only 1 color");
            }
            int i49 = bVar.f369859e - bVar.f369858d;
            int i57 = bVar.f369861g - bVar.f369860f;
            int i58 = bVar.f369863i - bVar.f369862h;
            int i59 = (i49 < i57 || i49 < i58) ? (i57 < i49 || i57 < i58) ? -1 : -2 : -3;
            i4.c cVar = bVar.f369864j;
            int[] iArr4 = cVar.f369866a;
            a(iArr4, i59, i48, i47);
            java.util.Arrays.sort(iArr4, i48, bVar.f369856b + 1);
            a(iArr4, i59, i48, bVar.f369856b);
            int i66 = bVar.f369857c / 2;
            int i67 = i18;
            int i68 = i48;
            while (true) {
                int i69 = bVar.f369856b;
                if (i68 <= i69) {
                    i67 += cVar.f369867b[iArr4[i68]];
                    if (i67 >= i66) {
                        i48 = java.lang.Math.min(i69 - 1, i68);
                        break;
                    }
                    i68++;
                }
            }
            i4.b bVar2 = new i4.b(cVar, i48 + 1, bVar.f369856b);
            bVar.f369856b = i48;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
            i18 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(priorityQueue.size());
        java.util.Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            i4.b bVar3 = (i4.b) it.next();
            i4.c cVar2 = bVar3.f369864j;
            int[] iArr5 = cVar2.f369866a;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            int i79 = 0;
            for (int i86 = bVar3.f369855a; i86 <= bVar3.f369856b; i86++) {
                int i87 = iArr5[i86];
                int i88 = cVar2.f369867b[i87];
                i77 += i88;
                i76 += ((i87 >> 10) & 31) * i88;
                i78 += ((i87 >> 5) & 31) * i88;
                i79 += i88 * (i87 & 31);
            }
            float f17 = i77;
            i4.i iVar = new i4.i(android.graphics.Color.rgb(b(java.lang.Math.round(i76 / f17), 5, 8), b(java.lang.Math.round(i78 / f17), 5, 8), b(java.lang.Math.round(i79 / f17), 5, 8)), i77);
            if (!c(iVar.f369882d, iVar.b())) {
                arrayList.add(iVar);
            }
        }
        this.f369868c = arrayList;
    }

    public static void a(int[] iArr, int i17, int i18, int i19) {
        if (i17 == -2) {
            while (i18 <= i19) {
                int i27 = iArr[i18];
                iArr[i18] = (i27 & 31) | (((i27 >> 5) & 31) << 10) | (((i27 >> 10) & 31) << 5);
                i18++;
            }
            return;
        }
        if (i17 != -1) {
            return;
        }
        while (i18 <= i19) {
            int i28 = iArr[i18];
            iArr[i18] = ((i28 >> 10) & 31) | ((i28 & 31) << 10) | (((i28 >> 5) & 31) << 5);
            i18++;
        }
    }

    public static int b(int i17, int i18, int i19) {
        return (i19 > i18 ? i17 << (i19 - i18) : i17 >> (i18 - i19)) & ((1 << i19) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[LOOP:0: B:6:0x000a->B:25:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r7, float[] r8) {
        /*
            r6 = this;
            r7 = 0
            i4.g[] r0 = r6.f369869d
            if (r0 == 0) goto L54
            int r1 = r0.length
            if (r1 <= 0) goto L54
            int r1 = r0.length
            r2 = r7
        La:
            if (r2 >= r1) goto L54
            r3 = r0[r2]
            i4.d r3 = (i4.d) r3
            r3.getClass()
            r3 = 2
            r3 = r8[r3]
            r4 = 1064514355(0x3f733333, float:0.95)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 1
            if (r4 < 0) goto L20
            r4 = r5
            goto L21
        L20:
            r4 = r7
        L21:
            if (r4 != 0) goto L4d
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L2c
            r3 = r5
            goto L2d
        L2c:
            r3 = r7
        L2d:
            if (r3 != 0) goto L4d
            r3 = r8[r7]
            r4 = 1092616192(0x41200000, float:10.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L48
            r4 = 1108606976(0x42140000, float:37.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L48
            r3 = r8[r5]
            r4 = 1062333317(0x3f51eb85, float:0.82)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L48
            r3 = r5
            goto L49
        L48:
            r3 = r7
        L49:
            if (r3 != 0) goto L4d
            r3 = r5
            goto L4e
        L4d:
            r3 = r7
        L4e:
            if (r3 != 0) goto L51
            return r5
        L51:
            int r2 = r2 + 1
            goto La
        L54:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.c.c(int, float[]):boolean");
    }
}
