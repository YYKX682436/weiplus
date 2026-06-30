package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.pm.ResolveInfo f270728a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f270729b;

    public b(android.content.pm.ResolveInfo info, android.content.Intent targetIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetIntent, "targetIntent");
        this.f270728a = info;
        this.f270729b = targetIntent;
    }

    /* renamed from: equals */
    public boolean m75215xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b bVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f270728a, bVar.f270728a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f270729b, bVar.f270729b);
    }

    /* renamed from: hashCode */
    public int m75216x8cdac1b() {
        return (this.f270728a.hashCode() * 31) + this.f270729b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m75217x9616526c() {
        return "AppIntentInfo(info=" + this.f270728a + ", targetIntent=" + this.f270729b + ')';
    }
}
