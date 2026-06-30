package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class oq extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f242938b;

    public oq(boolean z17) {
        super("view_exp", null);
        this.f242938b = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq
    public void a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        params.put("view_id", "setting_avatar_actionsheet");
        params.put("has_yuanbao_btn", java.lang.Integer.valueOf(this.f242938b ? 1 : 0));
    }

    /* renamed from: equals */
    public boolean m69064xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oq) && this.f242938b == ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oq) obj).f242938b;
    }

    /* renamed from: hashCode */
    public int m69065x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f242938b);
    }

    /* renamed from: toString */
    public java.lang.String m69066x9616526c() {
        return "Expose(hasYuanBaoButton=" + this.f242938b + ')';
    }
}
