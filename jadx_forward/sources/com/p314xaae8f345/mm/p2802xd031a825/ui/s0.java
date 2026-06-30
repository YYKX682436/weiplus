package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class s0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f295758d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f295759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f295760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f295761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295762h;

    public s0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, boolean z17, android.widget.EditText editText, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f295762h = abstractActivityC22902xe37969e;
        this.f295759e = z17;
        this.f295760f = editText;
        this.f295761g = onFocusChangeListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            ((android.view.inputmethod.InputMethodManager) this.f295762h.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p2802xd031a825.ui.q0(this, view), 300L);
        } else {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p2802xd031a825.ui.r0(this), 200L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f295761g;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
