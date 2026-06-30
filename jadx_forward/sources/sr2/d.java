package sr2;

/* loaded from: classes2.dex */
public final class d implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.f f493067d;

    public d(sr2.f fVar) {
        this.f493067d = fVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        j92.a aVar;
        java.util.HashSet<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> mo80395x5316d740;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        j92.a aVar2 = (j92.a) holder.f374658i;
        if (aVar2.f379886e) {
            return;
        }
        sr2.f fVar = this.f493067d;
        java.util.ArrayList arrayList = fVar.f493090n;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            aVar = null;
            while (it.hasNext()) {
                j92.a aVar3 = (j92.a) it.next();
                if (aVar3.f379886e) {
                    aVar = aVar3;
                }
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f379886e = false;
        }
        aVar2.f379886e = true;
        adapter.m8146xced61ae5();
        l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = fVar.m158354x19263085();
        m92.b bVar = aVar2.f379885d;
        java.lang.String field_username = bVar.f68723xdec927b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
        ((k40.f) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        g92.b.f351302e.z0(context, field_username);
        java.lang.String e17 = xy2.c.e(fVar.m158354x19263085());
        fVar.f493083d = e17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            fVar.f493084e = ya2.h.f542017a.b(fVar.f493083d);
        }
        fVar.P6();
        fVar.m158354x19263085().getIntent().putExtra("KEY_FINDER_USERNAME_SELF", fVar.f493083d);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = fVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
        if (abstractActivityC15087xee12defa != null && (mo80395x5316d740 = abstractActivityC15087xee12defa.mo80395x5316d740()) != null) {
            for (pf5.g gVar : mo80395x5316d740) {
                if (gVar instanceof ya2.r1) {
                    ((ya2.r1) gVar).w4(bVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = fVar.f493089m;
        if (c13638xb683e9ec != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.o(c13638xb683e9ec, false, 1, null);
        }
    }
}
