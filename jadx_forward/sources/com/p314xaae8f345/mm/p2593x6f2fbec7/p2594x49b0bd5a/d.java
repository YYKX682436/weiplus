package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public class d implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f273818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 f273822h;

    public d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1) {
        this.f273818d = i17;
        this.f273819e = str;
        this.f273820f = str2;
        this.f273821g = str3;
        this.f273822h = c19764x527bffc1;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "CrashUpload_upload";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.p4.a(32);
        boolean z17 = false;
        java.lang.String str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb6.append(java.lang.Integer.toHexString(o45.wf.f424562g));
        sb6.append("&devicetype=");
        sb6.append(wo.q.f529313a);
        sb6.append("&filelength=");
        sb6.append(this.f273818d);
        sb6.append("&sum=");
        sb6.append(this.f273819e);
        sb6.append("&reporttype=1&NewReportType=");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.f273824a.get(this.f273820f)));
        java.lang.String str2 = this.f273821g;
        if (str2 != null && !str2.equals("")) {
            sb6.append("&username=");
            sb6.append(str2);
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_crash_upload_retry_open_v2", "1", false, true), 0) == 1) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CrashUpload", "get retry x error" + sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CrashUpload", e17, "", new java.lang.Object[0]);
        }
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = this.f273822h;
        boolean a17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.a(sb7, c19764x527bffc1.f38861x6ac9171);
        if (!a17 && z17) {
            a17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.a(sb7, c19764x527bffc1.f38861x6ac9171);
        }
        if (a17) {
            com.p314xaae8f345.mm.app.p4.a(33);
        } else {
            com.p314xaae8f345.mm.app.p4.a(34);
        }
    }
}
