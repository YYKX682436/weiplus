package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class a2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f154096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f154097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f154098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 f154099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 abstractActivityC11345xc0d00306, boolean z17, android.widget.EditText editText, int i17) {
        super(false);
        this.f154099g = abstractActivityC11345xc0d00306;
        this.f154096d = z17;
        this.f154097e = editText;
        this.f154098f = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 abstractActivityC11345xc0d00306 = this.f154099g;
        view2 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC11345xc0d00306).f39900xbab696ce;
        boolean isShown = view2.isShown();
        android.widget.EditText editText = this.f154097e;
        boolean z17 = this.f154096d;
        if (!isShown && !z17) {
            abstractActivityC11345xc0d00306.m83139x8022ec1f();
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306.Z6(abstractActivityC11345xc0d00306, editText);
            abstractActivityC11345xc0d00306.m83128x12a99e7c(this.f154098f);
        } else if (z17) {
            abstractActivityC11345xc0d00306.mo48632xd46dd964();
            ((android.view.inputmethod.InputMethodManager) abstractActivityC11345xc0d00306.mo55332x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
        }
    }
}
