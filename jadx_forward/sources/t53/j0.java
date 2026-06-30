package t53;

/* loaded from: classes8.dex */
public final class j0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f497312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f497316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f497317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f497318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f497320i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t53.j f497321j;

    public j0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, ik1.b0 b0Var, ik1.b0 b0Var2, java.lang.String str, t53.m0 m0Var, u53.c0 c0Var, int i17, ik1.b0 b0Var3, android.content.Context context, t53.j jVar) {
        this.f497312a = z2Var;
        this.f497313b = b0Var;
        this.f497314c = b0Var2;
        this.f497315d = str;
        this.f497316e = m0Var;
        this.f497317f = c0Var;
        this.f497318g = i17;
        this.f497319h = b0Var3;
        this.f497320i = context;
        this.f497321j = jVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        boolean z17;
        this.f497312a.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        ik1.b0 b0Var = this.f497313b;
        if (b0Var != null) {
            java.lang.Object value = b0Var.f373357a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            if (((java.lang.Boolean) value).booleanValue()) {
                java.lang.Object value2 = this.f497314c.f373357a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value2, "value");
                if (((java.lang.Boolean) value2).booleanValue()) {
                    z17 = true;
                    c0Var.f391645d = z17;
                }
            }
            z17 = false;
            c0Var.f391645d = z17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null");
        }
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        java.lang.String str = this.f497315d;
        ((y53.x) yVar).Ri(str, true, c0Var.f391645d, new t53.i0(str, c0Var, this.f497319h, this.f497320i, this.f497321j));
        this.f497316e.fj(6, 65L, ((f63.e) this.f497317f).u0(), ((f63.e) this.f497317f).t0(), ((f63.e) this.f497317f).v0(), java.lang.Boolean.valueOf(c0Var.f391645d), java.lang.Integer.valueOf(this.f497318g), (java.lang.Boolean) this.f497313b.f373357a);
    }
}
