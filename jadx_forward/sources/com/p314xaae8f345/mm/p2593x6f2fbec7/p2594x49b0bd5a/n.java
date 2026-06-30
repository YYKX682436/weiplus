package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public class n implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f273837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273840g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 f273841h;

    public n(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1) {
        this.f273837d = i17;
        this.f273838e = str;
        this.f273839f = str2;
        this.f273840g = str3;
        this.f273841h = c19764x527bffc1;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MMBugReporter";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.p4.a(32);
        java.lang.String str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb6.append(java.lang.Integer.toHexString(o45.wf.f424562g));
        sb6.append("&devicetype=");
        sb6.append(wo.q.f529313a);
        sb6.append("&filelength=");
        sb6.append(this.f273837d);
        sb6.append("&sum=");
        sb6.append(this.f273838e);
        sb6.append("&reporttype=1&NewReportType=");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.f273824a.get(this.f273839f)));
        java.lang.String str2 = this.f273840g;
        if (str2 != null && !str2.isEmpty()) {
            sb6.append("&username=");
            sb6.append(str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "full url = " + sb6.toString());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = this.f273841h;
        boolean a17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.a(sb7, c19764x527bffc1.f38861x6ac9171);
        if (!a17) {
            a17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.a(sb7, c19764x527bffc1.f38861x6ac9171);
        }
        if (a17) {
            com.p314xaae8f345.mm.app.p4.a(33);
        } else {
            com.p314xaae8f345.mm.app.p4.a(34);
        }
    }
}
