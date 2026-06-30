package a31;

/* loaded from: classes5.dex */
public final class e implements fl5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a31.m f950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f951b;

    public e(a31.m mVar, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f950a = mVar;
        this.f951b = mMEditText;
    }

    @Override // fl5.f
    public void a(java.lang.CharSequence charSequence) {
        java.util.Objects.toString(charSequence);
        if (charSequence == null || r26.n0.N(charSequence)) {
            return;
        }
        a31.m mVar = this.f950a;
        mVar.f974h = true;
        mVar.f980n++;
        a31.m.a(mVar, charSequence);
        mVar.m(51);
    }

    @Override // fl5.f
    public void sendKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent != null) {
            keyEvent.toString();
            if (keyEvent.getAction() != 0) {
                return;
            }
            a31.m mVar = this.f950a;
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = mVar.f969c;
            int curV2TStatus = speechInputLayout != null ? speechInputLayout.getCurV2TStatus() : 0;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 67) {
                com.tencent.mm.ui.widget.MMEditText mMEditText = this.f951b;
                if (mMEditText == null) {
                    return;
                }
                int selectionStart = mMEditText.getSelectionStart();
                if (selectionStart < 0) {
                    selectionStart = 0;
                }
                int selectionEnd = mMEditText.getSelectionEnd();
                int i17 = selectionEnd >= 0 ? selectionEnd : 0;
                java.lang.CharSequence subSequence = selectionStart != i17 ? mMEditText.getText().subSequence(java.lang.Math.min(selectionStart, i17), java.lang.Math.max(selectionStart, i17)) : selectionStart > 0 ? mMEditText.getText().subSequence(selectionStart - 1, selectionStart) : null;
                mVar.f974h = true;
                mVar.f980n++;
                a31.m.a(mVar, subSequence);
            }
            if (keyCode == 0 || curV2TStatus < 2) {
                return;
            }
            if (keyCode == 21 || keyCode == 22) {
                mVar.m(53);
            } else {
                mVar.m(51);
            }
        }
    }
}
