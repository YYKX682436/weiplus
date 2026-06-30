package ef2;

/* loaded from: classes10.dex */
public final class c extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f333935m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f333936n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f333936n;
        if (c14195x2dafdb49 != null) {
            android.view.ViewParent parent = c14195x2dafdb49.getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(c14195x2dafdb49);
            }
            this.f333936n = null;
        }
        android.widget.RelativeLayout relativeLayout = this.f333935m;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // if2.b, if2.m0
    public boolean k() {
        if (zl2.r4.f555483a.w1()) {
            return true;
        }
        mm2.n0 n0Var = (mm2.n0) m56788xbba4bfc0(mm2.n0.class);
        return n0Var != null && n0Var.f410806r;
    }

    @Override // if2.e
    /* renamed from: onBackPress */
    public boolean mo124227x4ceae47d() {
        android.widget.RelativeLayout relativeLayout = this.f333935m;
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
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) T6(com.p314xaae8f345.mm.R.id.f566071tg5, com.p314xaae8f345.mm.R.id.f566070tg4);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(new ef2.a(this));
        } else {
            relativeLayout = null;
        }
        this.f333935m = relativeLayout;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        Z6();
        this.f333935m = null;
    }
}
