package ix3;

/* loaded from: classes.dex */
public final class k3 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final ex3.e f377005d;

    /* renamed from: e, reason: collision with root package name */
    public final int f377006e;

    public k3(ix3.o3 o3Var, ex3.e dataItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        this.f377005d = dataItem;
        this.f377006e = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenuInfo instanceof android.widget.AdapterView.AdapterContextMenuInfo) {
            int i17 = this.f377005d.f338741e;
            int i18 = this.f377006e;
            if (i17 == 1) {
                if (contextMenu != null) {
                    contextMenu.add(i18, 0, 0, "置顶");
                }
            } else if (contextMenu != null) {
                contextMenu.add(i18, 1, 0, "取消置顶");
            }
        }
    }
}
