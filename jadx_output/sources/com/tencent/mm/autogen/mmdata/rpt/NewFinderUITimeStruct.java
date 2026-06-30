package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class NewFinderUITimeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59665d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59666e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59667f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59668g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59669h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f59670i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f59671j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f59672k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f59673l = "";

    @Override // jx3.a
    public int g() {
        return 33617;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59665d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59666e);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59667f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59668g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59669h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59670i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59671j);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59672k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59673l);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f59665d);
        stringBuffer.append("\r\nPageName:");
        stringBuffer.append(this.f59666e);
        stringBuffer.append("\r\nStayTimeMs:0\r\nEnterTimeMs:0\r\nExitTimeMs:0\r\nClickTabContextId:");
        stringBuffer.append(this.f59667f);
        stringBuffer.append("\r\nSid:");
        stringBuffer.append(this.f59668g);
        stringBuffer.append("\r\nreportType:0\r\nFinderContextID:");
        stringBuffer.append(this.f59669h);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f59670i);
        stringBuffer.append("\r\nenterSourceInfo:");
        stringBuffer.append(this.f59671j);
        stringBuffer.append("\r\nModeFlag:0\r\nisNewNearbyLife:0\r\nentryType:0\r\nsessionFinderContextID:");
        stringBuffer.append(this.f59672k);
        stringBuffer.append("\r\notherInfo:");
        stringBuffer.append(this.f59673l);
        stringBuffer.append("\r\nisFinderTask:0");
        return stringBuffer.toString();
    }
}
