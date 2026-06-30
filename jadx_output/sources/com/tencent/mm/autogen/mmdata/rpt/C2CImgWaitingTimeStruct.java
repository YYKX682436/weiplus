package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class C2CImgWaitingTimeStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f55488h;

    /* renamed from: n, reason: collision with root package name */
    public cm.b f55494n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55484d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55485e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f55486f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f55487g = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f55489i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f55490j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f55491k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f55492l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f55493m = 0;

    @Override // jx3.a
    public int g() {
        return 15749;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55484d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55485e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55486f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55487g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55488h ? 1 : 0);
        stringBuffer.append(",");
        stringBuffer.append(this.f55489i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55490j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55491k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55492l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55493m);
        stringBuffer.append(",");
        cm.b bVar = this.f55494n;
        stringBuffer.append(bVar != null ? bVar.f43028d : -1);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f55484d);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f55485e);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f55486f);
        stringBuffer.append("\r\nMsgCreateTime:");
        stringBuffer.append(this.f55487g);
        stringBuffer.append("\r\nIsHdImgBool:");
        stringBuffer.append(this.f55488h);
        stringBuffer.append("\r\nImgSize:");
        stringBuffer.append(this.f55489i);
        stringBuffer.append("\r\nImgWidth:");
        stringBuffer.append(this.f55490j);
        stringBuffer.append("\r\nImgHeight:");
        stringBuffer.append(this.f55491k);
        stringBuffer.append("\r\nStartDownloadTimeStampMs:");
        stringBuffer.append(this.f55492l);
        stringBuffer.append("\r\nFinishDownloadTimeStampMs:");
        stringBuffer.append(this.f55493m);
        stringBuffer.append("\r\nFinishCode:");
        stringBuffer.append(this.f55494n);
        return stringBuffer.toString();
    }
}
