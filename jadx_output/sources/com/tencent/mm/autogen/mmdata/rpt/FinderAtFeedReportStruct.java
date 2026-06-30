package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderAtFeedReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56482d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56483e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56484f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f56485g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f56486h = "";

    @Override // jx3.a
    public int g() {
        return 21206;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f56482d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56483e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56484f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56485g);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f56486h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IfSelf:0\r\nAction:");
        stringBuffer.append(this.f56482d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f56483e);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f56484f);
        stringBuffer.append("\r\nFinderContexId:");
        stringBuffer.append(this.f56485g);
        stringBuffer.append("\r\ncommentScene:0\r\nEventTarget:0\r\nActivityId:");
        stringBuffer.append(this.f56486h);
        return stringBuffer.toString();
    }
}
