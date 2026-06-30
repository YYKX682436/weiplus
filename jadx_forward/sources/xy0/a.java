package xy0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f539653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f539654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f539655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f539656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f539657h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f539658i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list, long j17, long j18, long j19, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539654e = list;
        this.f539655f = j17;
        this.f539656g = j18;
        this.f539657h = j19;
        this.f539658i = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xy0.a(this.f539654e, this.f539655f, this.f539656g, this.f539657h, this.f539658i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xy0.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539653d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.util.List list = this.f539654e;
                long j17 = this.f539655f;
                long j18 = this.f539656g;
                long j19 = this.f539657h;
                int i18 = this.f539658i;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                r45.ih4 ih4Var = new r45.ih4();
                ih4Var.f458579e = 0.0f;
                ih4Var.f458580f = 0.0f;
                ih4Var.f458581g = xy0.d.a(xy0.d.f539668a, list);
                ih4Var.f458584m = j17;
                ih4Var.f458583i = j18;
                ih4Var.f458582h = j19;
                ih4Var.f458578d = i18;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152200d = 341;
                lVar.f152199c = "/cgi-bin/micromsg-bin/getrecommendedmusiclist";
                lVar.f152197a = ih4Var;
                lVar.f152198b = new r45.jh4();
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                iVar.p(a17);
                this.f539653d = 1;
                obj = rm0.h.a(iVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((r45.jh4) obj);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CgiHelper", m143898xd4a2fc34, "recommendMusic cgi error", new java.lang.Object[0]);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            return null;
        }
        return m143895xf1229813;
    }
}
