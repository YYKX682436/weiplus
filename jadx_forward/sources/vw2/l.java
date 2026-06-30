package vw2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw2.f f522393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw2.n f522394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vw2.f fVar, vw2.n nVar) {
        super(0);
        this.f522393d = fVar;
        this.f522394e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vw2.f fVar = this.f522393d;
        in5.s0 s0Var = fVar.f522372a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        int hashCode = s0Var.hashCode();
        vw2.n nVar = this.f522394e;
        boolean z17 = nVar.f522404c;
        vw2.d dVar = nVar.f522403b;
        if (z17 && abstractC14490x69736cb5 != null) {
            if (((java.util.LinkedHashMap) vw2.n.f522401g).get(java.lang.Integer.valueOf(hashCode)) == null || dVar != vw2.d.f522368d) {
                long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) vw2.n.f522400f;
                java.lang.Object obj = linkedHashMap.get(java.lang.Long.valueOf(mo2128x1ed62e84));
                in5.s0 s0Var2 = fVar.f522372a;
                vw2.g gVar = nVar.f522402a;
                if (obj == null || gVar == vw2.g.f522375f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "onIntercept: lastInterceptor[feedId]=" + linkedHashMap.get(java.lang.Long.valueOf(mo2128x1ed62e84)) + ", playStrategy=" + gVar);
                    java.util.Iterator it = ((java.util.ArrayList) nVar.f522405d).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ww2.b bVar = (ww2.b) it.next();
                        java.util.List a17 = bVar.a(fVar, abstractC14490x69736cb5);
                        if (!(a17 == null || a17.isEmpty())) {
                            vw2.n.f522400f.put(java.lang.Long.valueOf(mo2128x1ed62e84), bVar);
                            vw2.n.a(nVar, bVar, a17, s0Var2);
                            break;
                        }
                    }
                } else if (gVar == vw2.g.f522373d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "onIntercept: playStrategy=OneInterceptorPerVideo. interceptor=" + linkedHashMap.get(java.lang.Long.valueOf(mo2128x1ed62e84)));
                    ww2.b bVar2 = (ww2.b) linkedHashMap.get(java.lang.Long.valueOf(mo2128x1ed62e84));
                    if (bVar2 != null) {
                        java.util.List a18 = bVar2.a(fVar, abstractC14490x69736cb5);
                        if (!(a18 == null || a18.isEmpty())) {
                            vw2.n.a(nVar, bVar2, a18, s0Var2);
                        }
                    }
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "onIntercept: early return. enabled=" + nVar.f522404c + ", baseFinderFeed=" + abstractC14490x69736cb5 + ", lastAnimator[event.holder]=" + ((java.util.LinkedHashMap) vw2.n.f522401g).get(java.lang.Integer.valueOf(hashCode)) + ", conflictStrategy=" + dVar);
        return jz5.f0.f384359a;
    }
}
