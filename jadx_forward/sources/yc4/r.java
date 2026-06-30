package yc4;

/* loaded from: classes4.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final yc4.r f542396d = new yc4.r();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport$1");
        java.util.Map e17 = wo.w0.e();
        yc4.s sVar = yc4.s.f542397a;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) e17).get("hardware");
        java.lang.String t17 = str != null ? r26.i0.t(str, ",", ";", false) : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        yc4.s.f542399c = t17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get cpu name:");
        yc4.s sVar2 = yc4.s.f542397a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.lang.String str2 = yc4.s.f542399c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMethodReport", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport$1");
    }
}
