package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class LiveVisitorExceptionClientStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58681e;

    /* renamed from: g, reason: collision with root package name */
    public long f58683g;

    /* renamed from: h, reason: collision with root package name */
    public long f58684h;

    /* renamed from: i, reason: collision with root package name */
    public long f58685i;

    /* renamed from: j, reason: collision with root package name */
    public long f58686j;

    /* renamed from: k, reason: collision with root package name */
    public long f58687k;

    /* renamed from: l, reason: collision with root package name */
    public long f58688l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58680d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58682f = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58689m = "";

    @Override // jx3.a
    public int g() {
        return 21505;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58680d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58681e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58682f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58683g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58684h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58685i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58686j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58687k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58688l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58689m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("moduleName:");
        stringBuffer.append(this.f58680d);
        stringBuffer.append("\r\neventCode:");
        stringBuffer.append(this.f58681e);
        stringBuffer.append("\r\neventMsg:");
        stringBuffer.append(this.f58682f);
        stringBuffer.append("\r\nliveId:");
        stringBuffer.append(this.f58683g);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f58684h);
        stringBuffer.append("\r\nmode:");
        stringBuffer.append(this.f58685i);
        stringBuffer.append("\r\nanchorSEITimestamp:");
        stringBuffer.append(this.f58686j);
        stringBuffer.append("\r\naudienceSEITimestamp:");
        stringBuffer.append(this.f58687k);
        stringBuffer.append("\r\nsdkliveid:");
        stringBuffer.append(this.f58688l);
        stringBuffer.append("\r\nfinderName:");
        stringBuffer.append(this.f58689m);
        return stringBuffer.toString();
    }
}
