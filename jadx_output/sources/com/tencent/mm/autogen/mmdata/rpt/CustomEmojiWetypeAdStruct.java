package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class CustomEmojiWetypeAdStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55761d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55762e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55763f;

    /* renamed from: g, reason: collision with root package name */
    public long f55764g;

    @Override // jx3.a
    public int g() {
        return 28807;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55761d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55762e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55763f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55764g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f55761d);
        stringBuffer.append("\r\ntips:");
        stringBuffer.append(this.f55762e);
        stringBuffer.append("\r\nhasreddot:");
        stringBuffer.append(this.f55763f);
        stringBuffer.append("\r\nreddottype:");
        stringBuffer.append(this.f55764g);
        return stringBuffer.toString();
    }
}
