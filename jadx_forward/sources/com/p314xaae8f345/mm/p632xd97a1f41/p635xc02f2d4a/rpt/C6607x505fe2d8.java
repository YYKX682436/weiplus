package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayerSizeMonitorStruct */
/* loaded from: classes2.dex */
public final class C6607x505fe2d8 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139607d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139608e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f139609f;

    /* renamed from: g, reason: collision with root package name */
    public int f139610g;

    /* renamed from: h, reason: collision with root package name */
    public int f139611h;

    /* renamed from: i, reason: collision with root package name */
    public int f139612i;

    /* renamed from: j, reason: collision with root package name */
    public int f139613j;

    @Override // jx3.a
    public int g() {
        return 36040;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139607d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139608e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139609f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139610g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139611h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139612i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139613j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feed_id:");
        stringBuffer.append(this.f139607d);
        stringBuffer.append("\r\nfeed_bitrate_level:");
        stringBuffer.append(this.f139608e);
        stringBuffer.append("\r\nfinder_object_width:");
        stringBuffer.append(this.f139609f);
        stringBuffer.append("\r\nfinder_object_height:");
        stringBuffer.append(this.f139610g);
        stringBuffer.append("\r\nvideo_moov_width:");
        stringBuffer.append(this.f139611h);
        stringBuffer.append("\r\nvideo_moov_height:");
        stringBuffer.append(this.f139612i);
        stringBuffer.append("\r\nratio_delta:");
        stringBuffer.append(this.f139613j);
        return stringBuffer.toString();
    }
}
