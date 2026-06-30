package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class EmoticonCustomCreateResultStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56020e;

    /* renamed from: f, reason: collision with root package name */
    public long f56021f;

    /* renamed from: g, reason: collision with root package name */
    public long f56022g;

    /* renamed from: h, reason: collision with root package name */
    public long f56023h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56019d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56024i = "";

    @Override // jx3.a
    public int g() {
        return 29611;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56019d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56020e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56021f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56022g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56023h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56024i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EditStickerSessionID:");
        stringBuffer.append(this.f56019d);
        stringBuffer.append("\r\nstatus:");
        stringBuffer.append(this.f56020e);
        stringBuffer.append("\r\nEditStickerSource:");
        stringBuffer.append(this.f56021f);
        stringBuffer.append("\r\nEditStickerType:");
        stringBuffer.append(this.f56022g);
        stringBuffer.append("\r\nEditFromScene:");
        stringBuffer.append(this.f56023h);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f56024i);
        return stringBuffer.toString();
    }
}
