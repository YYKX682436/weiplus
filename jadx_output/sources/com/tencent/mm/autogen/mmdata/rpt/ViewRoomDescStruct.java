package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class ViewRoomDescStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61628e;

    /* renamed from: f, reason: collision with root package name */
    public long f61629f;

    /* renamed from: g, reason: collision with root package name */
    public long f61630g;

    /* renamed from: h, reason: collision with root package name */
    public long f61631h;

    /* renamed from: j, reason: collision with root package name */
    public long f61633j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61627d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61632i = "";

    @Override // jx3.a
    public int g() {
        return 22600;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61627d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61628e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61629f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61630g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61631h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61632i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61633j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f61627d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f61628e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f61629f);
        stringBuffer.append("\r\nisMuteRoom:");
        stringBuffer.append(this.f61630g);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f61631h);
        stringBuffer.append("\r\nNoticeId:");
        stringBuffer.append(this.f61632i);
        stringBuffer.append("\r\nNoticeType:");
        stringBuffer.append(this.f61633j);
        return stringBuffer.toString();
    }
}
