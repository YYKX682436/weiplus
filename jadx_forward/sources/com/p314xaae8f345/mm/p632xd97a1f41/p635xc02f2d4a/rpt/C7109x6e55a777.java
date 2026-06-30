package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct */
/* loaded from: classes7.dex */
public final class C7109x6e55a777 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144270d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144271e;

    /* renamed from: f, reason: collision with root package name */
    public long f144272f;

    /* renamed from: g, reason: collision with root package name */
    public cm.j0 f144273g;

    /* renamed from: h, reason: collision with root package name */
    public long f144274h;

    /* renamed from: i, reason: collision with root package name */
    public long f144275i;

    /* renamed from: j, reason: collision with root package name */
    public long f144276j;

    /* renamed from: k, reason: collision with root package name */
    public long f144277k;

    /* renamed from: l, reason: collision with root package name */
    public long f144278l;

    /* renamed from: m, reason: collision with root package name */
    public cm.k0 f144279m;

    /* renamed from: n, reason: collision with root package name */
    public long f144280n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f144281o;

    /* renamed from: p, reason: collision with root package name */
    public long f144282p;

    /* renamed from: q, reason: collision with root package name */
    public long f144283q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f144284r;

    public C7109x6e55a777() {
        this.f144270d = "";
        this.f144271e = "";
        this.f144272f = 0L;
        this.f144274h = 0L;
        this.f144275i = 0L;
        this.f144276j = 0L;
        this.f144277k = 0L;
        this.f144278l = 0L;
        this.f144280n = 0L;
        this.f144281o = "";
        this.f144282p = 0L;
        this.f144284r = "";
    }

    @Override // jx3.a
    public int g() {
        return 15798;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144270d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144271e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144272f);
        stringBuffer.append(",");
        cm.j0 j0Var = this.f144273g;
        stringBuffer.append(j0Var != null ? j0Var.f124651d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f144274h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144275i);
        stringBuffer.append(",");
        stringBuffer.append(this.f144276j);
        stringBuffer.append(",");
        stringBuffer.append(this.f144277k);
        stringBuffer.append(",");
        stringBuffer.append(this.f144278l);
        stringBuffer.append(",");
        cm.k0 k0Var = this.f144279m;
        stringBuffer.append(k0Var != null ? k0Var.f124658d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f144280n);
        stringBuffer.append(",");
        stringBuffer.append(this.f144281o);
        stringBuffer.append(",");
        stringBuffer.append(this.f144282p);
        stringBuffer.append(",");
        stringBuffer.append(this.f144283q);
        stringBuffer.append(",");
        stringBuffer.append(this.f144284r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f144270d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f144271e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f144272f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f144273g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f144274h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f144275i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f144276j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f144277k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f144278l);
        stringBuffer.append("\r\nRet:");
        stringBuffer.append(this.f144279m);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f144280n);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f144281o);
        stringBuffer.append("\r\nisParallel:");
        stringBuffer.append(this.f144282p);
        stringBuffer.append("\r\nisUesd:");
        stringBuffer.append(this.f144283q);
        stringBuffer.append("\r\nNetworkTypeStr:");
        stringBuffer.append(this.f144284r);
        return stringBuffer.toString();
    }

    public C7109x6e55a777(java.lang.String str) {
        java.lang.String[] split;
        cm.k0 k0Var;
        this.f144270d = "";
        this.f144271e = "";
        this.f144272f = 0L;
        this.f144274h = 0L;
        this.f144275i = 0L;
        this.f144276j = 0L;
        this.f144277k = 0L;
        this.f144278l = 0L;
        this.f144280n = 0L;
        this.f144281o = "";
        this.f144282p = 0L;
        this.f144284r = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 15) {
            java.lang.String[] strArr = new java.lang.String[15];
            java.util.Arrays.fill(strArr, 0, 15, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f144270d = b("InstanceId", split[0], true);
        this.f144271e = b("AppId", split[1], true);
        this.f144272f = h(split[2]);
        this.f144273g = cm.j0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], 0));
        this.f144274h = h(split[4]);
        this.f144275i = h(split[5]);
        this.f144276j = h(split[6]);
        this.f144277k = h(split[7]);
        this.f144278l = h(split[8]);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[9], 0);
        if (P != 0) {
            k0Var = P != 1 ? null : cm.k0.common_fail;
        } else {
            k0Var = cm.k0.ok;
        }
        this.f144279m = k0Var;
        this.f144280n = h(split[10]);
        this.f144281o = b(dm.i4.f66875xa013b0d5, split[11], true);
        this.f144282p = h(split[12]);
        this.f144283q = h(split[13]);
        this.f144284r = b("NetworkTypeStr", split[14], true);
    }
}
