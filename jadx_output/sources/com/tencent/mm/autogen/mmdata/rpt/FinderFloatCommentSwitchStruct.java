package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderFloatCommentSwitchStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56841d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56842e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56843f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f56844g = "";

    @Override // jx3.a
    public int g() {
        return 20353;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56841d);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f56842e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56843f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56844g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feedid:");
        stringBuffer.append(this.f56841d);
        stringBuffer.append("\r\nmediaType:0\r\ncommentscene:0\r\naction:0\r\nSessionid:");
        stringBuffer.append(this.f56842e);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f56843f);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f56844g);
        return stringBuffer.toString();
    }
}
