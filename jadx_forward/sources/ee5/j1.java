package ee5;

/* loaded from: classes9.dex */
public final class j1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.n1 f333468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333469e;

    public j1(ee5.n1 n1Var, android.view.View view) {
        this.f333468d = n1Var;
        this.f333469e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.n1 n1Var = this.f333468d;
        n1Var.getClass();
        android.view.View view2 = this.f333469e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        contextMenu.add(0, n1Var.f333582e, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1o));
        contextMenu.add(0, n1Var.f333583f, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
        contextMenu.add(0, n1Var.f333584g, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }
}
