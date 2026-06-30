package ap1;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f f94241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f94242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar, ap1.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94241d = fVar;
        this.f94242e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ap1.o(this.f94241d, this.f94242e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ap1.o oVar = (ap1.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar = this.f94241d;
        java.util.ArrayList arrayList = new java.util.ArrayList(fVar.f297357d.size());
        java.util.LinkedList linkedList = fVar.f297357d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getConversationId(...)");
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.Object obj3 = fVar.f297358e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            arrayList.add(new ap1.a0(str, 0L, ((java.lang.Number) obj3).longValue()));
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "loadDataImpl done, size=" + arrayList.size());
        j75.f U6 = this.f94242e.U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
        U6.B3(new ap1.b(null, 1, null));
        U6.B3(new ap1.a(arrayList, null, 2, null));
        return jz5.f0.f384359a;
    }
}
