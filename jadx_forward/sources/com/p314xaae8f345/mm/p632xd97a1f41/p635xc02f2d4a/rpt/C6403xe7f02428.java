package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmojiInitProfileStruct */
/* loaded from: classes12.dex */
public final class C6403xe7f02428 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137519d;

    /* renamed from: e, reason: collision with root package name */
    public int f137520e;

    /* renamed from: f, reason: collision with root package name */
    public long f137521f;

    /* renamed from: g, reason: collision with root package name */
    public int f137522g = 0;

    @Override // jx3.a
    public int g() {
        return 23818;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137519d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137520e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137521f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137522g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Version:");
        stringBuffer.append(this.f137519d);
        stringBuffer.append("\r\nEmojiCount:");
        stringBuffer.append(this.f137520e);
        stringBuffer.append("\r\nInitCost:");
        stringBuffer.append(this.f137521f);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f137522g);
        return stringBuffer.toString();
    }
}
