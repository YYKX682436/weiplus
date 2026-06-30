package b32;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f17654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b32.c0 f17655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f17656f;

    public y(com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer, b32.c0 c0Var, android.graphics.Matrix matrix) {
        this.f17654d = editorItemContainer;
        this.f17655e = c0Var;
        this.f17656f = matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = this.f17654d;
        android.view.ViewGroup viewGroup = editorItemContainer.f98728g;
        b32.c0 c0Var = this.f17655e;
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type android.view.View");
        viewGroup.addView((android.view.View) c0Var, layoutParams);
        c0Var.b(editorItemContainer.getValidRect(), editorItemContainer.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480351vc));
        editorItemContainer.setEditing(c0Var);
        editorItemContainer.f98728g.bringChildToFront(editorItemContainer.getTextItem());
        android.graphics.Matrix m17 = this.f17656f;
        if (m17 == null || !(c0Var instanceof com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView)) {
            return;
        }
        com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView emojiEditorItemView = (com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView) c0Var;
        emojiEditorItemView.getClass();
        kotlin.jvm.internal.o.g(m17, "m");
        ((w22.i) emojiEditorItemView.f98740r).f442545b.f24917g.set(m17);
    }
}
