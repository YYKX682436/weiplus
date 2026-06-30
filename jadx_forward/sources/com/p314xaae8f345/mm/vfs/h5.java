package com.p314xaae8f345.mm.vfs;

/* loaded from: classes3.dex */
public class h5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f294511a;

    /* renamed from: b, reason: collision with root package name */
    public final long f294512b;

    public h5(long j17, long j18) {
        this.f294511a = j17;
        this.f294512b = j18;
    }

    /* renamed from: equals */
    public boolean m82406xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.h5)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.h5 h5Var = (com.p314xaae8f345.mm.vfs.h5) obj;
        return h5Var.f294511a == this.f294511a && h5Var.f294512b == this.f294512b;
    }

    /* renamed from: hashCode */
    public int m82407x8cdac1b() {
        return java.lang.Long.hashCode(this.f294511a) ^ java.lang.Long.hashCode(this.f294512b);
    }
}
