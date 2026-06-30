package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class mq extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq f242873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq btn) {
        super("view_clk", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btn, "btn");
        this.f242873b = btn;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq
    public void a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        params.put("view_id", "setting_avatar_actionsheet");
        params.put("clk_actionsheet_btn", java.lang.Integer.valueOf(this.f242873b.f242790d));
    }

    /* renamed from: equals */
    public boolean m69051xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mq) && this.f242873b == ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mq) obj).f242873b;
    }

    /* renamed from: hashCode */
    public int m69052x8cdac1b() {
        return this.f242873b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m69053x9616526c() {
        return "Click(btn=" + this.f242873b + ')';
    }
}
