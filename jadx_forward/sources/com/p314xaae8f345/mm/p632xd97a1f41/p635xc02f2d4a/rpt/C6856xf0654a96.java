package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendImgErrorReportStruct */
/* loaded from: classes12.dex */
public final class C6856xf0654a96 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141743d;

    /* renamed from: e, reason: collision with root package name */
    public long f141744e;

    /* renamed from: f, reason: collision with root package name */
    public long f141745f;

    /* renamed from: h, reason: collision with root package name */
    public long f141747h;

    /* renamed from: i, reason: collision with root package name */
    public long f141748i;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141746g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f141749j = "";

    @Override // jx3.a
    public int g() {
        return 27902;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141743d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141744e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141745f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141746g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141747h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141748i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141749j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorCode:");
        stringBuffer.append(this.f141743d);
        stringBuffer.append("\r\nCompressType:");
        stringBuffer.append(this.f141744e);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f141745f);
        stringBuffer.append("\r\nFileName:");
        stringBuffer.append(this.f141746g);
        stringBuffer.append("\r\nrotateCount:");
        stringBuffer.append(this.f141747h);
        stringBuffer.append("\r\nAvgTime:");
        stringBuffer.append(this.f141748i);
        stringBuffer.append("\r\nRev:");
        stringBuffer.append(this.f141749j);
        return stringBuffer.toString();
    }
}
