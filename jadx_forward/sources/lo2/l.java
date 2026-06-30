package lo2;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f401679d;

    /* renamed from: e, reason: collision with root package name */
    public int f401680e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 f401682g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401682g = activityC14480x353d0a05;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        lo2.l lVar = new lo2.l(this.f401682g, interfaceC29045xdcb5ca57);
        lVar.f401681f = obj;
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long c17;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f401680e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05 = this.f401682g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f401681f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "CgiFutureTask");
            c17 = c01.id.c();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14480x353d0a05.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            lo2.k kVar = new lo2.k(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), activityC14480x353d0a05);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            bz2.a aVar2 = new bz2.a(kVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null, 4, null);
            this.f401679d = c17;
            this.f401680e = 1;
            j17 = ay1.l.j(aVar2, false, this, 1, null);
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f401679d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = j18;
            j17 = obj;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "CgiFutureTask:" + (c01.id.c() - c17));
        p3325xe03a0797.p3326xc267989b.l.d(activityC14480x353d0a05.f202923t, null, null, new lo2.j((com.p314xaae8f345.mm.p944x882e457a.f) j17, activityC14480x353d0a05, null), 3, null);
        return jz5.f0.f384359a;
    }
}
