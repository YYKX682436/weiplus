package ov0;

/* loaded from: classes5.dex */
public final class v implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.t f430687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ov0.i0 f430688e;

    public v(ov0.t tVar, ov0.i0 i0Var) {
        this.f430687d = tVar;
        this.f430688e = i0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (this.f430687d.m157204x661a2673() == ov0.e.f430658e) {
            this.f430688e.p7(charSequence);
        }
    }
}
