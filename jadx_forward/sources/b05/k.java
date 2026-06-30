package b05;

/* loaded from: classes12.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public long f98520p;

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 272;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a, t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f219539h > 0) {
            for (t13.i iVar : this.f219542n) {
                int size = iVar.f496103f.size() + iVar.f496107j;
                for (int i17 = 0; i17 < size; i17++) {
                    p13.e l17 = l(i17, j17, iVar);
                    if (l17 != null) {
                        l17.f432611f = this.f98520p - j17;
                        l17.f432607b = iVar.f496099b ? iVar.f496098a + i17 + 1 : iVar.f496098a + i17;
                        l17.f432609d = 1;
                        l17.f432606a = i17;
                        l17.f432617l = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.b(((p13.y) iVar.f496103f.get(i17)).f432717b, ((p13.y) iVar.f496103f.get(i17)).f432718c, ((p13.y) iVar.f496103f.get(i17)).f432734s);
                        arrayList.add(l17);
                    }
                }
                if (iVar.f496101d) {
                    p13.e eVar = new p13.e();
                    eVar.f432612g = java.lang.String.valueOf(iVar.hashCode());
                    eVar.f432609d = 2;
                    eVar.f432606a = size;
                    eVar.f432608c = 36;
                    eVar.f432611f = this.f98520p - j17;
                    eVar.f432607b = iVar.f496100c;
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i nativeItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeItem, "nativeItem");
        if (i17 >= nativeItem.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) nativeItem.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 36;
        eVar.f432615j = yVar.f432720e;
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        u13.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeItem, "nativeItem");
        int i18 = (i17 - nativeItem.f496098a) - 1;
        if (i18 >= nativeItem.f496103f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f496103f.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            gVar = p(655360, i17, yVar, nativeItem);
        }
        if (gVar != null) {
            gVar.f505300j = i18 + 1;
            if (i18 == nativeItem.f496103f.size() - 1) {
                gVar.f505294d = false;
            }
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y matchInfo, t13.i nativeItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchInfo, "matchInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeItem, "nativeItem");
        b05.f fVar = new b05.f(i18);
        fVar.f98514q = matchInfo;
        fVar.f505295e = nativeItem.f496104g;
        fVar.n(matchInfo.f432717b, matchInfo.f432718c);
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
        this.f98520p = c01.id.c();
        return sj6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v ftsResult, java.util.HashSet hashSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsResult, "ftsResult");
        if (k(ftsResult.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -28;
            java.util.List list = ftsResult.f432693e;
            iVar.f496103f = list;
            iVar.f496104g = ftsResult.f432692d;
            if (list.size() > 1) {
                iVar.f496101d = true;
                iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 1));
            }
            this.f219542n.add(iVar);
        }
    }
}
