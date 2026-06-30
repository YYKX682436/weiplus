package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StoryProfileTabExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60937d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f60938e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60939f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60940g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60941h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60942i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60943j = 0;

    @Override // jx3.a
    public int g() {
        return 16844;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60937d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60938e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60939f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60940g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60941h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60942i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60943j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickMyProfileTime:");
        stringBuffer.append(this.f60937d);
        stringBuffer.append("\r\nClickCameraTime:");
        stringBuffer.append(this.f60938e);
        stringBuffer.append("\r\nClickGuidePageTime:");
        stringBuffer.append(this.f60939f);
        stringBuffer.append("\r\nisProfileRedPoint:");
        stringBuffer.append(this.f60940g);
        stringBuffer.append("\r\nisCameraRedPoint:");
        stringBuffer.append(this.f60941h);
        stringBuffer.append("\r\nVideoObjectId:");
        stringBuffer.append(this.f60942i);
        stringBuffer.append("\r\nisStoryCommentRedDot:");
        stringBuffer.append(this.f60943j);
        return stringBuffer.toString();
    }
}
