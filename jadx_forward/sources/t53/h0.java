package t53;

/* loaded from: classes8.dex */
public final class h0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f497299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t53.j f497300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f497304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f497305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f497306h;

    public h0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, t53.j jVar, ik1.b0 b0Var, ik1.b0 b0Var2, ik1.b0 b0Var3, t53.m0 m0Var, u53.c0 c0Var, int i17) {
        this.f497299a = z2Var;
        this.f497300b = jVar;
        this.f497301c = b0Var;
        this.f497302d = b0Var2;
        this.f497303e = b0Var3;
        this.f497304f = m0Var;
        this.f497305g = c0Var;
        this.f497306h = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        boolean z17;
        this.f497299a.B();
        t53.j jVar = this.f497300b;
        if (jVar != null) {
            java.lang.Object value = this.f497301c.f373357a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            com.p314xaae8f345.mm.ui.oi oiVar = (com.p314xaae8f345.mm.ui.oi) jVar;
            oiVar.f291011a.runOnUiThread(new com.p314xaae8f345.mm.ui.ni(oiVar, ((java.lang.Boolean) value).booleanValue()));
        }
        ik1.b0 b0Var = this.f497302d;
        if (b0Var != null) {
            java.lang.Object value2 = b0Var.f373357a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value2, "value");
            if (((java.lang.Boolean) value2).booleanValue()) {
                java.lang.Object value3 = this.f497303e.f373357a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value3, "value");
                if (((java.lang.Boolean) value3).booleanValue()) {
                    z17 = true;
                    this.f497304f.fj(6, 4L, ((f63.e) this.f497305g).u0(), ((f63.e) this.f497305g).t0(), ((f63.e) this.f497305g).v0(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f497306h), (java.lang.Boolean) this.f497302d.f373357a);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null hideDialog");
        }
        z17 = false;
        this.f497304f.fj(6, 4L, ((f63.e) this.f497305g).u0(), ((f63.e) this.f497305g).t0(), ((f63.e) this.f497305g).v0(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f497306h), (java.lang.Boolean) this.f497302d.f373357a);
    }
}
