package com.p176xb6135e39.p280x308fcb;

/* loaded from: classes16.dex */
public final class k extends com.p176xb6135e39.p280x308fcb.l implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f126372d = new java.util.ArrayList();

    /* renamed from: equals */
    public boolean m20504xb2c87fbf(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.p176xb6135e39.p280x308fcb.k) {
                if (((java.util.ArrayList) ((com.p176xb6135e39.p280x308fcb.k) obj).f126372d).equals(this.f126372d)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m20505x8cdac1b() {
        return ((java.util.ArrayList) this.f126372d).hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return ((java.util.ArrayList) this.f126372d).iterator();
    }
}
