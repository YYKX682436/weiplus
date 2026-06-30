package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct */
/* loaded from: classes9.dex */
public final class C6660xaea6cfd extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140063d;

    /* renamed from: e, reason: collision with root package name */
    public long f140064e;

    /* renamed from: f, reason: collision with root package name */
    public long f140065f;

    @Override // jx3.a
    public int g() {
        return 24737;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140063d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140064e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140065f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("imagecount:");
        stringBuffer.append(this.f140063d);
        stringBuffer.append("\r\nconsumingtime:");
        stringBuffer.append(this.f140064e);
        stringBuffer.append("\r\nmodel:");
        stringBuffer.append(this.f140065f);
        return stringBuffer.toString();
    }
}
