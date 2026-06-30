package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class MMBizOriginViewerStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58800d;

    /* renamed from: e, reason: collision with root package name */
    public long f58801e;

    /* renamed from: f, reason: collision with root package name */
    public long f58802f;

    /* renamed from: g, reason: collision with root package name */
    public long f58803g;

    /* renamed from: h, reason: collision with root package name */
    public long f58804h;

    /* renamed from: i, reason: collision with root package name */
    public long f58805i;

    /* renamed from: j, reason: collision with root package name */
    public long f58806j;

    @Override // jx3.a
    public int g() {
        return 38209;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58800d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58801e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58802f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58803g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58804h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58805i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58806j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Optype:");
        stringBuffer.append(this.f58800d);
        stringBuffer.append("\r\nElement:");
        stringBuffer.append(this.f58801e);
        stringBuffer.append("\r\nBizuin:");
        stringBuffer.append(this.f58802f);
        stringBuffer.append("\r\nAppMsgID:");
        stringBuffer.append(this.f58803g);
        stringBuffer.append("\r\nItemIdx:");
        stringBuffer.append(this.f58804h);
        stringBuffer.append("\r\nNumber:");
        stringBuffer.append(this.f58805i);
        stringBuffer.append("\r\nSize:");
        stringBuffer.append(this.f58806j);
        return stringBuffer.toString();
    }
}
