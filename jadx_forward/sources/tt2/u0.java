package tt2;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503535d;

    public u0(tt2.e1 e1Var) {
        this.f503535d = e1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        tt2.e1 e1Var = this.f503535d;
        contextMenu.add(0, 100, 0, e1Var.f503413h.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ees));
        contextMenu.add(0, 101, 1, e1Var.f503413h.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edq));
    }
}
