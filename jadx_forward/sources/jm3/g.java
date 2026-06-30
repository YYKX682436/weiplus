package jm3;

/* loaded from: classes10.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f381851d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var) {
        this.f381851d = h6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8
    /* renamed from: select */
    public void mo67284xc9ff34fc(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        pk4.c cVar = this.f381851d.f232719n;
        if (cVar != null) {
            gk4.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).f256099f;
            java.lang.String str = rVar.f354135g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekToIndex:");
            sb6.append(i17);
            sb6.append(", renderPts:");
            sb6.append(rVar.f354145q);
            sb6.append(", playingPlayers.size:");
            sb6.append(rVar.f354139k.size());
            sb6.append(", status:");
            sb6.append(rVar.f354144p);
            sb6.append(", trackList.size:");
            gk4.t tVar = rVar.f354142n;
            sb6.append((tVar == null || (arrayList2 = tVar.f354163a) == null) ? null : java.lang.Integer.valueOf(arrayList2.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            gk4.t tVar2 = rVar.f354142n;
            if (tVar2 == null || (arrayList = tVar2.f354163a) == null || i17 > arrayList.size()) {
                return;
            }
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            gk4.s sVar = (gk4.s) obj;
            long j17 = sVar.f354158d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "found seek target track:" + sVar + ", trackSeekTime:" + j17 + ", trackStartTimeMs:" + sVar.f354158d);
            rVar.f354152x = sVar.f354156b;
            rVar.g(sVar, j17);
        }
    }
}
