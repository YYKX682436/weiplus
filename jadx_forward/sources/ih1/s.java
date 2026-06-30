package ih1;

/* loaded from: classes7.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373057d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ih1.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373059f = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ih1.s sVar = new ih1.s(this.f373059f, interfaceC29045xdcb5ca57);
        sVar.f373058e = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ih1.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373057d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f373058e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f373058e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        do {
            boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h(y0Var);
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (!h17) {
                return f0Var;
            }
            ih1.u uVar = this.f373059f;
            iq0.c cVar = uVar.f373065c;
            if (cVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], send heart beat");
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d("heartBeat", ""));
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], failed to notify heart beat", m143898xd4a2fc34);
                }
                p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
            }
            this.f373058e = y0Var;
            this.f373057d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(3000L, this) != aVar);
        return aVar;
    }
}
