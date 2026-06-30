package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96575d;

    public j(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96575d = editorFileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f96575d.finish();
        return true;
    }
}
