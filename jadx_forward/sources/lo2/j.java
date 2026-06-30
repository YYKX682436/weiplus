package lo2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f401671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 f401672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401671e = fVar;
        this.f401672f = activityC14480x353d0a05;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        lo2.j jVar = new lo2.j(this.f401671e, this.f401672f, interfaceC29045xdcb5ca57);
        jVar.f401670d = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f401671e;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar.f152153f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.member.cgi.FinderFetchMyMembershipSubscriberCgi");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05 = this.f401672f;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC14480x353d0a05.A, ((ho2.d) iVar).f364399t)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberFanListUI", "not my buf, ignore!");
                return f0Var;
            }
            activityC14480x353d0a05.f202929z = ((r45.bs0) fVar.f152151d).f452553e != 0;
            if (activityC14480x353d0a05.A == null) {
                activityC14480x353d0a05.f202928y.clear();
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                pm0.v.J(km5.u.d(), new lo2.h(fVar, activityC14480x353d0a05));
            }
            activityC14480x353d0a05.A = ((r45.bs0) fVar.f152151d).f452554f;
            pm0.v.X(new lo2.i(activityC14480x353d0a05, fVar));
        }
        return f0Var;
    }
}
