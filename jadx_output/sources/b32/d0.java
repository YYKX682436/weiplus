package b32;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView f17632d;

    public d0(com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textEditorItemView) {
        this.f17632d = textEditorItemView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textEditorItemView = this.f17632d;
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer itemContainer = textEditorItemView.getItemContainer();
        if (itemContainer != null) {
            itemContainer.setEditing(textEditorItemView);
        }
    }
}
