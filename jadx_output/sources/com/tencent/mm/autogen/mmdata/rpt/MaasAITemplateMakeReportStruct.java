package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MaasAITemplateMakeReportStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f58972g;

    /* renamed from: h, reason: collision with root package name */
    public long f58973h;

    /* renamed from: i, reason: collision with root package name */
    public long f58974i;

    /* renamed from: j, reason: collision with root package name */
    public long f58975j;

    /* renamed from: k, reason: collision with root package name */
    public long f58976k;

    /* renamed from: n, reason: collision with root package name */
    public int f58979n;

    /* renamed from: d, reason: collision with root package name */
    public int f58969d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58970e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58971f = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58977l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58978m = "";

    @Override // jx3.a
    public int g() {
        return 31178;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58969d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58970e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58971f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58972g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58973h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58974i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58975j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58976k);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58977l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58978m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58979n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("result:");
        stringBuffer.append(this.f58969d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f58970e);
        stringBuffer.append("\r\nmaasSessionKey:");
        stringBuffer.append(this.f58971f);
        stringBuffer.append("\r\nclientPicProcessConsuming:");
        stringBuffer.append(this.f58972g);
        stringBuffer.append("\r\nclientPicUploadConsuming:");
        stringBuffer.append(this.f58973h);
        stringBuffer.append("\r\nAiTimeConsuming:");
        stringBuffer.append(this.f58974i);
        stringBuffer.append("\r\nSpamTimeConsuming:0\r\nclientPicDownloadConsuming:");
        stringBuffer.append(this.f58975j);
        stringBuffer.append("\r\nmaasGenerateConsuming:");
        stringBuffer.append(this.f58976k);
        stringBuffer.append("\r\nEnd2EndTimeConsuming:0\r\nQueueTimeConsuming:0\r\nfailReason:");
        stringBuffer.append(this.f58977l);
        stringBuffer.append("\r\nTaskId:");
        stringBuffer.append(this.f58978m);
        stringBuffer.append("\r\nReportScene:");
        stringBuffer.append(this.f58979n);
        return stringBuffer.toString();
    }
}
