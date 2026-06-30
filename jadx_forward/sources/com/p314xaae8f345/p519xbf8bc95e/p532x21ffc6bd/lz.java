package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes4.dex */
public final class lz {

    /* renamed from: a, reason: collision with root package name */
    private java.util.List<java.lang.String> f131937a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<java.lang.String> f131938b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final int f131939c = 300;

    public final synchronized boolean a(java.lang.String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                return !this.f131938b.contains(str);
            }
        }
        return false;
    }

    public final synchronized void b(java.lang.String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                if (this.f131938b.contains(str)) {
                    this.f131938b.remove(str);
                    this.f131938b.add(str);
                } else if (!this.f131937a.contains(str)) {
                    a(this.f131937a);
                    this.f131937a.add(str);
                } else {
                    a(this.f131938b);
                    this.f131938b.add(str);
                    this.f131937a.remove(str);
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
        this.f131937a.clear();
        this.f131938b.clear();
    }
}
