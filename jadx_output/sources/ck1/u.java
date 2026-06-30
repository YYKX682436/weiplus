package ck1;

/* loaded from: classes4.dex */
public final class u implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42384d;

    public u(ck1.k0 k0Var) {
        this.f42384d = k0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ck1.k0 k0Var = this.f42384d;
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, k0Var.f42338d.getString(com.tencent.mm.R.string.a5g));
        } else {
            k0Var.getClass();
        }
    }
}
