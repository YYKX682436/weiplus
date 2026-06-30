package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct */
/* loaded from: classes5.dex */
public final class C6657x5b628c83 extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f140035h;

    /* renamed from: j, reason: collision with root package name */
    public long f140037j;

    /* renamed from: k, reason: collision with root package name */
    public long f140038k;

    /* renamed from: l, reason: collision with root package name */
    public long f140039l;

    /* renamed from: d, reason: collision with root package name */
    public long f140031d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f140032e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f140033f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140034g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140036i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f140040m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f140041n = 0;

    @Override // jx3.a
    public int g() {
        return 16112;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140031d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f140032e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f140033f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140034g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140035h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140036i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140037j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140038k);
        stringBuffer.append(",");
        stringBuffer.append(this.f140039l);
        stringBuffer.append(",");
        stringBuffer.append(this.f140040m);
        stringBuffer.append(",");
        stringBuffer.append(this.f140041n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f140031d);
        stringBuffer.append("\r\nsubScene:0\r\nhasText:");
        stringBuffer.append(this.f140032e);
        stringBuffer.append("\r\nsubSceneNote:0\r\nbuttonType:");
        stringBuffer.append(this.f140033f);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f140034g);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f140035h);
        stringBuffer.append("\r\nMenuList:");
        stringBuffer.append(this.f140036i);
        stringBuffer.append("\r\nPasteType:");
        stringBuffer.append(this.f140037j);
        stringBuffer.append("\r\nisKeyboardPopup:");
        stringBuffer.append(this.f140038k);
        stringBuffer.append("\r\nPasteTextLength:");
        stringBuffer.append(this.f140039l);
        stringBuffer.append("\r\nChatSessionId:");
        stringBuffer.append(this.f140040m);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f140041n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83 p(java.lang.String str) {
        this.f140040m = b("ChatSessionId", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83 q(java.lang.String str) {
        this.f140034g = b(dm.i4.f66875xa013b0d5, str, true);
        return this;
    }
}
