package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.NativeCronetProvider */
/* loaded from: classes13.dex */
public class C29622x121c94e5 extends org.p3343x72743996.net.AbstractC29502xfcaa84ee {
    public C29622x121c94e5(android.content.Context context) {
        super(context);
    }

    @Override // org.p3343x72743996.net.AbstractC29502xfcaa84ee
    /* renamed from: createBuilder */
    public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153198x93ab12ff() {
        return new org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder(new org.p3343x72743996.net.p3358x316220.C29621x2ebb8843(this.f73789xd6cfe882));
    }

    /* renamed from: equals */
    public boolean m154256xb2c87fbf(java.lang.Object obj) {
        return obj == this || ((obj instanceof org.p3343x72743996.net.p3358x316220.C29622x121c94e5) && this.f73789xd6cfe882.equals(((org.p3343x72743996.net.p3358x316220.C29622x121c94e5) obj).f73789xd6cfe882));
    }

    @Override // org.p3343x72743996.net.AbstractC29502xfcaa84ee
    /* renamed from: getName */
    public java.lang.String mo153199xfb82e301() {
        return org.p3343x72743996.net.AbstractC29502xfcaa84ee.f73786xa22ffc2;
    }

    @Override // org.p3343x72743996.net.AbstractC29502xfcaa84ee
    /* renamed from: getVersion */
    public java.lang.String mo153200x52c258a2() {
        return org.p3343x72743996.net.p3358x316220.C29616xa1995678.m154243xf714d6a5();
    }

    /* renamed from: hashCode */
    public int m154257x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{org.p3343x72743996.net.p3358x316220.C29622x121c94e5.class, this.f73789xd6cfe882});
    }

    @Override // org.p3343x72743996.net.AbstractC29502xfcaa84ee
    /* renamed from: isEnabled */
    public boolean mo153201x7d80d2b7() {
        return true;
    }
}
