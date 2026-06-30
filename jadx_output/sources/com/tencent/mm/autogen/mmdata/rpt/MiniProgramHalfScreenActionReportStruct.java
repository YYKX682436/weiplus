package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class MiniProgramHalfScreenActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f59228d;

    /* renamed from: e, reason: collision with root package name */
    public int f59229e;

    /* renamed from: f, reason: collision with root package name */
    public int f59230f;

    /* renamed from: g, reason: collision with root package name */
    public int f59231g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59232h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59233i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59234j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59235k = "";

    @Override // jx3.a
    public int g() {
        return 36142;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59228d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59229e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59230f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59231g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59232h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59233i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59234j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59235k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59228d);
        stringBuffer.append("\r\nMode:");
        stringBuffer.append(this.f59229e);
        stringBuffer.append("\r\nExpandButtonEnable:");
        stringBuffer.append(this.f59230f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59231g);
        stringBuffer.append("\r\nFromAppId:");
        stringBuffer.append(this.f59232h);
        stringBuffer.append("\r\nFromSessionId:");
        stringBuffer.append(this.f59233i);
        stringBuffer.append("\r\nTargetAppId:");
        stringBuffer.append(this.f59234j);
        stringBuffer.append("\r\nTargetSessionId:");
        stringBuffer.append(this.f59235k);
        return stringBuffer.toString();
    }
}
