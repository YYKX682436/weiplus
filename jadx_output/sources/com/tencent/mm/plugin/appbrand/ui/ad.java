package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final int f89510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89512c;

    /* renamed from: d, reason: collision with root package name */
    public final int f89513d;

    public ad(int i17, int i18, int i19, int i27) {
        this.f89510a = i17;
        this.f89511b = i18;
        this.f89512c = i19;
        this.f89513d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.ui.ad)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.ui.ad adVar = (com.tencent.mm.plugin.appbrand.ui.ad) obj;
        return this.f89510a == adVar.f89510a && this.f89511b == adVar.f89511b && this.f89512c == adVar.f89512c && this.f89513d == adVar.f89513d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f89510a) * 31) + java.lang.Integer.hashCode(this.f89511b)) * 31) + java.lang.Integer.hashCode(this.f89512c)) * 31) + java.lang.Integer.hashCode(this.f89513d);
    }

    public java.lang.String toString() {
        return "Padding(left=" + this.f89510a + ", top=" + this.f89511b + ", right=" + this.f89512c + ", bottom=" + this.f89513d + ')';
    }
}
