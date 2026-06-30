package wc2;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f526030a;

    /* renamed from: b, reason: collision with root package name */
    public int f526031b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f526034e = false;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f526032c = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f526033d = new android.util.SparseArray();

    public a(int i17, int i18) {
        this.f526030a = i17;
        this.f526031b = i18;
    }

    public final void a(wc2.b bVar, android.graphics.Point point, int i17) {
        bVar.f526035a++;
        bVar.f526036b += point.x;
        int i18 = point.y;
        int i19 = bVar.f526037c;
        if (i18 > i19) {
            i19 = i18;
        }
        bVar.f526037c = i19;
        if (i18 == i19) {
            bVar.f526038d = i17;
        }
    }

    public void b(int i17, int i18) {
        if (g()) {
            c(i17);
            int i19 = i17 + i18;
            android.util.SparseArray sparseArray = this.f526032c;
            if (i19 > sparseArray.size()) {
                i18 = sparseArray.size() - i17;
            }
            for (int i27 = 0; i27 < i18; i27++) {
                sparseArray.remove(i17 + i27);
            }
            e();
        }
    }

    public final void c(int i17) {
        if (this.f526034e) {
            return;
        }
        int d17 = d(i17);
        android.util.SparseArray sparseArray = this.f526033d;
        wc2.b bVar = (wc2.b) sparseArray.get(d17, null);
        if (bVar == null && sparseArray.size() > 0) {
            sparseArray.remove(sparseArray.size() - 1);
        }
        while (bVar != null) {
            sparseArray.remove(d17);
            d17++;
            bVar = (wc2.b) sparseArray.get(d17, null);
        }
    }

    public int d(int i17) {
        if (!g()) {
            return -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f526033d;
            if (i18 >= sparseArray.size()) {
                return -1;
            }
            i19 += ((wc2.b) sparseArray.get(i18)).f526035a;
            if (i19 >= i17 + 1) {
                return i18;
            }
            i18++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r11 = this;
            boolean r0 = r11.g()
            if (r0 == 0) goto La9
            boolean r0 = r11.f526034e
            if (r0 == 0) goto Lc
            goto La9
        Lc:
            r0 = 0
            r1 = r0
            r2 = r1
        Lf:
            android.util.SparseArray r3 = r11.f526033d
            int r4 = r3.size()
            if (r1 >= r4) goto L23
            java.lang.Object r3 = r3.get(r1)
            wc2.b r3 = (wc2.b) r3
            int r3 = r3.f526035a
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L23:
            android.util.SparseArray r1 = r11.f526032c
            int r4 = r1.size()
            if (r2 < r4) goto L2c
            r2 = -1
        L2c:
            r4 = 0
            java.lang.Object r5 = r1.get(r2, r4)
            android.graphics.Point r5 = (android.graphics.Point) r5
            int r6 = r3.size()
            boolean r7 = r11.g()
            if (r7 != 0) goto L3f
        L3d:
            r7 = r4
            goto L50
        L3f:
            int r7 = r11.d(r2)
            boolean r8 = r11.g()
            if (r8 != 0) goto L4a
            goto L3d
        L4a:
            java.lang.Object r7 = r3.get(r7, r4)
            wc2.b r7 = (wc2.b) r7
        L50:
            if (r7 != 0) goto L58
            wc2.b r7 = new wc2.b
            r7.<init>()
            goto L5c
        L58:
            int r6 = r11.d(r2)
        L5c:
            int r8 = r7.f526036b
        L5e:
            if (r5 == 0) goto La2
            int r9 = r5.x
            int r8 = r8 + r9
            r9 = 1
            int r0 = r0 + r9
            int r10 = r11.f526031b
            if (r8 > r10) goto L87
            int r10 = r11.f526030a
            if (r10 <= 0) goto L83
            if (r0 <= r10) goto L7f
            r3.put(r6, r7)
            wc2.b r0 = new wc2.b
            r0.<init>()
            r11.a(r0, r5, r2)
            int r6 = r6 + 1
            int r5 = r5.x
            goto L96
        L7f:
            r11.a(r7, r5, r2)
            goto L99
        L83:
            r11.a(r7, r5, r2)
            goto L99
        L87:
            r3.put(r6, r7)
            wc2.b r0 = new wc2.b
            r0.<init>()
            r11.a(r0, r5, r2)
            int r6 = r6 + 1
            int r5 = r5.x
        L96:
            r7 = r0
            r8 = r5
            r0 = r9
        L99:
            int r2 = r2 + 1
            java.lang.Object r5 = r1.get(r2, r4)
            android.graphics.Point r5 = (android.graphics.Point) r5
            goto L5e
        La2:
            int r0 = r7.f526035a
            if (r0 <= 0) goto La9
            r3.append(r6, r7)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc2.a.e():void");
    }

    public void f(int i17, android.graphics.Point point) {
        if (g()) {
            android.util.SparseArray sparseArray = this.f526032c;
            if (sparseArray.get(i17, null) == null) {
                c(i17);
                sparseArray.put(i17, point);
                e();
            } else {
                if (((android.graphics.Point) sparseArray.get(i17)).equals(point)) {
                    return;
                }
                c(i17);
                sparseArray.put(i17, point);
                e();
            }
        }
    }

    public boolean g() {
        return this.f526031b > 0;
    }
}
