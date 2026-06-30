package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MessagePanelEmoticonSearchButtonClickReportStruct */
/* loaded from: classes8.dex */
public final class C6738x6897eb4 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f140722f;

    /* renamed from: h, reason: collision with root package name */
    public long f140724h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140720d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f140721e = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f140723g = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f140725i = "";

    @Override // jx3.a
    public int g() {
        return 21160;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140720d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140721e);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f140722f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140723g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140724h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f140725i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f140720d);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f140721e);
        stringBuffer.append("\r\nClickMore:0\r\nExposureSearch:0\r\nExposureSearchClick:0\r\nActionType:");
        stringBuffer.append(this.f140722f);
        stringBuffer.append("\r\nContent:");
        stringBuffer.append(this.f140723g);
        stringBuffer.append("\r\nClienttimestamp:");
        stringBuffer.append(this.f140724h);
        stringBuffer.append("\r\nisCache:0\r\nClickId:");
        stringBuffer.append(this.f140725i);
        return stringBuffer.toString();
    }
}
