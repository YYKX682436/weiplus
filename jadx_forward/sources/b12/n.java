package b12;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b12.o f98610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b12.o oVar, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98610e = oVar;
        this.f98611f = str;
        this.f98612g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b12.n(this.f98610e, this.f98611f, this.f98612g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b12.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98609d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        b12.o oVar = this.f98610e;
        try {
            try {
                if (i17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    b12.m mVar = new b12.m(this.f98611f, null);
                    this.f98609d = 1;
                    b17 = p3325xe03a0797.p3326xc267989b.a4.b(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, mVar, this);
                    if (b17 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    b17 = obj;
                }
                uq.f fVar = (uq.f) b17;
                oVar.f98616d = fVar.f511673f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggHelper", "should play lucky egg:" + fVar.f511672e + " interval=" + oVar.f98616d + ", traceId=" + fVar.f511671d);
                int i18 = fVar.f511672e;
                if (i18 == 1) {
                    yz5.l lVar = oVar.f98617e;
                    if (lVar != null) {
                        lVar.mo146xb9724478(new d12.b(this.f98611f, fVar.f511671d, this.f98612g, true, fVar.f511673f, null, 32, null));
                    }
                } else if (i18 == 0) {
                    yz5.l lVar2 = oVar.f98618f;
                    if (lVar2 != null) {
                        lVar2.mo146xb9724478(b12.l.f98603f);
                    }
                } else {
                    yz5.l lVar3 = oVar.f98618f;
                    if (lVar3 != null) {
                        lVar3.mo146xb9724478(b12.l.f98604g);
                    }
                }
                oVar.f98617e = null;
                oVar.f98618f = null;
                return f0Var;
            } catch (b12.a e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggHelper", "Unable to check if we can show lucky egg: " + e17.getMessage());
                yz5.l lVar4 = oVar.f98618f;
                if (lVar4 != null) {
                    lVar4.mo146xb9724478(b12.l.f98604g);
                }
                oVar.f98617e = null;
                oVar.f98618f = null;
                return f0Var;
            } catch (p3325xe03a0797.p3326xc267989b.x3 unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggHelper", "Timeout to check can show luck egg");
                yz5.l lVar5 = oVar.f98618f;
                if (lVar5 != null) {
                    lVar5.mo146xb9724478(b12.l.f98604g);
                }
                oVar.f98617e = null;
                oVar.f98618f = null;
                return f0Var;
            }
        } catch (java.lang.Throwable th6) {
            oVar.f98617e = null;
            oVar.f98618f = null;
            throw th6;
        }
    }
}
