package pg0;

/* loaded from: classes2.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f435571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f435572f;

    public o3(java.lang.String str, java.util.LinkedList linkedList, int i17) {
        this.f435570d = str;
        this.f435571e = linkedList;
        this.f435572f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f435572f;
        java.lang.String str = this.f435570d;
        try {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152199c = "/cgi-bin/mmpay-bin/sec/mmpayriskappsvr_report_screenshotpage";
            lVar.f152200d = 25487;
            lVar.f152197a = new r45.qv5();
            lVar.f152198b = new r45.rv5();
            lVar.f152211o = 2;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScreenshotPageRequest");
            r45.qv5 qv5Var = (r45.qv5) fVar;
            qv5Var.f465834e = str;
            java.util.LinkedList linkedList = this.f435571e;
            if (linkedList != null && linkedList.size() > 0) {
                qv5Var.f465835f = linkedList;
            }
            qv5Var.f465836g = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[doReportScreenShotPageCgi] pageType: " + str + ", trans_id_list: " + linkedList + " , error_code: " + i17);
            com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, null, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[doReportScreenShotPageCgi] failed : " + th6 + ".message");
        }
    }
}
