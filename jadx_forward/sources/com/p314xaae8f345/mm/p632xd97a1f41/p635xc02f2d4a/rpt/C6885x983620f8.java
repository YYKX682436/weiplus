package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct */
/* loaded from: classes4.dex */
public final class C6885x983620f8 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142026d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142027e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142028f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f142029g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f142030h = "";

    @Override // jx3.a
    public int g() {
        return 18670;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142026d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142027e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142028f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142029g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142030h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PublishId:");
        stringBuffer.append(this.f142026d);
        stringBuffer.append("\r\nCommentIdList:");
        stringBuffer.append(this.f142027e);
        stringBuffer.append("\r\nEmojiIdList:");
        stringBuffer.append(this.f142028f);
        stringBuffer.append("\r\nClickEmojiIconIdList:");
        stringBuffer.append(this.f142029g);
        stringBuffer.append("\r\nClickEmojiIdList:");
        stringBuffer.append(this.f142030h);
        return stringBuffer.toString();
    }
}
