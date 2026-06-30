package ky2;

/* loaded from: classes.dex */
public final class o implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f395103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395104g;

    public o(android.view.View view, ky2.w wVar, android.widget.EditText editText, int i17) {
        this.f395101d = view;
        this.f395102e = wVar;
        this.f395103f = editText;
        this.f395104g = i17;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        boolean hasFocus = view.hasFocus();
        ky2.w wVar = this.f395102e;
        if (!hasFocus) {
            wVar.getClass();
        } else {
            this.f395101d.post(new ky2.n(this.f395103f, wVar, this.f395104g));
        }
    }
}
