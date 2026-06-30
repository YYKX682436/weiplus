package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class EmojiResReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55998d;

    /* renamed from: e, reason: collision with root package name */
    public long f55999e;

    /* renamed from: f, reason: collision with root package name */
    public int f56000f;

    /* renamed from: g, reason: collision with root package name */
    public int f56001g;

    /* renamed from: h, reason: collision with root package name */
    public int f56002h;

    /* renamed from: i, reason: collision with root package name */
    public int f56003i;

    /* renamed from: j, reason: collision with root package name */
    public int f56004j;

    @Override // jx3.a
    public int g() {
        return 21843;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55998d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55999e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56000f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56001g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56002h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56003i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56004j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("result:");
        stringBuffer.append(this.f55998d);
        stringBuffer.append("\r\nerrType:");
        stringBuffer.append(this.f55999e);
        stringBuffer.append("\r\nemojiCount:");
        stringBuffer.append(this.f56000f);
        stringBuffer.append("\r\noldVersion:");
        stringBuffer.append(this.f56001g);
        stringBuffer.append("\r\nnewVersion:");
        stringBuffer.append(this.f56002h);
        stringBuffer.append("\r\nsubType:");
        stringBuffer.append(this.f56003i);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f56004j);
        return stringBuffer.toString();
    }
}
