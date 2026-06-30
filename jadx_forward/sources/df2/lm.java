package df2;

/* loaded from: classes3.dex */
public final class lm extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f312206m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312207n;

    /* renamed from: z6, reason: collision with root package name */
    public android.widget.ImageView f312208z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6() {
        android.widget.RelativeLayout relativeLayout = this.f312206m;
        if (relativeLayout != null) {
            relativeLayout.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(relativeLayout.getContext()).y).setDuration(200L).start();
            relativeLayout.postDelayed(new df2.im(relativeLayout), 200L);
        }
    }

    public final void b(int i17) {
        if (this.f312206m == null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) T6(com.p314xaae8f345.mm.R.id.fpg, com.p314xaae8f345.mm.R.id.fpf);
            if (relativeLayout != null) {
                this.f312208z6 = (android.widget.ImageView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.hlm);
                android.widget.ImageView imageView = (android.widget.ImageView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.r6d);
                if (imageView != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new x.s(imageView, null), 3, null);
                }
                relativeLayout.setOnClickListener(new x.t(this));
                android.view.View findViewById = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.b5i);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new x.u(this, i17));
                }
                android.view.View findViewById2 = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.mvb);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new x.v(this, i17));
                }
            } else {
                relativeLayout = null;
            }
            this.f312206m = relativeLayout;
        }
        android.widget.ImageView imageView2 = this.f312208z6;
        if (imageView2 != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(c01.z1.r());
            java.lang.String d17 = n07 != null ? n07.d() : null;
            if (d17 == null) {
                d17 = "";
            }
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.l().c(new mn2.n(d17, null, 2, null), imageView2, g1Var.h(mn2.f1.f411494o));
        }
        android.widget.RelativeLayout relativeLayout2 = this.f312206m;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
            relativeLayout2.animate().translationY(0.0f).setDuration(200L).setListener(null).start();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        jSONObject.put("click_soure", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void c(int i17) {
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410462z6 && ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).c7() == 1) {
            boolean U6 = U6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHonorVisitorGuideController", "#showCard isLandscape:" + U6);
            if (U6) {
                W6(new x.w(this, i17));
            } else {
                b(i17);
            }
        }
    }

    @Override // if2.e
    /* renamed from: onBackPress */
    public boolean mo124227x4ceae47d() {
        android.widget.RelativeLayout relativeLayout = this.f312206m;
        if (!(relativeLayout != null && relativeLayout.getVisibility() == 0)) {
            return false;
        }
        Z6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        ae2.in.f85221a.J();
        if (this.f312207n) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.km(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        Z6();
        this.f312206m = null;
        this.f312208z6 = null;
    }
}
