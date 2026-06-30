package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class DismissedChatroomInfoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55860d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55861e;

    @Override // jx3.a
    public int g() {
        return 24182;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55860d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55861e);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomUsername:");
        stringBuffer.append(this.f55860d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f55861e);
        stringBuffer.append("\r\nUserRole:0");
        return stringBuffer.toString();
    }
}
