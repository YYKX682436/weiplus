package ee5;

/* loaded from: classes9.dex */
public final class d2 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.h2 f333388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333389e;

    public d2(ee5.h2 h2Var, android.view.View view) {
        this.f333388d = h2Var;
        this.f333389e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.h2 h2Var = this.f333388d;
        h2Var.getClass();
        android.view.View view2 = this.f333389e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        contextMenu.add(0, h2Var.f333582e, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1o));
        contextMenu.add(0, h2Var.f333583f, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
        contextMenu.add(0, h2Var.f333584g, 0, view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }
}
