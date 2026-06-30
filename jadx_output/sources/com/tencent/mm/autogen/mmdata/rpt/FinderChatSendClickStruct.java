package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderChatSendClickStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f56629g;

    /* renamed from: h, reason: collision with root package name */
    public long f56630h;

    /* renamed from: k, reason: collision with root package name */
    public long f56633k;

    /* renamed from: l, reason: collision with root package name */
    public long f56634l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56626d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56627e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56628f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56631i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56632j = "";

    @Override // jx3.a
    public int g() {
        return 20671;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56626d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56627e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56628f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56629g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56630h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56631i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56632j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56633k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56634l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("finderUsername:");
        stringBuffer.append(this.f56626d);
        stringBuffer.append("\r\ntoUsername:");
        stringBuffer.append(this.f56627e);
        stringBuffer.append("\r\ntoFinderUsername:");
        stringBuffer.append(this.f56628f);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f56629g);
        stringBuffer.append("\r\nresult:");
        stringBuffer.append(this.f56630h);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f56631i);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f56632j);
        stringBuffer.append("\r\nclickScene:");
        stringBuffer.append(this.f56633k);
        stringBuffer.append("\r\nchatType:");
        stringBuffer.append(this.f56634l);
        return stringBuffer.toString();
    }
}
