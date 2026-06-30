package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class VideoSendReporterStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61617e;

    /* renamed from: f, reason: collision with root package name */
    public long f61618f;

    /* renamed from: h, reason: collision with root package name */
    public long f61620h;

    /* renamed from: i, reason: collision with root package name */
    public long f61621i;

    /* renamed from: j, reason: collision with root package name */
    public long f61622j;

    /* renamed from: k, reason: collision with root package name */
    public long f61623k;

    /* renamed from: l, reason: collision with root package name */
    public int f61624l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61616d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61619g = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61625m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f61626n = "";

    @Override // jx3.a
    public int g() {
        return 24975;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61616d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61617e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61618f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61619g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61620h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61621i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61622j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61623k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61624l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61625m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61626n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f61616d);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f61617e);
        stringBuffer.append("\r\nVideoSource:");
        stringBuffer.append(this.f61618f);
        stringBuffer.append("\r\nToUsername:");
        stringBuffer.append(this.f61619g);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f61620h);
        stringBuffer.append("\r\nOriginSize:");
        stringBuffer.append(this.f61621i);
        stringBuffer.append("\r\nCompressSize:");
        stringBuffer.append(this.f61622j);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61623k);
        stringBuffer.append("\r\nFailReason:");
        stringBuffer.append(this.f61624l);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f61625m);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f61626n);
        return stringBuffer.toString();
    }
}
