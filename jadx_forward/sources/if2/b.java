package if2;

/* loaded from: classes3.dex */
public abstract class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 implements if2.m0, mf2.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f372631d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub f372632e;

    /* renamed from: f, reason: collision with root package name */
    public int f372633f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f372634g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f372635h;

    /* renamed from: i, reason: collision with root package name */
    public if2.l0 f372636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f372631d = "BaseLiveRoomController";
    }

    public static /* synthetic */ void Y6(if2.b bVar, qo0.b bVar2, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        bVar.X6(bVar2, bundle);
    }

    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6() {
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            return (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        }
        return null;
    }

    public final android.content.Context O6() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null) {
            return N6;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    public final dk2.xf P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        if (ubVar != null) {
            return ubVar.mo57732x101edc6b();
        }
        return null;
    }

    public tn0.w0 Q6() {
        tn0.w0 mo57476xdd07d18e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        if (k0Var != null && (mo57476xdd07d18e = k0Var.mo57476xdd07d18e()) != null) {
            return mo57476xdd07d18e;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        return dk2.ef.f314911d;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l R6(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        if (ubVar != null) {
            return ubVar.mo57682x2a5e9229(modelClass);
        }
        return null;
    }

    public final android.view.View S6(int i17) {
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            return view.findViewById(i17);
        }
        return null;
    }

    public final android.view.View T6(int i17, int i18) {
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null) {
            return null;
        }
        android.view.View findViewById = view.findViewById(i18);
        if (findViewById != null) {
            return findViewById;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(i17);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        return inflate instanceof android.view.View ? inflate : null;
    }

    public final boolean U6() {
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        android.content.res.Resources resources2;
        android.content.res.Resources resources3;
        android.content.res.Resources resources4;
        android.content.res.Configuration configuration2;
        java.lang.Object obj = this.f372632e;
        android.content.res.Configuration configuration3 = null;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        android.content.Context context = view != null ? view.getContext() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLandscape orientation: ");
        sb6.append((context == null || (resources4 = context.getResources()) == null || (configuration2 = resources4.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration2.orientation));
        sb6.append(" context: ");
        sb6.append(context);
        sb6.append("  hashCode: ");
        android.content.res.Configuration configuration4 = (context == null || (resources3 = context.getResources()) == null) ? null : resources3.getConfiguration();
        sb6.append(configuration4 != null ? configuration4.hashCode() : 0);
        sb6.append(" configuration: ");
        if (context != null && (resources2 = context.getResources()) != null) {
            configuration3 = resources2.getConfiguration();
        }
        sb6.append(configuration3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f372631d, sb6.toString());
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    public final void V6(java.lang.String tag, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, hashCode() + ' ' + str);
    }

    public final void W6(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (zl2.r4.f555483a.w1()) {
            callback.mo152xb9724478();
            return;
        }
        this.f372634g = callback;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        if (k0Var != null) {
            k0Var.m57728x4e476d70(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410346h2, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410340g2, null, null);
        }
    }

    public final void X6(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        if (k0Var != null) {
            k0Var.mo46557x60d69242(status, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: afterViewMount */
    public final void mo56787xb95be1f8(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        pluginLayout.postDelayed(new if2.a(this), 600L);
    }

    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        this.f372634g = null;
        this.f372635h = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
    }
}
