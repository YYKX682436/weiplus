package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1394xc84c5534;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct */
/* loaded from: classes13.dex */
public class C13493x9cb3cdf1 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f181330d;

    /* renamed from: e, reason: collision with root package name */
    public int f181331e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181332f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f181333g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f181334h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f181335i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f181336j = "";

    public C13493x9cb3cdf1(int i17) {
        this.f181330d = 0;
        this.f181330d = i17;
    }

    public static boolean p(int i17, java.lang.String str, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || i17 <= 0) {
            return false;
        }
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), i18);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1394xc84c5534.C13493x9cb3cdf1 c13493x9cb3cdf1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1394xc84c5534.C13493x9cb3cdf1(i17);
            c13493x9cb3cdf1.f181331e = android.os.Process.myPid();
            c13493x9cb3cdf1.f181332f = c13493x9cb3cdf1.b("PName", ((km0.c) gm0.j1.p().a()).f390520a, true);
            c13493x9cb3cdf1.f181333g = jx3.a.e();
            java.util.ArrayList arrayList = (java.util.ArrayList) c17;
            c13493x9cb3cdf1.f181335i = arrayList.size();
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                c13493x9cb3cdf1.f181334h = i19;
                c13493x9cb3cdf1.f181336j = c13493x9cb3cdf1.b("DataContent", (java.lang.String) arrayList.get(i19), false);
                c13493x9cb3cdf1.k();
            }
        }
        return true;
    }

    @Override // jx3.a
    public int g() {
        return this.f181330d;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f181331e);
        stringBuffer.append(",");
        stringBuffer.append(this.f181332f);
        stringBuffer.append(",");
        stringBuffer.append(this.f181333g);
        stringBuffer.append(",");
        stringBuffer.append(this.f181334h);
        stringBuffer.append(",");
        stringBuffer.append(this.f181335i);
        stringBuffer.append(",");
        stringBuffer.append(this.f181336j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PId:");
        stringBuffer.append(this.f181331e);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f181332f);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f181333g);
        stringBuffer.append("\r\nSubSeq:");
        stringBuffer.append(this.f181334h);
        stringBuffer.append("\r\nSubSeqSum:");
        stringBuffer.append(this.f181335i);
        stringBuffer.append("\r\nDataContent:");
        stringBuffer.append(this.f181336j);
        return stringBuffer.toString();
    }
}
