package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class FlutterEngineGroupMemInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58165d;

    /* renamed from: e, reason: collision with root package name */
    public long f58166e;

    /* renamed from: f, reason: collision with root package name */
    public long f58167f;

    /* renamed from: g, reason: collision with root package name */
    public long f58168g;

    /* renamed from: h, reason: collision with root package name */
    public long f58169h;

    /* renamed from: i, reason: collision with root package name */
    public long f58170i;

    /* renamed from: j, reason: collision with root package name */
    public int f58171j;

    /* renamed from: k, reason: collision with root package name */
    public int f58172k;

    /* renamed from: l, reason: collision with root package name */
    public int f58173l;

    /* renamed from: m, reason: collision with root package name */
    public int f58174m;

    /* renamed from: n, reason: collision with root package name */
    public long f58175n;

    @Override // jx3.a
    public int g() {
        return 33739;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58165d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58166e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58167f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58168g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58169h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58170i);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f58171j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58172k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58173l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58174m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58175n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BeforeCreateAll:");
        stringBuffer.append(this.f58165d);
        stringBuffer.append("\r\nAfterCreateAll:");
        stringBuffer.append(this.f58166e);
        stringBuffer.append("\r\nBeforeDestroyAll:");
        stringBuffer.append(this.f58167f);
        stringBuffer.append("\r\nAfterDestroyAll:");
        stringBuffer.append(this.f58168g);
        stringBuffer.append("\r\nBeforeFreeMemAll:");
        stringBuffer.append(this.f58169h);
        stringBuffer.append("\r\nAfterFreeMemAll:");
        stringBuffer.append(this.f58170i);
        stringBuffer.append("\r\nBeforeFreeMemVm:0\r\nAfterFreeMemVm:0\r\nBeforeFreeMemImage:0\r\nAfterFreeMemImage:0\r\nBeforeFreeMemPicture:0\r\nAfterFreeMemPicture:0\r\nCreatedEngineGroupCount:");
        stringBuffer.append(this.f58171j);
        stringBuffer.append("\r\nCreatedEngineCount:");
        stringBuffer.append(this.f58172k);
        stringBuffer.append("\r\nCreatedExternalEngineCount:");
        stringBuffer.append(this.f58173l);
        stringBuffer.append("\r\nReportType:");
        stringBuffer.append(this.f58174m);
        stringBuffer.append("\r\nAvgMemAll:");
        stringBuffer.append(this.f58175n);
        return stringBuffer.toString();
    }
}
