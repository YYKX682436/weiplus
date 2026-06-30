package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinderPrefetchDataStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57623d;

    /* renamed from: e, reason: collision with root package name */
    public long f57624e;

    /* renamed from: f, reason: collision with root package name */
    public long f57625f;

    /* renamed from: g, reason: collision with root package name */
    public long f57626g;

    /* renamed from: h, reason: collision with root package name */
    public long f57627h;

    /* renamed from: i, reason: collision with root package name */
    public long f57628i;

    /* renamed from: j, reason: collision with root package name */
    public long f57629j;

    @Override // jx3.a
    public int g() {
        return 23105;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57623d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57624e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57625f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57626g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57627h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57628i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57629j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pullType:");
        stringBuffer.append(this.f57623d);
        stringBuffer.append("\r\ncurTabType:");
        stringBuffer.append(this.f57624e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f57625f);
        stringBuffer.append("\r\nabandonReasonType:");
        stringBuffer.append(this.f57626g);
        stringBuffer.append("\r\nprefetchWithRedDot:");
        stringBuffer.append(this.f57627h);
        stringBuffer.append("\r\nrejectPrefetchReasonType:");
        stringBuffer.append(this.f57628i);
        stringBuffer.append("\r\nlocalHasPrefetchData:");
        stringBuffer.append(this.f57629j);
        return stringBuffer.toString();
    }
}
