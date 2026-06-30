package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct */
/* loaded from: classes14.dex */
public final class C7011xe05dc99 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143237d;

    /* renamed from: e, reason: collision with root package name */
    public long f143238e;

    /* renamed from: f, reason: collision with root package name */
    public long f143239f;

    /* renamed from: g, reason: collision with root package name */
    public long f143240g;

    /* renamed from: i, reason: collision with root package name */
    public long f143242i;

    /* renamed from: j, reason: collision with root package name */
    public long f143243j;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143241h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f143244k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f143245l = "";

    @Override // jx3.a
    public int g() {
        return 26491;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143237d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143238e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143239f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143240g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143241h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143242i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143243j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143244k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143245l);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f143237d);
        stringBuffer.append("\r\nroomkey:");
        stringBuffer.append(this.f143238e);
        stringBuffer.append("\r\nroomtype:");
        stringBuffer.append(this.f143239f);
        stringBuffer.append("\r\nmemberidx:");
        stringBuffer.append(this.f143240g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f143241h);
        stringBuffer.append("\r\noperatetime:");
        stringBuffer.append(this.f143242i);
        stringBuffer.append("\r\nstage:");
        stringBuffer.append(this.f143243j);
        stringBuffer.append("\r\naudio_session_port:");
        stringBuffer.append(this.f143244k);
        stringBuffer.append("\r\naction_res:");
        stringBuffer.append(this.f143245l);
        stringBuffer.append("\r\nvoip_entrance:0");
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 p(java.lang.String str) {
        this.f143241h = b("action", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 q(java.lang.String str) {
        this.f143244k = b("audio_session_port", str, true);
        return this;
    }
}
