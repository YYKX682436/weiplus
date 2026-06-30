package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class tl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f217572d;

    /* renamed from: e, reason: collision with root package name */
    public int f217573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl f217574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f217575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar, so2.q6 q6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217574f = zlVar;
        this.f217575g = q6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tl(this.f217574f, this.f217575g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object O6;
        java.lang.Object obj2;
        java.lang.Throwable m143898xd4a2fc34;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f217573e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", "loadCollection request CgiFinderGetTopicFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar = this.f217574f;
            so2.q6 q6Var = this.f217575g;
            this.f217573e = 1;
            O6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl.O6(zlVar, q6Var, this);
            if (O6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f217572d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                O6 = obj2;
                m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(O6);
                if (m143898xd4a2fc34 != null && (m143898xd4a2fc34 instanceof rm0.j)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCollection request CgiFinderGetTopicFeed fail, errType=");
                    rm0.j jVar = (rm0.j) m143898xd4a2fc34;
                    sb6.append(jVar.f478957e);
                    sb6.append(" errCode=");
                    sb6.append(jVar.f478958f);
                    sb6.append(" fail:");
                    sb6.append(jVar.f478959g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderHorizontalCollectionUIC", sb6.toString());
                }
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            O6 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar2 = this.f217574f;
        so2.q6 q6Var2 = this.f217575g;
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(O6)) {
            r45.oa1 oa1Var = (r45.oa1) O6;
            zlVar2.f218226h = oa1Var.m75934xbce7f2f(2);
            int i18 = 0;
            zlVar2.U6(oa1Var.m75939xb282bd08(11) == 1);
            zlVar2.V6(oa1Var.m75939xb282bd08(10) == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", "loadCollection request CgiFinderGetTopicFeed success, data: " + oa1Var.m75941xfb821914(1).size() + "lastBuffer: " + zlVar2.f218226h + ", downContinue: " + zlVar2.f218228m + ", upContinue: " + zlVar2.f218227i);
            java.util.LinkedList m75941xfb821914 = oa1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            for (java.lang.Object obj3 : m75941xfb821914) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = h90Var.a(c19792x256d2725, 64);
                java.util.ArrayList arrayList = zlVar2.f218224f.f203829a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1(a17);
                z1Var.f204043f = q6Var2.f492092e;
                z1Var.f204042e = zlVar2.R6().mo2128x1ed62e84();
                if (z1Var.mo2128x1ed62e84() == zlVar2.R6().mo2128x1ed62e84()) {
                    zlVar2.f218231p = z1Var;
                    z1Var.f204041d = true;
                }
                arrayList.add(z1Var);
                i18 = i19;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sl slVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sl(zlVar2, null);
            this.f217572d = O6;
            this.f217573e = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, slVar, this) == aVar) {
                return aVar;
            }
            obj2 = O6;
            O6 = obj2;
        }
        m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(O6);
        if (m143898xd4a2fc34 != null) {
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("loadCollection request CgiFinderGetTopicFeed fail, errType=");
            rm0.j jVar2 = (rm0.j) m143898xd4a2fc34;
            sb62.append(jVar2.f478957e);
            sb62.append(" errCode=");
            sb62.append(jVar2.f478958f);
            sb62.append(" fail:");
            sb62.append(jVar2.f478959g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderHorizontalCollectionUIC", sb62.toString());
        }
        return jz5.f0.f384359a;
    }
}
