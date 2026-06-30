package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveStayTimeLogStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f57377f;

    /* renamed from: h, reason: collision with root package name */
    public long f57379h;

    /* renamed from: i, reason: collision with root package name */
    public long f57380i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57375d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57376e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57378g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57381j = "";

    @Override // jx3.a
    public int g() {
        return 32116;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57375d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57376e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57377f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57378g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57379h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57380i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57381j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Contextid:");
        stringBuffer.append(this.f57375d);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f57376e);
        stringBuffer.append("\r\nStayTimeMs:");
        stringBuffer.append(this.f57377f);
        stringBuffer.append("\r\nRedDotTipsID:");
        stringBuffer.append(this.f57378g);
        stringBuffer.append("\r\nEnterTimeMs:");
        stringBuffer.append(this.f57379h);
        stringBuffer.append("\r\nExitTimeMs:");
        stringBuffer.append(this.f57380i);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f57381j);
        return stringBuffer.toString();
    }
}
