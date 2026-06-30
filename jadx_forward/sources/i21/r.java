package i21;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f369449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i21.s f369450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i21.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f369450e = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i21.r(this.f369450e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i21.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f369449d;
        i21.s sVar = this.f369450e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sVar.getClass();
            r45.rt6 rt6Var = new r45.rt6();
            rt6Var.set(6, sVar.f369451a);
            rt6Var.set(2, 0);
            rt6Var.set(3, 0);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            rt6Var.set(5, cu5Var);
            rt6Var.set(4, 0);
            rt6Var.set(1, sVar.f369454d);
            rt6Var.set(7, java.lang.Integer.valueOf(sVar.f369453c));
            rt6Var.set(8, sVar.f369452b);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 575;
            lVar.f152199c = "/cgi-bin/micromsg-bin/uploadcardimg";
            lVar.f152197a = rt6Var;
            lVar.f152198b = new r45.st6();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f369449d = 1;
            obj = rm0.h.b(iVar, this);
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
        int i18 = fVar.f152148a;
        int i19 = fVar.f152149b;
        sVar.getClass();
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sVar.f369451a, true);
            if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                r45.o80 o80Var = new r45.o80();
                java.util.LinkedList linkedList = sVar.f369452b;
                if (!linkedList.isEmpty()) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.fu fuVar = (r45.fu) it.next();
                        r45.c5 c5Var = new r45.c5();
                        c5Var.f452825d = fuVar.m75945x2fec8307(0);
                        c5Var.f452826e = fuVar.m75945x2fec8307(1);
                        linkedList2.add(c5Var);
                    }
                    if (o80Var.f463551d == null) {
                        o80Var.f463551d = new java.util.LinkedList();
                    }
                    o80Var.f463551d.addAll(linkedList2);
                    n17.O2(o80Var);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
                } else if (sVar.f369453c == 0) {
                    n17.O2(null);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadCardImgCgi", "upload card img error");
        }
        return fVar;
    }
}
