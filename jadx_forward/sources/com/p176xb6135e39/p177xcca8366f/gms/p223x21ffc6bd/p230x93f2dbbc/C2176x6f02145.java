package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzacg */
/* loaded from: classes16.dex */
final class C2176x6f02145 {
    final int tag;

    /* renamed from: zzbrc */
    final byte[] f6402x6f026d3;

    public C2176x6f02145(int i17, byte[] bArr) {
        this.tag = i17;
        this.f6402x6f026d3 = bArr;
    }

    /* renamed from: equals */
    public final boolean m18955xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145 c2176x6f02145 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145) obj;
        return this.tag == c2176x6f02145.tag && java.util.Arrays.equals(this.f6402x6f026d3, c2176x6f02145.f6402x6f026d3);
    }

    /* renamed from: hashCode */
    public final int m18956x8cdac1b() {
        return ((this.tag + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de) * 31) + java.util.Arrays.hashCode(this.f6402x6f026d3);
    }
}
