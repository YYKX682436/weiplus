package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class ViewRoomDescTipsStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61635e;

    /* renamed from: f, reason: collision with root package name */
    public long f61636f;

    /* renamed from: g, reason: collision with root package name */
    public long f61637g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61634d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61638h = "";

    @Override // jx3.a
    public int g() {
        return 22613;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61634d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61635e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61636f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61637g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61638h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f61634d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f61635e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f61636f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61637g);
        stringBuffer.append("\r\nNoticeId:");
        stringBuffer.append(this.f61638h);
        return stringBuffer.toString();
    }
}
