package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class video_background_eventStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63172d;

    /* renamed from: e, reason: collision with root package name */
    public long f63173e;

    /* renamed from: f, reason: collision with root package name */
    public long f63174f;

    /* renamed from: g, reason: collision with root package name */
    public long f63175g;

    /* renamed from: h, reason: collision with root package name */
    public long f63176h;

    /* renamed from: i, reason: collision with root package name */
    public long f63177i;

    /* renamed from: j, reason: collision with root package name */
    public long f63178j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f63179k = "";

    @Override // jx3.a
    public int g() {
        return 25060;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63172d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63173e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63174f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63175g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63176h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63177i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63178j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63179k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f63172d);
        stringBuffer.append("\r\nroomkey:");
        stringBuffer.append(this.f63173e);
        stringBuffer.append("\r\nroomtype:");
        stringBuffer.append(this.f63174f);
        stringBuffer.append("\r\nMemberIdx:");
        stringBuffer.append(this.f63175g);
        stringBuffer.append("\r\nDialTime:");
        stringBuffer.append(this.f63176h);
        stringBuffer.append("\r\nConnectTime:");
        stringBuffer.append(this.f63177i);
        stringBuffer.append("\r\nHangupTime:");
        stringBuffer.append(this.f63178j);
        stringBuffer.append("\r\nBackground_event:");
        stringBuffer.append(this.f63179k);
        return stringBuffer.toString();
    }
}
