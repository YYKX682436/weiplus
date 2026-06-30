package h63;

/* loaded from: classes7.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f360836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f360839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h63.l1 f360840h;

    public z(h63.v0 v0Var, java.lang.String str, android.content.Context context, int i17, h63.l1 l1Var) {
        this.f360836d = v0Var;
        this.f360837e = str;
        this.f360838f = context;
        this.f360839g = i17;
        this.f360840h = l1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f360837e;
        h63.v0 v0Var = this.f360836d;
        h63.v0.wi(v0Var, str, this.f360838f, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
        v0Var.Di(0, this.f360839g, null);
        h63.l1 l1Var = this.f360840h;
        if (l1Var != null) {
            mc1.b bVar = (mc1.b) l1Var;
            bVar.f407110a.a(bVar.f407111b, bVar.f407112c.o("ok"));
        }
    }
}
