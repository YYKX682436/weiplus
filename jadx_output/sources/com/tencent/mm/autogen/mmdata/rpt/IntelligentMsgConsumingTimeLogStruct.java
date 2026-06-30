package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class IntelligentMsgConsumingTimeLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58530d;

    /* renamed from: e, reason: collision with root package name */
    public long f58531e;

    /* renamed from: f, reason: collision with root package name */
    public long f58532f;

    @Override // jx3.a
    public int g() {
        return 24737;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58530d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58531e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58532f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("imagecount:");
        stringBuffer.append(this.f58530d);
        stringBuffer.append("\r\nconsumingtime:");
        stringBuffer.append(this.f58531e);
        stringBuffer.append("\r\nmodel:");
        stringBuffer.append(this.f58532f);
        return stringBuffer.toString();
    }
}
