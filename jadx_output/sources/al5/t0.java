package al5;

/* loaded from: classes5.dex */
public final class t0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMClearEditText f6027d;

    public t0(com.tencent.mm.ui.widget.MMClearEditText mMClearEditText) {
        this.f6027d = mMClearEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable arg0) {
        kotlin.jvm.internal.o.g(arg0, "arg0");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
        int i27 = com.tencent.mm.ui.widget.MMClearEditText.K;
        this.f6027d.u();
    }
}
