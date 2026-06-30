package df2;

/* loaded from: classes3.dex */
public final class a00 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311181m;

    /* renamed from: n, reason: collision with root package name */
    public st2.c f311182n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311183o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f311184p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f311185q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311181m = "ShopCouponBubbleController";
        this.f311183o = new p012xc85e97e9.p093xedfae76a.j0(null);
    }

    public static final void Z6(df2.a00 a00Var) {
        android.view.ViewGroup m56779x33bfba91;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c76 = a00Var.c7();
        if (c76 == null || (m56779x33bfba91 = c76.m56779x33bfba91()) == null || (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m56779x33bfba91.findViewById(com.p314xaae8f345.mm.R.id.odl)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b76 = a00Var.b7();
        c22699x3dcdb352.setImageBitmap(b76 != null ? b76.m82573x12501425() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[LOOP:0: B:28:0x00a5->B:30:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.a00 r9, r45.xb2 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.a00.a7(df2.a00, r45.xb2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b7() {
        android.view.View c76 = c7();
        if (c76 == null) {
            c76 = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.rp7);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) (c76 != null ? c76.findViewById(com.p314xaae8f345.mm.R.id.f564586vc) : null);
        if (c22789xd23e9a9b == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(true);
        return c22789xd23e9a9b;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.rp7);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) parent;
        }
        return null;
    }

    public final void d7() {
        boolean a86 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8();
        java.lang.String str = this.f311181m;
        if (!a86) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPolling liveStarted:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8());
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(34);
        r45.wb2 wb2Var = new r45.wb2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start polling with req " + wb2Var.mo12245xcc313de3());
        tbVar.e(45, wb2Var, new df2.vz(this, r45.xb2.class), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.f(45);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        d7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        p012xc85e97e9.p093xedfae76a.y yVar = pluginLayout instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) pluginLayout : null;
        java.lang.String str = this.f311181m;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, pluginLayout + " is not owner");
            return;
        }
        try {
            com.p314xaae8f345.mm.rfx.C20943x379d0cc1.m77416xa3faf9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), "fonts/WeChatSansSS-Bold.ttf");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "register font failed", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c76 = c7();
        if (c76 != null) {
            c76.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c77 = c7();
        if (c77 != null) {
            c77.setOnClickListener(new df2.mz(this));
        }
        android.view.View T6 = T6(com.p314xaae8f345.mm.R.id.rly, com.p314xaae8f345.mm.R.id.rlx);
        if (T6 != null) {
            st2.c cVar = this.f311182n;
            if (cVar == null) {
                cVar = new st2.c(T6, this);
                cVar.f493772d = new df2.nz(this);
            }
            this.f311182n = cVar;
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f311183o;
        j0Var.m7809x1ff8439(yVar);
        pm0.v.y(j0Var, yVar, new df2.pz(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c78 = c7();
        if (c78 != null) {
            c78.m56781xa1160b3b(new df2.uz(this));
        }
        d7();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b76 = b7();
        if (b76 != null) {
            b76.n();
        }
        this.f311182n = null;
    }
}
