package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96636d;

    public u(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96636d = editorFileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f96636d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.component.editor.s(this);
        k0Var.f211881s = new com.tencent.mm.plugin.component.editor.t(this);
        k0Var.v();
        return true;
    }
}
