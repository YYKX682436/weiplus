package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct */
/* loaded from: classes4.dex */
public final class C6925xaa80d9da extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142397d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142398e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142399f = 0;

    @Override // jx3.a
    public int g() {
        return 16656;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142397d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142398e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142399f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("UserName:");
        stringBuffer.append(this.f142397d);
        stringBuffer.append("\r\nPreviewEnterScene:");
        stringBuffer.append(this.f142398e);
        stringBuffer.append("\r\nHasUnreadStoryTips:");
        stringBuffer.append(this.f142399f);
        return stringBuffer.toString();
    }
}
