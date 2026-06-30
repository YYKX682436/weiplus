package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class GroupNoticeInfoStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58390e;

    /* renamed from: f, reason: collision with root package name */
    public long f58391f;

    /* renamed from: g, reason: collision with root package name */
    public long f58392g;

    /* renamed from: i, reason: collision with root package name */
    public long f58394i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58389d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58393h = "";

    @Override // jx3.a
    public int g() {
        return 24947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58389d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58390e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58391f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58392g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58393h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58394i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f58389d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f58390e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f58391f);
        stringBuffer.append("\r\nNoticeType:");
        stringBuffer.append(this.f58392g);
        stringBuffer.append("\r\nNoticeId:");
        stringBuffer.append(this.f58393h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f58394i);
        return stringBuffer.toString();
    }
}
