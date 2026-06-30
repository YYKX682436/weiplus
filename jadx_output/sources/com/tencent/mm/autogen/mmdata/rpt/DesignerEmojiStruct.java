package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class DesignerEmojiStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55783d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f55784e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55785f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55786g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55787h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55788i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f55789j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55790k = "";

    @Override // jx3.a
    public int g() {
        return 12787;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55783d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55784e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55785f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55786g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55787h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55788i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55789j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55790k);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f55783d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f55784e);
        stringBuffer.append("\r\nMD5Key:");
        stringBuffer.append(this.f55785f);
        stringBuffer.append("\r\nSearchID:");
        stringBuffer.append(this.f55786g);
        stringBuffer.append("\r\nDesignerId:");
        stringBuffer.append(this.f55787h);
        stringBuffer.append("\r\nPid:");
        stringBuffer.append(this.f55788i);
        stringBuffer.append("\r\nEmoticonScene:");
        stringBuffer.append(this.f55789j);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f55790k);
        stringBuffer.append("\r\npage:0");
        return stringBuffer.toString();
    }
}
