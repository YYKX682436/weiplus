package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class KBInvokeWechatStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58533d;

    /* renamed from: l, reason: collision with root package name */
    public long f58541l;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58534e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58535f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58536g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58537h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58538i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58539j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58540k = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58542m = "";

    @Override // jx3.a
    public int g() {
        return 25573;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58533d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58534e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58535f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58536g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58537h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58538i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58539j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58540k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58541l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58542m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f58533d);
        stringBuffer.append("\r\nContentType:0\r\nContentTitle:");
        stringBuffer.append(this.f58534e);
        stringBuffer.append("\r\nAppID:");
        stringBuffer.append(this.f58535f);
        stringBuffer.append("\r\nSongID:");
        stringBuffer.append(this.f58536g);
        stringBuffer.append("\r\nEmojiMd5:");
        stringBuffer.append(this.f58537h);
        stringBuffer.append("\r\nEmojiProductID:");
        stringBuffer.append(this.f58538i);
        stringBuffer.append("\r\nSongName:");
        stringBuffer.append(this.f58539j);
        stringBuffer.append("\r\nToUsername:");
        stringBuffer.append(this.f58540k);
        stringBuffer.append("\r\nWXKBMessageType:");
        stringBuffer.append(this.f58541l);
        stringBuffer.append("\r\nimageUrl:");
        stringBuffer.append(this.f58542m);
        return stringBuffer.toString();
    }
}
