package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class po extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: m, reason: collision with root package name */
    public static long f217104m;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f217105d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f217106e;

    /* renamed from: f, reason: collision with root package name */
    public int f217107f;

    /* renamed from: g, reason: collision with root package name */
    public int f217108g;

    /* renamed from: h, reason: collision with root package name */
    public int f217109h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f217110i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217105d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity);
        this.f217107f = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179()).f278668a;
        this.f217109h = 1;
        this.f217110i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lo.f216607d);
    }

    public final boolean O6() {
        return ((java.lang.Boolean) ((jz5.n) this.f217110i).mo141623x754a37bb()).booleanValue();
    }

    public final void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f217105d;
        tlVar.h("resetToPortrait");
        if (!O6() || tlVar.f190616u < 0) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = tlVar.g().f192608d;
        int i17 = tlVar.f190616u + 1;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tlVar.g().f192609e;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        int a07 = i17 + c22848x6ddd90cf.a0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(a07));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "scrollToSelectPos", "()V", "Undefined", "scrollToPosition", "(I)V");
        c22849x81a93d25.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "scrollToSelectPos", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b2d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179());
        int i17 = this.f217107f;
        int i18 = a17.f278668a;
        if (i18 != i17) {
            this.f217107f = i18;
            this.f217105d.h("screenWidthChange");
        }
        int i19 = this.f217109h;
        int i27 = newConfig.orientation;
        if (i19 != i27) {
            this.f217109h = i27;
            if (i27 == 1) {
                pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mo(this));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0526, code lost:
    
        if (r1 == false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0360  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r42) {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderLongVideoShareUIC$onCreateAfter$1
            {
                this.f39173x3fe91575 = 2063121603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 c5151xfdcfc6b3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 event = c5151xfdcfc6b3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po poVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po.this;
                if (poVar.m158354x19263085().hashCode() != event.f135500g.f88248a) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "ActivityToggleAnimEndEvent: notify adjust progress bar");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oo(poVar));
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f217105d;
        tlVar.e().m56401x31d4943c(tlVar.g().f192615k);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn) ((jz5.n) tlVar.f190609n).mo141623x754a37bb()).R1().mo50302x6b17ad39(null);
        so2.j5 j5Var = (so2.j5) tlVar.f().f374658i;
        if (j5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.a(tlVar.f190602d, j5Var, 55);
        }
        do2.k kVar = tlVar.B;
        if (kVar != null) {
            kVar.dismiss();
        }
        tlVar.B = null;
        tlVar.g().f192614j = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0) ((jz5.n) tlVar.f190608m).mo141623x754a37bb()).m56485x3f5eee52();
        ao2.a aVar = tlVar.f190603e;
        if (aVar == null || !aVar.f94077m) {
            return;
        }
        aVar.f94077m = false;
        aVar.a(2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f217105d;
        tlVar.f190606h.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(tlVar.D);
        ao2.a aVar = tlVar.f190603e;
        if (aVar != null) {
            synchronized (aVar) {
                if (aVar.f94076l == null) {
                    return;
                }
                if (!aVar.f94078n) {
                    aVar.f94078n = true;
                    aVar.a(3);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f217105d;
        tlVar.getClass();
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hl(tlVar));
        ao2.a aVar = tlVar.f190603e;
        if (aVar != null) {
            aVar.e();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(tlVar.D, 200L);
    }
}
