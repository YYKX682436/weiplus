package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class SendImgErrorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60210d;

    /* renamed from: e, reason: collision with root package name */
    public long f60211e;

    /* renamed from: f, reason: collision with root package name */
    public long f60212f;

    /* renamed from: h, reason: collision with root package name */
    public long f60214h;

    /* renamed from: i, reason: collision with root package name */
    public long f60215i;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60213g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60216j = "";

    @Override // jx3.a
    public int g() {
        return 27902;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60210d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60211e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60212f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60213g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60214h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60215i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60216j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorCode:");
        stringBuffer.append(this.f60210d);
        stringBuffer.append("\r\nCompressType:");
        stringBuffer.append(this.f60211e);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f60212f);
        stringBuffer.append("\r\nFileName:");
        stringBuffer.append(this.f60213g);
        stringBuffer.append("\r\nrotateCount:");
        stringBuffer.append(this.f60214h);
        stringBuffer.append("\r\nAvgTime:");
        stringBuffer.append(this.f60215i);
        stringBuffer.append("\r\nRev:");
        stringBuffer.append(this.f60216j);
        return stringBuffer.toString();
    }
}
