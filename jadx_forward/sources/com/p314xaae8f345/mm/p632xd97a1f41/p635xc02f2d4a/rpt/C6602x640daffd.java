package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderUserPageScreenshotByClientStruct */
/* loaded from: classes2.dex */
public final class C6602x640daffd extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139501e;

    /* renamed from: f, reason: collision with root package name */
    public long f139502f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139500d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139503g = "";

    @Override // jx3.a
    public int g() {
        return 36194;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139500d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139501e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139502f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139503g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("finder_user_name:");
        stringBuffer.append(this.f139500d);
        stringBuffer.append("\r\ncomment_scene:");
        stringBuffer.append(this.f139501e);
        stringBuffer.append("\r\nenter_type:");
        stringBuffer.append(this.f139502f);
        stringBuffer.append("\r\nfeedid_list:");
        stringBuffer.append(this.f139503g);
        return stringBuffer.toString();
    }
}
