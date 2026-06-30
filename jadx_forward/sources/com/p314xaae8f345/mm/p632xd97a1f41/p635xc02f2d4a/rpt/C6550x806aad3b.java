package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPauseReportByClientStruct */
/* loaded from: classes2.dex */
public final class C6550x806aad3b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139007d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139008e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f139009f;

    /* renamed from: g, reason: collision with root package name */
    public long f139010g;

    /* renamed from: h, reason: collision with root package name */
    public long f139011h;

    @Override // jx3.a
    public int g() {
        return 36193;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139007d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139008e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139009f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139010g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139011h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feed_id:");
        stringBuffer.append(this.f139007d);
        stringBuffer.append("\r\nfinder_user_name:");
        stringBuffer.append(this.f139008e);
        stringBuffer.append("\r\npause_position:");
        stringBuffer.append(this.f139009f);
        stringBuffer.append("\r\ncomment_scene:");
        stringBuffer.append(this.f139010g);
        stringBuffer.append("\r\nenter_type:");
        stringBuffer.append(this.f139011h);
        return stringBuffer.toString();
    }
}
