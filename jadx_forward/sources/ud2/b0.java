package ud2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f508119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f508120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ud2.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508120e = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ud2.b0(this.f508120e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ud2.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.nw1 m59258xd0557130;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f508119d;
        ud2.c0 c0Var = this.f508120e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f508119d = 1;
            obj = ud2.c0.b(c0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        if (c19792x256d2725 != null) {
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            java.lang.Long l17 = null;
            java.lang.Long l18 = m76794xd0557130 != null ? new java.lang.Long(m76794xd0557130.m75942xfb822ef2(0)) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = c0Var.f508129g;
            if (c14994x9b99c079 != null && (m59258xd0557130 = c14994x9b99c079.m59258xd0557130()) != null) {
                l17 = new java.lang.Long(m59258xd0557130.m75942xfb822ef2(0));
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l18, l17)) {
                c0Var.f508129g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
            }
        }
        c0Var.d();
        return jz5.f0.f384359a;
    }
}
