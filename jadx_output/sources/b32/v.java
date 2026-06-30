package b32;

/* loaded from: classes8.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView f17651d;

    public v(com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView) {
        this.f17651d = editorChangeTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView = this.f17651d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) editorChangeTextView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editorChangeTextView.f98715q, 0);
        }
    }
}
