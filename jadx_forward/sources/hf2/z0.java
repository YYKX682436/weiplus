package hf2;

/* loaded from: classes.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f362748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.lang.String str, hf2.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362747e = str;
        this.f362748f = e1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.z0(this.f362747e, this.f362748f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f362746d;
        hf2.e1 e1Var = this.f362748f;
        java.lang.String str = this.f362747e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!(str.length() > 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e1Var.f362585b, "delete stickerId:" + str + '!');
                return jz5.f0.f384359a;
            }
            r45.so1 so1Var = new r45.so1();
            so1Var.set(4, java.lang.Long.valueOf(((mm2.e1) e1Var.f362584a.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            hf2.x xVar = e1Var.f362584a;
            so1Var.set(3, java.lang.Long.valueOf(((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410516m));
            so1Var.set(2, ((mm2.c1) xVar.m56788xbba4bfc0(mm2.c1.class)).f410385o);
            so1Var.set(5, str);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 9852;
            lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivedeletesticker";
            lVar.f152197a = so1Var;
            lVar.f152198b = new r45.to1();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
            wi6.p(a17);
            this.f362746d = 1;
            obj = xg2.g.d(wi6, null, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e1Var.f362585b, "deleteSticker " + str + " result is suc:" + (obj instanceof xg2.i));
        return jz5.f0.f384359a;
    }
}
