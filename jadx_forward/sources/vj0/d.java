package vj0;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w15.a f519175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e f519176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f519177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w15.a aVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519175e = aVar;
        this.f519176f = c6268x26920e3e;
        this.f519177g = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vj0.d(this.f519175e, this.f519176f, this.f519177g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vj0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519174d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.rc5 rc5Var = new r45.rc5();
            w15.a aVar2 = this.f519175e;
            rc5Var.f466263f = aVar2.m173112x7520bed6();
            rc5Var.f466261d = aVar2.j();
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
            if (str == null) {
                str = "";
            }
            rc5Var.f466262e = str;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 268;
            lVar.f152199c = "/cgi-bin/micromsg-bin/privacypolicychoise";
            lVar.f152197a = rc5Var;
            lVar.f152198b = new r45.sc5();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f519174d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonLiteAppGuidanceManager", "closeWindow " + fVar.f152149b + ':' + fVar.f152148a + ':' + fVar.f152150c);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        vj0.c cVar = new vj0.c(this.f519176f, this.f519177g, null);
        this.f519174d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, cVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
