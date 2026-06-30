package ee5;

/* loaded from: classes9.dex */
public final class e1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.i1 f333397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333398e;

    public e1(ee5.i1 i1Var, android.view.View view) {
        this.f333397d = i1Var;
        this.f333398e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.i1 i1Var = this.f333397d;
        i1Var.getClass();
        android.view.View view2 = this.f333398e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        contextMenu.add(0, i1Var.f333582e, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1o));
        contextMenu.add(0, i1Var.f333583f, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
        contextMenu.add(0, i1Var.f333584g, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }
}
