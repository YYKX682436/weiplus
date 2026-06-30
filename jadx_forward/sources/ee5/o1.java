package ee5;

/* loaded from: classes9.dex */
public final class o1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.s1 f333520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333521e;

    public o1(ee5.s1 s1Var, android.view.View view) {
        this.f333520d = s1Var;
        this.f333521e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.s1 s1Var = this.f333520d;
        s1Var.getClass();
        android.view.View view2 = this.f333521e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        contextMenu.add(0, s1Var.f333582e, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1o));
        contextMenu.add(0, s1Var.f333583f, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
        contextMenu.add(0, s1Var.f333584g, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }
}
