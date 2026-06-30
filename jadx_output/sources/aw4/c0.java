package aw4;

/* loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f14853f;

    public c0(long j17, long j18, long j19) {
        this.f14851d = j17;
        this.f14852e = j18;
        this.f14853f = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.WowCompliancePopupWindowReportStruct wowCompliancePopupWindowReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WowCompliancePopupWindowReportStruct();
        wowCompliancePopupWindowReportStruct.f62987d = this.f14851d;
        wowCompliancePopupWindowReportStruct.f62988e = this.f14852e;
        wowCompliancePopupWindowReportStruct.f62989f = this.f14853f;
        wowCompliancePopupWindowReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "25208 ,action = " + wowCompliancePopupWindowReportStruct.f62987d + ",actionInfo = " + wowCompliancePopupWindowReportStruct.f62988e + ",actionInfo = " + wowCompliancePopupWindowReportStruct.f62989f);
    }
}
