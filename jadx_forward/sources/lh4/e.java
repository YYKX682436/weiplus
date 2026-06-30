package lh4;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f400237d;

    public e(boolean z17) {
        this.f400237d = z17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (this.f400237d && contextMenu != null) {
            contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.r_);
        }
        if (contextMenu != null) {
            contextMenu.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571845rh);
        }
    }
}
