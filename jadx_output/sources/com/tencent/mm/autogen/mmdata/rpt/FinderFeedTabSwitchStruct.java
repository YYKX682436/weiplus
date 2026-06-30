package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderFeedTabSwitchStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56834e;

    /* renamed from: f, reason: collision with root package name */
    public long f56835f;

    /* renamed from: i, reason: collision with root package name */
    public long f56838i;

    /* renamed from: j, reason: collision with root package name */
    public long f56839j;

    /* renamed from: d, reason: collision with root package name */
    public long f56833d = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56836g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56837h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56840k = "";

    @Override // jx3.a
    public int g() {
        return 19949;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56833d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56834e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56835f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56836g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56837h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56838i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56839j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56840k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("fromTab:");
        stringBuffer.append(this.f56833d);
        stringBuffer.append("\r\ntoTab:");
        stringBuffer.append(this.f56834e);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f56835f);
        stringBuffer.append("\r\nSessionid:");
        stringBuffer.append(this.f56836g);
        stringBuffer.append("\r\nClickContextid:");
        stringBuffer.append(this.f56837h);
        stringBuffer.append("\r\nhasRedDot:");
        stringBuffer.append(this.f56838i);
        stringBuffer.append("\r\nManuallyTapped:");
        stringBuffer.append(this.f56839j);
        stringBuffer.append("\r\nContextID:");
        stringBuffer.append(this.f56840k);
        return stringBuffer.toString();
    }
}
