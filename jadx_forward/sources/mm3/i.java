package mm3;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.n f411176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mm3.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f411176d = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm3.i(this.f411176d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm3.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        kp4.a Ai;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        mm3.n nVar = this.f411176d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = nVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.LinkedList P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6.class)).P6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : P6) {
            if (!((jk4.f) obj2).f316009m) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jk4.f fVar = (jk4.f) it.next();
            if (fVar.f316001e || fVar.a()) {
                bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                java.lang.String path = fVar.f316016t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 Di = ((b92.u2) vVar).Di(path, fVar.a());
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) Di;
                i1Var.d(fVar.f316012p);
                i1Var.c(fVar.f316012p + fVar.f316011o);
                i1Var.e(fVar.f316010n);
                i1Var.a(fVar.f316010n + fVar.f316011o);
                if (fVar.a()) {
                    ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                    Ai = new kp4.w((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) Di);
                } else {
                    Ai = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ai(Di);
                }
            } else {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                Ai = new rw2.k(fVar);
            }
            long j17 = fVar.f316012p;
            Ai.f392607d = j17;
            Ai.f392608e = j17 + fVar.f316011o;
            Ai.f392604a = nVar.m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            Ai.f392605b = nVar.m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            arrayList2.add(Ai);
        }
        return arrayList2;
    }
}
