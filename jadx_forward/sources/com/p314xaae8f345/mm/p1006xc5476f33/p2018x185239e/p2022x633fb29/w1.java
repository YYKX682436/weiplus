package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes5.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public int f238588a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f238589b;

    public w1(int i17, java.lang.String bind_serial, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        bind_serial = (i18 & 2) != 0 ? "" : bind_serial;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bind_serial, "bind_serial");
        this.f238588a = i17;
        this.f238589b = bind_serial;
    }

    /* renamed from: equals */
    public boolean m68426xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1) obj;
        return this.f238588a == w1Var.f238588a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f238589b, w1Var.f238589b);
    }

    /* renamed from: hashCode */
    public int m68427x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f238588a) * 31) + this.f238589b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m68428x9616526c() {
        return "RecvChannelAccount(recv_channel_type=" + this.f238588a + ", bind_serial=" + this.f238589b + ')';
    }
}
