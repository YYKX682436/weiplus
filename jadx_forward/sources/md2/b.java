package md2;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md2.c f407362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407364g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(md2.c cVar, java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f407362e = cVar;
        this.f407363f = str;
        this.f407364g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new md2.b(this.f407362e, this.f407363f, this.f407364g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((md2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f407361d;
        md2.c cVar = this.f407362e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = cVar.f407368f;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sendBlueGift-enter] itemID = ");
            java.lang.String str2 = this.f407363f;
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            r45.do1 do1Var = new r45.do1();
            do1Var.set(1, db2.t4.f309704a.a(23090));
            do1Var.set(3, java.lang.Long.valueOf(((mm2.e1) cVar.f407367e.a(mm2.e1.class)).f410516m));
            gk2.e eVar = cVar.f407367e;
            do1Var.set(4, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v);
            do1Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            do1Var.set(6, java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
            byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f410518o;
            if (bArr != null) {
                do1Var.set(5, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length));
            }
            com.p314xaae8f345.mm.p944x882e457a.i d17 = do1Var.d();
            this.f407361d = 1;
            obj = rm0.h.b(d17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f407368f, "[sendBlueGift] errCode = " + fVar.f152149b + ", errType = " + fVar.f152148a);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f407364g.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(fVar.b()))));
        return jz5.f0.f384359a;
    }
}
