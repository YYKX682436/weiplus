package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSysMsgItemClickStruct */
/* loaded from: classes9.dex */
public final class C6592xf7203db0 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139425d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f139426e;

    /* renamed from: f, reason: collision with root package name */
    public long f139427f;

    @Override // jx3.a
    public int g() {
        return 19947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139425d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139426e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139427f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f139425d);
        stringBuffer.append("\r\nRedDotCount:");
        stringBuffer.append(this.f139426e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f139427f);
        return stringBuffer.toString();
    }
}
