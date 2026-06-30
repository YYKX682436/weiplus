package ee5;

/* loaded from: classes9.dex */
public final class j0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.n0 f333466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333467e;

    public j0(ee5.n0 n0Var, android.view.View view) {
        this.f333466d = n0Var;
        this.f333467e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, this.f333466d.f333583f, 0, this.f333467e.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
    }
}
