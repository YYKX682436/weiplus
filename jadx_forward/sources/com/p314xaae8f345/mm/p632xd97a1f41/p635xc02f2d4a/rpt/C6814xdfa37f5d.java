package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct */
/* loaded from: classes12.dex */
public final class C6814xdfa37f5d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141383d;

    /* renamed from: e, reason: collision with root package name */
    public long f141384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141385f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141386g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f141387h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f141388i;

    /* renamed from: j, reason: collision with root package name */
    public long f141389j;

    /* renamed from: k, reason: collision with root package name */
    public long f141390k;

    /* renamed from: l, reason: collision with root package name */
    public long f141391l;

    /* renamed from: m, reason: collision with root package name */
    public long f141392m;

    /* renamed from: n, reason: collision with root package name */
    public long f141393n;

    @Override // jx3.a
    public int g() {
        return 27004;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141383d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141384e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141385f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141386g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141387h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f141388i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141389j);
        stringBuffer.append(",");
        stringBuffer.append(this.f141390k);
        stringBuffer.append(",");
        stringBuffer.append(this.f141391l);
        stringBuffer.append(",");
        stringBuffer.append(this.f141392m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f141393n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f141383d);
        stringBuffer.append("\r\nMediaType:");
        stringBuffer.append(this.f141384e);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f141385f);
        stringBuffer.append("\r\nMsgID:");
        stringBuffer.append(this.f141386g);
        stringBuffer.append("\r\nMediaID:");
        stringBuffer.append(this.f141387h);
        stringBuffer.append("\r\nIsFirstClkOrExpo:0\r\nPreloadStatus:");
        stringBuffer.append(this.f141388i);
        stringBuffer.append("\r\nClientPreloadPriority:");
        stringBuffer.append(this.f141389j);
        stringBuffer.append("\r\nServerPreloadPriority:");
        stringBuffer.append(this.f141390k);
        stringBuffer.append("\r\nResourceStatus:");
        stringBuffer.append(this.f141391l);
        stringBuffer.append("\r\nMsgCreateTime:");
        stringBuffer.append(this.f141392m);
        stringBuffer.append("\r\nMsgReceiveTime:0\r\npd:");
        stringBuffer.append(this.f141393n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6814xdfa37f5d p(java.lang.String str) {
        this.f141385f = b("ChatName", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6814xdfa37f5d q(java.lang.String str) {
        this.f141386g = b("MsgID", str, true);
        return this;
    }
}
