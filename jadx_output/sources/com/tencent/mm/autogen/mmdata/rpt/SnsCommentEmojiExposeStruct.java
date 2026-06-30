package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsCommentEmojiExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60493d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60494e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60495f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60496g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f60497h = "";

    @Override // jx3.a
    public int g() {
        return 18670;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60493d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60494e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60495f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60496g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60497h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PublishId:");
        stringBuffer.append(this.f60493d);
        stringBuffer.append("\r\nCommentIdList:");
        stringBuffer.append(this.f60494e);
        stringBuffer.append("\r\nEmojiIdList:");
        stringBuffer.append(this.f60495f);
        stringBuffer.append("\r\nClickEmojiIconIdList:");
        stringBuffer.append(this.f60496g);
        stringBuffer.append("\r\nClickEmojiIdList:");
        stringBuffer.append(this.f60497h);
        return stringBuffer.toString();
    }
}
