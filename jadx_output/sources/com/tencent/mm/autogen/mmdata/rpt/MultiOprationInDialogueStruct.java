package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class MultiOprationInDialogueStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f59351g;

    /* renamed from: h, reason: collision with root package name */
    public long f59352h;

    /* renamed from: d, reason: collision with root package name */
    public long f59348d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f59349e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f59350f = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f59353i = 0;

    @Override // jx3.a
    public int g() {
        return 10811;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59348d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59349e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59350f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59351g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59352h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59353i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpType:");
        stringBuffer.append(this.f59348d);
        stringBuffer.append("\r\nRecCount:");
        stringBuffer.append(this.f59349e);
        stringBuffer.append("\r\nSuccessRecCount:");
        stringBuffer.append(this.f59350f);
        stringBuffer.append("\r\nContinuousSelectCount:");
        stringBuffer.append(this.f59351g);
        stringBuffer.append("\r\nContinuousSelectItemCount:");
        stringBuffer.append(this.f59352h);
        stringBuffer.append("\r\nMultiSelectEnabled:");
        stringBuffer.append(this.f59353i);
        return stringBuffer.toString();
    }
}
