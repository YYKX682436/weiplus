package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveNotifyReplaceStruct */
/* loaded from: classes9.dex */
public final class C6675x5a505a34 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140145d;

    /* renamed from: e, reason: collision with root package name */
    public long f140146e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140147f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140148g = "";

    @Override // jx3.a
    public int g() {
        return 22623;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140145d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140146e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140147f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140148g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("NewMsgCount:");
        stringBuffer.append(this.f140145d);
        stringBuffer.append("\r\nUnReadLiveEndCount:");
        stringBuffer.append(this.f140146e);
        stringBuffer.append("\r\nNewTipsIDs:");
        stringBuffer.append(this.f140147f);
        stringBuffer.append("\r\nDeleteTipsIDs:");
        stringBuffer.append(this.f140148g);
        return stringBuffer.toString();
    }
}
