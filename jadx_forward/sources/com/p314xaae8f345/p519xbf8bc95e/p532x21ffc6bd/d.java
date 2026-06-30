package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class d extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f {

    /* renamed from: k, reason: collision with root package name */
    private static final long f130733k = 1;

    public d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h hVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g;
        hVar.f131230a = (short) 2;
        hVar.f131231b = (byte) 0;
        hVar.f131232c = 0;
        hVar.f131237h = 0;
        hVar.f131236g = new byte[0];
        hVar.f131238i = new java.util.HashMap();
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131239j = new java.util.HashMap();
    }

    private void a(short s17) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131230a = s17;
        if (s17 == 3) {
            g();
        }
    }

    private void b(int i17) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131237h = i17;
    }

    private void d(byte[] bArr) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131236g = bArr;
    }

    private short h() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131230a;
    }

    private byte i() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131231b;
    }

    private int j() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131232c;
    }

    private int k() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131237h;
    }

    private byte[] l() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131236g;
    }

    private java.util.Map<java.lang.String, java.lang.String> m() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131238i;
    }

    private java.util.Map<java.lang.String, java.lang.String> n() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131239j;
    }

    private int o() {
        java.lang.String str = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131239j.get("STATUS_RESULT_CODE");
        if (str != null) {
            return java.lang.Integer.parseInt(str);
        }
        return 0;
    }

    private java.lang.String p() {
        java.lang.String str = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131239j.get("STATUS_RESULT_DESC");
        return str != null ? str : "";
    }

    private void b(java.util.Map<java.lang.String, java.lang.String> map) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131239j = map;
    }

    private void a(byte b17) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131231b = b17;
    }

    private void a(int i17) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131232c = i17;
    }

    private void a(java.util.Map<java.lang.String, java.lang.String> map) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f) this).f130961g.f131238i = map;
    }
}
