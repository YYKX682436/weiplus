package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class GroupUpgradeSelectGroupStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58408d;

    /* renamed from: h, reason: collision with root package name */
    public long f58412h;

    /* renamed from: j, reason: collision with root package name */
    public long f58414j;

    /* renamed from: e, reason: collision with root package name */
    public long f58409e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58410f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58411g = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58413i = "";

    @Override // jx3.a
    public int g() {
        return 19450;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58408d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58409e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58410f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58411g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58412h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58413i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58414j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RecomdCount:");
        stringBuffer.append(this.f58408d);
        stringBuffer.append("\r\nClickMore:");
        stringBuffer.append(this.f58409e);
        stringBuffer.append("\r\nRecomdSelect:");
        stringBuffer.append(this.f58410f);
        stringBuffer.append("\r\nOtherSelect:");
        stringBuffer.append(this.f58411g);
        stringBuffer.append("\r\nExitType:");
        stringBuffer.append(this.f58412h);
        stringBuffer.append("\r\nTicketId:");
        stringBuffer.append(this.f58413i);
        stringBuffer.append("\r\nOtherCount:");
        stringBuffer.append(this.f58414j);
        return stringBuffer.toString();
    }
}
