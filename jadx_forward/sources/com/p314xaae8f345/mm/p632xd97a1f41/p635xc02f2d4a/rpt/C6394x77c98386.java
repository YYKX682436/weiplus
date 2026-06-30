package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DismissChatroomReportStruct */
/* loaded from: classes11.dex */
public final class C6394x77c98386 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137389d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f137390e;

    /* renamed from: f, reason: collision with root package name */
    public long f137391f;

    /* renamed from: g, reason: collision with root package name */
    public long f137392g;

    @Override // jx3.a
    public int g() {
        return 24180;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137389d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137390e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137391f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137392g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomUsername:");
        stringBuffer.append(this.f137389d);
        stringBuffer.append("\r\nmemberCount:");
        stringBuffer.append(this.f137390e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f137391f);
        stringBuffer.append("\r\nerrCode:");
        stringBuffer.append(this.f137392g);
        return stringBuffer.toString();
    }
}
