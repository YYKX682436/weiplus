package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class LiveNotifyReplaceStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58612d;

    /* renamed from: e, reason: collision with root package name */
    public long f58613e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58614f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58615g = "";

    @Override // jx3.a
    public int g() {
        return 22623;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58612d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58613e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58614f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58615g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("NewMsgCount:");
        stringBuffer.append(this.f58612d);
        stringBuffer.append("\r\nUnReadLiveEndCount:");
        stringBuffer.append(this.f58613e);
        stringBuffer.append("\r\nNewTipsIDs:");
        stringBuffer.append(this.f58614f);
        stringBuffer.append("\r\nDeleteTipsIDs:");
        stringBuffer.append(this.f58615g);
        return stringBuffer.toString();
    }
}
