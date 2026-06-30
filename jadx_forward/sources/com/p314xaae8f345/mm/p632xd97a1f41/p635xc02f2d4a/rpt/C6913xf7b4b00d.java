package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct */
/* loaded from: classes4.dex */
public final class C6913xf7b4b00d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142327d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f142328e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f142329f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f142330g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f142331h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f142332i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f142333j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f142334k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f142335l = 0;

    @Override // jx3.a
    public int g() {
        return 26179;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142327d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142328e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142329f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142330g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142331h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142332i);
        stringBuffer.append(",");
        stringBuffer.append(this.f142333j);
        stringBuffer.append(",");
        stringBuffer.append(this.f142334k);
        stringBuffer.append(",");
        stringBuffer.append(this.f142335l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f142327d);
        stringBuffer.append("\r\nresult:");
        stringBuffer.append(this.f142328e);
        stringBuffer.append("\r\nusertype:");
        stringBuffer.append(this.f142329f);
        stringBuffer.append("\r\nmediaEditPageCnt:");
        stringBuffer.append(this.f142330g);
        stringBuffer.append("\r\nmediaEditPlayTime:");
        stringBuffer.append(this.f142331h);
        stringBuffer.append("\r\neditPagePlayCnt:");
        stringBuffer.append(this.f142332i);
        stringBuffer.append("\r\neditPagePlayTime:");
        stringBuffer.append(this.f142333j);
        stringBuffer.append("\r\nmuxTime:");
        stringBuffer.append(this.f142334k);
        stringBuffer.append("\r\nfakePublishTime:");
        stringBuffer.append(this.f142335l);
        return stringBuffer.toString();
    }
}
