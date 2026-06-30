package a2;

/* loaded from: classes14.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a2.d f687a = new a2.d("", null, null, 6, null);

    public static final java.util.List a(java.util.List list, int i17, int i18) {
        if (!(i17 <= i18)) {
            throw new java.lang.IllegalArgumentException(("start (" + i17 + ") should be less than or equal to end (" + i18 + ')').toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i19 = 0; i19 < size; i19++) {
            java.lang.Object obj = list.get(i19);
            a2.c cVar = (a2.c) obj;
            if (b(i17, i18, cVar.f676b, cVar.f677c)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i27 = 0; i27 < size2; i27++) {
            a2.c cVar2 = (a2.c) arrayList.get(i27);
            arrayList2.add(new a2.c(cVar2.f675a, java.lang.Math.max(i17, cVar2.f676b) - i17, java.lang.Math.min(i18, cVar2.f677c) - i17, cVar2.f678d));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if ((r6 == r7) == (r4 == r5)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        if ((r4 == r5) == (r6 == r7)) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 1
            if (r0 < r1) goto L3c
            r0 = 0
            if (r4 > r6) goto L20
            if (r7 > r5) goto L20
            if (r5 != r7) goto L1e
            if (r6 != r7) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r0
        L17:
            if (r4 != r5) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r0
        L1c:
            if (r1 != r3) goto L20
        L1e:
            r1 = r2
            goto L21
        L20:
            r1 = r0
        L21:
            if (r1 != 0) goto L3c
            if (r6 > r4) goto L37
            if (r5 > r7) goto L37
            if (r7 != r5) goto L35
            if (r4 != r5) goto L2d
            r4 = r2
            goto L2e
        L2d:
            r4 = r0
        L2e:
            if (r6 != r7) goto L32
            r5 = r2
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != r5) goto L37
        L35:
            r4 = r2
            goto L38
        L37:
            r4 = r0
        L38:
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.e.b(int, int, int, int):boolean");
    }
}
