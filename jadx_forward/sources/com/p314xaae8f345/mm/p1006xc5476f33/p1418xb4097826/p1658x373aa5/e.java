package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.p3210x3857dc.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h f213481a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar) {
        this.f213481a = hVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogHelper", "overScrollBy: deltaX：" + i17 + " deltaY：" + i18 + " scrollX：" + i19 + " scrollY:" + i27 + "  scrollRangeX:" + i28 + " scrollRangeY:" + i29 + " maxOverScrollX:" + i37 + " maxOverScrollY:" + i38 + " isTouchEvent:" + z17);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void b(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogHelper", "onScrollChanged l:" + i17 + ", t:" + i18 + "  oldl:" + i19 + " oldt:" + i27);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogHelper", "onOverScrolled: scrollX:" + i17 + " scrollY:" + i18 + " clampedX:" + z17 + " clampedY:" + z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar = this.f213481a;
        if (z18 && i18 < 200) {
            hVar.f213724a.m63418x7a8868a5(true);
        } else {
            if (!z17 || i17 >= 100) {
                return;
            }
            hVar.f213724a.m63417xd98add77(true);
        }
    }
}
