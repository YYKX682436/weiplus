package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 f227422d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237) {
        this.f227422d = c16346x4deb5237;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237 = this.f227422d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16346x4deb5237.f227335d;
        if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.mo2533x106ab264() == null || c16346x4deb5237.f227335d.mo2533x106ab264().j() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "[overlayActionBarTouch] null check failed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "[overlayActionBarTouch]");
            c16346x4deb5237.f227335d.mo2533x106ab264().j().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.t0(c16346x4deb5237));
        }
    }
}
