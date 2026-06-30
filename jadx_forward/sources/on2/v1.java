package on2;

/* loaded from: classes.dex */
public final class v1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f428582d;

    public v1(android.content.Context context) {
        this.f428582d = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1000, 0, this.f428582d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edq));
    }
}
