package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLivePerformanceDataStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57270d;

    /* renamed from: e, reason: collision with root package name */
    public long f57271e;

    /* renamed from: f, reason: collision with root package name */
    public long f57272f;

    /* renamed from: g, reason: collision with root package name */
    public long f57273g;

    /* renamed from: h, reason: collision with root package name */
    public long f57274h;

    /* renamed from: i, reason: collision with root package name */
    public long f57275i;

    /* renamed from: j, reason: collision with root package name */
    public long f57276j;

    /* renamed from: k, reason: collision with root package name */
    public int f57277k;

    /* renamed from: l, reason: collision with root package name */
    public long f57278l;

    /* renamed from: n, reason: collision with root package name */
    public long f57280n;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57279m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f57281o = "";

    @Override // jx3.a
    public int g() {
        return 23799;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57270d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57271e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57272f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57273g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57274h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57275i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57276j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57277k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57278l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57279m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57280n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57281o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sceneType:");
        stringBuffer.append(this.f57270d);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f57271e);
        stringBuffer.append("\r\nfirstFrameTime:");
        stringBuffer.append(this.f57272f);
        stringBuffer.append("\r\nstartPlayTime:");
        stringBuffer.append(this.f57273g);
        stringBuffer.append("\r\nconnectTime:");
        stringBuffer.append(this.f57274h);
        stringBuffer.append("\r\nconnectToDecodeTime:");
        stringBuffer.append(this.f57275i);
        stringBuffer.append("\r\ndecodeTime:0\r\nplayTime:");
        stringBuffer.append(this.f57276j);
        stringBuffer.append("\r\nisFirstLivePreload:");
        stringBuffer.append(this.f57277k);
        stringBuffer.append("\r\nstartPlayToFrameTime:");
        stringBuffer.append(this.f57278l);
        stringBuffer.append("\r\nsnn:");
        stringBuffer.append(this.f57279m);
        stringBuffer.append("\r\nliveid:");
        stringBuffer.append(this.f57280n);
        stringBuffer.append("\r\ndata:");
        stringBuffer.append(this.f57281o);
        return stringBuffer.toString();
    }
}
