package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class UpgradeBootStatusReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61491d;

    /* renamed from: e, reason: collision with root package name */
    public long f61492e;

    /* renamed from: f, reason: collision with root package name */
    public long f61493f;

    /* renamed from: g, reason: collision with root package name */
    public long f61494g;

    /* renamed from: h, reason: collision with root package name */
    public long f61495h;

    /* renamed from: i, reason: collision with root package name */
    public long f61496i;

    /* renamed from: j, reason: collision with root package name */
    public long f61497j;

    /* renamed from: k, reason: collision with root package name */
    public long f61498k;

    @Override // jx3.a
    public int g() {
        return 23550;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61491d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61492e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61493f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61494g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61495h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61496i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61497j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61498k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BootType:");
        stringBuffer.append(this.f61491d);
        stringBuffer.append("\r\nBootScene:");
        stringBuffer.append(this.f61492e);
        stringBuffer.append("\r\nMergeCode:");
        stringBuffer.append(this.f61493f);
        stringBuffer.append("\r\nMergeStayTime:");
        stringBuffer.append(this.f61494g);
        stringBuffer.append("\r\nUpdateWay:");
        stringBuffer.append(this.f61495h);
        stringBuffer.append("\r\nDownloadTime:");
        stringBuffer.append(this.f61496i);
        stringBuffer.append("\r\nPatchTotalTime:");
        stringBuffer.append(this.f61497j);
        stringBuffer.append("\r\nUseTotalTime:");
        stringBuffer.append(this.f61498k);
        return stringBuffer.toString();
    }
}
