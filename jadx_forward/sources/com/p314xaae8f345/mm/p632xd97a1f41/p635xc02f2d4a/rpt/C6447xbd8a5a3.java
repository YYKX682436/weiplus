package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct */
/* loaded from: classes12.dex */
public final class C6447xbd8a5a3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137877d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137878e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137879f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f137880g;

    @Override // jx3.a
    public int g() {
        return 14547;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137877d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137878e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137879f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137880g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OperationType:");
        stringBuffer.append(this.f137877d);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f137878e);
        stringBuffer.append("\r\nnoteid:");
        stringBuffer.append(this.f137879f);
        stringBuffer.append("\r\npicStatus:");
        stringBuffer.append(this.f137880g);
        return stringBuffer.toString();
    }
}
