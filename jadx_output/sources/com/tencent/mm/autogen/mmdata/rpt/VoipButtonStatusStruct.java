package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class VoipButtonStatusStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61704d;

    /* renamed from: e, reason: collision with root package name */
    public long f61705e;

    /* renamed from: f, reason: collision with root package name */
    public long f61706f;

    /* renamed from: g, reason: collision with root package name */
    public long f61707g;

    /* renamed from: i, reason: collision with root package name */
    public long f61709i;

    /* renamed from: j, reason: collision with root package name */
    public long f61710j;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61708h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61711k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f61712l = "";

    @Override // jx3.a
    public int g() {
        return 26491;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61704d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61705e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61706f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61707g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61708h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61709i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61710j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61711k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61712l);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f61704d);
        stringBuffer.append("\r\nroomkey:");
        stringBuffer.append(this.f61705e);
        stringBuffer.append("\r\nroomtype:");
        stringBuffer.append(this.f61706f);
        stringBuffer.append("\r\nmemberidx:");
        stringBuffer.append(this.f61707g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f61708h);
        stringBuffer.append("\r\noperatetime:");
        stringBuffer.append(this.f61709i);
        stringBuffer.append("\r\nstage:");
        stringBuffer.append(this.f61710j);
        stringBuffer.append("\r\naudio_session_port:");
        stringBuffer.append(this.f61711k);
        stringBuffer.append("\r\naction_res:");
        stringBuffer.append(this.f61712l);
        stringBuffer.append("\r\nvoip_entrance:0");
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct p(java.lang.String str) {
        this.f61708h = b("action", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct q(java.lang.String str) {
        this.f61711k = b("audio_session_port", str, true);
        return this;
    }
}
