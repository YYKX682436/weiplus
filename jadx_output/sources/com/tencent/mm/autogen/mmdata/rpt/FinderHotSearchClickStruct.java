package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderHotSearchClickStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f56928f;

    /* renamed from: h, reason: collision with root package name */
    public int f56930h;

    /* renamed from: i, reason: collision with root package name */
    public int f56931i;

    /* renamed from: j, reason: collision with root package name */
    public int f56932j;

    /* renamed from: k, reason: collision with root package name */
    public int f56933k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56926d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56927e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56929g = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56934l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56935m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56936n = "";

    @Override // jx3.a
    public int g() {
        return 22080;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56926d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56927e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56928f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56929g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56930h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56931i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56932j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56933k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56934l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56935m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56936n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f56926d);
        stringBuffer.append("\r\nclickTabContextid:");
        stringBuffer.append(this.f56927e);
        stringBuffer.append("\r\ncommentScene:");
        stringBuffer.append(this.f56928f);
        stringBuffer.append("\r\nItemId:");
        stringBuffer.append(this.f56929g);
        stringBuffer.append("\r\nPosition:");
        stringBuffer.append(this.f56930h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56931i);
        stringBuffer.append("\r\nmyAccountType:");
        stringBuffer.append(this.f56932j);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f56933k);
        stringBuffer.append("\r\nreasonId:");
        stringBuffer.append(this.f56934l);
        stringBuffer.append("\r\nhotWordId:");
        stringBuffer.append(this.f56935m);
        stringBuffer.append("\r\nrequestId:");
        stringBuffer.append(this.f56936n);
        return stringBuffer.toString();
    }
}
