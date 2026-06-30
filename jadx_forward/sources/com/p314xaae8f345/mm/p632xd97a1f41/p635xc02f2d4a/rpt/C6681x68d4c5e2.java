package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveRoomPlayStatusStruct */
/* loaded from: classes10.dex */
public final class C6681x68d4c5e2 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140187d;

    /* renamed from: e, reason: collision with root package name */
    public long f140188e;

    /* renamed from: f, reason: collision with root package name */
    public long f140189f;

    /* renamed from: g, reason: collision with root package name */
    public long f140190g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140191h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140192i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140193j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f140194k = "";

    @Override // jx3.a
    public int g() {
        return 30110;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140187d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140188e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140189f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140190g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140191h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140192i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140193j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140194k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("reportTime:");
        stringBuffer.append(this.f140187d);
        stringBuffer.append("\r\nplayStatus:");
        stringBuffer.append(this.f140188e);
        stringBuffer.append("\r\nplayTime:");
        stringBuffer.append(this.f140189f);
        stringBuffer.append("\r\nliveScene:");
        stringBuffer.append(this.f140190g);
        stringBuffer.append("\r\nstreamId:");
        stringBuffer.append(this.f140191h);
        stringBuffer.append("\r\nliveid:");
        stringBuffer.append(this.f140192i);
        stringBuffer.append("\r\nanchorNickname:");
        stringBuffer.append(this.f140193j);
        stringBuffer.append("\r\nplayUrl:");
        stringBuffer.append(this.f140194k);
        return stringBuffer.toString();
    }
}
