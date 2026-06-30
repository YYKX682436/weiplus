package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GameWebPageTimeReportStruct */
/* loaded from: classes8.dex */
public final class C6634xf5c4cb47 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f139888d;

    /* renamed from: e, reason: collision with root package name */
    public long f139889e;

    /* renamed from: g, reason: collision with root package name */
    public long f139891g;

    /* renamed from: i, reason: collision with root package name */
    public long f139893i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139890f = "";

    /* renamed from: h, reason: collision with root package name */
    public final int f139892h = 1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139894j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f139895k = "";

    @Override // jx3.a
    public int g() {
        return 27743;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139888d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139889e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139890f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139891g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139892h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139893i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139894j);
        stringBuffer.append(",");
        stringBuffer.append(this.f139895k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Time:");
        stringBuffer.append(this.f139888d);
        stringBuffer.append("\r\nSceneId:");
        stringBuffer.append(this.f139889e);
        stringBuffer.append("\r\nsession_id:");
        stringBuffer.append(this.f139890f);
        stringBuffer.append("\r\nssid:");
        stringBuffer.append(this.f139891g);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f139892h);
        stringBuffer.append("\r\nclient_timestamp:");
        stringBuffer.append(this.f139893i);
        stringBuffer.append("\r\nURL:");
        stringBuffer.append(this.f139894j);
        stringBuffer.append("\r\nextern_info:");
        stringBuffer.append(this.f139895k);
        return stringBuffer.toString();
    }
}
