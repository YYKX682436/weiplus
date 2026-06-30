package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class MagicBrushMonitorStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f59055e;

    /* renamed from: g, reason: collision with root package name */
    public long f59057g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59054d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59056f = "";

    @Override // jx3.a
    public int g() {
        return 26632;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59054d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59055e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59056f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59057g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("key:");
        stringBuffer.append(this.f59054d);
        stringBuffer.append("\r\nvalue:");
        stringBuffer.append(this.f59055e);
        stringBuffer.append("\r\nextra:");
        stringBuffer.append(this.f59056f);
        stringBuffer.append("\r\nreportTime:");
        stringBuffer.append(this.f59057g);
        return stringBuffer.toString();
    }
}
