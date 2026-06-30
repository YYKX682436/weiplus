package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes.dex */
public final class yp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp f281883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp zpVar) {
        super(1);
        this.f281883d = zpVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        if (mVar != null) {
            this.f281883d.f281933a = mVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardAdReportHelper", "prefetchAdInfo: ad info fetched, aid=" + mVar.f536286a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardAdReportHelper", "prefetchAdInfo: no ad info available");
        }
        return jz5.f0.f384359a;
    }
}
