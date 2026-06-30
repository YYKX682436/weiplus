package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupLiveTipsBarUserActionStruct */
/* loaded from: classes11.dex */
public final class C6639x3a144c86 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139917e;

    /* renamed from: g, reason: collision with root package name */
    public long f139919g;

    /* renamed from: h, reason: collision with root package name */
    public long f139920h;

    /* renamed from: i, reason: collision with root package name */
    public int f139921i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139916d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139918f = "";

    @Override // jx3.a
    public int g() {
        return 21876;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139916d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139917e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139918f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139919g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139920h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139921i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f139916d);
        stringBuffer.append("\r\nLivesCnt:");
        stringBuffer.append(this.f139917e);
        stringBuffer.append("\r\nActionToLiveId:");
        stringBuffer.append(this.f139918f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f139919g);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f139920h);
        stringBuffer.append("\r\nIsReddotShining:");
        stringBuffer.append(this.f139921i);
        return stringBuffer.toString();
    }
}
