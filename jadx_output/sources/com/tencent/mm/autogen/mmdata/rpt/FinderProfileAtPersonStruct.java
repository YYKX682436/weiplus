package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderProfileAtPersonStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57642e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57643f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57644g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57645h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57646i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57647j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57648k = "";

    @Override // jx3.a
    public int g() {
        return 21172;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f57641d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57642e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57643f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57644g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57645h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57646i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57647j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57648k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ProfileUin:0\r\nActionType:");
        stringBuffer.append(this.f57641d);
        stringBuffer.append("\r\nAtText:");
        stringBuffer.append(this.f57642e);
        stringBuffer.append("\r\nIfClickSucess:0\r\nProfileUsername:");
        stringBuffer.append(this.f57643f);
        stringBuffer.append("\r\nProfileBizUin:");
        stringBuffer.append(this.f57644g);
        stringBuffer.append("\r\nExtInfo:");
        stringBuffer.append(this.f57645h);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f57646i);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f57647j);
        stringBuffer.append("\r\nEnterSourceInfo:");
        stringBuffer.append(this.f57648k);
        return stringBuffer.toString();
    }
}
