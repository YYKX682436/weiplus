package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes5.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f229554a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f229555b;

    public h6(java.lang.String instanceName, java.lang.ref.WeakReference context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f229554a = instanceName;
        this.f229555b = context;
    }

    /* renamed from: equals */
    public boolean m66354xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229554a, h6Var.f229554a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229555b, h6Var.f229555b);
    }

    /* renamed from: hashCode */
    public int m66355x8cdac1b() {
        return (this.f229554a.hashCode() * 31) + this.f229555b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66356x9616526c() {
        return "BizCallbackInfo(instanceName=" + this.f229554a + ", context=" + this.f229555b + ')';
    }
}
