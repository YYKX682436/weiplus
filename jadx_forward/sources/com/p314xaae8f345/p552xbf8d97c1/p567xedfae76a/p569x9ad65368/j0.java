package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f134377a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134378b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f134379c;

    public j0(boolean z17, boolean z18, java.util.List lruKillerWhiteList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lruKillerWhiteList, "lruKillerWhiteList");
        this.f134377a = z17;
        this.f134378b = z18;
        this.f134379c = lruKillerWhiteList;
    }

    /* renamed from: equals */
    public boolean m41114xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0) obj;
        return this.f134377a == j0Var.f134377a && this.f134378b == j0Var.f134378b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134379c, j0Var.f134379c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m41115x8cdac1b() {
        boolean z17 = this.f134377a;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = i17 * 31;
        boolean z18 = this.f134378b;
        int i19 = (i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31;
        java.util.List list = this.f134379c;
        return i19 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m41116x9616526c() {
        return "SupervisorConfig(enable=" + this.f134377a + ", autoCreate=" + this.f134378b + ", lruKillerWhiteList=" + this.f134379c + ")";
    }
}
