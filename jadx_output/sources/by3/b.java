package by3;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f36371d;

    public b(android.content.Context context) {
        this.f36371d = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f36371d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
