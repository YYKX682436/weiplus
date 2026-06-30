package zu0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f557204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa f557205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f557205e = c10858x5d0663fa;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zu0.f fVar = new zu0.f(this.f557205e, interfaceC29045xdcb5ca57);
        fVar.f557204d = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zu0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa = this.f557205e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            boolean z17 = true;
            if (c10858x5d0663fa.f150174g <= 0 || c10858x5d0663fa.f150175h <= 0) {
                if (zu0.g.a(c10858x5d0663fa)) {
                    zu0.g.d(c10858x5d0663fa);
                } else {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_album_get_video_info, 0) == 1) {
                        zu0.g.d(c10858x5d0663fa);
                    } else {
                        zu0.g.c(c10858x5d0663fa);
                    }
                }
            }
            int i17 = c10858x5d0663fa.f150174g;
            int i18 = c10858x5d0663fa.f150175h;
            int i19 = c10858x5d0663fa.f150176i;
            qg.c cVar = qg.c.Video;
            if (i19 != 90 && i19 != 270) {
                z17 = false;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(zu0.g.b(c10858x5d0663fa, i17, i18, cVar, z17));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.MCMediaFile", "toMCMediaFile: video " + m143898xd4a2fc34, m143898xd4a2fc34);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            return null;
        }
        return m143895xf1229813;
    }
}
