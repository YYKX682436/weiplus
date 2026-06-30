package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeResultStruct */
/* loaded from: classes12.dex */
public final class C6644x15329af extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139935d;

    /* renamed from: e, reason: collision with root package name */
    public long f139936e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f139937f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f139938g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139939h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f139940i = "";

    @Override // jx3.a
    public int g() {
        return 19451;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139935d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139936e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139937f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139938g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139939h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139940i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RecomdSuccess:");
        stringBuffer.append(this.f139935d);
        stringBuffer.append("\r\nRecomdFail:");
        stringBuffer.append(this.f139936e);
        stringBuffer.append("\r\notherSuccess:");
        stringBuffer.append(this.f139937f);
        stringBuffer.append("\r\notherFail:");
        stringBuffer.append(this.f139938g);
        stringBuffer.append("\r\nsucRoomList:");
        stringBuffer.append(this.f139939h);
        stringBuffer.append("\r\nticketId:");
        stringBuffer.append(this.f139940i);
        return stringBuffer.toString();
    }
}
