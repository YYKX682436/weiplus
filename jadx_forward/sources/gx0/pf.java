package gx0;

/* loaded from: classes5.dex */
public final class pf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358381d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358382e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f358383f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f358384g;

    /* renamed from: h, reason: collision with root package name */
    public int f358385h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f358386i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f358387m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358388n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pu0.b f358389o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, gx0.gg ggVar, java.lang.String str, pu0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358386i = c4181x2248e1a3;
        this.f358387m = ggVar;
        this.f358388n = str;
        this.f358389o = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.pf(this.f358386i, this.f358387m, this.f358388n, this.f358389o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358385h;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f358386i;
            this.f358381d = c4181x2248e1a3;
            gx0.gg ggVar = this.f358387m;
            this.f358382e = ggVar;
            java.lang.String str = this.f358388n;
            this.f358383f = str;
            pu0.b bVar = this.f358389o;
            this.f358384g = bVar;
            this.f358385h = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new gx0.of(ggVar));
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 x17 = c4181x2248e1a3.x1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x17, "getTimeRangeInMedia(...)");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.nio.ByteBuffer a17 = com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.a(new java.io.File(str), 2, 1, 16000, x17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                boolean booleanValue = bVar.d(a17).booleanValue();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("asrAudioLocalCheck: localResult ");
                sb6.append(booleanValue);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleRecommendedUseUIC", sb6.toString());
                if (!booleanValue) {
                    z17 = false;
                }
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleRecommendedUseUIC", "asrAudioLocalCheck: extractAudioPCM failed, error message = " + m143898xd4a2fc34.getMessage());
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            }
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
