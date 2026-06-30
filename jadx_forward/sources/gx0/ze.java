package gx0;

/* loaded from: classes5.dex */
public final class ze extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358819d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358821f = bfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gx0.ze zeVar = new gx0.ze(this.f358821f, interfaceC29045xdcb5ca57);
        zeVar.f358820e = obj;
        return zeVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ze) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358819d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358821f.B;
                if (c4152x8b3cf7db == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.PlaybackControlUIC", "stopPlaying - playbackSession is null");
                    return java.lang.Boolean.FALSE;
                }
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f358819d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                c4152x8b3cf7db.m34180x9600b9cc(new ou0.u(nVar));
                java.lang.Object a17 = nVar.a();
                if (a17 != aVar) {
                    a17 = jz5.f0.f384359a;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? java.lang.Boolean.FALSE : m143895xf1229813;
    }
}
