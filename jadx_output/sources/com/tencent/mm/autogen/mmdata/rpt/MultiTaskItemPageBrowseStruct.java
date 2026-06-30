package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MultiTaskItemPageBrowseStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59386f;

    /* renamed from: h, reason: collision with root package name */
    public long f59388h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59384d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59385e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59387g = "";

    @Override // jx3.a
    public int g() {
        return 21947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59384d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59385e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59386f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59387g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59388h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContextId:");
        stringBuffer.append(this.f59384d);
        stringBuffer.append("\r\nItemId:");
        stringBuffer.append(this.f59385e);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f59386f);
        stringBuffer.append("\r\nItemSubId:");
        stringBuffer.append(this.f59387g);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f59388h);
        return stringBuffer.toString();
    }
}
