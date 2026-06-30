package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class MvCardActionReportStruct extends jx3.a {

    /* renamed from: j, reason: collision with root package name */
    public long f59456j;

    /* renamed from: k, reason: collision with root package name */
    public long f59457k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59450d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59451e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59452f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59453g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59454h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59455i = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59458l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59459m = "";

    @Override // jx3.a
    public int g() {
        return 22243;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59450d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59451e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59452f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59453g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59454h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59455i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59456j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59457k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59458l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59459m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContextId:");
        stringBuffer.append(this.f59450d);
        stringBuffer.append("\r\nSongName:");
        stringBuffer.append(this.f59451e);
        stringBuffer.append("\r\nSongId:");
        stringBuffer.append(this.f59452f);
        stringBuffer.append("\r\nWebUrl:");
        stringBuffer.append(this.f59453g);
        stringBuffer.append("\r\nDataUrl:");
        stringBuffer.append(this.f59454h);
        stringBuffer.append("\r\nSinger:");
        stringBuffer.append(this.f59455i);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f59456j);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59457k);
        stringBuffer.append("\r\nFromSourceId:");
        stringBuffer.append(this.f59458l);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f59459m);
        return stringBuffer.toString();
    }
}
