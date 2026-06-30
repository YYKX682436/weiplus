package nl2;

/* loaded from: classes3.dex */
public final class g extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f419709m;

    /* renamed from: n, reason: collision with root package name */
    public bm2.m3 f419710n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6() {
        bm2.m3 m3Var = this.f419710n;
        if (m3Var != null) {
            ol2.b a17 = ol2.b.f427675c.a(((mm2.u0) m56788xbba4bfc0(mm2.u0.class)).f410981n);
            java.util.ArrayList arrayList = a17.f427676a;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            pm0.v.b0(arrayList, nl2.a.f419702d);
            m3Var.z(arrayList, a17.f427677b);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        android.content.Context context = pluginLayout.getContext();
        super.mo8998x9f682d55(pluginLayout);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.tn6);
        if (c1163xf1deaba4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveOuterShortcutWordingController", "cannot find outer_fast_comment_container");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        bm2.m3 m3Var = new bm2.m3(context, bm2.h3.f103472e);
        m3Var.f103631g = new nl2.c(m3Var, this);
        m3Var.m8146xced61ae5();
        this.f419710n = m3Var;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31 c1626x16b77f31 = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31(context);
        c1626x16b77f31.F(1);
        c1626x16b77f31.E(0);
        c1626x16b77f31.D(4);
        if (c1626x16b77f31.f125734f != 0) {
            c1626x16b77f31.f125734f = 0;
            c1626x16b77f31.m8087x46ac7299();
        }
        c1163xf1deaba4.mo7960x6cab2c8d(this.f419710n);
        c1163xf1deaba4.mo7967x900dcbe1(c1626x16b77f31);
        c1163xf1deaba4.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
        this.f419709m = c1163xf1deaba4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.u0) m56788xbba4bfc0(mm2.u0.class)).f410979i;
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new nl2.d(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f419709m;
        if (c1163xf1deaba42 != null) {
            this.f372636i = new nl2.f(new if2.d0(c1163xf1deaba42, new nl2.e()));
        }
        Z6();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f419709m = null;
        this.f419710n = null;
    }
}
