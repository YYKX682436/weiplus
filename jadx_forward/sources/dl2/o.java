package dl2;

/* loaded from: classes3.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f f316781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f316782e;

    public o(dl2.f fVar, dl2.f0 f0Var) {
        this.f316781d = fVar;
        this.f316782e = f0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj;
        java.lang.Integer h17;
        this.f316781d.f316729b.set(1, java.lang.Integer.valueOf((editable == null || (obj = editable.toString()) == null || (h17 = r26.h0.h(obj)) == null) ? 0 : h17.intValue()));
        this.f316782e.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
