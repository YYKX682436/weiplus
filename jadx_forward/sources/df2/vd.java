package df2;

/* loaded from: classes3.dex */
public final class vd extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313127m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313127m = "LiveAutoOpenProductDetailController";
    }

    public final void Z6(android.view.ViewGroup viewGroup) {
        android.content.Intent intent;
        byte[] byteArrayExtra;
        android.content.Intent intent2;
        if (!((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313127m, "tryDoProductAction but live is not started");
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = null;
        java.lang.Integer valueOf = (N6 == null || (intent2 = N6.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent2.getIntExtra("KEY_PARAMS_DO_ACTION", 0));
        if (valueOf != null && valueOf.intValue() == 19) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = N6();
            if (N62 != null && (intent = N62.getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_AUTO_OPEN_JUMP_INFO")) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                try {
                    c19786x6a1e28622.mo11468x92b714fd(byteArrayExtra);
                    c19786x6a1e2862 = c19786x6a1e28622;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            if (c19786x6a1e2862 == null) {
                return;
            }
            android.content.Context context = viewGroup.getContext();
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, c19786x6a1e2862);
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        java.lang.Object obj = this.f372632e;
        android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
        if (viewGroup != null) {
            Z6(viewGroup);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        Z6(pluginLayout);
    }
}
