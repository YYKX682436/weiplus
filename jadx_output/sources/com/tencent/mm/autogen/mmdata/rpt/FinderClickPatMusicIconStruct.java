package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderClickPatMusicIconStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56644d;

    /* renamed from: e, reason: collision with root package name */
    public long f56645e;

    /* renamed from: f, reason: collision with root package name */
    public long f56646f;

    /* renamed from: g, reason: collision with root package name */
    public long f56647g;

    /* renamed from: h, reason: collision with root package name */
    public long f56648h;

    @Override // jx3.a
    public int g() {
        return 21077;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56644d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56645e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56646f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56647g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56648h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickTimestamps:");
        stringBuffer.append(this.f56644d);
        stringBuffer.append("\r\nClickType:");
        stringBuffer.append(this.f56645e);
        stringBuffer.append("\r\nOutcome:");
        stringBuffer.append(this.f56646f);
        stringBuffer.append("\r\ncommentScene:");
        stringBuffer.append(this.f56647g);
        stringBuffer.append("\r\nFollowcount:");
        stringBuffer.append(this.f56648h);
        return stringBuffer.toString();
    }
}
