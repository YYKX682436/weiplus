package mo1;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f411834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d f411835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f411834e = gVar;
        this.f411835f = activityC12849xeea2846d;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mo1.m(this.f411834e, this.f411835f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mo1.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f411833d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d = this.f411835f;
        try {
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.x1 unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
            this.f411833d = 3;
            obj = r0Var.f(false, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g backupPackage = this.f411834e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(backupPackage, "$backupPackage");
            this.f411833d = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().a(kz5.c0.d(backupPackage), new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.x(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC12849xeea2846d);
                    u1Var.g(activityC12849xeea2846d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofc));
                    u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                    u1Var.l(new mo1.k(activityC12849xeea2846d));
                    u1Var.q(false);
                    return jz5.f0.f384359a;
                }
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.CreateRoamLitePkgUI", "Create package failed, count of packages is " + arrayList.size());
                int i18 = arrayList.size() >= 100 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574390mx5 : com.p314xaae8f345.mm.R.C30867xcad56011.oey;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC12849xeea2846d);
                u1Var2.g(activityC12849xeea2846d.getString(i18));
                u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                u1Var2.l(mo1.l.f411831a);
                u1Var2.q(false);
                activityC12849xeea2846d.f174241r = 2;
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        long longValue = ((java.lang.Number) obj).longValue();
        activityC12849xeea2846d.f174241r = 0;
        java.lang.String str = activityC12849xeea2846d.f174239p;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            throw null;
        }
        activityC12849xeea2846d.V6(longValue, str, 0);
        activityC12849xeea2846d.f174240q = true;
        this.f411833d = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(15000L, this) == aVar) {
            return aVar;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC12849xeea2846d);
        u1Var3.g(activityC12849xeea2846d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofc));
        u1Var3.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        u1Var3.l(new mo1.k(activityC12849xeea2846d));
        u1Var3.q(false);
        return jz5.f0.f384359a;
    }
}
