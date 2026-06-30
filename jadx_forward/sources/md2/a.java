package md2;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md2.c f407358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(md2.c cVar, java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f407358e = cVar;
        this.f407359f = str;
        this.f407360g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new md2.a(this.f407358e, this.f407359f, this.f407360g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((md2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.uv1 uv1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f407357d;
        java.lang.String str = this.f407359f;
        md2.c cVar = this.f407358e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f407368f, "[fetchBlueGiftCreate-enter] orderID = " + str);
            r45.eu1 eu1Var = new r45.eu1();
            eu1Var.set(1, db2.t4.f309704a.a(18583));
            eu1Var.set(2, java.lang.Long.valueOf(((mm2.e1) cVar.f407367e.a(mm2.e1.class)).f410516m));
            gk2.e eVar = cVar.f407367e;
            eu1Var.set(4, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v);
            eu1Var.set(5, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f410518o;
            if (bArr != null) {
                eu1Var.set(3, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length));
            }
            com.p314xaae8f345.mm.p944x882e457a.i d17 = eu1Var.d();
            this.f407357d = 1;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f407368f, "[fetchBlueGiftCreate] errCode = " + fVar.f152149b + ", errType = " + fVar.f152148a);
        java.util.LinkedList m75941xfb821914 = ((r45.fu1) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItem_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            r45.vv1 vv1Var = (r45.vv1) ((r45.uc5) obj2).m75936x14adae67(3);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((vv1Var == null || (uv1Var = (r45.uv1) vv1Var.m75936x14adae67(1)) == null) ? null : uv1Var.m75945x2fec8307(11), str)) {
                break;
            }
        }
        r45.uc5 uc5Var = (r45.uc5) obj2;
        boolean b17 = fVar.b();
        yz5.l lVar = this.f407360g;
        if (b17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(uc5Var != null ? uc5Var.mo14344x5f01b1f6() : null)));
        } else {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        }
        return jz5.f0.f384359a;
    }
}
