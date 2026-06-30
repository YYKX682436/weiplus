package mm3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f411164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm3.h f411165f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var, mm3.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f411164e = h6Var;
        this.f411165f = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm3.g(this.f411164e, this.f411165f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm3.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f411163d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f411163d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pk4.c cVar = this.f411164e.f232719n;
        if (cVar != null) {
            mm3.h hVar = this.f411165f;
            int i18 = hVar.f411169d;
            long j17 = hVar.f411170e;
            gk4.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).f256099f;
            java.lang.String str = rVar.f354135g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekToIndexTime, index:");
            sb6.append(i18);
            sb6.append(", seekTo:");
            sb6.append(j17);
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
            if (tVar2 != null && (arrayList = tVar2.f354163a) != null && i18 <= arrayList.size()) {
                java.lang.Object obj2 = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                gk4.s sVar = (gk4.s) obj2;
                rVar.f354152x = sVar.f354156b + j17;
                rVar.g(sVar, j17);
            }
        }
        this.f411165f.f411171f = null;
        return jz5.f0.f384359a;
    }
}
