package t82;

/* loaded from: classes12.dex */
public final class p implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f497932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t82.r f497933b;

    public p(o72.r2 r2Var, t82.r rVar) {
        this.f497932a = r2Var;
        this.f497933b = rVar;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        o72.r2 r2Var = this.f497932a;
        boolean c17 = b3Var.c(r2Var, false, false);
        t82.r rVar = this.f497933b;
        if (!c17) {
            g4Var.c(0, 3, 0, rVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccj), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (c17 && o72.x1.l0(r2Var)) {
            g4Var.c(0, 3, 0, rVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccj), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        g4Var.c(0, 2, 0, rVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4), com.p314xaae8f345.mm.R.raw.f81163x4709a7);
        g4Var.c(0, 0, 0, rVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_f), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        g4Var.c(0, 1, 0, rVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbi), com.p314xaae8f345.mm.R.raw.f79818xafe47098);
    }
}
