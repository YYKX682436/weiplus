package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class PanelDynamicEnterActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59832d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f59833e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59834f = "";

    @Override // jx3.a
    public int g() {
        return 19194;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59832d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59833e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59834f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59832d);
        stringBuffer.append("\r\nIsRedDot:");
        stringBuffer.append(this.f59833e);
        stringBuffer.append("\r\nAppList:");
        stringBuffer.append(this.f59834f);
        return stringBuffer.toString();
    }
}
