package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class LuckyMoneyNewYearReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58698d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58699e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58700f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f58701g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58702h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58703i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f58704j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f58705k = 0;

    @Override // jx3.a
    public int g() {
        return 13079;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58698d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58699e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58700f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58701g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58702h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58703i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58704j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58705k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f58698d);
        stringBuffer.append("\r\nsceneUI:");
        stringBuffer.append(this.f58699e);
        stringBuffer.append("\r\nplayTime:");
        stringBuffer.append(this.f58700f);
        stringBuffer.append("\r\namount:");
        stringBuffer.append(this.f58701g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f58702h);
        stringBuffer.append("\r\nflistid:");
        stringBuffer.append(this.f58703i);
        stringBuffer.append("\r\nhbstatus:");
        stringBuffer.append(this.f58704j);
        stringBuffer.append("\r\nbarrageCount:");
        stringBuffer.append(this.f58705k);
        return stringBuffer.toString();
    }
}
