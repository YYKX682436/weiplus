package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f218701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f218702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s f218703f;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s sVar, int i17, int i18) {
        this.f218703f = sVar;
        this.f218701d = i17;
        this.f218702e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s sVar = this.f218703f;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) sVar.f218712b.f218603i.getLayoutParams();
        int i17 = this.f218701d;
        layoutParams.width = i17;
        int i18 = this.f218702e;
        layoutParams.height = i18;
        int i19 = (i18 - i17) / 2;
        if (sVar.f218712b.f218600f.getVisibility() == 0) {
            layoutParams.topMargin = ((int) sVar.f218712b.f218599e.m63495x618bdc5()) - i19;
        } else {
            layoutParams.topMargin = i65.a.h(sVar.f218712b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561929wr) - i19;
        }
        sVar.f218712b.f218603i.setLayoutParams(layoutParams);
        sVar.f218712b.f218604m.setVisibility(8);
    }
}
