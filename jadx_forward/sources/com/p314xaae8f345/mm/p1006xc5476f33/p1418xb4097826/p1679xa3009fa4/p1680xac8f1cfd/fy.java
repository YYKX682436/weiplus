package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fy extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f215975d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ey f215976e;

    /* renamed from: f, reason: collision with root package name */
    public final kd2.j0 f215977f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f215978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215976e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ey(this);
        this.f215977f = new kd2.j0();
        this.f215978g = "FinderRecoverPageUIC_" + hashCode() + '_' + java.lang.System.currentTimeMillis();
    }

    public static final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy fyVar) {
        android.view.View mo144222x4ff8c0f0;
        if (fyVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = fyVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c().m7474xfb86a31b();
            mo144222x4ff8c0f0 = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
        } else {
            mo144222x4ff8c0f0 = fyVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m6e);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = mo144222x4ff8c0f0 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo144222x4ff8c0f0 : null;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00.m82555x4905e9fa();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        boolean z17 = m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ey eyVar = this.f215976e;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).getFragments()) {
                android.app.Activity context = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                fc2.c Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Y6(abstractC15124x7bae6180.f210798p);
                if (Y6 != null) {
                    Y6.a(eyVar);
                }
            }
        } else {
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(eyVar);
            }
        }
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderRecoverPageUIC$onCreateAfter$2
            {
                this.f39173x3fe91575 = -616994146;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae) {
                ya2.b2 contact;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae event = c5705xaea272ae;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy fyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = fyVar.f215975d;
                if (abstractC14490x69736cb5 == null || (contact = abstractC14490x69736cb5.getContact()) == null) {
                    return false;
                }
                java.lang.String D0 = contact.D0();
                am.rj rjVar = event.f136027g;
                D0.equals(rjVar.f89356b);
                if (eo2.f.f337098a.d(java.lang.Integer.valueOf(rjVar.f89357c))) {
                    return false;
                }
                fyVar.f215977f.c();
                return false;
            }
        };
        kd2.j0 j0Var = this.f215977f;
        j0Var.getClass();
        java.lang.String recoverPageKey = this.f215978g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recoverPageKey, "recoverPageKey");
        xs.k1 k1Var = (xs.k1) i95.n0.c(xs.k1.class);
        if (k1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderRecoverPageHelper", "ISecRecoveryDataService is null, skip");
            return;
        }
        j0Var.f388295a = recoverPageKey;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecoverPageHelper", "start register, recoverPageKey: ".concat(recoverPageKey));
        ((q04.y) k1Var).wi(recoverPageKey, 2, j0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f215977f.getClass();
        java.lang.String recoverPageKey = this.f215978g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recoverPageKey, "recoverPageKey");
        xs.k1 k1Var = (xs.k1) i95.n0.c(xs.k1.class);
        if (k1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderRecoverPageHelper", "ISecRecoveryDataService is null, skip");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecoverPageHelper", "removeRecoverPage start unregister, recoverPageKey: ".concat(recoverPageKey));
            ((q04.y) k1Var).Bi(recoverPageKey, 2);
        }
    }
}
