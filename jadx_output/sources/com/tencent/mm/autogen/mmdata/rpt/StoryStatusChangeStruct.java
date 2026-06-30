package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StoryStatusChangeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60980d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60981e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60982f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60983g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60984h = 0;

    @Override // jx3.a
    public int g() {
        return 17090;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60980d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60981e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60982f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60983g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60984h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StoryId:");
        stringBuffer.append(this.f60980d);
        stringBuffer.append("\r\nVideoType:");
        stringBuffer.append(this.f60981e);
        stringBuffer.append("\r\nPreviewEnterScene:");
        stringBuffer.append(this.f60982f);
        stringBuffer.append("\r\nProfileSource:");
        stringBuffer.append(this.f60983g);
        stringBuffer.append("\r\nIsAlbumStarButton:");
        stringBuffer.append(this.f60984h);
        return stringBuffer.toString();
    }
}
