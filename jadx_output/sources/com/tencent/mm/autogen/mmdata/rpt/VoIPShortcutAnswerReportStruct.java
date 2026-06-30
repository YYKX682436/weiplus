package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class VoIPShortcutAnswerReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61673d;

    /* renamed from: e, reason: collision with root package name */
    public long f61674e;

    /* renamed from: f, reason: collision with root package name */
    public int f61675f;

    /* renamed from: g, reason: collision with root package name */
    public int f61676g;

    /* renamed from: h, reason: collision with root package name */
    public int f61677h;

    /* renamed from: i, reason: collision with root package name */
    public int f61678i;

    @Override // jx3.a
    public int g() {
        return 28680;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61673d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61674e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61675f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61676g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61677h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61678i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomId:");
        stringBuffer.append(this.f61673d);
        stringBuffer.append("\r\nroomKey:");
        stringBuffer.append(this.f61674e);
        stringBuffer.append("\r\nroomType:");
        stringBuffer.append(this.f61675f);
        stringBuffer.append("\r\nenableShortcut:");
        stringBuffer.append(this.f61676g);
        stringBuffer.append("\r\nuseShortcut:");
        stringBuffer.append(this.f61677h);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f61678i);
        return stringBuffer.toString();
    }
}
