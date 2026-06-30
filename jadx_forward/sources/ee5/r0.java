package ee5;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f333558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae5.g f333559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333560f;

    public r0(ee5.v0 v0Var, ae5.g gVar, android.view.View view) {
        this.f333558d = v0Var;
        this.f333559e = gVar;
        this.f333560f = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.v0 v0Var = this.f333558d;
        v0Var.getClass();
        contextMenu.add(0, 0, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        ae5.g gVar = this.f333559e;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(gVar.f85934e) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(gVar.f85934e)) {
            contextMenu.add(0, v0Var.f333582e, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1o));
        }
        int i17 = v0Var.f333583f;
        android.view.View view2 = this.f333560f;
        contextMenu.add(0, i17, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
        contextMenu.add(0, v0Var.f333584g, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }
}
