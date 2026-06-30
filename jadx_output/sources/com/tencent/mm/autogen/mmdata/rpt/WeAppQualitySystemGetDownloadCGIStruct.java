package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySystemGetDownloadCGIStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62737d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62738e;

    /* renamed from: f, reason: collision with root package name */
    public long f62739f;

    /* renamed from: g, reason: collision with root package name */
    public cm.j0 f62740g;

    /* renamed from: h, reason: collision with root package name */
    public long f62741h;

    /* renamed from: i, reason: collision with root package name */
    public long f62742i;

    /* renamed from: j, reason: collision with root package name */
    public long f62743j;

    /* renamed from: k, reason: collision with root package name */
    public long f62744k;

    /* renamed from: l, reason: collision with root package name */
    public long f62745l;

    /* renamed from: m, reason: collision with root package name */
    public cm.k0 f62746m;

    /* renamed from: n, reason: collision with root package name */
    public long f62747n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f62748o;

    /* renamed from: p, reason: collision with root package name */
    public long f62749p;

    /* renamed from: q, reason: collision with root package name */
    public long f62750q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f62751r;

    public WeAppQualitySystemGetDownloadCGIStruct() {
        this.f62737d = "";
        this.f62738e = "";
        this.f62739f = 0L;
        this.f62741h = 0L;
        this.f62742i = 0L;
        this.f62743j = 0L;
        this.f62744k = 0L;
        this.f62745l = 0L;
        this.f62747n = 0L;
        this.f62748o = "";
        this.f62749p = 0L;
        this.f62751r = "";
    }

    @Override // jx3.a
    public int g() {
        return 15798;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62737d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62738e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62739f);
        stringBuffer.append(",");
        cm.j0 j0Var = this.f62740g;
        stringBuffer.append(j0Var != null ? j0Var.f43118d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62741h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62742i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62743j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62744k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62745l);
        stringBuffer.append(",");
        cm.k0 k0Var = this.f62746m;
        stringBuffer.append(k0Var != null ? k0Var.f43125d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62747n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62748o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62749p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62750q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62751r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62737d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62738e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62739f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62740g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62741h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62742i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62743j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62744k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62745l);
        stringBuffer.append("\r\nRet:");
        stringBuffer.append(this.f62746m);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f62747n);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f62748o);
        stringBuffer.append("\r\nisParallel:");
        stringBuffer.append(this.f62749p);
        stringBuffer.append("\r\nisUesd:");
        stringBuffer.append(this.f62750q);
        stringBuffer.append("\r\nNetworkTypeStr:");
        stringBuffer.append(this.f62751r);
        return stringBuffer.toString();
    }

    public WeAppQualitySystemGetDownloadCGIStruct(java.lang.String str) {
        java.lang.String[] split;
        cm.k0 k0Var;
        this.f62737d = "";
        this.f62738e = "";
        this.f62739f = 0L;
        this.f62741h = 0L;
        this.f62742i = 0L;
        this.f62743j = 0L;
        this.f62744k = 0L;
        this.f62745l = 0L;
        this.f62747n = 0L;
        this.f62748o = "";
        this.f62749p = 0L;
        this.f62751r = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 15) {
            java.lang.String[] strArr = new java.lang.String[15];
            java.util.Arrays.fill(strArr, 0, 15, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f62737d = b("InstanceId", split[0], true);
        this.f62738e = b("AppId", split[1], true);
        this.f62739f = h(split[2]);
        this.f62740g = cm.j0.a(com.tencent.mm.sdk.platformtools.t8.P(split[3], 0));
        this.f62741h = h(split[4]);
        this.f62742i = h(split[5]);
        this.f62743j = h(split[6]);
        this.f62744k = h(split[7]);
        this.f62745l = h(split[8]);
        int P = com.tencent.mm.sdk.platformtools.t8.P(split[9], 0);
        if (P != 0) {
            k0Var = P != 1 ? null : cm.k0.common_fail;
        } else {
            k0Var = cm.k0.ok;
        }
        this.f62746m = k0Var;
        this.f62747n = h(split[10]);
        this.f62748o = b(dm.i4.COL_USERNAME, split[11], true);
        this.f62749p = h(split[12]);
        this.f62750q = h(split[13]);
        this.f62751r = b("NetworkTypeStr", split[14], true);
    }
}
