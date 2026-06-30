package lj2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f400348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.b f400349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, lj2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f400348e = str;
        this.f400349f = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lj2.a(this.f400348e, this.f400349f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lj2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f400347d;
        boolean z17 = true;
        lj2.b bVar = this.f400349f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f400348e;
            vl2.h hVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finder_live_pk_result_draw.pag") ? vl2.h.R : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finder_live_pk_result_draw_en.pag") ? vl2.h.S : null;
            if (hVar != null) {
                vl2.s sVar = vl2.s.f519401a;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = bVar.f400355e;
                this.f400347d = 1;
                if (sVar.d(hVar, c22789xd23e9a9b, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (bVar.f400355e.getVisibility() == 0) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = bVar.f400355e;
            if (!c22789xd23e9a9b2.useRfx ? c22789xd23e9a9b2.m82574xa7d55074() == null : c22789xd23e9a9b2.m82578x583e633c() == null) {
                z17 = false;
            }
            if (z17) {
                bVar.f400355e.g();
                bVar.f400355e.d();
            }
        }
        return jz5.f0.f384359a;
    }
}
