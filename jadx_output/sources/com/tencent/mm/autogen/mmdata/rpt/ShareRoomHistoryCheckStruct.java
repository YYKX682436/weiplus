package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ShareRoomHistoryCheckStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60347e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60346d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60348f = 0;

    @Override // jx3.a
    public int g() {
        return 20543;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60346d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60347e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60348f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RoomId:");
        stringBuffer.append(this.f60346d);
        stringBuffer.append("\r\nUserRole:");
        stringBuffer.append(this.f60347e);
        stringBuffer.append("\r\nHistoryID:");
        stringBuffer.append(this.f60348f);
        return stringBuffer.toString();
    }
}
