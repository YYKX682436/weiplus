package lf4;

/* loaded from: classes4.dex */
public final class g implements cf4.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final cf4.b f399927d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f399928e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f399929f;

    /* renamed from: g, reason: collision with root package name */
    public long f399930g;

    /* renamed from: h, reason: collision with root package name */
    public long f399931h;

    /* renamed from: i, reason: collision with root package name */
    public long f399932i;

    /* renamed from: m, reason: collision with root package name */
    public int f399933m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f399934n;

    public g(cf4.b view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f399927d = view;
        this.f399928e = "";
        this.f399929f = new java.util.LinkedHashMap();
    }

    public final void a(long j17) {
        ef4.v vVar = ef4.w.f334001t;
        nf4.l i17 = vVar.i();
        vVar.j();
        java.lang.String userName = this.f399928e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        long b17 = i17.b1(j17, 30);
        this.f399932i = b17;
        long j18 = this.f399930g;
        if (j18 != 0) {
            if (b17 >= j18) {
                b17 = j18;
            }
            this.f399932i = b17;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ff4.d) {
            ff4.d dVar = (ff4.d) m1Var;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(dVar.f343204d, this.f399928e)) {
                boolean z17 = i18 == 314 || i18 == 315;
                this.f399934n = z17;
                if (z17) {
                    qf4.f fVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae) this.f399927d).f253404g;
                    if (fVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStoryAlbumAdapter");
                        throw null;
                    }
                    fVar.f444230m = true;
                    if (!fVar.f444228h.isEmpty()) {
                        fVar.m8146xced61ae5();
                    }
                }
                if (dVar.f343211n) {
                    ef4.w.f334001t.l().mo50293x3498a0(new lf4.e(this));
                } else {
                    this.f399933m = 0;
                    ef4.w.f334001t.l().mo50293x3498a0(new lf4.f(this));
                }
                this.f399930g = dVar.f343210m;
            }
        }
    }
}
