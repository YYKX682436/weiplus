package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct */
/* loaded from: classes9.dex */
public final class C6869x36ad427 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141875d;

    /* renamed from: e, reason: collision with root package name */
    public int f141876e;

    /* renamed from: f, reason: collision with root package name */
    public int f141877f;

    /* renamed from: g, reason: collision with root package name */
    public int f141878g;

    @Override // jx3.a
    public int g() {
        return 18617;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141875d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141876e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141877f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141878g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("msgId:");
        stringBuffer.append(this.f141875d);
        stringBuffer.append("\r\nselectLen:");
        stringBuffer.append(this.f141876e);
        stringBuffer.append("\r\ntotalLen:");
        stringBuffer.append(this.f141877f);
        stringBuffer.append("\r\nclipLen:");
        stringBuffer.append(this.f141878g);
        return stringBuffer.toString();
    }
}
