package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class EmojiProcessProfileStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55990d;

    /* renamed from: e, reason: collision with root package name */
    public int f55991e;

    /* renamed from: f, reason: collision with root package name */
    public long f55992f;

    /* renamed from: g, reason: collision with root package name */
    public int f55993g;

    /* renamed from: h, reason: collision with root package name */
    public int f55994h;

    /* renamed from: i, reason: collision with root package name */
    public long f55995i;

    /* renamed from: j, reason: collision with root package name */
    public int f55996j;

    /* renamed from: k, reason: collision with root package name */
    public int f55997k;

    @Override // jx3.a
    public int g() {
        return 23817;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55990d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55991e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55992f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55993g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55994h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55995i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55996j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55997k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("HitCacheCount:");
        stringBuffer.append(this.f55990d);
        stringBuffer.append("\r\nProcessCount:");
        stringBuffer.append(this.f55991e);
        stringBuffer.append("\r\nProcessCost:");
        stringBuffer.append(this.f55992f);
        stringBuffer.append("\r\nProcessDecodeCount:");
        stringBuffer.append(this.f55993g);
        stringBuffer.append("\r\nCacheHitPercent:");
        stringBuffer.append(this.f55994h);
        stringBuffer.append("\r\nEmojiVersion:");
        stringBuffer.append(this.f55995i);
        stringBuffer.append("\r\nCurEmojiCacheCount:");
        stringBuffer.append(this.f55996j);
        stringBuffer.append("\r\nEmojiTextCount:");
        stringBuffer.append(this.f55997k);
        return stringBuffer.toString();
    }
}
