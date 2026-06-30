package ee5;

/* loaded from: classes9.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333526d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ee5.q0 f333529g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.util.ArrayList arrayList, ee5.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333528f = arrayList;
        this.f333529g = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.p0 p0Var = new ee5.p0(this.f333528f, this.f333529g, interfaceC29045xdcb5ca57);
        p0Var.f333527e = obj;
        return p0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333526d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333527e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f333528f.iterator();
            java.lang.String str = "";
            while (true) {
                boolean hasNext = it.hasNext();
                ee5.q0 q0Var = this.f333529g;
                if (hasNext) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                    if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemEmojiUIC", "is no active");
                        return f0Var;
                    }
                    java.lang.String j17 = f9Var.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
                    java.util.List f07 = r26.n0.f0(j17, new java.lang.String[]{":"}, false, 0, 6, null);
                    if (f07.size() > 3) {
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Di((java.lang.String) f07.get(3));
                        if (Di != null) {
                            zb5.c cVar = new zb5.c();
                            cVar.f552841a = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Di;
                            cVar.f552842b = f9Var;
                            cVar.f552843c = 0;
                            java.lang.String c17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().c(new java.util.Date(f9Var.mo78012x3fdd41df()), q0Var.m80379x76847179());
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, str)) {
                                zb5.c cVar2 = new zb5.c();
                                cVar2.f552843c = 1;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                                cVar2.f552844d = c17;
                                arrayList.add(cVar2);
                                str = c17;
                            }
                            arrayList.add(cVar);
                        }
                    }
                } else {
                    if (!arrayList.isEmpty()) {
                        zb5.c cVar3 = new zb5.c();
                        cVar3.f552843c = 2;
                        arrayList.add(cVar3);
                    }
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                    ee5.o0 o0Var = new ee5.o0(q0Var, arrayList, null);
                    this.f333526d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, o0Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
