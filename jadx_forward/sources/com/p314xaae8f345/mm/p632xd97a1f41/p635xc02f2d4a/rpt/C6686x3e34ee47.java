package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LongPressHeadImageAtUserStruct */
/* loaded from: classes5.dex */
public final class C6686x3e34ee47 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140228d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f140229e;

    /* renamed from: f, reason: collision with root package name */
    public long f140230f;

    @Override // jx3.a
    public int g() {
        return 22595;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140228d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140229e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140230f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f140228d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f140229e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f140230f);
        return stringBuffer.toString();
    }
}
