package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct */
/* loaded from: classes10.dex */
public final class C6560x6997f09c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139086d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139087e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f139088f;

    /* renamed from: g, reason: collision with root package name */
    public long f139089g;

    /* renamed from: h, reason: collision with root package name */
    public long f139090h;

    @Override // jx3.a
    public int g() {
        return 21149;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139086d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139087e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139088f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139089g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139090h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickId:");
        stringBuffer.append(this.f139086d);
        stringBuffer.append("\r\nPostId:");
        stringBuffer.append(this.f139087e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f139088f);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f139089g);
        stringBuffer.append("\r\nClickTab:");
        stringBuffer.append(this.f139090h);
        return stringBuffer.toString();
    }
}
