package b05;

/* loaded from: classes12.dex */
public final class k extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public long f16987p;

    @Override // t13.k
    public int getType() {
        return 272;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a, t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f138006h > 0) {
            for (t13.i iVar : this.f138009n) {
                int size = iVar.f414570f.size() + iVar.f414574j;
                for (int i17 = 0; i17 < size; i17++) {
                    p13.e l17 = l(i17, j17, iVar);
                    if (l17 != null) {
                        l17.f351078f = this.f16987p - j17;
                        l17.f351074b = iVar.f414566b ? iVar.f414565a + i17 + 1 : iVar.f414565a + i17;
                        l17.f351076d = 1;
                        l17.f351073a = i17;
                        l17.f351084l = com.tencent.mm.plugin.fts.ui.x2.b(((p13.y) iVar.f414570f.get(i17)).f351184b, ((p13.y) iVar.f414570f.get(i17)).f351185c, ((p13.y) iVar.f414570f.get(i17)).f351201s);
                        arrayList.add(l17);
                    }
                }
                if (iVar.f414568d) {
                    p13.e eVar = new p13.e();
                    eVar.f351079g = java.lang.String.valueOf(iVar.hashCode());
                    eVar.f351076d = 2;
                    eVar.f351073a = size;
                    eVar.f351075c = 36;
                    eVar.f351078f = this.f16987p - j17;
                    eVar.f351074b = iVar.f414567c;
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i nativeItem) {
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        if (i17 >= nativeItem.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) nativeItem.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f351075c = 36;
        eVar.f351082j = yVar.f351187e;
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        u13.g gVar;
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        int i18 = (i17 - nativeItem.f414565a) - 1;
        if (i18 >= nativeItem.f414570f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f414570f.get(i18);
            kotlin.jvm.internal.o.d(yVar);
            gVar = p(655360, i17, yVar, nativeItem);
        }
        if (gVar != null) {
            gVar.f423767j = i18 + 1;
            if (i18 == nativeItem.f414570f.size() - 1) {
                gVar.f423761d = false;
            }
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y matchInfo, t13.i nativeItem) {
        kotlin.jvm.internal.o.g(matchInfo, "matchInfo");
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        b05.f fVar = new b05.f(i18);
        fVar.f16981q = matchInfo;
        fVar.f423762e = nativeItem.f414571g;
        fVar.n(matchInfo.f351184b, matchInfo.f351185c);
        return fVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351150l = r13.d.f368604d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351148j = hashSet;
        p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(15, uVar);
        this.f16987p = c01.id.c();
        return sj6;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v ftsResult, java.util.HashSet hashSet) {
        kotlin.jvm.internal.o.g(ftsResult, "ftsResult");
        if (k(ftsResult.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -28;
            java.util.List list = ftsResult.f351160e;
            iVar.f414570f = list;
            iVar.f414571g = ftsResult.f351159d;
            if (list.size() > 1) {
                iVar.f414568d = true;
                iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 1));
            }
            this.f138009n.add(iVar);
        }
    }
}
