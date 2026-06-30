package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavoriteNoteClickReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56344d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56345e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56346f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f56347g;

    @Override // jx3.a
    public int g() {
        return 14547;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56344d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56345e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56346f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56347g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OperationType:");
        stringBuffer.append(this.f56344d);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f56345e);
        stringBuffer.append("\r\nnoteid:");
        stringBuffer.append(this.f56346f);
        stringBuffer.append("\r\npicStatus:");
        stringBuffer.append(this.f56347g);
        return stringBuffer.toString();
    }
}
