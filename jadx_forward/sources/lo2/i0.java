package lo2;

/* loaded from: classes8.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401665d;

    /* renamed from: e, reason: collision with root package name */
    public int f401666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc f401667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401668g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401669h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401667f = activityC14486x9c4a98dc;
        this.f401668g = str;
        this.f401669h = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lo2.i0(this.f401667f, this.f401668g, this.f401669h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c76;
        java.lang.Object obj2;
        java.lang.Throwable m143898xd4a2fc34;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f401666e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc = this.f401667f;
            java.lang.String str = this.f401668g;
            this.f401666e = 1;
            c76 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc.c7(activityC14486x9c4a98dc, str, this);
            if (c76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f401665d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c76 = obj2;
                m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(c76);
                if (m143898xd4a2fc34 != null && (m143898xd4a2fc34 instanceof rm0.j)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request CgiGetFinderSearchMemberZone fail, errType=");
                    rm0.j jVar = (rm0.j) m143898xd4a2fc34;
                    sb6.append(jVar.f478957e);
                    sb6.append(" errCode=");
                    sb6.append(jVar.f478958f);
                    sb6.append(" fail:");
                    sb6.append(jVar.f478959g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMemberSearchUI", sb6.toString());
                }
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c76 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        java.lang.String str2 = this.f401669h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc2 = this.f401667f;
        java.lang.String str3 = this.f401668g;
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(c76)) {
            r45.qu2 qu2Var = (r45.qu2) c76;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, activityC14486x9c4a98dc2.E)) {
                activityC14486x9c4a98dc2.F = qu2Var.f465796e;
                int i18 = qu2Var.f465797f;
                activityC14486x9c4a98dc2.G = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberSearchUI", "set continueFlag " + i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberSearchUI", "request CgiGetFinderSearchMemberZone success, data: " + qu2Var.f465795d.size() + ", lastBuffer: " + activityC14486x9c4a98dc2.F + ", continueFlag: " + activityC14486x9c4a98dc2.G);
                java.util.List d76 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc.d7(activityC14486x9c4a98dc2, qu2Var);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                lo2.h0 h0Var = new lo2.h0(activityC14486x9c4a98dc2, d76, null);
                this.f401665d = c76;
                this.f401666e = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, h0Var, this) == aVar) {
                    return aVar;
                }
                obj2 = c76;
                c76 = obj2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberSearchUI", "refresh query not match query " + str3 + " curQuery " + activityC14486x9c4a98dc2.D);
            }
        }
        m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(c76);
        if (m143898xd4a2fc34 != null) {
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("request CgiGetFinderSearchMemberZone fail, errType=");
            rm0.j jVar2 = (rm0.j) m143898xd4a2fc34;
            sb62.append(jVar2.f478957e);
            sb62.append(" errCode=");
            sb62.append(jVar2.f478958f);
            sb62.append(" fail:");
            sb62.append(jVar2.f478959g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMemberSearchUI", sb62.toString());
        }
        return jz5.f0.f384359a;
    }
}
