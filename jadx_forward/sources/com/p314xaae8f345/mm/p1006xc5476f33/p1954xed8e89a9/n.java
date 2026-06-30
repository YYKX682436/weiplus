package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o f235067d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar) {
        this.f235067d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar = this.f235067d;
        if (oVar.f235084k == null) {
            oVar.f235084k = (android.view.ViewGroup) oVar.f235074a.findViewById(com.p314xaae8f345.mm.R.id.coz);
        }
        android.view.ViewGroup viewGroup = oVar.f235084k;
        if (viewGroup == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(15, -1);
            android.view.ViewGroup viewGroup2 = oVar.f235084k;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setLayoutParams(layoutParams2);
        }
    }
}
