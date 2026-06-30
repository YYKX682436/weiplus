package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.Struct28552 */
/* loaded from: classes4.dex */
public final class C6946xb5a612b7 extends jx3.a {
    public C6946xb5a612b7() {
        j("SnsUIType", -1);
        j("ADType", -1);
        j("Action", -1);
        j("Scene", -1);
        j("Aid", "");
    }

    @Override // jx3.a
    public int g() {
        return 28552;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f("SnsUIType"));
        stringBuffer.append(",");
        stringBuffer.append(f("ADType"));
        stringBuffer.append(",");
        stringBuffer.append(f("Action"));
        stringBuffer.append(",");
        stringBuffer.append(f("Scene"));
        stringBuffer.append(",");
        stringBuffer.append(f("Aid"));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SnsUIType:");
        stringBuffer.append(f("SnsUIType"));
        stringBuffer.append("\r\nADType:");
        stringBuffer.append(f("ADType"));
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(f("Action"));
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(f("Scene"));
        stringBuffer.append("\r\nAid:");
        stringBuffer.append(f("Aid"));
        return stringBuffer.toString();
    }
}
