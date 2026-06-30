package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct */
/* loaded from: classes5.dex */
public final class C6628xef1f4b81 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f139800d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139801e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f139802f = 0;

    @Override // jx3.a
    public int g() {
        return 27027;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139800d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139801e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139802f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f139800d);
        stringBuffer.append("\r\nCompleteSeq:");
        stringBuffer.append(this.f139801e);
        stringBuffer.append("\r\nIsFirstComplete:");
        stringBuffer.append(this.f139802f);
        return stringBuffer.toString();
    }
}
