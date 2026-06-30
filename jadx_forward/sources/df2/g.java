package df2;

/* loaded from: classes3.dex */
public final class g extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311713p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f311714q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311713p = new p012xc85e97e9.p093xedfae76a.j0();
        this.f311714q = new java.util.HashSet();
    }

    @Override // df2.l9
    public void b5() {
        m7("autoDismiss", false);
    }

    @Override // df2.l9
    /* renamed from: getTag */
    public java.lang.String mo124177xb5887064() {
        return "CreateNextNoticeGuide";
    }

    public final void m7(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CreateNextNoticeGuide", "dismissBubble: source=" + str + ", onViewUnMount=" + z17);
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f311713p;
        if (z17) {
            android.view.View f76 = f7(this);
            boolean z18 = false;
            if (f76 != null && f76.getVisibility() == 0) {
                z18 = true;
            }
            if (z18) {
                j0Var.mo523x53d8522f(j0Var.mo3195x754a37bb());
                a7(str, this);
            }
        }
        j0Var.mo523x53d8522f(null);
        a7(str, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f311713p.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.a(this));
    }

    @Override // df2.de, if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        m7("onViewUnmount", true);
        super.mo8999xb1ef75c(pluginLayout);
    }
}
