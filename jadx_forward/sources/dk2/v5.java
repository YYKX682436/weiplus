package dk2;

/* loaded from: classes3.dex */
public final class v5 extends dk2.t4 implements dk2.cg, dk2.fg {

    /* renamed from: b, reason: collision with root package name */
    public boolean f315768b;

    /* renamed from: c, reason: collision with root package name */
    public int f315769c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315770d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f315771e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f315772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.eg
    public boolean A() {
        return this.f315768b;
    }

    @Override // dk2.cg
    public void B(boolean z17) {
        this.f315771e = z17;
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20124) {
            return null;
        }
        r45.ei1 ei1Var = new r45.ei1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            ei1Var.mo11468x92b714fd(g17);
            return ei1Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return null;
        }
    }

    @Override // dk2.fg
    public void E(java.lang.String str) {
        this.f315772f = str;
    }

    @Override // dk2.fg
    public java.lang.String b() {
        return this.f315772f;
    }

    @Override // dk2.eg
    public void c(boolean z17) {
        this.f315768b = z17;
    }

    @Override // dk2.cg
    public void d(boolean z17) {
        this.f315770d = z17;
    }

    @Override // dk2.cg
    public boolean g() {
        return this.f315771e;
    }

    @Override // dk2.cg
    public boolean o() {
        return this.f315770d;
    }

    @Override // dk2.fg
    public jz5.l q() {
        java.lang.Object D = D();
        r45.ei1 ei1Var = D instanceof r45.ei1 ? (r45.ei1) D : null;
        if (ei1Var == null) {
            return null;
        }
        java.lang.String m75945x2fec8307 = ei1Var.m75945x2fec8307(0);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ei1Var.m75934xbce7f2f(1);
        if (m75945x2fec8307 == null || m75934xbce7f2f == null) {
            return null;
        }
        return new jz5.l(m75945x2fec8307, m75934xbce7f2f);
    }

    @Override // dk2.cg
    public int s() {
        return this.f315769c;
    }

    @Override // dk2.cg
    public void w(int i17) {
        this.f315769c = i17;
    }
}
