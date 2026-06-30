package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class WeVisionBaseDataStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f62924d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f62925e = "";

    @Override // jx3.a
    public int g() {
        return 22049;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f62924d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62925e);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("host_id:0\r\nsteam_type:");
        stringBuffer.append(this.f62924d);
        stringBuffer.append("\r\nroom_id:0\r\nstream_id:");
        stringBuffer.append(this.f62925e);
        stringBuffer.append("\r\nstream_duration:0");
        return stringBuffer.toString();
    }
}
