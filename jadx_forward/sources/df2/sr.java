package df2;

/* loaded from: classes10.dex */
public final class sr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f312900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(df2.lt ltVar, dk2.h hVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312899d = ltVar;
        this.f312900e = hVar;
        this.f312901f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.sr(this.f312899d, this.f312900e, this.f312901f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.sr srVar = (df2.sr) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        srVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = df2.lt.W;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove, currentTitle: ");
        in5.c cVar = this.f312899d.f312243r;
        java.lang.String str2 = null;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (c19786x6a1e2862 = hVar.f315074d) != null) {
            str2 = c19786x6a1e2862.m76523x98b23862();
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb6.toString());
        df2.lt ltVar = this.f312899d;
        dk2.h hVar2 = this.f312900e;
        java.lang.String dislikeBannerId = this.f312901f;
        synchronized (ltVar.f312246u) {
            if (ltVar.f312250y.size() > 0) {
                java.util.ArrayList arrayList = ltVar.f312250y;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar2, arrayList.get(ltVar.f312245t % arrayList.size()))) {
                    java.util.ArrayList arrayList2 = ltVar.f312250y;
                    arrayList2.remove(ltVar.f312245t % arrayList2.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "after remove dataList size: " + ltVar.f312250y.size());
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = ltVar.f312240o;
                    if (c22848x6ddd90cf != null) {
                        c22848x6ddd90cf.m8155x27702c4(ltVar.f312245t);
                    }
                }
            }
        }
        rl2.f fVar = (rl2.f) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148534y).mo141623x754a37bb();
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dislikeBannerId, "dislikeBannerId");
        if (!android.text.TextUtils.isEmpty(dislikeBannerId)) {
            synchronized (fVar) {
                ce2.f fVar2 = new ce2.f();
                fVar2.f67661xb1c9dc67 = dislikeBannerId;
                fVar2.f67662x9de75411 = java.lang.System.currentTimeMillis();
                boolean mo11260x413cb2b4 = fVar.mo11260x413cb2b4(fVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDislikeBannerStorage", "recordDislikeBanner dislikeBannerId:%s ret:%b", dislikeBannerId, java.lang.Boolean.valueOf(mo11260x413cb2b4));
                if (mo11260x413cb2b4 && !fVar.f478728f.contains(dislikeBannerId)) {
                    fVar.f478728f.add(dislikeBannerId);
                }
            }
        }
        if (this.f312899d.f312250y.size() <= 0) {
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = this.f312899d.f312239n;
            if (c22800xb2c6317b != null) {
                c22800xb2c6317b.setVisibility(8);
            }
            df2.lt ltVar2 = this.f312899d;
            ltVar2.f312242q = true;
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b2 = ltVar2.f312239n;
            if (c22800xb2c6317b2 != null) {
                c22800xb2c6317b2.m82658x69a99e53(false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "only one banner gone banner plugin");
        } else {
            this.f312899d.x7();
        }
        return jz5.f0.f384359a;
    }
}
