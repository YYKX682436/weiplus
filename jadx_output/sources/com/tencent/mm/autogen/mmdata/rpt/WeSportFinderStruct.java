package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class WeSportFinderStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62918d;

    /* renamed from: e, reason: collision with root package name */
    public long f62919e;

    /* renamed from: g, reason: collision with root package name */
    public long f62921g;

    /* renamed from: h, reason: collision with root package name */
    public long f62922h;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62920f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62923i = "";

    @Override // jx3.a
    public int g() {
        return 27236;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62918d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62919e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62920f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62921g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62922h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62923i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pageName:");
        stringBuffer.append(this.f62918d);
        stringBuffer.append("\r\ninfoSource:");
        stringBuffer.append(this.f62919e);
        stringBuffer.append("\r\ninfoSourceName:");
        stringBuffer.append(this.f62920f);
        stringBuffer.append("\r\nifHasFinder:");
        stringBuffer.append(this.f62921g);
        stringBuffer.append("\r\nifFinderClick:");
        stringBuffer.append(this.f62922h);
        stringBuffer.append("\r\nviewedUser:");
        stringBuffer.append(this.f62923i);
        return stringBuffer.toString();
    }
}
