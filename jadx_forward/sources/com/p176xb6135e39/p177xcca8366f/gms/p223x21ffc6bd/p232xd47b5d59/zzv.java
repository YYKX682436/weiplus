package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
final class zzv {
    final int tag;

    /* renamed from: zzhm */
    final byte[] f7322x394c45;

    public zzv(int i17, byte[] bArr) {
        this.tag = i17;
        this.f7322x394c45 = bArr;
    }

    /* renamed from: equals */
    public final boolean m19461xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv zzvVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv) obj;
        return this.tag == zzvVar.tag && java.util.Arrays.equals(this.f7322x394c45, zzvVar.f7322x394c45);
    }

    /* renamed from: hashCode */
    public final int m19462x8cdac1b() {
        return ((this.tag + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de) * 31) + java.util.Arrays.hashCode(this.f7322x394c45);
    }
}
