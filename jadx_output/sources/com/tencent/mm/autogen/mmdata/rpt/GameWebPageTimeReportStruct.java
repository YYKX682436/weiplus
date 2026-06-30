package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class GameWebPageTimeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58355d;

    /* renamed from: e, reason: collision with root package name */
    public long f58356e;

    /* renamed from: g, reason: collision with root package name */
    public long f58358g;

    /* renamed from: i, reason: collision with root package name */
    public long f58360i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58357f = "";

    /* renamed from: h, reason: collision with root package name */
    public final int f58359h = 1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58361j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58362k = "";

    @Override // jx3.a
    public int g() {
        return 27743;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58355d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58356e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58357f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58358g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58359h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58360i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58361j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58362k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Time:");
        stringBuffer.append(this.f58355d);
        stringBuffer.append("\r\nSceneId:");
        stringBuffer.append(this.f58356e);
        stringBuffer.append("\r\nsession_id:");
        stringBuffer.append(this.f58357f);
        stringBuffer.append("\r\nssid:");
        stringBuffer.append(this.f58358g);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f58359h);
        stringBuffer.append("\r\nclient_timestamp:");
        stringBuffer.append(this.f58360i);
        stringBuffer.append("\r\nURL:");
        stringBuffer.append(this.f58361j);
        stringBuffer.append("\r\nextern_info:");
        stringBuffer.append(this.f58362k);
        return stringBuffer.toString();
    }
}
