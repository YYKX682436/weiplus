package yv1;

/* loaded from: classes12.dex */
public final class n0 implements bw1.k, c01.fa {

    /* renamed from: d, reason: collision with root package name */
    public final int f547646d;

    /* renamed from: e, reason: collision with root package name */
    public final c01.e8 f547647e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f547648f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer[] f547649g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f547650h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f547651i;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f547652m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f547653n;

    public n0(int i17, c01.e8 e8Var, boolean z17) {
        this.f547646d = i17;
        this.f547647e = e8Var;
        this.f547648f = z17;
        java.lang.Integer[] numArr = {3, 5, 1, 1};
        this.f547649g = numArr;
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i18 = 0; i18 < length; i18++) {
            iArr[i18] = this.f547646d;
        }
        this.f547650h = iArr;
        this.f547651i = new int[this.f547649g.length];
    }

    @Override // bw1.k
    public void K2(int i17, int i18) {
        this.f547651i[0] = i17;
        this.f547650h[0] = i18;
        a();
    }

    @Override // bw1.k
    public void Y4() {
    }

    public final void a() {
        c01.e8 e8Var = this.f547647e;
        if (e8Var == null) {
            return;
        }
        java.lang.Integer[] numArr = this.f547649g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numArr, "<this>");
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Integer num : numArr) {
            i18 += num.intValue();
        }
        long j17 = 1000;
        long j18 = i18 * 1000;
        int length = this.f547651i.length;
        long j19 = 0;
        while (i17 < length) {
            int i19 = this.f547650h[i17];
            j19 += i19 <= 0 ? numArr[i17].intValue() * j17 : ((r2[i17] * j17) / i19) * numArr[i17].intValue();
            i17++;
            j17 = 1000;
        }
        e8Var.b((int) j19, (int) j18);
    }

    @Override // c01.fa
    public void b(int i17, int i18) {
        this.f547651i[1] = i17;
        this.f547650h[1] = i18;
        a();
    }

    @Override // c01.fa
    public void d(boolean z17, int i17) {
        this.f547653n = i17;
        if (z17 || !this.f547648f) {
            return;
        }
        aw1.l1.f96121d.a();
    }

    @Override // bw1.k
    public void j6(boolean z17, long j17) {
        this.f547652m = j17;
        if (!z17 && this.f547648f) {
            com.p314xaae8f345.mm.vfs.w6.f("wcf://image2/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://video/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://voice2/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://attachment/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://record/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://c2c/");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Done delete files");
    }
}
