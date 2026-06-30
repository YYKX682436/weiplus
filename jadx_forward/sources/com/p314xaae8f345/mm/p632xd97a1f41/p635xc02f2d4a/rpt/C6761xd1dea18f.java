package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiOprationInDialogueStruct */
/* loaded from: classes16.dex */
public final class C6761xd1dea18f extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f140884g;

    /* renamed from: h, reason: collision with root package name */
    public long f140885h;

    /* renamed from: d, reason: collision with root package name */
    public long f140881d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f140882e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f140883f = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f140886i = 0;

    @Override // jx3.a
    public int g() {
        return 10811;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140881d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140882e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140883f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140884g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140885h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140886i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpType:");
        stringBuffer.append(this.f140881d);
        stringBuffer.append("\r\nRecCount:");
        stringBuffer.append(this.f140882e);
        stringBuffer.append("\r\nSuccessRecCount:");
        stringBuffer.append(this.f140883f);
        stringBuffer.append("\r\nContinuousSelectCount:");
        stringBuffer.append(this.f140884g);
        stringBuffer.append("\r\nContinuousSelectItemCount:");
        stringBuffer.append(this.f140885h);
        stringBuffer.append("\r\nMultiSelectEnabled:");
        stringBuffer.append(this.f140886i);
        return stringBuffer.toString();
    }
}
