package im2;

/* loaded from: classes3.dex */
public final class o6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374001d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f374002e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e4 f374003f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f374004g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 f374005h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f374006i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f374007m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f374008n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f374009o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f374001d = "FinderLiveVisitorEndPageUIC";
        this.f374003f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e4();
        this.f374004g = jz5.h.b(im2.n6.f373992d);
        this.f374009o = true;
    }

    public final so2.v2 O6() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dtj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x016a, code lost:
    
        if ((r1 - r5 > ((long) java.lang.Math.max(r0.f315506g, 30000))) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.o6.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374001d, "destryo, curpage = " + this.f374005h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 no0Var = this.f374005h;
        if (no0Var != null) {
            no0Var.e();
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f374007m;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        if (this.f374008n) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39 c5494xbcbdbc39 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39();
            c5494xbcbdbc39.f135827g.f89982a = 5L;
            c5494xbcbdbc39.e();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5490xca85566c c5490xca85566c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5490xca85566c();
            am.ub ubVar = c5490xca85566c.f135823g;
            ubVar.f89603a = 2L;
            ubVar.f89604b = true;
            c5490xca85566c.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 no0Var = this.f374005h;
        if (no0Var != null) {
            no0Var.c();
        }
        ml2.b1.a(ml2.b1.f408744a, java.lang.String.valueOf(hashCode()), null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 no0Var = this.f374005h;
        if (no0Var != null) {
            no0Var.d();
        }
        ml2.b1.a(ml2.b1.f408744a, java.lang.String.valueOf(hashCode()), null, 2, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String valueOf = java.lang.String.valueOf(hashCode());
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r0Var.Jj(valueOf, ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e.f492192n.m75942xfb822ef2(0));
    }
}
