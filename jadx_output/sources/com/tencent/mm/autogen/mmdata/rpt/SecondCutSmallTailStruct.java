package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SecondCutSmallTailStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f60179e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60178d = "";

    /* renamed from: f, reason: collision with root package name */
    public int f60180f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f60181g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60182h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60183i = "";

    @Override // jx3.a
    public int g() {
        return 22624;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60178d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60179e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60180f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60181g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60182h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60183i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Publishid:");
        stringBuffer.append(this.f60178d);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f60179e);
        stringBuffer.append("\r\nInstallMiaoJian:");
        stringBuffer.append(this.f60180f);
        stringBuffer.append("\r\nifEg:");
        stringBuffer.append(this.f60181g);
        stringBuffer.append("\r\nEgID:");
        stringBuffer.append(this.f60182h);
        stringBuffer.append("\r\nMusicID:");
        stringBuffer.append(this.f60183i);
        return stringBuffer.toString();
    }
}
