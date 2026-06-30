package b12;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b12.j f98587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b12.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98587e = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b12.i(this.f98587e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b12.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        yz5.p pVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98586d;
        b12.j jVar = this.f98587e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b12.h hVar = new b12.h(null);
                this.f98586d = 1;
                obj = p3325xe03a0797.p3326xc267989b.a4.b(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, hVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            uq.j jVar2 = (uq.j) obj;
            jVar.f98591d = jVar2.f511683f * 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: " + jVar2.f511681d + ", " + jVar2.f511682e + ", " + jVar2.f511683f);
            if (jVar2.f511681d && (str = jVar2.f511682e) != null && (pVar = jVar.f98592e) != null) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, str);
            }
        } catch (b12.a e17) {
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggRedEnvelopeHelper", "Cgi error: " + e17.getMessage());
        } catch (p3325xe03a0797.p3326xc267989b.x3 unused) {
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggRedEnvelopeHelper", "Cgi Timeout: ");
        }
        return jz5.f0.f384359a;
    }
}
