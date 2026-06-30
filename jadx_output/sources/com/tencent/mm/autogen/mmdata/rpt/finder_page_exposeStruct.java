package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class finder_page_exposeStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f63109g;

    /* renamed from: m, reason: collision with root package name */
    public long f63115m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63106d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63107e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63108f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63110h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63111i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f63112j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f63113k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f63114l = "";

    @Override // jx3.a
    public int g() {
        return 21874;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63106d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63107e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63108f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63109g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63110h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63111i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63112j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63113k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63114l);
        stringBuffer.append(",");
        stringBuffer.append(this.f63115m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f63106d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f63107e);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f63108f);
        stringBuffer.append("\r\nevent_code:");
        stringBuffer.append(this.f63109g);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f63110h);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f63111i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f63112j);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f63113k);
        stringBuffer.append("\r\nref_commentscene:");
        stringBuffer.append(this.f63114l);
        stringBuffer.append("\r\nstayTime:");
        stringBuffer.append(this.f63115m);
        return stringBuffer.toString();
    }
}
