package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class UpgradeBootStageDetailReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61482d;

    /* renamed from: e, reason: collision with root package name */
    public long f61483e;

    /* renamed from: f, reason: collision with root package name */
    public long f61484f;

    /* renamed from: g, reason: collision with root package name */
    public long f61485g;

    /* renamed from: h, reason: collision with root package name */
    public long f61486h;

    /* renamed from: i, reason: collision with root package name */
    public long f61487i;

    /* renamed from: j, reason: collision with root package name */
    public long f61488j;

    /* renamed from: k, reason: collision with root package name */
    public long f61489k;

    /* renamed from: l, reason: collision with root package name */
    public long f61490l;

    @Override // jx3.a
    public int g() {
        return 25395;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61482d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61483e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61484f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61485g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61486h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61487i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61488j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61489k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61490l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BootStageType:");
        stringBuffer.append(this.f61482d);
        stringBuffer.append("\r\npatchWay:");
        stringBuffer.append(this.f61483e);
        stringBuffer.append("\r\nUpdateWay:");
        stringBuffer.append(this.f61484f);
        stringBuffer.append("\r\nMergeStayTime:");
        stringBuffer.append(this.f61485g);
        stringBuffer.append("\r\nDownloadTime:");
        stringBuffer.append(this.f61486h);
        stringBuffer.append("\r\nPatchTotalTime:");
        stringBuffer.append(this.f61487i);
        stringBuffer.append("\r\nUseTotalTime:");
        stringBuffer.append(this.f61488j);
        stringBuffer.append("\r\nerroCode:");
        stringBuffer.append(this.f61489k);
        stringBuffer.append("\r\ndownloadPatchSize:");
        stringBuffer.append(this.f61490l);
        return stringBuffer.toString();
    }
}
