package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class PanelEnterActionStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f59838g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59835d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59836e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59837f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59839h = "";

    @Override // jx3.a
    public int g() {
        return 19959;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59835d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59836e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59837f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59838g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59839h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RoomName:");
        stringBuffer.append(this.f59835d);
        stringBuffer.append("\r\nIsRedDot:");
        stringBuffer.append(this.f59836e);
        stringBuffer.append("\r\nAppList:");
        stringBuffer.append(this.f59837f);
        stringBuffer.append("\r\nPanelPage:");
        stringBuffer.append(this.f59838g);
        stringBuffer.append("\r\nHasReddotAppList:");
        stringBuffer.append(this.f59839h);
        return stringBuffer.toString();
    }
}
