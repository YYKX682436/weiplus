package bm2;

/* loaded from: classes3.dex */
public final class s7 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.u7 f22293d;

    public s7(bm2.u7 u7Var) {
        this.f22293d = u7Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f22293d.itemView.getContext().getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
