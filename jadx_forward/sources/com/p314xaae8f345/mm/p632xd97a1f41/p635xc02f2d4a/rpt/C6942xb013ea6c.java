package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct */
/* loaded from: classes4.dex */
public final class C6942xb013ea6c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142513d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142514e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142515f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f142516g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f142517h = 0;

    @Override // jx3.a
    public int g() {
        return 17090;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142513d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142514e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142515f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142516g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142517h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StoryId:");
        stringBuffer.append(this.f142513d);
        stringBuffer.append("\r\nVideoType:");
        stringBuffer.append(this.f142514e);
        stringBuffer.append("\r\nPreviewEnterScene:");
        stringBuffer.append(this.f142515f);
        stringBuffer.append("\r\nProfileSource:");
        stringBuffer.append(this.f142516g);
        stringBuffer.append("\r\nIsAlbumStarButton:");
        stringBuffer.append(this.f142517h);
        return stringBuffer.toString();
    }
}
