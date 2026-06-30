package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class MegaVideoPopupActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59157d;

    /* renamed from: e, reason: collision with root package name */
    public long f59158e;

    /* renamed from: g, reason: collision with root package name */
    public long f59160g;

    /* renamed from: l, reason: collision with root package name */
    public long f59165l;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59159f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59161h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59162i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59163j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59164k = "";

    @Override // jx3.a
    public int g() {
        return 21155;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59157d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59158e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59159f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59160g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59161h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59162i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59163j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59164k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59165l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpType:");
        stringBuffer.append(this.f59157d);
        stringBuffer.append("\r\nOpScene:");
        stringBuffer.append(this.f59158e);
        stringBuffer.append("\r\nMiniSessionId:");
        stringBuffer.append(this.f59159f);
        stringBuffer.append("\r\nTaskOrder:");
        stringBuffer.append(this.f59160g);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f59161h);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59162i);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f59163j);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f59164k);
        stringBuffer.append("\r\nifPictureInPicture:");
        stringBuffer.append(this.f59165l);
        return stringBuffer.toString();
    }
}
