package df2;

/* loaded from: classes10.dex */
public final class et extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(df2.lt ltVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311615d = ltVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.et(this.f311615d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.et etVar = (df2.et) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        etVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.bm1 bm1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            df2.lt ltVar = this.f311615d;
            synchronized (ltVar.f312246u) {
                try {
                    if (ltVar.f312250y.size() > 0) {
                        int i17 = ltVar.f312245t + 1;
                        ltVar.f312245t = i17;
                        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = ltVar.f312239n;
                        if (c22800xb2c6317b != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(java.lang.Integer.valueOf(i17));
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(c22800xb2c6317b, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$startJob$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                            c22800xb2c6317b.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(c22800xb2c6317b, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$startJob$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                        java.util.ArrayList arrayList2 = ltVar.f312250y;
                        ltVar.f312243r = (in5.c) arrayList2.get(ltVar.f312245t % arrayList2.size());
                        java.lang.String str = df2.lt.W;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loop index ");
                        sb6.append(ltVar.f312245t);
                        sb6.append(", wording: ");
                        in5.c cVar = ltVar.f312243r;
                        java.lang.Integer num = null;
                        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
                        sb6.append((hVar == null || (c19786x6a1e2862 = hVar.f315074d) == null) ? null : c19786x6a1e2862.m76523x98b23862());
                        sb6.append(", time: ");
                        in5.c cVar2 = ltVar.f312243r;
                        dk2.h hVar2 = cVar2 instanceof dk2.h ? (dk2.h) cVar2 : null;
                        if (hVar2 != null && (bm1Var = hVar2.f315078h) != null) {
                            num = new java.lang.Integer(bm1Var.m75939xb282bd08(17));
                        }
                        sb6.append(num);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb6.toString());
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable unused) {
            java.lang.String str2 = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "smoothScroll crash");
        }
        return jz5.f0.f384359a;
    }
}
