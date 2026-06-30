package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderModifyStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57418d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57419e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f57420f;

    @Override // jx3.a
    public int g() {
        return 33591;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57418d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57419e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57420f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feed_id:");
        stringBuffer.append(this.f57418d);
        stringBuffer.append("\r\nfeed_modify_info:");
        stringBuffer.append(this.f57419e);
        stringBuffer.append("\r\nmodify_ret:");
        stringBuffer.append(this.f57420f);
        return stringBuffer.toString();
    }
}
