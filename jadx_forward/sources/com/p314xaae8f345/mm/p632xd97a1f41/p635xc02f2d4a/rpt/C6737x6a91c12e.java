package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct */
/* loaded from: classes5.dex */
public final class C6737x6a91c12e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140711d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f140712e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f140713f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f140714g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f140715h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f140716i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f140717j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f140718k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f140719l = 0;

    @Override // jx3.a
    public int g() {
        return 36065;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140711d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140712e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140713f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140714g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140715h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140716i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140717j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140718k);
        stringBuffer.append(",");
        stringBuffer.append(this.f140719l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f140711d);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f140712e);
        stringBuffer.append("\r\nRevokingCount:");
        stringBuffer.append(this.f140713f);
        stringBuffer.append("\r\nSucCount:");
        stringBuffer.append(this.f140714g);
        stringBuffer.append("\r\nFailCount:");
        stringBuffer.append(this.f140715h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f140716i);
        stringBuffer.append("\r\nInterval:");
        stringBuffer.append(this.f140717j);
        stringBuffer.append("\r\nRevokingBatchId:");
        stringBuffer.append(this.f140718k);
        stringBuffer.append("\r\nRevokingType:");
        stringBuffer.append(this.f140719l);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6737x6a91c12e p(java.lang.String str) {
        this.f140718k = b("RevokingBatchId", str, true);
        return this;
    }
}
