package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipNewCallWhenInCallReportStruct */
/* loaded from: classes14.dex */
public final class C7018x19d267a4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143319d;

    /* renamed from: e, reason: collision with root package name */
    public long f143320e;

    /* renamed from: f, reason: collision with root package name */
    public long f143321f;

    /* renamed from: g, reason: collision with root package name */
    public long f143322g;

    /* renamed from: h, reason: collision with root package name */
    public long f143323h;

    @Override // jx3.a
    public int g() {
        return 27765;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143319d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143320e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143321f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143322g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143323h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomkey:");
        stringBuffer.append(this.f143319d);
        stringBuffer.append("\r\nroomid:");
        stringBuffer.append(this.f143320e);
        stringBuffer.append("\r\nnewroomkey:");
        stringBuffer.append(this.f143321f);
        stringBuffer.append("\r\nnewroomid:");
        stringBuffer.append(this.f143322g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f143323h);
        return stringBuffer.toString();
    }
}
