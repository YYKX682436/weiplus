package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct */
/* loaded from: classes4.dex */
public final class C7078xde9ebcc9 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143863d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143864e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143865f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f143866g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143867h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f143868i = "";

    @Override // jx3.a
    public int g() {
        return 15402;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143863d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143864e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143865f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143866g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143867h);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f143868i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DeleteReason:");
        stringBuffer.append(this.f143863d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f143864e);
        stringBuffer.append("\r\nDebugType:");
        stringBuffer.append(this.f143865f);
        stringBuffer.append("\r\nDeleteCount:");
        stringBuffer.append(this.f143866g);
        stringBuffer.append("\r\nAbtestStatus:");
        stringBuffer.append(this.f143867h);
        stringBuffer.append("\r\nLRUDeleteSize:0\r\nweappDirSizeBeforeLRUDelete:0\r\nweappDirSizePercentBeforeLRUDelete:0\r\nweappDirSizeAfterLRUDelete:0\r\nweappDirSizePercentAfterLRUDelete:0\r\nExpiredDeleteSize:0\r\nAppIdList:");
        stringBuffer.append(this.f143868i);
        return stringBuffer.toString();
    }
}
