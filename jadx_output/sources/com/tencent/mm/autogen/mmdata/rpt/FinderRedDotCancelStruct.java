package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderRedDotCancelStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57690d;

    /* renamed from: f, reason: collision with root package name */
    public long f57692f;

    /* renamed from: g, reason: collision with root package name */
    public long f57693g;

    /* renamed from: i, reason: collision with root package name */
    public long f57695i;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57691e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57694h = "";

    @Override // jx3.a
    public int g() {
        return 20223;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57690d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57691e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57692f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57693g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57694h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57695i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CtrType:");
        stringBuffer.append(this.f57690d);
        stringBuffer.append("\r\nTipsId:");
        stringBuffer.append(this.f57691e);
        stringBuffer.append("\r\nRecallTime:");
        stringBuffer.append(this.f57692f);
        stringBuffer.append("\r\nTabType:");
        stringBuffer.append(this.f57693g);
        stringBuffer.append("\r\nRevokeId:");
        stringBuffer.append(this.f57694h);
        stringBuffer.append("\r\nRevokeStatus:");
        stringBuffer.append(this.f57695i);
        return stringBuffer.toString();
    }
}
