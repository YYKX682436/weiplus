package df2;

/* loaded from: classes3.dex */
public final class ju extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f312032m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312033n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public static final android.view.View Z6(df2.ju juVar) {
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            return c76.findViewById(com.p314xaae8f345.mm.R.id.rc8);
        }
        return null;
    }

    public static final android.view.View a7(df2.ju juVar) {
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            return c76.findViewById(com.p314xaae8f345.mm.R.id.fjj);
        }
        return null;
    }

    public static final android.widget.TextView b7(df2.ju juVar) {
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            return (android.widget.TextView) c76.findViewById(com.p314xaae8f345.mm.R.id.f566339fl2);
        }
        return null;
    }

    public final android.view.ViewGroup c7() {
        return (android.view.ViewGroup) T6(com.p314xaae8f345.mm.R.id.f566341fl4, com.p314xaae8f345.mm.R.id.f566340fl3);
    }

    public final void d7() {
        if2.d0 d0Var = this.f312032m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            c76.setOnClickListener(df2.au.f311285d);
        }
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
        r45.ku1 ku1Var = new r45.ku1();
        ku1Var.set(0, java.lang.Long.valueOf(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m));
        ku1Var.set(1, xy2.c.e(O6()));
        dk2.ef.f314925k.e(24, ku1Var, new df2.iu(this, r45.lu1.class), false);
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            if2.d0 d0Var = new if2.d0(c76, new df2.bu());
            this.f372636i = new df2.cu(d0Var);
            this.f312032m = d0Var;
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        d7();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312033n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        dk2.ef.f314925k.f(24);
        this.f312032m = null;
    }
}
