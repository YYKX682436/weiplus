package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class EntryMeWorkExposeClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56104d;

    /* renamed from: e, reason: collision with root package name */
    public long f56105e;

    /* renamed from: g, reason: collision with root package name */
    public long f56107g;

    /* renamed from: j, reason: collision with root package name */
    public long f56110j;

    /* renamed from: k, reason: collision with root package name */
    public long f56111k;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56106f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56108h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56109i = "";

    @Override // jx3.a
    public int g() {
        return 37479;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56104d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56105e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56106f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56107g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56108h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56109i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56110j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56111k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Actiontype:");
        stringBuffer.append(this.f56104d);
        stringBuffer.append("\r\nIsRedDot:");
        stringBuffer.append(this.f56105e);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f56106f);
        stringBuffer.append("\r\nRedDotType:");
        stringBuffer.append(this.f56107g);
        stringBuffer.append("\r\nRedDotContent:");
        stringBuffer.append(this.f56108h);
        stringBuffer.append("\r\nRedDotId:");
        stringBuffer.append(this.f56109i);
        stringBuffer.append("\r\nHasInteractiveRedDot:");
        stringBuffer.append(this.f56110j);
        stringBuffer.append("\r\nInteractiveRedDotCnt:");
        stringBuffer.append(this.f56111k);
        return stringBuffer.toString();
    }
}
