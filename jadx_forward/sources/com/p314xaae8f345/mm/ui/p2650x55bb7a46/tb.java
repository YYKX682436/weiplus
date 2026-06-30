package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class tb extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public em.i1 f284244d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f284245e;

    /* renamed from: f, reason: collision with root package name */
    public long f284246f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f284247g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f284248h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f284249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f284248h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.rb(this);
        this.f284249i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.kb(this);
    }

    public final void T6() {
        boolean z17 = m158354x19263085().getResources().getConfiguration().orientation == 2;
        int dimensionPixelSize = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int dimensionPixelSize2 = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        int dimensionPixelSize3 = m158354x19263085().getResources().getDimensionPixelSize(z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn : com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        em.i1 i1Var = this.f284244d;
        if (i1Var != null) {
            i1Var.b().setPadding(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }

    /* renamed from: finish */
    public final void m79835xb4098c93() {
        m158354x19263085().finish();
        m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ej6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        m79835xb4098c93();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        em.i1 i1Var = this.f284244d;
        if (i1Var != null) {
            i1Var.b().post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.qb(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03d1 A[Catch: Exception -> 0x03ec, TRY_LEAVE, TryCatch #0 {Exception -> 0x03ec, blocks: (B:38:0x03a5, B:41:0x03b4, B:43:0x03bd, B:45:0x03c5, B:50:0x03d1), top: B:37:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x05b2  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r88) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        em.i1 i1Var = this.f284244d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        i1Var.a().removeCallbacks(this.f284249i);
        long j17 = this.f284246f;
        if (j17 != 0) {
            cf5.l lVar = cf5.l.f122520a;
            cf5.d dVar = (cf5.d) cf5.l.f122521b.remove(java.lang.Long.valueOf(j17));
            if (dVar != null) {
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("msg_svr_id", java.lang.Long.valueOf(dVar.f122490a));
                lVarArr[1] = new jz5.l("enter_source", dVar.f122491b);
                lVarArr[2] = new jz5.l("stay_ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - dVar.f122492c));
                lVarArr[3] = new jz5.l("selection_triggered", java.lang.Long.valueOf(dVar.f122493d ? 1L : 0L));
                lVarArr[4] = new jz5.l("actions", kz5.n0.g0(dVar.f122494e, ",", null, null, 0, null, null, 62, null));
                lVarArr[5] = new jz5.l("inner_version", 1);
                java.util.LinkedHashMap j18 = kz5.c1.j(lVarArr);
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new cf5.j(j18, null), 1, null);
                }
            }
        }
        n3.h2.a(m158354x19263085().getWindow(), true);
        new n3.m3(m158354x19263085().getWindow(), m158354x19263085().getWindow().getDecorView()).f415907a.g(1);
        m158354x19263085().getWindow().getDecorView().setSystemUiVisibility(m158354x19263085().getWindow().getDecorView().getSystemUiVisibility() & (-513));
    }
}
