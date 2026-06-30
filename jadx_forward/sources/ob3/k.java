package ob3;

/* loaded from: classes5.dex */
public class k implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f425597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f425599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 f425600g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63, boolean z17, int i17, android.widget.EditText editText) {
        this.f425600g = activityC16326x540b7c63;
        this.f425597d = z17;
        this.f425598e = i17;
        this.f425599f = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (!view.isFocused() || this.f425597d) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new ob3.j(this), 200L);
        } else {
            ((android.view.inputmethod.InputMethodManager) this.f425600g.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new ob3.i(this, view), 300L);
        }
    }
}
