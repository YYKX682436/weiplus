package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityFirstRenderStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f62479f;

    /* renamed from: g, reason: collision with root package name */
    public cm.w f62480g;

    /* renamed from: h, reason: collision with root package name */
    public long f62481h;

    /* renamed from: i, reason: collision with root package name */
    public long f62482i;

    /* renamed from: j, reason: collision with root package name */
    public long f62483j;

    /* renamed from: k, reason: collision with root package name */
    public long f62484k;

    /* renamed from: l, reason: collision with root package name */
    public long f62485l;

    /* renamed from: n, reason: collision with root package name */
    public long f62487n;

    /* renamed from: o, reason: collision with root package name */
    public long f62488o;

    /* renamed from: q, reason: collision with root package name */
    public long f62490q;

    /* renamed from: r, reason: collision with root package name */
    public long f62491r;

    /* renamed from: s, reason: collision with root package name */
    public long f62492s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62477d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62478e = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62486m = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f62489p = "";

    @Override // jx3.a
    public int g() {
        return 18798;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62477d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62478e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62479f);
        stringBuffer.append(",");
        cm.w wVar = this.f62480g;
        stringBuffer.append(wVar != null ? wVar.f43239d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62481h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62482i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62483j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62484k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62485l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62486m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62487n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62488o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62489p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62490q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62491r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62492s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62477d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62478e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62479f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62480g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62481h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62482i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62483j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62484k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62485l);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62486m);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62487n);
        stringBuffer.append("\r\nisPreloadPageFrame:");
        stringBuffer.append(this.f62488o);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f62489p);
        stringBuffer.append("\r\nisSplitCodeLib:");
        stringBuffer.append(this.f62490q);
        stringBuffer.append("\r\ninitProcess:");
        stringBuffer.append(this.f62491r);
        stringBuffer.append("\r\nisFirstPageRenderingCacheAccepted:");
        stringBuffer.append(this.f62492s);
        return stringBuffer.toString();
    }
}
