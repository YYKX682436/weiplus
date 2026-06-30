package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class wechat_use_weapp_exposeStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f63210e;

    /* renamed from: h, reason: collision with root package name */
    public long f63213h;

    /* renamed from: i, reason: collision with root package name */
    public long f63214i;

    /* renamed from: j, reason: collision with root package name */
    public long f63215j;

    /* renamed from: m, reason: collision with root package name */
    public long f63218m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63209d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63211f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63212g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f63216k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f63217l = "";

    @Override // jx3.a
    public int g() {
        return 21777;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63209d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63210e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63211f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63212g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63213h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63214i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63215j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63216k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63217l);
        stringBuffer.append(",");
        stringBuffer.append(this.f63218m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session:");
        stringBuffer.append(this.f63209d);
        stringBuffer.append("\r\nscene_id:");
        stringBuffer.append(this.f63210e);
        stringBuffer.append("\r\nweapp_id:");
        stringBuffer.append(this.f63211f);
        stringBuffer.append("\r\nweapp_name:");
        stringBuffer.append(this.f63212g);
        stringBuffer.append("\r\nweapp_index:");
        stringBuffer.append(this.f63213h);
        stringBuffer.append("\r\nopen_type:");
        stringBuffer.append(this.f63214i);
        stringBuffer.append("\r\nitem_type:");
        stringBuffer.append(this.f63215j);
        stringBuffer.append("\r\ndevice_ID:");
        stringBuffer.append(this.f63216k);
        stringBuffer.append("\r\ndisplay_name:");
        stringBuffer.append(this.f63217l);
        stringBuffer.append("\r\ndevice_type:");
        stringBuffer.append(this.f63218m);
        return stringBuffer.toString();
    }
}
