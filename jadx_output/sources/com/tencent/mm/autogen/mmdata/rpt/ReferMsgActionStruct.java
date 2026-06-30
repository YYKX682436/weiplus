package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class ReferMsgActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59941d;

    /* renamed from: e, reason: collision with root package name */
    public long f59942e;

    /* renamed from: f, reason: collision with root package name */
    public long f59943f;

    /* renamed from: h, reason: collision with root package name */
    public long f59945h;

    /* renamed from: j, reason: collision with root package name */
    public long f59947j;

    /* renamed from: k, reason: collision with root package name */
    public long f59948k;

    /* renamed from: l, reason: collision with root package name */
    public long f59949l;

    /* renamed from: m, reason: collision with root package name */
    public long f59950m;

    /* renamed from: n, reason: collision with root package name */
    public long f59951n;

    /* renamed from: o, reason: collision with root package name */
    public long f59952o;

    /* renamed from: g, reason: collision with root package name */
    public long f59944g = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59946i = "";

    @Override // jx3.a
    public int g() {
        return 18754;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59941d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59942e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59943f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59944g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59945h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59946i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59947j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59948k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59949l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59950m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59951n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59952o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f59941d);
        stringBuffer.append("\r\nmsgid:");
        stringBuffer.append(this.f59942e);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f59943f);
        stringBuffer.append("\r\nappMsgType:");
        stringBuffer.append(this.f59944g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59945h);
        stringBuffer.append("\r\nchat_name:");
        stringBuffer.append(this.f59946i);
        stringBuffer.append("\r\nref_source:");
        stringBuffer.append(this.f59947j);
        stringBuffer.append("\r\nref_range:");
        stringBuffer.append(this.f59948k);
        stringBuffer.append("\r\nsendMsgid:");
        stringBuffer.append(this.f59949l);
        stringBuffer.append("\r\nsendMsgType:");
        stringBuffer.append(this.f59950m);
        stringBuffer.append("\r\nsendAppMsgType:");
        stringBuffer.append(this.f59951n);
        stringBuffer.append("\r\nref_occasion:");
        stringBuffer.append(this.f59952o);
        return stringBuffer.toString();
    }
}
