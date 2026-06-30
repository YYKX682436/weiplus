package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class z1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f154437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f154439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f154441h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 f154442i;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 abstractActivityC11345xc0d00306, boolean z17, boolean z18, android.widget.EditText editText, android.view.View view, int i17) {
        this.f154442i = abstractActivityC11345xc0d00306;
        this.f154437d = z17;
        this.f154438e = z18;
        this.f154439f = editText;
        this.f154440g = view;
        this.f154441h = i17;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3;
        boolean isFocused = view.isFocused();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 abstractActivityC11345xc0d00306 = this.f154442i;
        if (isFocused && !this.f154437d) {
            ((android.view.inputmethod.InputMethodManager) abstractActivityC11345xc0d00306.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x1(this, view), 300L);
            return;
        }
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        android.view.View view2 = this.f154440g;
        if (view2 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
            c27990xda3033a3 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC11345xc0d00306).f39901x43041b74;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p0(view2, c27990xda3033a3);
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y1(this), 200L);
    }
}
