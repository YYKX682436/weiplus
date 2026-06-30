package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171703d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        this.f171703d = c12723x5ab2de90;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171703d;
        android.view.View view = c12723x5ab2de90.H.f171608a;
        if (view == null || view.getHeight() <= 0 || (c12808x5de4409f = c12723x5ab2de90.f171546w) == null) {
            return;
        }
        try {
            c12808x5de4409f.scrollBy(0, c12723x5ab2de90.H.f171608a.getHeight());
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLauncherRecentsList", "makeFooterFullyVisible scrollBy e=%s", e17);
        }
    }
}
