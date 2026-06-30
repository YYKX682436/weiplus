package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175628a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f175629b;

    public a(java.lang.String name, yz5.a execute) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(execute, "execute");
        this.f175628a = name;
        this.f175629b = execute;
    }

    /* renamed from: equals */
    public boolean m54327xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175628a, aVar.f175628a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175629b, aVar.f175629b);
    }

    /* renamed from: hashCode */
    public int m54328x8cdac1b() {
        return (this.f175628a.hashCode() * 31) + this.f175629b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m54329x9616526c() {
        return "TestItem(name=" + this.f175628a + ", execute=" + this.f175629b + ')';
    }
}
