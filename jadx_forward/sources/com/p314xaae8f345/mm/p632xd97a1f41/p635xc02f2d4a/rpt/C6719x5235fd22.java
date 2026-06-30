package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBrushMonitorStruct */
/* loaded from: classes12.dex */
public final class C6719x5235fd22 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f140588e;

    /* renamed from: g, reason: collision with root package name */
    public long f140590g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140587d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140589f = "";

    @Override // jx3.a
    public int g() {
        return 26632;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140587d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140588e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140589f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140590g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("key:");
        stringBuffer.append(this.f140587d);
        stringBuffer.append("\r\nvalue:");
        stringBuffer.append(this.f140588e);
        stringBuffer.append("\r\nextra:");
        stringBuffer.append(this.f140589f);
        stringBuffer.append("\r\nreportTime:");
        stringBuffer.append(this.f140590g);
        return stringBuffer.toString();
    }
}
