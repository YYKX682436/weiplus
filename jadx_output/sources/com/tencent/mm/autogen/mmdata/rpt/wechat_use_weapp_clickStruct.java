package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class wechat_use_weapp_clickStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f63200e;

    /* renamed from: f, reason: collision with root package name */
    public long f63201f;

    /* renamed from: i, reason: collision with root package name */
    public long f63204i;

    /* renamed from: j, reason: collision with root package name */
    public long f63205j;

    /* renamed from: m, reason: collision with root package name */
    public long f63208m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63199d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63202g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63203h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f63206k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f63207l = "";

    @Override // jx3.a
    public int g() {
        return 21776;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63199d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63200e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63201f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63202g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63203h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63204i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63205j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63206k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63207l);
        stringBuffer.append(",");
        stringBuffer.append(this.f63208m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session:");
        stringBuffer.append(this.f63199d);
        stringBuffer.append("\r\nweapp_sum:");
        stringBuffer.append(this.f63200e);
        stringBuffer.append("\r\nweapp_index:");
        stringBuffer.append(this.f63201f);
        stringBuffer.append("\r\nweapp_ID:");
        stringBuffer.append(this.f63202g);
        stringBuffer.append("\r\nweapp_name:");
        stringBuffer.append(this.f63203h);
        stringBuffer.append("\r\nopen_type:");
        stringBuffer.append(this.f63204i);
        stringBuffer.append("\r\nitem_type:");
        stringBuffer.append(this.f63205j);
        stringBuffer.append("\r\ndevice_ID:");
        stringBuffer.append(this.f63206k);
        stringBuffer.append("\r\ndisplay_name:");
        stringBuffer.append(this.f63207l);
        stringBuffer.append("\r\ndevice_type:");
        stringBuffer.append(this.f63208m);
        return stringBuffer.toString();
    }
}
