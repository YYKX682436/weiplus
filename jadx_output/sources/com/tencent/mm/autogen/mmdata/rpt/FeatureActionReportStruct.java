package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class FeatureActionReportStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f56357g;

    /* renamed from: h, reason: collision with root package name */
    public long f56358h;

    /* renamed from: i, reason: collision with root package name */
    public long f56359i;

    /* renamed from: j, reason: collision with root package name */
    public long f56360j;

    /* renamed from: n, reason: collision with root package name */
    public long f56364n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56354d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56355e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56356f = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56361k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f56362l = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f56363m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56365o = "";

    @Override // jx3.a
    public int g() {
        return 25147;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56354d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56355e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56356f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56357g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56358h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56359i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56360j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56361k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56362l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56363m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56364n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56365o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f56354d);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f56355e);
        stringBuffer.append("\r\nRequestId:");
        stringBuffer.append(this.f56356f);
        stringBuffer.append("\r\nSceneType:");
        stringBuffer.append(this.f56357g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56358h);
        stringBuffer.append("\r\nActionId:");
        stringBuffer.append(this.f56359i);
        stringBuffer.append("\r\nClientTimestamp:");
        stringBuffer.append(this.f56360j);
        stringBuffer.append("\r\nFeatureInfo:");
        stringBuffer.append(this.f56361k);
        stringBuffer.append("\r\nItemInfo:");
        stringBuffer.append(this.f56362l);
        stringBuffer.append("\r\nDocInfo:");
        stringBuffer.append(this.f56363m);
        stringBuffer.append("\r\nReqBusinessType:");
        stringBuffer.append(this.f56364n);
        stringBuffer.append("\r\nParentSearchId:");
        stringBuffer.append(this.f56365o);
        return stringBuffer.toString();
    }
}
