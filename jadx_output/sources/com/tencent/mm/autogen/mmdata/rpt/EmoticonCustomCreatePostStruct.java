package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class EmoticonCustomCreatePostStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56017d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56018e = "";

    @Override // jx3.a
    public int g() {
        return 29612;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56017d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f56018e);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EditStickerSessionID:");
        stringBuffer.append(this.f56017d);
        stringBuffer.append("\r\nstatus:0\r\nshowStickerInChannel:0\r\nStickerName:");
        stringBuffer.append(this.f56018e);
        stringBuffer.append("\r\nhalfScreen:0");
        return stringBuffer.toString();
    }
}
