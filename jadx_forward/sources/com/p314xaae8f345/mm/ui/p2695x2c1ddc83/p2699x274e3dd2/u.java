package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f289697a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.t f289698b;

    public u(java.lang.String talker, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.t action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f289697a = talker;
        this.f289698b = action;
    }

    /* renamed from: equals */
    public boolean m80613xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.u)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.u uVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f289697a, uVar.f289697a) && this.f289698b == uVar.f289698b;
    }

    /* renamed from: hashCode */
    public int m80614x8cdac1b() {
        return (this.f289697a.hashCode() * 31) + this.f289698b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m80615x9616526c() {
        return "PendingUnreadUpdate(talker=" + this.f289697a + ", action=" + this.f289698b + ')';
    }
}
