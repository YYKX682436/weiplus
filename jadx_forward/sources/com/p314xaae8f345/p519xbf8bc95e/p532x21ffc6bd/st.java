package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class st extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f133065i = "default";

    /* renamed from: k, reason: collision with root package name */
    private static final int f133066k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f133067l = 1;

    /* renamed from: e, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "logo_night")
    public java.lang.String f133072e;

    /* renamed from: f, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    public android.graphics.Bitmap f133073f;

    /* renamed from: g, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    public android.graphics.Bitmap f133074g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f133075h;

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "rule")
    public int f133068a = 0;

    /* renamed from: j, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4)
    private int f133076j = 0;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "frontier")
    public java.lang.String f133069b = "default";

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "logo_name")
    public java.lang.String f133070c = "";

    /* renamed from: d, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "logo")
    public java.lang.String f133071d = "";

    private boolean b() {
        return this.f133075h;
    }

    private void c() {
        this.f133075h = true;
    }

    private void d() {
        this.f133068a = 1;
    }

    private java.lang.String e() {
        return this.f133070c;
    }

    private java.lang.String f() {
        return this.f133071d;
    }

    private java.lang.String g() {
        return this.f133072e;
    }

    public final int a() {
        return (this.f133068a * 10) + this.f133076j;
    }

    private void b(java.lang.String str) {
        this.f133070c = str;
    }

    private void c(java.lang.String str) {
        this.f133071d = str;
    }

    private void d(java.lang.String str) {
        this.f133072e = str;
    }

    public final boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb gbVar) {
        boolean b17;
        int i17 = this.f133068a;
        if (i17 != 0) {
            b17 = i17 != 1 ? false : c(gbVar);
        } else {
            b17 = b(gbVar);
        }
        return this.f133075h ? !b17 : b17;
    }

    private void b(android.graphics.Bitmap bitmap) {
        this.f133074g = bitmap;
    }

    private boolean c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb gbVar) {
        if ("default".equals(this.f133069b)) {
            return true;
        }
        if (gbVar == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.c(this.f133069b);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] gcVarArr = gbVar.f131094b;
        if (gcVarArr == null || c17 == null) {
            return true;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a(gcVarArr, c17);
    }

    private boolean b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb gbVar) {
        if ("default".equals(this.f133069b)) {
            return true;
        }
        if (gbVar == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar = gbVar.f131093a;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a();
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a(gcVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.c(this.f133069b));
    }

    private void a(int i17) {
        this.f133076j = i17;
    }

    private void a(java.lang.String str) {
        this.f133069b = str;
    }

    public final android.graphics.Bitmap a(boolean z17) {
        return z17 ? this.f133074g : this.f133073f;
    }

    private void a(android.graphics.Bitmap bitmap) {
        this.f133073f = bitmap;
    }
}
