package dk2;

/* loaded from: classes3.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f315587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, dk2.r4 r4Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315587d = hVar;
        this.f315588e = r4Var;
        this.f315589f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.s1(this.f315587d, interfaceC29045xdcb5ca57, this.f315588e, this.f315589f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dk2.s1 s1Var = (dk2.s1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.cz1 cz1Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.od1 od1Var = (r45.od1) ((xg2.i) this.f315587d).f535926b;
        boolean z17 = pm0.v.z(od1Var.m75939xb282bd08(1), 1);
        dk2.r4 r4Var = this.f315588e;
        if (z17) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dot);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            r4Var.getClass();
            pm0.v.X(new dk2.r3(r4Var, string, com.p314xaae8f345.mm.R.raw.f80084xebd378da));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doLikeLive attended lottery success,lotteryId:");
            km2.z zVar = ((on2.z2) r4Var.m(on2.z2.class)).f428625m;
            sb6.append((zVar == null || (cz1Var = zVar.f390765d) == null) ? null : cz1Var.m75945x2fec8307(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, sb6.toString());
            if (!zl2.r4.f555483a.w1()) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.ek((ml2.r0) c17, ml2.p4.f409331i, "", null, 0, null, 28, null);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_popup_joined_toast", null, um2.x5.f510553x1.a(), 25561);
            }
        }
        if (pm0.v.z(od1Var.m75939xb282bd08(1), 8)) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nuf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            r4Var.getClass();
            pm0.v.X(new dk2.r3(r4Var, string2, com.p314xaae8f345.mm.R.raw.f80084xebd378da));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "doLikeLive MMFinderLiveStatusFlag_AttendedLiveGiftActivity success");
        }
        if (pm0.v.z(od1Var.m75939xb282bd08(1), 4)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzd), 0).show();
        }
        this.f315589f.f391656d = od1Var;
        return jz5.f0.f384359a;
    }
}
