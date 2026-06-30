package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct */
/* loaded from: classes12.dex */
public final class C6334xad1e0c67 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f136900d;

    /* renamed from: e, reason: collision with root package name */
    public int f136901e;

    /* renamed from: f, reason: collision with root package name */
    public int f136902f;

    /* renamed from: g, reason: collision with root package name */
    public int f136903g;

    /* renamed from: h, reason: collision with root package name */
    public int f136904h;

    public C6334xad1e0c67() {
        this.f136900d = 0;
        this.f136901e = 0;
        this.f136902f = 0;
        this.f136903g = 0;
        this.f136904h = 0;
    }

    @Override // jx3.a
    public int g() {
        return 22772;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136900d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136901e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136902f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136903g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136904h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f136900d);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f136901e);
        stringBuffer.append("\r\nFailedTime:");
        stringBuffer.append(this.f136902f);
        stringBuffer.append("\r\nMergeSession:");
        stringBuffer.append(this.f136903g);
        stringBuffer.append("\r\nTotalSession:");
        stringBuffer.append(this.f136904h);
        return stringBuffer.toString();
    }

    public C6334xad1e0c67(java.lang.String str) {
        java.lang.String[] split;
        this.f136900d = 0;
        this.f136901e = 0;
        this.f136902f = 0;
        this.f136903g = 0;
        this.f136904h = 0;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 5) {
            java.lang.String[] strArr = new java.lang.String[5];
            java.util.Arrays.fill(strArr, 0, 5, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f136900d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0);
        this.f136901e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0);
        this.f136902f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0);
        this.f136903g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], 0);
        this.f136904h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[4], 0);
    }
}
