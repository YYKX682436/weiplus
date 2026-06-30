package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
final class zzo {

    /* renamed from: zzbw */
    private final java.security.KeyPair f6149x394b95;

    /* renamed from: zzbx */
    private final long f6150x394b96;

    public zzo(java.security.KeyPair keyPair, long j17) {
        this.f6149x394b95 = keyPair;
        this.f6150x394b96 = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zzo() {
        return android.util.Base64.encodeToString(this.f6149x394b95.getPublic().getEncoded(), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zzp() {
        return android.util.Base64.encodeToString(this.f6149x394b95.getPrivate().getEncoded(), 11);
    }

    /* renamed from: equals */
    public final boolean m18775xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.iid.zzo)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.iid.zzo zzoVar = (com.p176xb6135e39.p177xcca8366f.gms.iid.zzo) obj;
        return this.f6150x394b96 == zzoVar.f6150x394b96 && this.f6149x394b95.getPublic().equals(zzoVar.f6149x394b95.getPublic()) && this.f6149x394b95.getPrivate().equals(zzoVar.f6149x394b95.getPrivate());
    }

    /* renamed from: getCreationTime */
    public final long m18776xbf7b40c2() {
        return this.f6150x394b96;
    }

    /* renamed from: getKeyPair */
    public final java.security.KeyPair m18777xd3069a3() {
        return this.f6149x394b95;
    }

    /* renamed from: hashCode */
    public final int m18778x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.f6149x394b95.getPublic(), this.f6149x394b95.getPrivate(), java.lang.Long.valueOf(this.f6150x394b96));
    }
}
