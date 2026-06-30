package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public class v extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f172890d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f172891e;

    public v(android.content.Context context, boolean z17) {
        super(context, null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559764e8);
        this.f172891e = z17;
        setCacheColorHint(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f172891e || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f172891e || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f172891e || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f172891e && this.f172890d) || super.isInTouchMode();
    }
}
