package j23;

/* loaded from: classes12.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        if (gVar == null || gVar.f505302l != 65536 || !gVar.f505305o) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 c6662x813c26a0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0();
        c6662x813c26a0.q(g23.j.f349465c);
        c6662x813c26a0.f140076d = 6L;
        c6662x813c26a0.f140077e = g23.j.f349464b;
        c6662x813c26a0.p(g23.j.f349466d);
        c6662x813c26a0.f140079g = g23.j.f349467e;
        c6662x813c26a0.f140080h = 3L;
        c6662x813c26a0.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + c6662x813c26a0.m());
        return true;
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 12290;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        e23.p0 p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeItem, "nativeItem");
        int i18 = i17 - nativeItem.f496098a;
        if (nativeItem.f496099b) {
            i18--;
        }
        if (i18 >= nativeItem.f496103f.size() || i18 < 0) {
            p0Var = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f496103f.get(i18);
            p0Var = new e23.p0(i17);
            p0Var.f328458q = yVar;
            p0Var.f505297g = -2;
            p0Var.n(yVar.f432717b, yVar.f432718c);
        }
        if (p0Var != null) {
            p0Var.f505300j = i18 + 1;
            p0Var.f505295e = nativeItem.f496104g;
            if (i18 == nativeItem.f496103f.size() - 1) {
                p0Var.f505294d = false;
            }
        }
        return p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler, java.util.HashSet blockSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSet, "blockSet");
        p13.u uVar = new p13.u();
        uVar.f432673b = nd1.w0.f72983x366c91de;
        uVar.f432680i = Integer.MAX_VALUE;
        uVar.f432674c = this.f219540i;
        uVar.f432681j = blockSet;
        uVar.f432683l = r13.b.f450135d;
        uVar.f432684m = this;
        uVar.f432685n = handler;
        p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sj6, "search(...)");
        return sj6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v ftsResult, java.util.HashSet blockSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsResult, "ftsResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSet, "blockSet");
        if (k(ftsResult.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496103f = ftsResult.f432693e;
            iVar.f496102e = -2;
            iVar.f496104g = ftsResult.f432692d;
            this.f219542n.add(iVar);
        }
    }
}
