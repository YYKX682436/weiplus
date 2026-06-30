package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderProfilePostBtnReportStruct */
/* loaded from: classes.dex */
public final class C6567xcc1c262 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f139188d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139189e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f139190f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f139191g = "";

    @Override // jx3.a
    public int g() {
        return 21923;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139188d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139189e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139190f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f139191g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f139188d);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f139189e);
        stringBuffer.append("\r\nFinderContexId:");
        stringBuffer.append(this.f139190f);
        stringBuffer.append("\r\nCommentScene:0\r\nEventCode:0\r\nEventTime:");
        stringBuffer.append(this.f139191g);
        stringBuffer.append("\r\nEventTarget:0");
        return stringBuffer.toString();
    }
}
