package al5;

/* loaded from: classes5.dex */
public final class u0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMClearEditText f6052d;

    public u0(com.tencent.mm.ui.widget.MMClearEditText mMClearEditText) {
        this.f6052d = mMClearEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = this.f6052d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = mMClearEditText.I;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        mMClearEditText.u();
    }
}
