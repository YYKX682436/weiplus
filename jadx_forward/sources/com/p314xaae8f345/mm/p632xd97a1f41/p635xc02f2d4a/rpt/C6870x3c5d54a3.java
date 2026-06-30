package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryCheckStruct */
/* loaded from: classes11.dex */
public final class C6870x3c5d54a3 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f141880e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141879d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141881f = 0;

    @Override // jx3.a
    public int g() {
        return 20543;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141879d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141880e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141881f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RoomId:");
        stringBuffer.append(this.f141879d);
        stringBuffer.append("\r\nUserRole:");
        stringBuffer.append(this.f141880e);
        stringBuffer.append("\r\nHistoryID:");
        stringBuffer.append(this.f141881f);
        return stringBuffer.toString();
    }
}
