package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MegaVideoBulletPostStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59145d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59146e = "";

    @Override // jx3.a
    public int g() {
        return 21150;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59145d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59146e);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f59145d);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f59146e);
        stringBuffer.append("\r\nLongVideoDuration:0\r\nWordingCnt:0\r\nDurationPosition:0\r\nOutcome:0");
        return stringBuffer.toString();
    }
}
