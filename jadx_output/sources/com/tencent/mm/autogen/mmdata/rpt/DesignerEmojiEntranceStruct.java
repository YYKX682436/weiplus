package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class DesignerEmojiEntranceStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f55778g;

    /* renamed from: k, reason: collision with root package name */
    public long f55782k;

    /* renamed from: d, reason: collision with root package name */
    public long f55775d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f55776e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55777f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55779h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55780i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55781j = "";

    @Override // jx3.a
    public int g() {
        return 12875;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55775d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55776e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55777f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55778g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55779h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55780i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55781j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55782k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f55775d);
        stringBuffer.append("\r\nDesignerUin:0\r\nSetID:");
        stringBuffer.append(this.f55776e);
        stringBuffer.append("\r\nSetName:");
        stringBuffer.append(this.f55777f);
        stringBuffer.append("\r\nentrance_scene:");
        stringBuffer.append(this.f55778g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f55779h);
        stringBuffer.append("\r\nmd5:");
        stringBuffer.append(this.f55780i);
        stringBuffer.append("\r\nindex:");
        stringBuffer.append(this.f55781j);
        stringBuffer.append("\r\npage:");
        stringBuffer.append(this.f55782k);
        return stringBuffer.toString();
    }
}
