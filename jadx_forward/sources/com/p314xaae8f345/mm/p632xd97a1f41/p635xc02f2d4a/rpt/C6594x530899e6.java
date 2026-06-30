package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderTagForwardStruct */
/* loaded from: classes10.dex */
public final class C6594x530899e6 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139439e;

    /* renamed from: f, reason: collision with root package name */
    public long f139440f;

    /* renamed from: i, reason: collision with root package name */
    public long f139443i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139438d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139441g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139442h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139444j = "";

    @Override // jx3.a
    public int g() {
        return 19187;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139438d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139439e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139440f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139441g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139442h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f139443i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139444j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f139438d);
        stringBuffer.append("\r\nForwardType:");
        stringBuffer.append(this.f139439e);
        stringBuffer.append("\r\nForwardResult:");
        stringBuffer.append(this.f139440f);
        stringBuffer.append("\r\nTag:");
        stringBuffer.append(this.f139441g);
        stringBuffer.append("\r\nTagId:");
        stringBuffer.append(this.f139442h);
        stringBuffer.append("\r\nIsPoi:0\r\nTagFeedCnt:");
        stringBuffer.append(this.f139443i);
        stringBuffer.append("\r\nForwardToUsr:");
        stringBuffer.append(this.f139444j);
        return stringBuffer.toString();
    }
}
