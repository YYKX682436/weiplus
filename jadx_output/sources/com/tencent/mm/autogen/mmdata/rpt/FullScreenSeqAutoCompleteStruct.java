package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class FullScreenSeqAutoCompleteStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58267d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58268e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f58269f = 0;

    @Override // jx3.a
    public int g() {
        return 27027;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58267d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58268e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58269f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f58267d);
        stringBuffer.append("\r\nCompleteSeq:");
        stringBuffer.append(this.f58268e);
        stringBuffer.append("\r\nIsFirstComplete:");
        stringBuffer.append(this.f58269f);
        return stringBuffer.toString();
    }
}
