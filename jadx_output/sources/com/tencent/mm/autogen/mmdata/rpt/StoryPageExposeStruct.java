package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StoryPageExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60916d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60917e = "";

    @Override // jx3.a
    public int g() {
        return 16657;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60916d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60917e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PageType:");
        stringBuffer.append(this.f60916d);
        stringBuffer.append("\r\nStoryId:");
        stringBuffer.append(this.f60917e);
        return stringBuffer.toString();
    }
}
