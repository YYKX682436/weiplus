package ud2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f508187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f508188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f508189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, ud2.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508187d = hVar;
        this.f508188e = c0Var;
        this.f508189f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ud2.v(this.f508187d, interfaceC29045xdcb5ca57, this.f508188e, this.f508189f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ud2.v vVar = (ud2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.z61) ((xg2.i) this.f508187d).f535926b).m75936x14adae67(1);
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f508188e.f508128f, "got finderObject " + c19792x256d2725.m76784x5db1b11());
            this.f508189f.f391656d = c19792x256d2725;
        }
        return jz5.f0.f384359a;
    }
}
