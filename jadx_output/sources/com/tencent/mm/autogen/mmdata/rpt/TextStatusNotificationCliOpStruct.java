package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TextStatusNotificationCliOpStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f61210f;

    /* renamed from: h, reason: collision with root package name */
    public long f61212h;

    /* renamed from: i, reason: collision with root package name */
    public long f61213i;

    /* renamed from: j, reason: collision with root package name */
    public long f61214j;

    /* renamed from: k, reason: collision with root package name */
    public long f61215k;

    /* renamed from: l, reason: collision with root package name */
    public long f61216l;

    /* renamed from: m, reason: collision with root package name */
    public long f61217m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61208d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61209e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61211g = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f61218n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f61219o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f61220p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f61221q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f61222r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f61223s = "";

    @Override // jx3.a
    public int g() {
        return 23836;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61208d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61209e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61210f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61211g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61212h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61213i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61214j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61215k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61216l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61217m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61218n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61219o);
        stringBuffer.append(",");
        stringBuffer.append(this.f61220p);
        stringBuffer.append(",");
        stringBuffer.append(this.f61221q);
        stringBuffer.append(",");
        stringBuffer.append(this.f61222r);
        stringBuffer.append(",");
        stringBuffer.append(this.f61223s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f61208d);
        stringBuffer.append("\r\nNotificationSessionID:");
        stringBuffer.append(this.f61209e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61210f);
        stringBuffer.append("\r\nActionResult:");
        stringBuffer.append(this.f61211g);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f61212h);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f61213i);
        stringBuffer.append("\r\nEnterPosition:");
        stringBuffer.append(this.f61214j);
        stringBuffer.append("\r\nUnreadInteractCount:");
        stringBuffer.append(this.f61215k);
        stringBuffer.append("\r\nUnreadMsgCount:");
        stringBuffer.append(this.f61216l);
        stringBuffer.append("\r\nUnreadHelloToMeCount:");
        stringBuffer.append(this.f61217m);
        stringBuffer.append("\r\nToUserSessionID:");
        stringBuffer.append(this.f61218n);
        stringBuffer.append("\r\nToUserIconID:");
        stringBuffer.append(this.f61219o);
        stringBuffer.append("\r\nToUserSourceID:");
        stringBuffer.append(this.f61220p);
        stringBuffer.append("\r\nToUserHashTag:");
        stringBuffer.append(this.f61221q);
        stringBuffer.append("\r\nToUserStatusID:");
        stringBuffer.append(this.f61222r);
        stringBuffer.append("\r\nMyCurrentStatusID:");
        stringBuffer.append(this.f61223s);
        return stringBuffer.toString();
    }
}
