package qf2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f444145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f444146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.v0 v0Var, km2.q qVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444144d = hVar;
        this.f444145e = v0Var;
        this.f444146f = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.v(this.f444144d, interfaceC29045xdcb5ca57, this.f444145e, this.f444146f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.v vVar = (qf2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object remove;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "accept pk response success sessionId: " + ((r45.m22) ((xg2.i) this.f444144d).f535926b).m75945x2fec8307(1));
        java.util.List list = ((mm2.o4) this.f444145e.m56788xbba4bfc0(mm2.o4.class)).f410855q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-newLinkMicUserList>(...)");
        pm0.v.I(list, new qf2.p(this.f444146f));
        mm2.y2 y2Var = (mm2.y2) this.f444145e.m56788xbba4bfc0(mm2.y2.class);
        km2.q qVar = this.f444146f;
        if (qVar != null) {
            java.util.List list2 = y2Var.f411103w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            pm0.v.G(list2, new mm2.v2(qVar));
            list2.add(qVar);
        } else {
            y2Var.getClass();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "safeAddReportAnchorMicUserList , user = " + qVar);
        fj2.s sVar = fj2.s.f344716a;
        java.lang.String str = this.f444146f.f390703a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("type", new java.lang.Integer(2));
        sVar.f(1, str, jSONObject.toString());
        mm2.o4 o4Var = (mm2.o4) this.f444145e.m56788xbba4bfc0(mm2.o4.class);
        km2.q qVar2 = this.f444146f;
        o4Var.getClass();
        if (qVar2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safeAddAnchorCarryPkMicUser sdkUserId: ");
            sb6.append(qVar2.f390703a);
            sb6.append(" nickName: ");
            r45.xn1 xn1Var = qVar2.f390720r;
            sb6.append((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
            sb6.append(" roomId: ");
            sb6.append(qVar2.f390711i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
            java.util.Map map = o4Var.f410859u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            java.lang.String str2 = qVar2.f390703a;
            synchronized (map) {
                obj2 = map.get(str2);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o4Var.M7((km2.q) it.next());
                }
            }
            java.util.Map map2 = o4Var.f410859u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map2);
            java.lang.String str3 = qVar2.f390703a;
            synchronized (map2) {
                remove = map2.remove(str3);
            }
        }
        return jz5.f0.f384359a;
    }
}
