package com.google.gson;

/* loaded from: classes16.dex */
public final class k extends com.google.gson.l implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f44839d = new java.util.ArrayList();

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.google.gson.k) {
                if (((java.util.ArrayList) ((com.google.gson.k) obj).f44839d).equals(this.f44839d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((java.util.ArrayList) this.f44839d).hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return ((java.util.ArrayList) this.f44839d).iterator();
    }
}
