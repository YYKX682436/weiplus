package b32;

/* loaded from: classes8.dex */
public final class n implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView f17644d;

    public n(com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView) {
        this.f17644d = editorChangeTextView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        this.f17644d.setImeVisibility(z17);
    }
}
