package com.tencent.mapsdk.internal;

/* loaded from: classes4.dex */
public final class lz {

    /* renamed from: a, reason: collision with root package name */
    private java.util.List<java.lang.String> f50404a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<java.lang.String> f50405b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final int f50406c = 300;

    public final synchronized boolean a(java.lang.String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                return !this.f50405b.contains(str);
            }
        }
        return false;
    }

    public final synchronized void b(java.lang.String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                if (this.f50405b.contains(str)) {
                    this.f50405b.remove(str);
                    this.f50405b.add(str);
                } else if (!this.f50404a.contains(str)) {
                    a(this.f50404a);
                    this.f50404a.add(str);
                } else {
                    a(this.f50405b);
                    this.f50405b.add(str);
                    this.f50404a.remove(str);
                }
            }
        }
    }

    private static void a(java.util.List<java.lang.String> list) {
        if (list != null && list.size() > 300) {
            list.remove(0);
        }
    }

    private synchronized void a() {
        this.f50404a.clear();
        this.f50405b.clear();
    }
}
