package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderSettingExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57815d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f57816e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f57817f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f57818g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f57819h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57820i = "";

    @Override // jx3.a
    public int g() {
        return 20673;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57815d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57816e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57817f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57818g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57819h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57820i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type:");
        stringBuffer.append(this.f57815d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f57816e);
        stringBuffer.append("\r\nhasReddot:");
        stringBuffer.append(this.f57817f);
        stringBuffer.append("\r\nfinderType:");
        stringBuffer.append(this.f57818g);
        stringBuffer.append("\r\nregion:");
        stringBuffer.append(this.f57819h);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f57820i);
        return stringBuffer.toString();
    }
}
