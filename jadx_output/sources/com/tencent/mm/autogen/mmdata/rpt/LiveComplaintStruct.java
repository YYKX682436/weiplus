package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveComplaintStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58572d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58573e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58574f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58575g = "";

    @Override // jx3.a
    public int g() {
        return 19896;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58572d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58573e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58574f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58575g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:0\r\nroomid:");
        stringBuffer.append(this.f58572d);
        stringBuffer.append("\r\nliveid:0\r\ntopic:");
        stringBuffer.append(this.f58573e);
        stringBuffer.append("\r\nliveuin:");
        stringBuffer.append(this.f58574f);
        stringBuffer.append("\r\nroomRole:0\r\naudienceCount:0\r\nliveusername:");
        stringBuffer.append(this.f58575g);
        return stringBuffer.toString();
    }
}
