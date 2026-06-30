package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class h implements ls0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f153226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f153227d;

    public h(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, long j17) {
        this.f153224a = str;
        this.f153225b = str2;
        this.f153226c = c11120x15dce88d;
        this.f153227d = j17;
    }

    @Override // ls0.m
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "mediaCodecRemuxer remux onFinish");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p962x4177e4be.j.e(0, this.f153227d);
            java.lang.Object obj = com.p314xaae8f345.mm.p962x4177e4be.j.f153228a;
            synchronized (obj) {
                try {
                    obj.notifyAll();
                    com.p314xaae8f345.mm.p962x4177e4be.j.f153229b = true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferUtil", e17, "wait mediaCodecRemuxer error", new java.lang.Object[0]);
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferUtil", "MediaCodecRemuxer remux failed, ret path is null, retry x264");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 244L, 1L, false);
        try {
            com.p314xaae8f345.mm.p962x4177e4be.j.c(this.f153224a, this.f153225b, this.f153226c, this.f153227d);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer error!!!");
            com.p314xaae8f345.mm.p962x4177e4be.j.e(-1, this.f153227d);
        }
        java.lang.Object obj2 = com.p314xaae8f345.mm.p962x4177e4be.j.f153228a;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
                com.p314xaae8f345.mm.p962x4177e4be.j.f153229b = true;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferUtil", e18, "wait mediaCodecRemuxer error", new java.lang.Object[0]);
            }
        }
    }
}
