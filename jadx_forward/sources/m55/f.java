package m55;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f405863d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f405864e;

    /* renamed from: f, reason: collision with root package name */
    public int f405865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ og3.d f405866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ og3.e f405867h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f405866g = dVar;
        this.f405867h = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new m55.f(this.f405866g, this.f405867h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((m55.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f405865f;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        og3.d dVar = this.f405866g;
        this.f405863d = dVar;
        og3.e eVar = this.f405867h;
        this.f405864e = eVar;
        this.f405865f = 1;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa : dVar.f426692a) {
            if (m55.e.f405862a[c16506x8e746ffa.f230142d.ordinal()] == 1) {
                rm5.j jVar = new rm5.j(c16506x8e746ffa.f230143e, 2);
                jVar.f(1.0f);
                jVar.e(c16506x8e746ffa.f230144f.f230133d);
                jVar.d(java.lang.Math.min(c16506x8e746ffa.f230144f.f230134e, jVar.f479041j));
                jVar.c(0L);
                jVar.b(jVar.f479038g - jVar.f479037f);
                arrayList.add(jVar);
            }
        }
        rm5.v vVar = new rm5.v(arrayList);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = eVar.f426694a;
        vVar.f479116k = new sm5.b(new l55.b(c11120x15dce88d.f152732o, c11120x15dce88d.f152733p));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(((rm5.j) arrayList.get(0)).f479032a, true);
        if (d17 == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(og3.h.f426697d, -1, "remux error", null, 8, null)));
        } else {
            int i18 = d17.f243928n;
            int i19 = (i18 == 0 || i18 == 180) ? d17.f243917c : d17.f243918d;
            int i27 = (i18 == 0 || i18 == 180) ? d17.f243918d : d17.f243917c;
            vVar.l(i19, i27);
            vVar.m(new android.graphics.Rect(0, 0, i19, i27));
            vVar.e(true);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = eVar.f426694a;
            rm5.q qVar = new rm5.q(new android.util.Size(c11120x15dce88d2.f152724d, c11120x15dce88d2.f152725e), c11120x15dce88d2.f152727g, c11120x15dce88d2.f152726f, c11120x15dce88d2.f152730m, c11120x15dce88d2.f152731n, c11120x15dce88d2.f152732o, c11120x15dce88d2.f152733p, true, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mediacodec_level_limit, true), false, false, 0, null, 6144, null);
            java.lang.String src = ((rm5.j) arrayList.get(0)).f479032a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
            rs0.q a17 = rs0.r.f480849a.a(src);
            if (a17 != null) {
                qVar.f479082n = a17.f480845a;
                qVar.f479083o = a17.f480846b;
                qVar.f479084p = a17.f480847c;
            }
            m55.d dVar2 = new m55.d(android.os.SystemClock.elapsedRealtime(), new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), vVar, nVar);
            java.lang.String b17 = eVar.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            vVar.f(b17, qVar, true, dVar2, null);
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar2 = pz5.a.f440719d;
        return a18 == aVar ? aVar : a18;
    }
}
