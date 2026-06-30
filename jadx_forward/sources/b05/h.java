package b05;

/* loaded from: classes12.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public long f98519p;

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 4368;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a, t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f219542n;
        if (!list.isEmpty() && this.f98519p > 0) {
            java.lang.Object element = list.get(0);
            t13.i iVar = (t13.i) element;
            int size = iVar.f496103f.size();
            for (int i17 = 0; i17 < size; i17++) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                t13.i iVar2 = (t13.i) element;
                p13.e l17 = l(i17, j17, iVar2);
                if (l17 != null) {
                    l17.f432611f = this.f98519p - j17;
                    l17.f432607b = iVar2.f496099b ? iVar2.f496098a + i17 + 1 : iVar2.f496098a + i17;
                    l17.f432609d = 1;
                    l17.f432606a = i17;
                    l17.f432617l = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.b(((p13.y) iVar2.f496103f.get(i17)).f432717b, ((p13.y) iVar2.f496103f.get(i17)).f432718c, ((p13.y) iVar2.f496103f.get(i17)).f432734s);
                    arrayList.add(l17);
                }
            }
            if (iVar.f496101d) {
                p13.e eVar = new p13.e();
                eVar.f432612g = java.lang.String.valueOf(iVar.hashCode());
                eVar.f432609d = 2;
                eVar.f432606a = size;
                eVar.f432608c = 36;
                eVar.f432611f = this.f98519p - j17;
                eVar.f432607b = iVar.f496100c;
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i nativeItem) {
        c30.t tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeItem, "nativeItem");
        java.lang.String str = null;
        if (i17 >= nativeItem.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) nativeItem.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 36;
        c00.g4 g4Var = (c00.g4) i95.n0.c(c00.g4.class);
        long j18 = yVar.f432719d;
        c30.f0 f0Var = (c30.f0) g4Var;
        f0Var.m134976x2690a4ac();
        c30.e eVar2 = f0Var.f119646d;
        if (eVar2 != null && (tVar = eVar2.f119642c) != null) {
            try {
                com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107277x754a37bb = tVar.f119695a.m107277x754a37bb(tq.b.f502718e, tq.b.f502716c.eq(j18));
                if (m107277x754a37bb != null) {
                    str = m107277x754a37bb.m106363xfb85ada3();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopItemStorage", e17, "getByLocalId error: " + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        if (str != null) {
            eVar.f432615j = str;
        }
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        b05.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeItem, "nativeItem");
        int i18 = (i17 - nativeItem.f496098a) - 1;
        if (i18 >= nativeItem.f496103f.size() || i18 < 0) {
            fVar = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f496103f.get(i18);
            fVar = new b05.f(i17);
            fVar.f98514q = yVar;
            fVar.f505295e = nativeItem.f496104g;
            fVar.n(yVar.f432717b, yVar.f432718c);
        }
        if (fVar != null) {
            fVar.f505300j = i18 + 1;
        }
        return fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432683l = r13.d.f450137d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432681j = hashSet;
        p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(15, uVar);
        this.f98519p = c01.id.c();
        return sj6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v ftsResult, java.util.HashSet hashSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsResult, "ftsResult");
        if (k(ftsResult.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -28;
            iVar.f496104g = ftsResult.f432692d;
            iVar.f496103f = ftsResult.f432693e;
            this.f219542n.add(iVar);
        }
    }
}
