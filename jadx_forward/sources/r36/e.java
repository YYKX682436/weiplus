package r36;

/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final x36.k f450907a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f450909c;

    /* renamed from: b, reason: collision with root package name */
    public int f450908b = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public r36.c[] f450911e = new r36.c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f450912f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f450913g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f450914h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f450910d = 4096;

    public e(x36.k kVar) {
        this.f450907a = kVar;
    }

    public final int a(int i17) {
        int i18;
        int i19 = 0;
        if (i17 > 0) {
            int length = this.f450911e.length;
            while (true) {
                length--;
                i18 = this.f450912f;
                if (length < i18 || i17 <= 0) {
                    break;
                }
                int i27 = this.f450911e[length].f450889c;
                i17 -= i27;
                this.f450914h -= i27;
                this.f450913g--;
                i19++;
            }
            r36.c[] cVarArr = this.f450911e;
            java.lang.System.arraycopy(cVarArr, i18 + 1, cVarArr, i18 + 1 + i19, this.f450913g);
            r36.c[] cVarArr2 = this.f450911e;
            int i28 = this.f450912f;
            java.util.Arrays.fill(cVarArr2, i28 + 1, i28 + 1 + i19, (java.lang.Object) null);
            this.f450912f += i19;
        }
        return i19;
    }

    public final void b(r36.c cVar) {
        int i17 = cVar.f450889c;
        int i18 = this.f450910d;
        if (i17 > i18) {
            java.util.Arrays.fill(this.f450911e, (java.lang.Object) null);
            this.f450912f = this.f450911e.length - 1;
            this.f450913g = 0;
            this.f450914h = 0;
            return;
        }
        a((this.f450914h + i17) - i18);
        int i19 = this.f450913g + 1;
        r36.c[] cVarArr = this.f450911e;
        if (i19 > cVarArr.length) {
            r36.c[] cVarArr2 = new r36.c[cVarArr.length * 2];
            java.lang.System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f450912f = this.f450911e.length - 1;
            this.f450911e = cVarArr2;
        }
        int i27 = this.f450912f;
        this.f450912f = i27 - 1;
        this.f450911e[i27] = cVar;
        this.f450913g++;
        this.f450914h += i17;
    }

    public void c(x36.o oVar) {
        r36.j0.f450964d.getClass();
        long j17 = 0;
        long j18 = 0;
        for (int i17 = 0; i17 < oVar.l(); i17++) {
            j18 += r36.j0.f450963c[oVar.o(i17) & 255];
        }
        int i18 = (int) ((j18 + 7) >> 3);
        int l17 = oVar.l();
        x36.k kVar = this.f450907a;
        if (i18 >= l17) {
            e(oVar.l(), 127, 0);
            kVar.x(oVar);
            return;
        }
        x36.k kVar2 = new x36.k();
        r36.j0.f450964d.getClass();
        int i19 = 0;
        for (int i27 = 0; i27 < oVar.l(); i27++) {
            int o17 = oVar.o(i27) & 255;
            int i28 = r36.j0.f450962b[o17];
            byte b17 = r36.j0.f450963c[o17];
            j17 = (j17 << b17) | i28;
            i19 += b17;
            while (i19 >= 8) {
                i19 -= 8;
                kVar2.e((int) (j17 >> i19));
            }
        }
        if (i19 > 0) {
            kVar2.e((int) ((j17 << (8 - i19)) | (255 >>> i19)));
        }
        x36.o l18 = kVar2.l();
        e(l18.l(), 127, 128);
        kVar.x(l18);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.e.d(java.util.List):void");
    }

    public void e(int i17, int i18, int i19) {
        x36.k kVar = this.f450907a;
        if (i17 < i18) {
            kVar.F(i17 | i19);
            return;
        }
        kVar.F(i19 | i18);
        int i27 = i17 - i18;
        while (i27 >= 128) {
            kVar.F(128 | (i27 & 127));
            i27 >>>= 7;
        }
        kVar.F(i27);
    }
}
