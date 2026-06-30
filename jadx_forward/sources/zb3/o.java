package zb3;

/* loaded from: classes9.dex */
public class o implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f552812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f552813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f552814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552815g;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b, boolean z17, int i17, android.widget.EditText editText) {
        this.f552815g = activityC16343x55c0d8b;
        this.f552812d = z17;
        this.f552813e = i17;
        this.f552814f = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (!view.isFocused() || this.f552812d) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new zb3.n(this), 200L);
        } else {
            ((android.view.inputmethod.InputMethodManager) this.f552815g.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new zb3.m(this, view), 300L);
        }
    }
}
