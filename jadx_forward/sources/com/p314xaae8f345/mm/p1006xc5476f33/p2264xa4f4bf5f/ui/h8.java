package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f255486a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f255487b;

    public h8(java.lang.String str, java.util.List list) {
        this.f255486a = str;
        this.f255487b = list;
    }

    /* renamed from: equals */
    public boolean m71877xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h8 h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255486a, h8Var.f255486a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255487b, h8Var.f255487b);
    }

    /* renamed from: hashCode */
    public int m71878x8cdac1b() {
        java.lang.String str = this.f255486a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List list = this.f255487b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m71879x9616526c() {
        return "ThirdInfo(sourceId=" + this.f255486a + ", jumpInfos=" + this.f255487b + ')';
    }
}
