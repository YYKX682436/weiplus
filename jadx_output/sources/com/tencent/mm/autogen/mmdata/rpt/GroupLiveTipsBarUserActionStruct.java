package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class GroupLiveTipsBarUserActionStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58384e;

    /* renamed from: g, reason: collision with root package name */
    public long f58386g;

    /* renamed from: h, reason: collision with root package name */
    public long f58387h;

    /* renamed from: i, reason: collision with root package name */
    public int f58388i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58383d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58385f = "";

    @Override // jx3.a
    public int g() {
        return 21876;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58383d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58384e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58385f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58386g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58387h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58388i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f58383d);
        stringBuffer.append("\r\nLivesCnt:");
        stringBuffer.append(this.f58384e);
        stringBuffer.append("\r\nActionToLiveId:");
        stringBuffer.append(this.f58385f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58386g);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f58387h);
        stringBuffer.append("\r\nIsReddotShining:");
        stringBuffer.append(this.f58388i);
        return stringBuffer.toString();
    }
}
