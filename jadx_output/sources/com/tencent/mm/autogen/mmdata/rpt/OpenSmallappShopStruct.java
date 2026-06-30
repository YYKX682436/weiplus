package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class OpenSmallappShopStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59806d;

    /* renamed from: e, reason: collision with root package name */
    public long f59807e;

    /* renamed from: f, reason: collision with root package name */
    public long f59808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59809g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59810h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59811i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59812j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59813k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59814l = "";

    @Override // jx3.a
    public int g() {
        return 21837;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59806d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59807e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59808f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59809g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59810h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59811i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59812j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59813k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59814l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionTS:");
        stringBuffer.append(this.f59806d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f59807e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f59808f);
        stringBuffer.append("\r\nsetting:");
        stringBuffer.append(this.f59809g);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f59810h);
        stringBuffer.append("\r\nsession_id:");
        stringBuffer.append(this.f59811i);
        stringBuffer.append("\r\nfinderid:");
        stringBuffer.append(this.f59812j);
        stringBuffer.append("\r\nclickid:");
        stringBuffer.append(this.f59813k);
        stringBuffer.append("\r\nrequestID:");
        stringBuffer.append(this.f59814l);
        return stringBuffer.toString();
    }
}
