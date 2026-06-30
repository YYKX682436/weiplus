package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class GroupUpgradeResultStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58402d;

    /* renamed from: e, reason: collision with root package name */
    public long f58403e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58404f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58405g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58406h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58407i = "";

    @Override // jx3.a
    public int g() {
        return 19451;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58402d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58403e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58404f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58405g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58406h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58407i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RecomdSuccess:");
        stringBuffer.append(this.f58402d);
        stringBuffer.append("\r\nRecomdFail:");
        stringBuffer.append(this.f58403e);
        stringBuffer.append("\r\notherSuccess:");
        stringBuffer.append(this.f58404f);
        stringBuffer.append("\r\notherFail:");
        stringBuffer.append(this.f58405g);
        stringBuffer.append("\r\nsucRoomList:");
        stringBuffer.append(this.f58406h);
        stringBuffer.append("\r\nticketId:");
        stringBuffer.append(this.f58407i);
        return stringBuffer.toString();
    }
}
