package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f219750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f219751e;

    public w2(int i17, java.lang.String str) {
        this.f219750d = i17;
        this.f219751e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6756x82ae0060 c6756x82ae0060 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6756x82ae0060();
        c6756x82ae0060.f140830d = this.f219750d;
        c6756x82ae0060.f140831e = c6756x82ae0060.b("actionInfo", this.f219751e, true);
        c6756x82ae0060.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSReportLogic", "24832 ,action = " + c6756x82ae0060.f140830d + ",actionInfo = " + c6756x82ae0060.f140831e);
    }
}
