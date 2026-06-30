package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct */
/* loaded from: classes14.dex */
public final class C7006x6281fdcd extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143206d;

    /* renamed from: e, reason: collision with root package name */
    public long f143207e;

    /* renamed from: f, reason: collision with root package name */
    public int f143208f;

    /* renamed from: g, reason: collision with root package name */
    public int f143209g;

    /* renamed from: h, reason: collision with root package name */
    public int f143210h;

    /* renamed from: i, reason: collision with root package name */
    public int f143211i;

    @Override // jx3.a
    public int g() {
        return 28680;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143206d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143207e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143208f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143209g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143210h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143211i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomId:");
        stringBuffer.append(this.f143206d);
        stringBuffer.append("\r\nroomKey:");
        stringBuffer.append(this.f143207e);
        stringBuffer.append("\r\nroomType:");
        stringBuffer.append(this.f143208f);
        stringBuffer.append("\r\nenableShortcut:");
        stringBuffer.append(this.f143209g);
        stringBuffer.append("\r\nuseShortcut:");
        stringBuffer.append(this.f143210h);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f143211i);
        return stringBuffer.toString();
    }
}
