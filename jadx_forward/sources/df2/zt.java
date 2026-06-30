package df2;

/* loaded from: classes3.dex */
public final class zt extends if2.b implements if2.e {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.List f313528o = kz5.c0.i(1, 2, 4, 8, 16, 256);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.List f313529p = kz5.c0.i(2, 4);

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f313530q = kz5.c0.i(1, 8);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313531m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f313532n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313531m = "Finder.JoinLivePreloadController";
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x029f, code lost:
    
        if (r2 != false) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r11) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zt.Z6(boolean):void");
    }

    public final void a7() {
        android.content.Intent intent;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null || (intent = abstractActivityC21394xb3d2c0cf.getIntent()) == null) {
            return;
        }
        intent.removeExtra("FunctionGuideAction");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        super.mo14866x804e7f00();
        this.f313532n = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        super.mo14867x5aa1c816(r71Var);
        pm0.v.X(new df2.yt(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        Z6(false);
    }

    @Override // if2.e
    /* renamed from: onNewIntent */
    public void mo57867xc944513d(android.content.Intent intent) {
        Z6(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onNormalMode */
    public void mo14868x7c41fe69() {
        super.mo14868x7c41fe69();
        if (this.f313532n) {
            Z6(false);
            this.f313532n = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T7()) {
            Z6(false);
        }
    }
}
