package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class EmoticonManageDetailStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56056d;

    /* renamed from: e, reason: collision with root package name */
    public long f56057e;

    /* renamed from: f, reason: collision with root package name */
    public long f56058f;

    /* renamed from: g, reason: collision with root package name */
    public long f56059g;

    /* renamed from: h, reason: collision with root package name */
    public long f56060h;

    /* renamed from: i, reason: collision with root package name */
    public long f56061i;

    @Override // jx3.a
    public int g() {
        return 28449;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56056d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56057e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56058f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56059g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56060h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56061i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f56056d);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f56057e);
        stringBuffer.append("\r\nEmojiCnt:");
        stringBuffer.append(this.f56058f);
        stringBuffer.append("\r\nLocation:");
        stringBuffer.append(this.f56059g);
        stringBuffer.append("\r\nIfTop:");
        stringBuffer.append(this.f56060h);
        stringBuffer.append("\r\nFromScene:");
        stringBuffer.append(this.f56061i);
        return stringBuffer.toString();
    }
}
