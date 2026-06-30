package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class TimelineMissReadJumpBtnClickActionStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61261e;

    /* renamed from: f, reason: collision with root package name */
    public long f61262f;

    /* renamed from: g, reason: collision with root package name */
    public long f61263g;

    /* renamed from: h, reason: collision with root package name */
    public long f61264h;

    /* renamed from: j, reason: collision with root package name */
    public long f61266j;

    /* renamed from: l, reason: collision with root package name */
    public long f61268l;

    /* renamed from: m, reason: collision with root package name */
    public long f61269m;

    /* renamed from: n, reason: collision with root package name */
    public long f61270n;

    /* renamed from: o, reason: collision with root package name */
    public long f61271o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61260d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61265i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61267k = "";

    @Override // jx3.a
    public int g() {
        return 19056;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61260d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61261e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61262f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61263g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61264h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61265i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61266j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61267k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61268l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61269m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61270n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61271o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f61260d);
        stringBuffer.append("\r\nMissReadJumpBtnId:");
        stringBuffer.append(this.f61261e);
        stringBuffer.append("\r\nMissReadJumpBreakLayerId:");
        stringBuffer.append(this.f61262f);
        stringBuffer.append("\r\nIsJumpToNearestBreakLayer:");
        stringBuffer.append(this.f61263g);
        stringBuffer.append("\r\nJumpSkipFeedsCount:");
        stringBuffer.append(this.f61264h);
        stringBuffer.append("\r\nJumpBreakLayerFeeds:");
        stringBuffer.append(this.f61265i);
        stringBuffer.append("\r\nJumpBreakLayerFeedsCount:");
        stringBuffer.append(this.f61266j);
        stringBuffer.append("\r\nJumpBreakLayerExposureFeeds:");
        stringBuffer.append(this.f61267k);
        stringBuffer.append("\r\nJumpBreakLayerExposureFeedsCount:0\r\nBreakLayerFirstFeedFromNow:");
        stringBuffer.append(this.f61268l);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f61269m);
        stringBuffer.append("\r\nSubSeq:");
        stringBuffer.append(this.f61270n);
        stringBuffer.append("\r\nSubSeqSum:");
        stringBuffer.append(this.f61271o);
        return stringBuffer.toString();
    }
}
