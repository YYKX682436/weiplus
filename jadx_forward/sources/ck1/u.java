package ck1;

/* loaded from: classes4.dex */
public final class u implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123917d;

    public u(ck1.k0 k0Var) {
        this.f123917d = k0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ck1.k0 k0Var = this.f123917d;
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, k0Var.f123871d.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.a5g));
        } else {
            k0Var.getClass();
        }
    }
}
