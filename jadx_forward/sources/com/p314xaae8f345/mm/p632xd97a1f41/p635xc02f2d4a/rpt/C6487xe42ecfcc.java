package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFPSMonitorStruct */
/* loaded from: classes10.dex */
public final class C6487xe42ecfcc extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138286d;

    /* renamed from: e, reason: collision with root package name */
    public long f138287e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138288f = "";

    @Override // jx3.a
    public int g() {
        return 30579;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138286d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138287e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138288f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("fps:");
        stringBuffer.append(this.f138286d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f138287e);
        stringBuffer.append("\r\ncommentSceneString:");
        stringBuffer.append(this.f138288f);
        return stringBuffer.toString();
    }
}
