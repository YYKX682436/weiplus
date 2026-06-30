package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveCdnUserEnterLiveTimeCostStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57086e;

    /* renamed from: f, reason: collision with root package name */
    public long f57087f;

    /* renamed from: g, reason: collision with root package name */
    public long f57088g;

    /* renamed from: h, reason: collision with root package name */
    public long f57089h;

    /* renamed from: i, reason: collision with root package name */
    public long f57090i;

    /* renamed from: j, reason: collision with root package name */
    public long f57091j;

    /* renamed from: k, reason: collision with root package name */
    public int f57092k;

    /* renamed from: l, reason: collision with root package name */
    public long f57093l;

    /* renamed from: m, reason: collision with root package name */
    public long f57094m;

    /* renamed from: n, reason: collision with root package name */
    public long f57095n;

    /* renamed from: o, reason: collision with root package name */
    public long f57096o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57085d = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f57097p = "";

    @Override // jx3.a
    public int g() {
        return 22976;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57085d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57086e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57087f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57088g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57089h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57090i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57091j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57092k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57093l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57094m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57095n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57096o);
        stringBuffer.append(",");
        stringBuffer.append(this.f57097p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("tid:");
        stringBuffer.append(this.f57085d);
        stringBuffer.append("\r\nliveId:");
        stringBuffer.append(this.f57086e);
        stringBuffer.append("\r\ncommentScene:0\r\nbeginEnterLiveTimestamp:");
        stringBuffer.append(this.f57087f);
        stringBuffer.append("\r\nstartCdnPlayTimestamp:");
        stringBuffer.append(this.f57088g);
        stringBuffer.append("\r\ncdnPlayerConnectTimestamp:");
        stringBuffer.append(this.f57089h);
        stringBuffer.append("\r\nrealCdnPlayOkTimestamp:");
        stringBuffer.append(this.f57090i);
        stringBuffer.append("\r\nfirstJoinLiveResponseTimestamp:");
        stringBuffer.append(this.f57091j);
        stringBuffer.append("\r\nisPreviewingWhenEnterLive:0\r\nhasJoinLiveMicInfo:");
        stringBuffer.append(this.f57092k);
        stringBuffer.append("\r\nloadJoinLiveMicInfoFinishedTimestamp:");
        stringBuffer.append(this.f57093l);
        stringBuffer.append("\r\ncloseLiveOrLiveEndTimestamp:");
        stringBuffer.append(this.f57094m);
        stringBuffer.append("\r\ncanReuseCdnPlayerItemWhenEnterLive:0\r\nuserTapOpenLiveTimestamp:");
        stringBuffer.append(this.f57095n);
        stringBuffer.append("\r\nfirstShowCdnPlayerViewTimestamp:");
        stringBuffer.append(this.f57096o);
        stringBuffer.append("\r\ncommentSceneStr:");
        stringBuffer.append(this.f57097p);
        return stringBuffer.toString();
    }
}
