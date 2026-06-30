package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class AndroidWAServiceLibSnapshotQualityStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f55113g;

    /* renamed from: d, reason: collision with root package name */
    public int f55110d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55111e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55112f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55114h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55115i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55116j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55117k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f55118l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55119m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f55120n = "";

    @Override // jx3.a
    public int g() {
        return 25956;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55110d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55111e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55112f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55113g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55114h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55115i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55116j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55117k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55118l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55119m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55120n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f55110d);
        stringBuffer.append("\r\nLibVersionInfo:");
        stringBuffer.append(this.f55111e);
        stringBuffer.append("\r\nV8Version:");
        stringBuffer.append(this.f55112f);
        stringBuffer.append("\r\nActionCostTimeMs:");
        stringBuffer.append(this.f55113g);
        stringBuffer.append("\r\nActionParams1:");
        stringBuffer.append(this.f55114h);
        stringBuffer.append("\r\nActionParams2:");
        stringBuffer.append(this.f55115i);
        stringBuffer.append("\r\nActionParams3:");
        stringBuffer.append(this.f55116j);
        stringBuffer.append("\r\nActionParams4:");
        stringBuffer.append(this.f55117k);
        stringBuffer.append("\r\nIsPreload:");
        stringBuffer.append(this.f55118l);
        stringBuffer.append("\r\nActionParams5:");
        stringBuffer.append(this.f55119m);
        stringBuffer.append("\r\nActionParams6:");
        stringBuffer.append(this.f55120n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct p(java.lang.String str) {
        this.f55114h = b("ActionParams1", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct q(java.lang.String str) {
        this.f55115i = b("ActionParams2", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct r(java.lang.String str) {
        this.f55111e = b("LibVersionInfo", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct s(java.lang.String str) {
        this.f55112f = b("V8Version", str, true);
        return this;
    }
}
