package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class NewGroupRecommendStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59680d;

    /* renamed from: e, reason: collision with root package name */
    public long f59681e;

    /* renamed from: f, reason: collision with root package name */
    public long f59682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59683g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59684h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f59685i;

    /* renamed from: j, reason: collision with root package name */
    public long f59686j;

    @Override // jx3.a
    public int g() {
        return 17535;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59680d);
        stringBuffer.append(",0,0,0,0,");
        stringBuffer.append(this.f59681e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f59682f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59683g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59684h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59685i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59686j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f59680d);
        stringBuffer.append("\r\nSelectCount:0\r\nSearchCount:0\r\nRecommendCount:0\r\nRecommendGroupCount:0\r\nExitType:");
        stringBuffer.append(this.f59681e);
        stringBuffer.append("\r\nTokenSearchCount:0\r\nTokenRecommendCount:0\r\nSelectTotalCount:");
        stringBuffer.append(this.f59682f);
        stringBuffer.append("\r\ncreate_group_sessionid:");
        stringBuffer.append(this.f59683g);
        stringBuffer.append("\r\nchat_username:");
        stringBuffer.append(this.f59684h);
        stringBuffer.append("\r\nSelectGroupMemberCount:");
        stringBuffer.append(this.f59685i);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f59686j);
        return stringBuffer.toString();
    }
}
