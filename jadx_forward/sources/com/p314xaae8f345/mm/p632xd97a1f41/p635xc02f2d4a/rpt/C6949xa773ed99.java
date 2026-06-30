package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct */
/* loaded from: classes4.dex */
public final class C6949xa773ed99 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142547d;

    /* renamed from: e, reason: collision with root package name */
    public long f142548e;

    /* renamed from: f, reason: collision with root package name */
    public long f142549f;

    /* renamed from: g, reason: collision with root package name */
    public long f142550g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142551h = "";

    @Override // jx3.a
    public int g() {
        return 20203;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142547d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142548e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142549f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142550g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142551h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PullStartTimeStamp:");
        stringBuffer.append(this.f142547d);
        stringBuffer.append("\r\nPullEndTimeStamp:");
        stringBuffer.append(this.f142548e);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f142549f);
        stringBuffer.append("\r\nWordSize:");
        stringBuffer.append(this.f142550g);
        stringBuffer.append("\r\nWordVersion:");
        stringBuffer.append(this.f142551h);
        return stringBuffer.toString();
    }
}
