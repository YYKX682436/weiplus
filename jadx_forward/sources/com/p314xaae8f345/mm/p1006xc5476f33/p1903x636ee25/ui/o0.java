package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes5.dex */
public class o0 extends android.widget.Scroller {

    /* renamed from: a, reason: collision with root package name */
    public final int f232305a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16634x96cbb99 c16634x96cbb99, android.content.Context context) {
        super(context);
        this.f232305a = 1000;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i17, int i18, int i19, int i27, int i28) {
        super.startScroll(i17, i18, i19, i27, this.f232305a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i17, int i18, int i19, int i27) {
        super.startScroll(i17, i18, i19, i27, this.f232305a);
    }
}
