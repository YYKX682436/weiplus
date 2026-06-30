package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRedDotImageLoadFailStruct */
/* loaded from: classes8.dex */
public final class C6573x4b326096 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139229d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139230e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139231f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f139232g;

    @Override // jx3.a
    public int g() {
        return 35193;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139229d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139230e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139231f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139232g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("redDotPath:");
        stringBuffer.append(this.f139229d);
        stringBuffer.append("\r\nredDotTipsUuid:");
        stringBuffer.append(this.f139230e);
        stringBuffer.append("\r\nloadFailUrl:");
        stringBuffer.append(this.f139231f);
        stringBuffer.append("\r\ndownloadTimeConsuming:");
        stringBuffer.append(this.f139232g);
        stringBuffer.append("\r\nerrorCode:0");
        return stringBuffer.toString();
    }
}
