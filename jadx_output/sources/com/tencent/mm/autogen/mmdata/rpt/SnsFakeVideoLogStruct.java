package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsFakeVideoLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60551d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60552e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f60553f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f60554g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f60555h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60556i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60557j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f60558k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f60559l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f60560m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f60561n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f60562o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f60563p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f60564q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f60565r = 0;

    @Override // jx3.a
    public int g() {
        return 26122;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60551d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60552e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60553f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60554g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60555h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60556i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60557j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60558k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60559l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60560m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60561n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60562o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60563p);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60564q);
        stringBuffer.append(",");
        stringBuffer.append(this.f60565r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f60551d);
        stringBuffer.append("\r\nWorkId:");
        stringBuffer.append(this.f60552e);
        stringBuffer.append("\r\nMuxCode:");
        stringBuffer.append(this.f60553f);
        stringBuffer.append("\r\nLastWorkType:");
        stringBuffer.append(this.f60554g);
        stringBuffer.append("\r\nCurrentWorkType:");
        stringBuffer.append(this.f60555h);
        stringBuffer.append("\r\nConfirmEditTimeStamp:");
        stringBuffer.append(this.f60556i);
        stringBuffer.append("\r\nConfirmPublishTimeStamp:");
        stringBuffer.append(this.f60557j);
        stringBuffer.append("\r\nStartMuxTimeStamp:");
        stringBuffer.append(this.f60558k);
        stringBuffer.append("\r\nFinishMuxTimeStamp:");
        stringBuffer.append(this.f60559l);
        stringBuffer.append("\r\nFakeVideoIsPlaySuccess:");
        stringBuffer.append(this.f60560m);
        stringBuffer.append("\r\nEncodeConfig:");
        stringBuffer.append(this.f60561n);
        stringBuffer.append("\r\nIsSnsDoubleCheck:");
        stringBuffer.append(this.f60562o);
        stringBuffer.append("\r\nMixVideoInfo:");
        stringBuffer.append(this.f60563p);
        stringBuffer.append("\r\nIsUseSoftRetry:0\r\nIsKilledProcessReStart:");
        stringBuffer.append(this.f60564q);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f60565r);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct p(java.lang.String str) {
        this.f60552e = b("WorkId", str, true);
        return this;
    }
}
