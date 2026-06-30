package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class dj implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f215678e;

    public dj(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f215677d = view;
        this.f215678e = blVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f215677d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f215678e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(blVar.m158354x19263085());
        android.view.View mo144222x4ff8c0f0 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e5b);
        if (mo144222x4ff8c0f0 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = mo144222x4ff8c0f0.getLayoutParams();
            kb2.b bVar = kb2.b.f387758a;
            layoutParams.height += h17;
            mo144222x4ff8c0f0.setLayoutParams(layoutParams);
            mo144222x4ff8c0f0.setPadding(0, h17, 0, 0);
        }
        android.view.View mo144222x4ff8c0f02 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jtz);
        if (mo144222x4ff8c0f02 == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = mo144222x4ff8c0f02.getLayoutParams();
        layoutParams2.height += h17;
        mo144222x4ff8c0f02.setLayoutParams(layoutParams2);
        mo144222x4ff8c0f02.setPadding(mo144222x4ff8c0f02.getPaddingLeft(), h17, mo144222x4ff8c0f02.getPaddingRight(), mo144222x4ff8c0f02.getPaddingBottom());
        return true;
    }
}
