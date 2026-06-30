package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MessagePanelEmoticonSearchButtonClickReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59189f;

    /* renamed from: h, reason: collision with root package name */
    public long f59191h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59187d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59188e = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59190g = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f59192i = "";

    @Override // jx3.a
    public int g() {
        return 21160;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59187d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59188e);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59189f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59190g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59191h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59192i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f59187d);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f59188e);
        stringBuffer.append("\r\nClickMore:0\r\nExposureSearch:0\r\nExposureSearchClick:0\r\nActionType:");
        stringBuffer.append(this.f59189f);
        stringBuffer.append("\r\nContent:");
        stringBuffer.append(this.f59190g);
        stringBuffer.append("\r\nClienttimestamp:");
        stringBuffer.append(this.f59191h);
        stringBuffer.append("\r\nisCache:0\r\nClickId:");
        stringBuffer.append(this.f59192i);
        return stringBuffer.toString();
    }
}
