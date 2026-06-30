package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderFPSMonitorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56753d;

    /* renamed from: e, reason: collision with root package name */
    public long f56754e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56755f = "";

    @Override // jx3.a
    public int g() {
        return 30579;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56753d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56754e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56755f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("fps:");
        stringBuffer.append(this.f56753d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f56754e);
        stringBuffer.append("\r\ncommentSceneString:");
        stringBuffer.append(this.f56755f);
        return stringBuffer.toString();
    }
}
