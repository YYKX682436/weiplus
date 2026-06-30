package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class VideoSendLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f61607d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f61608e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f61609f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61610g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61611h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61612i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f61613j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f61614k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f61615l = -1;

    @Override // jx3.a
    public int g() {
        return 24620;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61607d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61608e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61609f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61610g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61611h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61612i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61613j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61614k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61615l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f61607d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f61608e);
        stringBuffer.append("\r\nEncodeInfo:");
        stringBuffer.append(this.f61609f);
        stringBuffer.append("\r\nOriginMediaInfo:");
        stringBuffer.append(this.f61610g);
        stringBuffer.append("\r\nRemuxInfo:");
        stringBuffer.append(this.f61611h);
        stringBuffer.append("\r\nOutputMediaInfo:");
        stringBuffer.append(this.f61612i);
        stringBuffer.append("\r\nResultCode:");
        stringBuffer.append(this.f61613j);
        stringBuffer.append("\r\nRemuxDuration:");
        stringBuffer.append(this.f61614k);
        stringBuffer.append("\r\nParallelSize:");
        stringBuffer.append(this.f61615l);
        return stringBuffer.toString();
    }
}
