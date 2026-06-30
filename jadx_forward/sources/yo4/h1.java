package yo4;

/* loaded from: classes10.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545765d = c18795x62fd7c3f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yo4.h1(this.f545765d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yo4.h1 h1Var = (yo4.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545765d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe c18830xa8309efe = c18795x62fd7c3f.m72543x67c60a58().f104744g;
        ru3.o oVar = ru3.o.f481297e;
        c18830xa8309efe.m68099x53b6de6f(oVar);
        c18795x62fd7c3f.m72544xee20813a(oVar);
        bp4.k0 m72543x67c60a58 = c18795x62fd7c3f.m72543x67c60a58();
        yo4.p pVar = c18795x62fd7c3f.f257412v;
        m72543x67c60a58.I(pVar.B());
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = c18795x62fd7c3f.G;
        int size = ((java.util.ArrayList) u0Var.f257276t.m()).size() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(java.lang.Boolean.FALSE);
        }
        bp4.e4 e4Var = c18795x62fd7c3f.M;
        e4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = e4Var.f104693h;
        c18833x82cf22d.getClass();
        c18833x82cf22d.recyclerView.D0();
        c18795x62fd7c3f.setBackgroundColor(c18795x62fd7c3f.J1);
        yo4.p pVar2 = c18795x62fd7c3f.f257412v;
        ct0.b bVar = c18795x62fd7c3f.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        yo4.p.K(pVar2, bVar, c18795x62fd7c3f.E, false, c18795x62fd7c3f.H, u0Var.f257267h, 4, null);
        int size2 = u0Var.f257276t.f257130c.size();
        bp4.p4 p4Var = c18795x62fd7c3f.f257406p1;
        if (size2 == 1 && ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) u0Var.f257276t.f257130c.get(0)).f257160l.f479041j > c18795x62fd7c3f.f257401m) {
            c18795x62fd7c3f.A();
            p4Var.getClass();
            u0Var.j(0);
            c18795x62fd7c3f.N.z().m72660x83047075(!u0Var.s());
            bp4.o4 o4Var = c18795x62fd7c3f.N;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = u0Var.f257280x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
            bp4.o4.A(o4Var, i1Var, true, 0L, 4, null);
            c18795x62fd7c3f.m72543x67c60a58().I(pVar.B());
        } else if (u0Var.f257276t.k() > c18795x62fd7c3f.f257401m) {
            c18795x62fd7c3f.A();
            p4Var.getClass();
            u0Var.j(-1);
            e4Var.mo9067x901b6914(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = u0Var.f257276t;
            bp4.n nVar = c18795x62fd7c3f.P;
            nVar.A(h1Var);
            u0Var.a(h1Var, false);
            nVar.D(u0Var.f257276t, c18795x62fd7c3f.f257401m);
            c18795x62fd7c3f.m72543x67c60a58().I(pVar.B());
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markShowCrop60s");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257086g <= 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257086g = android.os.SystemClock.elapsedRealtime();
            }
        }
        return jz5.f0.f384359a;
    }
}
