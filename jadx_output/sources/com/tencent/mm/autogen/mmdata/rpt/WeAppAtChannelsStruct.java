package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class WeAppAtChannelsStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f62219e;

    /* renamed from: i, reason: collision with root package name */
    public long f62223i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62218d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62220f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62221g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62222h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62224j = "";

    @Override // jx3.a
    public int g() {
        return 22265;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62218d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62219e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62220f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62221g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62222h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62223i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62224j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppID:");
        stringBuffer.append(this.f62218d);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f62219e);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f62220f);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f62221g);
        stringBuffer.append("\r\nclick_tab_context_id:");
        stringBuffer.append(this.f62222h);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f62223i);
        stringBuffer.append("\r\npageResrouceID:");
        stringBuffer.append(this.f62224j);
        return stringBuffer.toString();
    }
}
