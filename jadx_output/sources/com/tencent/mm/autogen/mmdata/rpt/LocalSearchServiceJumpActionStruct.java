package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LocalSearchServiceJumpActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58690d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58691e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58692f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58693g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f58694h = "";

    @Override // jx3.a
    public int g() {
        return 16019;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58690d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58691e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58692f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58693g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58694h);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:0\r\nSearchId:");
        stringBuffer.append(this.f58690d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f58691e);
        stringBuffer.append("\r\nQuery:");
        stringBuffer.append(this.f58692f);
        stringBuffer.append("\r\nJumpType:0\r\nPath:");
        stringBuffer.append(this.f58693g);
        stringBuffer.append("\r\nWeappUsrname:");
        stringBuffer.append(this.f58694h);
        stringBuffer.append("\r\nServiceType:0");
        return stringBuffer.toString();
    }
}
