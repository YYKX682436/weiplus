package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupLiveShareCardStruct */
/* loaded from: classes5.dex */
public final class C6638x4349a8d9 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139912e;

    /* renamed from: f, reason: collision with root package name */
    public long f139913f;

    /* renamed from: g, reason: collision with root package name */
    public long f139914g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139911d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139915h = "";

    @Override // jx3.a
    public int g() {
        return 22469;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139911d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139912e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139913f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139914g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139915h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f139911d);
        stringBuffer.append("\r\nReddotType:");
        stringBuffer.append(this.f139912e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f139913f);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f139914g);
        stringBuffer.append("\r\nLiveIDList:");
        stringBuffer.append(this.f139915h);
        return stringBuffer.toString();
    }
}
