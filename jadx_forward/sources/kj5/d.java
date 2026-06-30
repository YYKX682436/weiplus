package kj5;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f389991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kj5.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f389991d = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kj5.d(this.f389991d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kj5.d dVar = (kj5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        kj5.f fVar = this.f389991d;
        java.lang.String stringExtra = fVar.m158359x1e885992().getStringExtra("key_create_chatroom_from_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (cj6.D2(stringExtra) > 0 && (O6 = fVar.O6()) != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new kj5.c(fVar, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
