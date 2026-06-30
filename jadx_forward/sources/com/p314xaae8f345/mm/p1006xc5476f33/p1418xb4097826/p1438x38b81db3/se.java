package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class se implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df f186083g;

    public se(in5.s0 s0Var, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df dfVar) {
        this.f186080d = s0Var;
        this.f186081e = view;
        this.f186082f = view2;
        this.f186083g = dfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx2.n b17;
        int[] iArr = new int[2];
        in5.s0 holder = this.f186080d;
        holder.f3639x46306858.getLocationInWindow(iArr);
        android.view.View view = this.f186081e;
        view.getLocationInWindow(r2);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.view.View view2 = this.f186082f;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin = ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin + (view.getHeight() / 2);
        view2.requestLayout();
        this.f186083g.s(holder);
        mx2.p pVar = mx2.p.f414044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
        if (p17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = p17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041) p17 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234 m61652x7f02fdf3 = c15401xb8016041 != null ? c15401xb8016041.m61652x7f02fdf3() : null;
        if (!(m61652x7f02fdf3 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4)) {
            m61652x7f02fdf3 = null;
        }
        if (m61652x7f02fdf3 == null || (b17 = pVar.b(holder)) == null) {
            return;
        }
        int childCount = m61652x7f02fdf3.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback findViewById = m61652x7f02fdf3.getChildAt(i17).findViewById(com.p314xaae8f345.mm.R.id.tbn);
            mx2.o oVar = findViewById instanceof mx2.o ? (mx2.o) findViewById : null;
            if (oVar != null) {
                pVar.a(oVar, b17);
            }
        }
    }
}
