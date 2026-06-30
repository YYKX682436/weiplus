package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ki extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f131619a;

    public ki() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
    public final int a() {
        return b().length;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
    public final byte[] b() {
        java.lang.String str = this.f131619a;
        return str != null ? str.getBytes() : new byte[0];
    }

    /* renamed from: toString */
    public final java.lang.String m36810x9616526c() {
        return "StringData{strData='" + this.f131619a + "'}";
    }

    private ki(java.lang.String str) {
        this.f131619a = str;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
    public final void a(byte[] bArr) {
        this.f131619a = new java.lang.String(bArr);
    }
}
