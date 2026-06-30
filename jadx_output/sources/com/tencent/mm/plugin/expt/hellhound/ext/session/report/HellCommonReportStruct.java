package com.tencent.mm.plugin.expt.hellhound.ext.session.report;

/* loaded from: classes13.dex */
public class HellCommonReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f99797d;

    /* renamed from: e, reason: collision with root package name */
    public int f99798e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f99799f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f99800g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f99801h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f99802i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f99803j = "";

    public HellCommonReportStruct(int i17) {
        this.f99797d = 0;
        this.f99797d = i17;
    }

    public static boolean p(int i17, java.lang.String str, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || i17 <= 0) {
            return false;
        }
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), i18);
        if (c17 != null) {
            com.tencent.mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct hellCommonReportStruct = new com.tencent.mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct(i17);
            hellCommonReportStruct.f99798e = android.os.Process.myPid();
            hellCommonReportStruct.f99799f = hellCommonReportStruct.b("PName", ((km0.c) gm0.j1.p().a()).f308987a, true);
            hellCommonReportStruct.f99800g = jx3.a.e();
            java.util.ArrayList arrayList = (java.util.ArrayList) c17;
            hellCommonReportStruct.f99802i = arrayList.size();
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                hellCommonReportStruct.f99801h = i19;
                hellCommonReportStruct.f99803j = hellCommonReportStruct.b("DataContent", (java.lang.String) arrayList.get(i19), false);
                hellCommonReportStruct.k();
            }
        }
        return true;
    }

    @Override // jx3.a
    public int g() {
        return this.f99797d;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f99798e);
        stringBuffer.append(",");
        stringBuffer.append(this.f99799f);
        stringBuffer.append(",");
        stringBuffer.append(this.f99800g);
        stringBuffer.append(",");
        stringBuffer.append(this.f99801h);
        stringBuffer.append(",");
        stringBuffer.append(this.f99802i);
        stringBuffer.append(",");
        stringBuffer.append(this.f99803j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PId:");
        stringBuffer.append(this.f99798e);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f99799f);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f99800g);
        stringBuffer.append("\r\nSubSeq:");
        stringBuffer.append(this.f99801h);
        stringBuffer.append("\r\nSubSeqSum:");
        stringBuffer.append(this.f99802i);
        stringBuffer.append("\r\nDataContent:");
        stringBuffer.append(this.f99803j);
        return stringBuffer.toString();
    }
}
