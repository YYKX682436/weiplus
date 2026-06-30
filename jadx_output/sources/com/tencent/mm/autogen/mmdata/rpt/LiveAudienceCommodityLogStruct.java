package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class LiveAudienceCommodityLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58562d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58563e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58564f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58565g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f58566h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f58567i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f58568j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f58569k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58570l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58571m = "";

    @Override // jx3.a
    public int g() {
        return 23782;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58562d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58563e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58564f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58565g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58566h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58567i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58568j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58569k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58570l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58571m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("LiveID:");
        stringBuffer.append(this.f58562d);
        stringBuffer.append("\r\nFeedID:");
        stringBuffer.append(this.f58563e);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f58564f);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f58565g);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f58566h);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f58567i);
        stringBuffer.append("\r\nSessionBuffer:");
        stringBuffer.append(this.f58568j);
        stringBuffer.append("\r\nEnterIconType:0\r\nchnl_extra:");
        stringBuffer.append(this.f58569k);
        stringBuffer.append("\r\nEvent:");
        stringBuffer.append(this.f58570l);
        stringBuffer.append("\r\nParams:");
        stringBuffer.append(this.f58571m);
        return stringBuffer.toString();
    }
}
