package b32;

/* loaded from: classes8.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView f17645d;

    public o(com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView) {
        this.f17645d = editorChangeTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView = this.f17645d;
        if (editable != null) {
            if (editable.length() > 0) {
                editorChangeTextView.f98716r.setVisibility(0);
                return;
            }
        }
        editorChangeTextView.f98716r.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f17645d.setTextChanged(true);
    }
}
