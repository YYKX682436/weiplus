package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XFileOtherAppActionStruct */
/* loaded from: classes8.dex */
public final class C7154xac460150 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144608d;

    /* renamed from: e, reason: collision with root package name */
    public long f144609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144610f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144611g = "";

    @Override // jx3.a
    public int g() {
        return 27653;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144608d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144609e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144610f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144611g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f144608d);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f144609e);
        stringBuffer.append("\r\nOtherInfo:");
        stringBuffer.append(this.f144610f);
        stringBuffer.append("\r\nFileFormat:");
        stringBuffer.append(this.f144611g);
        return stringBuffer.toString();
    }
}
