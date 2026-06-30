package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bz extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    public java.lang.String f130608a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "md5")
    public java.lang.String f130609b;

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "pinyin")
    public java.lang.String f130610c;

    /* renamed from: d, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "size")
    public int f130611d;

    /* renamed from: e, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "ver")
    public int f130612e;

    private boolean a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76) {
        return c4265xa1eefb76.m35501x2a31609f().equals(this.f130610c);
    }

    private java.lang.String b() {
        return this.f130610c + ".zip";
    }

    private java.lang.String c() {
        return this.f130608a + java.io.File.separator + this.f130610c + this.f130612e + ".zip";
    }

    /* renamed from: toString */
    public final java.lang.String m36668x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OfflineMapConfigCity{url='");
        stringBuffer.append(this.f130608a);
        stringBuffer.append("', md5='");
        stringBuffer.append(this.f130609b);
        stringBuffer.append("', pinyin='");
        stringBuffer.append(this.f130610c);
        stringBuffer.append("', size=");
        stringBuffer.append(this.f130611d);
        stringBuffer.append(", version=");
        stringBuffer.append(this.f130612e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar) {
        if (mvVar != null) {
            mvVar.a(this.f130610c + "-md5", this.f130609b);
            mvVar.a(this.f130610c + "-version", this.f130612e);
        }
    }

    public final java.lang.String a() {
        return this.f130610c + ".dat";
    }

    private boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar) {
        if (mvVar == null) {
            return false;
        }
        java.lang.String a17 = mvVar.a(this.f130610c + "-md5");
        if (this.f130612e == mvVar.b(this.f130610c + "-version", -1)) {
            return (a17 == null || a17.equals(this.f130609b)) ? false : true;
        }
        return true;
    }
}
