package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes3.dex */
public class b0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f232468a;

    public b0(int i17) {
        this.f232468a = 0;
        this.f232468a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(new android.graphics.Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), this.f232468a);
    }
}
