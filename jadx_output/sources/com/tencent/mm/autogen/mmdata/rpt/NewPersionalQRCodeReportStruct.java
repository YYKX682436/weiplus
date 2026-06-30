package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class NewPersionalQRCodeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59709d;

    /* renamed from: e, reason: collision with root package name */
    public long f59710e;

    /* renamed from: f, reason: collision with root package name */
    public long f59711f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59712g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59713h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59714i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f59715j;

    /* renamed from: k, reason: collision with root package name */
    public int f59716k;

    /* renamed from: l, reason: collision with root package name */
    public int f59717l;

    /* renamed from: m, reason: collision with root package name */
    public long f59718m;

    /* renamed from: n, reason: collision with root package name */
    public int f59719n;

    @Override // jx3.a
    public int g() {
        return 27036;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59709d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59710e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59711f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59712g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59713h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59714i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59715j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59716k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59717l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59718m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59719n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f59709d);
        stringBuffer.append("\r\nActionTS:");
        stringBuffer.append(this.f59710e);
        stringBuffer.append("\r\nPatternId:");
        stringBuffer.append(this.f59711f);
        stringBuffer.append("\r\nQRCodeUrl:");
        stringBuffer.append(this.f59712g);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f59713h);
        stringBuffer.append("\r\nQRCodeUrlWithStyle:");
        stringBuffer.append(this.f59714i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59715j);
        stringBuffer.append("\r\nScreenBrightness:");
        stringBuffer.append(this.f59716k);
        stringBuffer.append("\r\nLocalGen:");
        stringBuffer.append(this.f59717l);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f59718m);
        stringBuffer.append("\r\nmyqrcode_entrance:");
        stringBuffer.append(this.f59719n);
        return stringBuffer.toString();
    }
}
