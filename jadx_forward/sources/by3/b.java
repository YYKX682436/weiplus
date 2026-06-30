package by3;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f117904d;

    public b(android.content.Context context) {
        this.f117904d = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f117904d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
    }
}
