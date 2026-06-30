package h63;

/* loaded from: classes7.dex */
public final class k0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f360786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f360789g;

    public k0(h63.v0 v0Var, java.lang.String str, android.content.Context context, java.lang.Runnable runnable) {
        this.f360786d = v0Var;
        this.f360787e = str;
        this.f360788f = context;
        this.f360789g = runnable;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f360787e;
        h63.v0 v0Var = this.f360786d;
        h63.v0.wi(v0Var, str, this.f360788f, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t[] tVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t.f167522d;
        v0Var.Di(0, 2, null);
        this.f360789g.run();
    }
}
