package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonClientLocalOcrResultStruct */
/* loaded from: classes12.dex */
public final class C6408x543f5f56 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137547d;

    /* renamed from: e, reason: collision with root package name */
    public long f137548e;

    /* renamed from: f, reason: collision with root package name */
    public long f137549f;

    @Override // jx3.a
    public int g() {
        return 27969;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137547d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137548e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137549f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("total_md5_cnt:");
        stringBuffer.append(this.f137547d);
        stringBuffer.append("\r\nrec_md5_cnt:");
        stringBuffer.append(this.f137548e);
        stringBuffer.append("\r\nresult_md5_cnt:");
        stringBuffer.append(this.f137549f);
        return stringBuffer.toString();
    }
}
