package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class WeAppWidgetSwitchStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f62890d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f62891e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f62892f = "";

    @Override // jx3.a
    public int g() {
        return 14688;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f62890d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62891e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62892f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionType:0\r\nclientTimestamp:0\r\nappId:");
        stringBuffer.append(this.f62890d);
        stringBuffer.append("\r\nserviceType:0\r\nstatBuffer:");
        stringBuffer.append(this.f62891e);
        stringBuffer.append("\r\nswitchId:");
        stringBuffer.append(this.f62892f);
        return stringBuffer.toString();
    }
}
