package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class nq extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq {

    /* renamed from: b, reason: collision with root package name */
    public final int f242904b;

    public nq(int i17) {
        super("enter_edit_avatar_page", null);
        this.f242904b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq
    public void a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        params.put("crt_pic_from", java.lang.Integer.valueOf(this.f242904b));
    }

    /* renamed from: equals */
    public boolean m69059xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nq) && this.f242904b == ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nq) obj).f242904b;
    }

    /* renamed from: hashCode */
    public int m69060x8cdac1b() {
        return java.lang.Integer.hashCode(this.f242904b);
    }

    /* renamed from: toString */
    public java.lang.String m69061x9616526c() {
        return "Crop(source=" + this.f242904b + ')';
    }
}
