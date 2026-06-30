package ov0;

/* loaded from: classes5.dex */
public final class w implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.t f430689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ov0.i0 f430690e;

    public w(ov0.t tVar, ov0.i0 i0Var) {
        this.f430689d = tVar;
        this.f430690e = i0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (this.f430689d.m157204x661a2673() == ov0.e.f430658e) {
            this.f430690e.o7(charSequence);
        }
    }
}
