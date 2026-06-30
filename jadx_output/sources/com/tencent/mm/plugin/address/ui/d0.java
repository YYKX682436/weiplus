package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class d0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74531d;

    public d0(com.tencent.mm.plugin.address.ui.g0 g0Var, android.widget.TextView textView) {
        this.f74531d = textView;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f74531d.getContext().getString(com.tencent.mm.R.string.f490359sr));
    }
}
