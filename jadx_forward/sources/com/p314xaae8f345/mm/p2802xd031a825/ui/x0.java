package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class x0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f295796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f295798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f295799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f295800h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295801i;

    public x0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, boolean z17, android.view.View view, android.widget.EditText editText, int i17, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f295801i = abstractActivityC22902xe37969e;
        this.f295796d = z17;
        this.f295797e = view;
        this.f295798f = editText;
        this.f295799g = i17;
        this.f295800h = onFocusChangeListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean isFocused = view.isFocused();
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f295801i;
        if (!isFocused || this.f295796d) {
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            android.view.View view2 = this.f295797e;
            if (view2 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p0(view2, abstractActivityC22902xe37969e.f39901x43041b74);
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p2802xd031a825.ui.w0(this), 200L);
        } else {
            ((android.view.inputmethod.InputMethodManager) abstractActivityC22902xe37969e.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p2802xd031a825.ui.v0(this, view), 300L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f295800h;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
