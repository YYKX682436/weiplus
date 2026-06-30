package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class pq extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq {

    /* renamed from: b, reason: collision with root package name */
    public final int f242989b;

    public pq(int i17) {
        super("set_avatar_finish", null);
        this.f242989b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq
    public void a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        params.put("crt_pic_from", java.lang.Integer.valueOf(this.f242989b));
    }

    /* renamed from: equals */
    public boolean m69072xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pq) && this.f242989b == ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pq) obj).f242989b;
    }

    /* renamed from: hashCode */
    public int m69073x8cdac1b() {
        return java.lang.Integer.hashCode(this.f242989b);
    }

    /* renamed from: toString */
    public java.lang.String m69074x9616526c() {
        return "SetAvatar(source=" + this.f242989b + ')';
    }
}
