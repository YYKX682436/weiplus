package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class EmoticonClientLocalOcrResultStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56014d;

    /* renamed from: e, reason: collision with root package name */
    public long f56015e;

    /* renamed from: f, reason: collision with root package name */
    public long f56016f;

    @Override // jx3.a
    public int g() {
        return 27969;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56014d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56015e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56016f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("total_md5_cnt:");
        stringBuffer.append(this.f56014d);
        stringBuffer.append("\r\nrec_md5_cnt:");
        stringBuffer.append(this.f56015e);
        stringBuffer.append("\r\nresult_md5_cnt:");
        stringBuffer.append(this.f56016f);
        return stringBuffer.toString();
    }
}
