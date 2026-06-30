package kl;

/* loaded from: classes13.dex */
public abstract class e implements kl.k {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.Object f390242o = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f390243a;

    /* renamed from: b, reason: collision with root package name */
    public kl.l f390244b;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f390254l;

    /* renamed from: n, reason: collision with root package name */
    public kl.l f390256n;

    /* renamed from: c, reason: collision with root package name */
    public int f390245c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f390246d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f390247e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f390248f = 44100;

    /* renamed from: g, reason: collision with root package name */
    public int f390249g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f390250h = 2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f390251i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f390252j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f390253k = false;

    /* renamed from: m, reason: collision with root package name */
    public byte[][] f390255m = new byte[2];

    public e(int i17) {
        this.f390243a = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // kl.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] a(byte[] r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.e.a(byte[]):byte[]");
    }

    @Override // kl.k
    public void b() {
    }

    @Override // kl.k
    public hl.e c(int i17) {
        return null;
    }

    @Override // kl.k
    public void d() {
    }

    public kl.l e() {
        return kl.c.a(this.f390243a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if (r13 != 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] f(byte[] r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.e.f(byte[]):byte[]");
    }

    public void g(int i17, int i18, int i19) {
        synchronized (this) {
            int i27 = this.f390245c;
            this.f390245c = i17;
            this.f390246d = i18;
            this.f390247e = i19;
            if (this.f390248f != i17) {
                kl.l lVar = this.f390244b;
                if (lVar == null) {
                    kl.l e17 = e();
                    this.f390244b = e17;
                    e17.b(this.f390254l, this.f390245c, this.f390247e, this.f390248f, this.f390250h);
                } else if (lVar != null && i27 != i17) {
                    lVar.mo143609x41012807();
                    kl.l e18 = e();
                    this.f390244b = e18;
                    e18.b(this.f390254l, this.f390245c, this.f390247e, this.f390248f, this.f390250h);
                }
                if (this.f390246d == 2 && this.f390249g == 2) {
                    kl.l lVar2 = this.f390256n;
                    if (lVar2 == null) {
                        kl.l e19 = e();
                        this.f390256n = e19;
                        e19.b(this.f390254l + "RResample", this.f390245c, this.f390247e, this.f390248f, this.f390250h);
                    } else if (lVar2 != null && i27 != this.f390245c) {
                        lVar2.mo143609x41012807();
                        kl.l e27 = e();
                        this.f390256n = e27;
                        e27.b(this.f390254l + "RResample", this.f390245c, this.f390247e, this.f390248f, this.f390250h);
                    }
                }
                this.f390253k = true;
            } else {
                this.f390253k = false;
                kl.l lVar3 = this.f390244b;
                if (lVar3 != null) {
                    lVar3.mo143609x41012807();
                    this.f390244b = null;
                }
            }
            if (this.f390250h != this.f390247e) {
                this.f390252j = true;
            }
            if (this.f390249g != this.f390246d) {
                this.f390251i = true;
            }
        }
    }

    @Override // kl.k
    /* renamed from: release */
    public void mo143607x41012807() {
        synchronized (this) {
            kl.l lVar = this.f390244b;
            if (lVar != null) {
                lVar.mo143609x41012807();
                this.f390244b = null;
            }
            kl.l lVar2 = this.f390256n;
            if (lVar2 != null) {
                lVar2.mo143609x41012807();
                this.f390256n = null;
            }
        }
    }
}
