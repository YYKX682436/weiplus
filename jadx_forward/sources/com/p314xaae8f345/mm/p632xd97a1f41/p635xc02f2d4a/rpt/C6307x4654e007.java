package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct */
/* loaded from: classes7.dex */
public final class C6307x4654e007 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f136646g;

    /* renamed from: d, reason: collision with root package name */
    public int f136643d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f136644e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f136645f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136647h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136648i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f136649j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f136650k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f136651l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f136652m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f136653n = "";

    @Override // jx3.a
    public int g() {
        return 25956;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136643d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136644e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136645f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136646g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136647h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136648i);
        stringBuffer.append(",");
        stringBuffer.append(this.f136649j);
        stringBuffer.append(",");
        stringBuffer.append(this.f136650k);
        stringBuffer.append(",");
        stringBuffer.append(this.f136651l);
        stringBuffer.append(",");
        stringBuffer.append(this.f136652m);
        stringBuffer.append(",");
        stringBuffer.append(this.f136653n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f136643d);
        stringBuffer.append("\r\nLibVersionInfo:");
        stringBuffer.append(this.f136644e);
        stringBuffer.append("\r\nV8Version:");
        stringBuffer.append(this.f136645f);
        stringBuffer.append("\r\nActionCostTimeMs:");
        stringBuffer.append(this.f136646g);
        stringBuffer.append("\r\nActionParams1:");
        stringBuffer.append(this.f136647h);
        stringBuffer.append("\r\nActionParams2:");
        stringBuffer.append(this.f136648i);
        stringBuffer.append("\r\nActionParams3:");
        stringBuffer.append(this.f136649j);
        stringBuffer.append("\r\nActionParams4:");
        stringBuffer.append(this.f136650k);
        stringBuffer.append("\r\nIsPreload:");
        stringBuffer.append(this.f136651l);
        stringBuffer.append("\r\nActionParams5:");
        stringBuffer.append(this.f136652m);
        stringBuffer.append("\r\nActionParams6:");
        stringBuffer.append(this.f136653n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 p(java.lang.String str) {
        this.f136647h = b("ActionParams1", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 q(java.lang.String str) {
        this.f136648i = b("ActionParams2", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 r(java.lang.String str) {
        this.f136644e = b("LibVersionInfo", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 s(java.lang.String str) {
        this.f136645f = b("V8Version", str, true);
        return this;
    }
}
