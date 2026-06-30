package cs0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f303573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 f303574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f303575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f303576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jz5.l lVar, com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303573d = lVar;
        this.f303574e = c10899x89fee862;
        this.f303575f = f17;
        this.f303576g = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cs0.e(this.f303573d, this.f303574e, this.f303575f, this.f303576g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cs0.e eVar = (cs0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.l lVar = this.f303573d;
        if (lVar != null) {
            android.util.Range range = (android.util.Range) lVar.f384366d;
            com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f303574e;
            c10899x89fee862.f150423p = range;
            int intValue = ((java.lang.Number) lVar.f384367e).intValue();
            c10899x89fee862.f150424q = intValue;
            c10899x89fee862.f150425r = intValue;
            android.util.Range range2 = c10899x89fee862.f150423p;
            if (range2 != null) {
                float f17 = c10899x89fee862.f150419i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(range2);
                int intValue2 = ((java.lang.Number) range2.getUpper()).intValue();
                android.util.Range range3 = c10899x89fee862.f150423p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(range3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(range3.getLower(), "getLower(...)");
                c10899x89fee862.f150420m = f17 / ((intValue2 - ((java.lang.Number) r2).intValue()) / 2.0f);
                cs0.i iVar = c10899x89fee862.f150418h;
                float f18 = this.f303575f;
                float f19 = this.f303576g;
                if (iVar != null) {
                    iVar.a(f18, f19, c10899x89fee862.a());
                }
                cs0.b bVar = c10899x89fee862.f150414d;
                if (bVar != null) {
                    ((com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) bVar).m(f18, f19);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
