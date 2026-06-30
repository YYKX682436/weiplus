package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class u0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f227449e;

    public u0(java.lang.String str, long j17) {
        this.f227448d = str;
        this.f227449e = j17;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "preload complete: %s %s", str, java.lang.Integer.valueOf(hVar.f69553xb5f54fe9));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.f227334o).remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19228, this.f227448d, 0, 4, 0, 0, 0, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - this.f227449e) / 1000), 0);
    }
}
