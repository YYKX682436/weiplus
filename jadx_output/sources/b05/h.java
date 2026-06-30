package b05;

/* loaded from: classes12.dex */
public final class h extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public long f16986p;

    @Override // t13.k
    public int getType() {
        return 4368;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a, t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f138009n;
        if (!list.isEmpty() && this.f16986p > 0) {
            java.lang.Object element = list.get(0);
            t13.i iVar = (t13.i) element;
            int size = iVar.f414570f.size();
            for (int i17 = 0; i17 < size; i17++) {
                kotlin.jvm.internal.o.f(element, "element");
                t13.i iVar2 = (t13.i) element;
                p13.e l17 = l(i17, j17, iVar2);
                if (l17 != null) {
                    l17.f351078f = this.f16986p - j17;
                    l17.f351074b = iVar2.f414566b ? iVar2.f414565a + i17 + 1 : iVar2.f414565a + i17;
                    l17.f351076d = 1;
                    l17.f351073a = i17;
                    l17.f351084l = com.tencent.mm.plugin.fts.ui.x2.b(((p13.y) iVar2.f414570f.get(i17)).f351184b, ((p13.y) iVar2.f414570f.get(i17)).f351185c, ((p13.y) iVar2.f414570f.get(i17)).f351201s);
                    arrayList.add(l17);
                }
            }
            if (iVar.f414568d) {
                p13.e eVar = new p13.e();
                eVar.f351079g = java.lang.String.valueOf(iVar.hashCode());
                eVar.f351076d = 2;
                eVar.f351073a = size;
                eVar.f351075c = 36;
                eVar.f351078f = this.f16986p - j17;
                eVar.f351074b = iVar.f414567c;
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i nativeItem) {
        c30.t tVar;
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        java.lang.String str = null;
        if (i17 >= nativeItem.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) nativeItem.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f351075c = 36;
        c00.g4 g4Var = (c00.g4) i95.n0.c(c00.g4.class);
        long j18 = yVar.f351186d;
        c30.f0 f0Var = (c30.f0) g4Var;
        f0Var.requireAccountInitialized();
        c30.e eVar2 = f0Var.f38113d;
        if (eVar2 != null && (tVar = eVar2.f38109c) != null) {
            try {
                com.tencent.wcdb.base.Value value = tVar.f38162a.getValue(tq.b.f421185e, tq.b.f421183c.eq(j18));
                if (value != null) {
                    str = value.getText();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopItemStorage", e17, "getByLocalId error: " + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        if (str != null) {
            eVar.f351082j = str;
        }
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        b05.f fVar;
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        int i18 = (i17 - nativeItem.f414565a) - 1;
        if (i18 >= nativeItem.f414570f.size() || i18 < 0) {
            fVar = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f414570f.get(i18);
            fVar = new b05.f(i17);
            fVar.f16981q = yVar;
            fVar.f423762e = nativeItem.f414571g;
            fVar.n(yVar.f351184b, yVar.f351185c);
        }
        if (fVar != null) {
            fVar.f423767j = i18 + 1;
        }
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
        this.f16986p = c01.id.c();
        return sj6;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v ftsResult, java.util.HashSet hashSet) {
        kotlin.jvm.internal.o.g(ftsResult, "ftsResult");
        if (k(ftsResult.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -28;
            iVar.f414571g = ftsResult.f351159d;
            iVar.f414570f = ftsResult.f351160e;
            this.f138009n.add(iVar);
        }
    }
}
