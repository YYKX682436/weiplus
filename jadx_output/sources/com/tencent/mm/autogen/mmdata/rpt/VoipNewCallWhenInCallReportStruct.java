package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class VoipNewCallWhenInCallReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61786d;

    /* renamed from: e, reason: collision with root package name */
    public long f61787e;

    /* renamed from: f, reason: collision with root package name */
    public long f61788f;

    /* renamed from: g, reason: collision with root package name */
    public long f61789g;

    /* renamed from: h, reason: collision with root package name */
    public long f61790h;

    @Override // jx3.a
    public int g() {
        return 27765;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61786d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61787e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61788f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61789g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61790h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomkey:");
        stringBuffer.append(this.f61786d);
        stringBuffer.append("\r\nroomid:");
        stringBuffer.append(this.f61787e);
        stringBuffer.append("\r\nnewroomkey:");
        stringBuffer.append(this.f61788f);
        stringBuffer.append("\r\nnewroomid:");
        stringBuffer.append(this.f61789g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f61790h);
        return stringBuffer.toString();
    }
}
