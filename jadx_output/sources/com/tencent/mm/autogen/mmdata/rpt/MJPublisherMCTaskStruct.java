package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class MJPublisherMCTaskStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f58727i;

    /* renamed from: j, reason: collision with root package name */
    public int f58728j;

    /* renamed from: o, reason: collision with root package name */
    public int f58733o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58722d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58723e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58724f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58725g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58726h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58729k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58730l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58731m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f58732n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f58734p = "";

    @Override // jx3.a
    public int g() {
        return 29913;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58722d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58723e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58724f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58725g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58726h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58727i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58728j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58729k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58730l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58731m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58732n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58733o);
        stringBuffer.append(",");
        stringBuffer.append(this.f58734p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PublisherSessionID:");
        stringBuffer.append(this.f58722d);
        stringBuffer.append("\r\nEntryType:");
        stringBuffer.append(this.f58723e);
        stringBuffer.append("\r\nMaasSDKVersion:");
        stringBuffer.append(this.f58724f);
        stringBuffer.append("\r\nTaskID:");
        stringBuffer.append(this.f58725g);
        stringBuffer.append("\r\nTaskName:");
        stringBuffer.append(this.f58726h);
        stringBuffer.append("\r\nBeginTime:");
        stringBuffer.append(this.f58727i);
        stringBuffer.append("\r\nDurationMillis:");
        stringBuffer.append(this.f58728j);
        stringBuffer.append("\r\nEndReason:");
        stringBuffer.append(this.f58729k);
        stringBuffer.append("\r\nAssetOriginType:");
        stringBuffer.append(this.f58730l);
        stringBuffer.append("\r\nDetails:");
        stringBuffer.append(this.f58731m);
        stringBuffer.append("\r\nExtDetails0:");
        stringBuffer.append(this.f58732n);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f58733o);
        stringBuffer.append("\r\nPostId:");
        stringBuffer.append(this.f58734p);
        return stringBuffer.toString();
    }
}
