package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class w5 implements org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157553a;

    public w5(java.lang.String str) {
        this.f157553a = str;
    }

    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PkgNetworkOpt", "preConnectHost, task end, url:%s, statusCode:%d", this.f157553a, java.lang.Integer.valueOf(i17));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.util.SparseLongArray sparseLongArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x5.f157584b;
        synchronized (sparseLongArray) {
            sparseLongArray.put(this.f157553a.hashCode(), currentTimeMillis);
        }
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onCanceled */
    public void mo49258x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        a(-2);
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onFailed */
    public void mo49259x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        a(-1);
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onSucceeded */
    public void mo49260x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.Object obj) {
        a(abstractC29564x6974077e.mo153682xea30509d());
    }
}
