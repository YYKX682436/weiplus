package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class BackupReportErrorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55367d;

    /* renamed from: e, reason: collision with root package name */
    public int f55368e;

    /* renamed from: f, reason: collision with root package name */
    public int f55369f;

    /* renamed from: g, reason: collision with root package name */
    public int f55370g;

    /* renamed from: h, reason: collision with root package name */
    public int f55371h;

    public BackupReportErrorStruct() {
        this.f55367d = 0;
        this.f55368e = 0;
        this.f55369f = 0;
        this.f55370g = 0;
        this.f55371h = 0;
    }

    @Override // jx3.a
    public int g() {
        return 22772;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55367d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55368e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55369f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55370g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55371h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f55367d);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f55368e);
        stringBuffer.append("\r\nFailedTime:");
        stringBuffer.append(this.f55369f);
        stringBuffer.append("\r\nMergeSession:");
        stringBuffer.append(this.f55370g);
        stringBuffer.append("\r\nTotalSession:");
        stringBuffer.append(this.f55371h);
        return stringBuffer.toString();
    }

    public BackupReportErrorStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f55367d = 0;
        this.f55368e = 0;
        this.f55369f = 0;
        this.f55370g = 0;
        this.f55371h = 0;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 5) {
            java.lang.String[] strArr = new java.lang.String[5];
            java.util.Arrays.fill(strArr, 0, 5, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f55367d = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
        this.f55368e = com.tencent.mm.sdk.platformtools.t8.P(split[1], 0);
        this.f55369f = com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
        this.f55370g = com.tencent.mm.sdk.platformtools.t8.P(split[3], 0);
        this.f55371h = com.tencent.mm.sdk.platformtools.t8.P(split[4], 0);
    }
}
