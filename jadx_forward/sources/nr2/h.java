package nr2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f420731d;

    /* renamed from: e, reason: collision with root package name */
    public int f420732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr2.l f420733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f420734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f420735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nr2.l lVar, so2.q6 q6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420733f = lVar;
        this.f420734g = q6Var;
        this.f420735h = c15343x638a173f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr2.h(this.f420733f, this.f420734g, this.f420735h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object O6;
        java.lang.Object obj2;
        java.lang.Throwable m143898xd4a2fc34;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f420732e;
        nr2.l lVar = this.f420733f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f420732e = 1;
            O6 = nr2.l.O6(lVar, this.f420734g, this);
            if (O6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f420731d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                O6 = obj2;
                m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(O6);
                if (m143898xd4a2fc34 != null && (m143898xd4a2fc34 instanceof rm0.j)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request CgiFinderGetTopicFeed fail, errType=");
                    rm0.j jVar = (rm0.j) m143898xd4a2fc34;
                    sb6.append(jVar.f478957e);
                    sb6.append(" errCode=");
                    sb6.append(jVar.f478958f);
                    sb6.append(" fail:");
                    sb6.append(jVar.f478959g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderCoursePreviewItemUIC", sb6.toString());
                }
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            O6 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(O6)) {
            r45.oa1 oa1Var = (r45.oa1) O6;
            lVar.f420791n = oa1Var.m75934xbce7f2f(2);
            lVar.f420787g = oa1Var.m75939xb282bd08(11) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoursePreviewItemUIC", "request CgiFinderGetCollectionList success, data: " + oa1Var.m75941xfb821914(1).size() + ", lastBuffer: " + lVar.f420791n + ", continueFlage: " + lVar.f420787g);
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = oa1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1(h90Var.a(c19792x256d2725, 64)));
            }
            lVar.f420785e.addAll(arrayList);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            nr2.g gVar = new nr2.g(lVar, this.f420735h, null);
            this.f420731d = O6;
            this.f420732e = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, gVar, this) == aVar) {
                return aVar;
            }
            obj2 = O6;
            O6 = obj2;
        }
        m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(O6);
        if (m143898xd4a2fc34 != null) {
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("request CgiFinderGetTopicFeed fail, errType=");
            rm0.j jVar2 = (rm0.j) m143898xd4a2fc34;
            sb62.append(jVar2.f478957e);
            sb62.append(" errCode=");
            sb62.append(jVar2.f478958f);
            sb62.append(" fail:");
            sb62.append(jVar2.f478959g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderCoursePreviewItemUIC", sb62.toString());
        }
        return jz5.f0.f384359a;
    }
}
