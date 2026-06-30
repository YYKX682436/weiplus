package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderTimelineMoreFeedExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57917d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f57918e;

    /* renamed from: f, reason: collision with root package name */
    public long f57919f;

    /* renamed from: g, reason: collision with root package name */
    public long f57920g;

    /* renamed from: h, reason: collision with root package name */
    public long f57921h;

    @Override // jx3.a
    public int g() {
        return 19251;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57917d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57918e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57919f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57920g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57921h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f57917d);
        stringBuffer.append("\r\nMessageType:");
        stringBuffer.append(this.f57918e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f57919f);
        stringBuffer.append("\r\nIsFloat:");
        stringBuffer.append(this.f57920g);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f57921h);
        return stringBuffer.toString();
    }
}
