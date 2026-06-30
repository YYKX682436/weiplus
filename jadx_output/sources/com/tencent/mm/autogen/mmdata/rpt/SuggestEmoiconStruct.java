package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SuggestEmoiconStruct extends jx3.a {

    /* renamed from: n, reason: collision with root package name */
    public long f61008n;

    /* renamed from: o, reason: collision with root package name */
    public long f61009o;

    /* renamed from: s, reason: collision with root package name */
    public long f61013s;

    /* renamed from: d, reason: collision with root package name */
    public long f60998d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60999e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f61000f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61001g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61002h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f61003i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61004j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61005k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f61006l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61007m = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f61010p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f61011q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f61012r = "";

    @Override // jx3.a
    public int g() {
        return 10994;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60998d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60999e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61000f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61001g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61002h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61003i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61004j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61005k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61006l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61007m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61008n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61009o);
        stringBuffer.append(",");
        stringBuffer.append(this.f61010p);
        stringBuffer.append(",");
        stringBuffer.append(this.f61011q);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61012r);
        stringBuffer.append(",");
        stringBuffer.append(this.f61013s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f60998d);
        stringBuffer.append("\r\nWord:");
        stringBuffer.append(this.f60999e);
        stringBuffer.append("\r\nExpId:");
        stringBuffer.append(this.f61000f);
        stringBuffer.append("\r\nPosition:");
        stringBuffer.append(this.f61001g);
        stringBuffer.append("\r\nmd5:");
        stringBuffer.append(this.f61002h);
        stringBuffer.append("\r\nTotalCount:");
        stringBuffer.append(this.f61003i);
        stringBuffer.append("\r\nIndex:");
        stringBuffer.append(this.f61004j);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f61005k);
        stringBuffer.append("\r\nIsLocal:0\r\nIsLocalSearch:");
        stringBuffer.append(this.f61006l);
        stringBuffer.append("\r\nWordVersion:");
        stringBuffer.append(this.f61007m);
        stringBuffer.append("\r\nWordType:");
        stringBuffer.append(this.f61008n);
        stringBuffer.append("\r\nWordSize:");
        stringBuffer.append(this.f61009o);
        stringBuffer.append("\r\nRecSessionId:");
        stringBuffer.append(this.f61010p);
        stringBuffer.append("\r\nChatId:");
        stringBuffer.append(this.f61011q);
        stringBuffer.append("\r\nEmojiType:0\r\nmd5Type:");
        stringBuffer.append(this.f61012r);
        stringBuffer.append("\r\nClickTime:");
        stringBuffer.append(this.f61013s);
        return stringBuffer.toString();
    }
}
