package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sx extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)
    public java.lang.String f133091a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "style")
    public int f133092b;

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)
    public int f133093c;

    /* renamed from: d, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "version")
    public int f133094d;

    /* renamed from: e, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "url")
    public java.lang.String f133095e;

    /* renamed from: f, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "range")
    public int[] f133096f;

    private java.lang.String a() {
        return this.f133091a;
    }

    private int b() {
        return this.f133092b;
    }

    private int c() {
        return this.f133093c;
    }

    private int d() {
        return this.f133094d;
    }

    private java.lang.String e() {
        return this.f133095e;
    }

    private int[] f() {
        return this.f133096f;
    }

    /* renamed from: toString */
    public final java.lang.String m36979x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("WorldMapTileSrc{mName='");
        stringBuffer.append(this.f133091a);
        stringBuffer.append("', mStyle=");
        stringBuffer.append(this.f133092b);
        stringBuffer.append(", mScene=");
        stringBuffer.append(this.f133093c);
        stringBuffer.append(", mVersion=");
        stringBuffer.append(this.f133094d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f133095e);
        stringBuffer.append("', mRanges=");
        if (this.f133096f == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('[');
            int i17 = 0;
            while (i17 < this.f133096f.length) {
                stringBuffer.append(i17 == 0 ? "" : ", ");
                stringBuffer.append(this.f133096f[i17]);
                i17++;
            }
            stringBuffer.append(']');
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private void a(java.lang.String str) {
        this.f133091a = str;
    }

    private void b(int i17) {
        this.f133093c = i17;
    }

    private void c(int i17) {
        this.f133094d = i17;
    }

    private void a(int i17) {
        this.f133092b = i17;
    }

    private void b(java.lang.String str) {
        this.f133095e = str;
    }

    private void a(int[] iArr) {
        this.f133096f = iArr;
    }

    private java.lang.String a(int i17, int i18, int i19, java.lang.String str) {
        java.lang.String replaceFirst;
        java.lang.String str2 = this.f133095e;
        int[] iArr = this.f133096f;
        if (iArr.length == 0) {
            replaceFirst = str2.replaceFirst("\\{range\\}", "");
        } else {
            replaceFirst = str2.replaceFirst("\\{range\\}", java.lang.Integer.toString(a(i17 + i18, iArr.length)));
        }
        return replaceFirst.replaceFirst("\\{z\\}", java.lang.Integer.toString(i19)).replaceFirst("\\{x\\}", java.lang.Integer.toString(i17)).replaceFirst("\\{y\\}", java.lang.Integer.toString(i18)).replaceFirst("\\{style\\}", java.lang.Integer.toString(this.f133092b)).replaceFirst("\\{scene\\}", java.lang.Integer.toString(this.f133093c)).replaceFirst("\\{version\\}", java.lang.Integer.toString(this.f133094d)).replaceFirst("\\{ch\\}", str);
    }

    public static int a(int i17, int i18) {
        int i19 = i17 % i18;
        return i19 * i18 < 0 ? i19 + i18 : i19;
    }
}
