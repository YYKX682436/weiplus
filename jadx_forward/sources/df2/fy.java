package df2;

/* loaded from: classes10.dex */
public final class fy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ja0 f311707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.wy f311708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(r45.ja0 ja0Var, df2.wy wyVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311707e = ja0Var;
        this.f311708f = wyVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.fy(this.f311707e, this.f311708f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.fy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311706d;
        r45.ja0 ja0Var = this.f311707e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long m75939xb282bd08 = ja0Var.m75939xb282bd08(9) * 1000;
            this.f311706d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m75939xb282bd08, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ja0Var.set(9, 0);
        df2.wy wyVar = this.f311708f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wyVar.f313269m, "onCritQuestInfoChanged STAGE_QUEST_ANNOUNCING stage_time_left countDown, emit");
        wyVar.b7(wyVar.f313274r);
        return jz5.f0.f384359a;
    }
}
