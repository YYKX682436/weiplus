package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class RingTonePlaySoundReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60029d;

    /* renamed from: f, reason: collision with root package name */
    public long f60031f;

    /* renamed from: g, reason: collision with root package name */
    public long f60032g;

    /* renamed from: i, reason: collision with root package name */
    public long f60034i;

    /* renamed from: j, reason: collision with root package name */
    public long f60035j;

    /* renamed from: k, reason: collision with root package name */
    public long f60036k;

    /* renamed from: l, reason: collision with root package name */
    public int f60037l;

    /* renamed from: m, reason: collision with root package name */
    public long f60038m;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60030e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60033h = "";

    @Override // jx3.a
    public int g() {
        return 23613;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60029d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60030e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60031f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60032g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60033h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60034i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f60035j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60036k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60037l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60038m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f60029d);
        stringBuffer.append("\r\nroomkey:0\r\nfeedid:");
        stringBuffer.append(this.f60030e);
        stringBuffer.append("\r\nfeedtype:");
        stringBuffer.append(this.f60031f);
        stringBuffer.append("\r\nis_individual:");
        stringBuffer.append(this.f60032g);
        stringBuffer.append("\r\ntousername:");
        stringBuffer.append(this.f60033h);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f60034i);
        stringBuffer.append("\r\nplayScene:0\r\nis_callkit:0\r\nplayDuration:");
        stringBuffer.append(this.f60035j);
        stringBuffer.append("\r\nroom_key:");
        stringBuffer.append(this.f60036k);
        stringBuffer.append("\r\nis_mute:");
        stringBuffer.append(this.f60037l);
        stringBuffer.append("\r\nis_vibrate:");
        stringBuffer.append(this.f60038m);
        return stringBuffer.toString();
    }
}
