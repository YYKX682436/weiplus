package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class h implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f76444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f76445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f76446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.f f76447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.l f76448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f76449f;

    public h(com.tencent.mm.pointers.PInt pInt, java.util.List list, java.util.List list2, com.tencent.mm.plugin.appbrand.appusage.f fVar, com.tencent.mm.plugin.appbrand.appusage.l lVar, java.util.ArrayList arrayList) {
        this.f76444a = pInt;
        this.f76445b = list;
        this.f76446c = list2;
        this.f76447d = fVar;
        this.f76448e = lVar;
        this.f76449f = arrayList;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo;
        this.f76444a.value += i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyDiff, onInserted position=");
        sb6.append(i17);
        sb6.append(" count=");
        sb6.append(i18);
        sb6.append("  oldList.size=");
        java.util.List<com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo> list = this.f76445b;
        sb6.append(list.size());
        sb6.append("  newList.size=");
        java.util.List<com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo> list2 = this.f76446c;
        sb6.append(list2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", sb6.toString());
        int i19 = i18 + i17;
        if (i19 == list2.size()) {
            localUsageInfo = null;
        } else {
            try {
                localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) list2.get(i19);
            } catch (java.lang.IndexOutOfBoundsException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "print old list:" + list.size());
                for (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 : list) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", localUsageInfo2.f76365h + ':' + localUsageInfo2.f76363f);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "print new list:" + list2.size());
                for (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo3 : list2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", localUsageInfo3.f76365h + ':' + localUsageInfo3.f76363f);
                }
                throw e17;
            }
        }
        int i27 = i19 - 1;
        if (i17 > i27) {
            return;
        }
        while (true) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo4 = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) list2.get(i17);
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo5 = i17 == 0 ? null : (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) list2.get(i17 - 1);
            com.tencent.mm.plugin.appbrand.appusage.f fVar = this.f76447d;
            if (fVar != null) {
                fVar.b(localUsageInfo4);
            }
            com.tencent.mm.plugin.appbrand.appusage.l lVar = this.f76448e;
            r45.id6 wi6 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo4);
            kotlin.jvm.internal.o.d(wi6);
            r45.id6 wi7 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo5);
            r45.id6 wi8 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo);
            r45.jd6 jd6Var = new r45.jd6();
            jd6Var.f377726d = wi6;
            jd6Var.f377730h = 1;
            jd6Var.f377727e = wi7;
            jd6Var.f377728f = wi8;
            lVar.Bi(jd6Var, com.tencent.mm.plugin.appbrand.appusage.l3.f76504e);
            if (i17 == i27) {
                return;
            } else {
                i17++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        this.f76444a.value += i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onRemoved position=" + i17 + " count=" + i18);
        int i19 = i18 + i17 + (-1);
        if (i17 > i19) {
            return;
        }
        int i27 = i17;
        while (true) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f76449f.remove(i17);
            com.tencent.mm.plugin.appbrand.appusage.f fVar = this.f76447d;
            if (fVar != null) {
                kotlin.jvm.internal.o.d(localUsageInfo);
                fVar.a(localUsageInfo);
            }
            com.tencent.mm.plugin.appbrand.appusage.l lVar = this.f76448e;
            r45.id6 wi6 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo);
            kotlin.jvm.internal.o.d(wi6);
            r45.jd6 jd6Var = new r45.jd6();
            jd6Var.f377726d = wi6;
            jd6Var.f377730h = 2;
            jd6Var.f377727e = null;
            jd6Var.f377728f = null;
            lVar.Bi(jd6Var, com.tencent.mm.plugin.appbrand.appusage.l3.f76504e);
            if (i27 == i19) {
                return;
            } else {
                i27++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        this.f76444a.value++;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onMoved from " + i17 + " to " + i18);
        java.util.ArrayList arrayList = this.f76449f;
        arrayList.add(i18, (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) arrayList.remove(i17));
        java.lang.Object obj = arrayList.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj;
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = i18 == 0 ? null : (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) arrayList.get(i18 - 1);
        int i19 = i18 + 1;
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo3 = i19 != arrayList.size() ? (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) arrayList.get(i19) : null;
        com.tencent.mm.plugin.appbrand.appusage.l lVar = this.f76448e;
        r45.id6 wi6 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo);
        kotlin.jvm.internal.o.d(wi6);
        r45.id6 wi7 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo2);
        r45.id6 wi8 = com.tencent.mm.plugin.appbrand.appusage.l.wi(lVar, localUsageInfo3);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        r45.jd6 jd6Var = new r45.jd6();
        jd6Var.f377726d = wi6;
        jd6Var.f377730h = 3;
        jd6Var.f377727e = wi7;
        jd6Var.f377728f = wi8;
        lVar.Bi(jd6Var, com.tencent.mm.plugin.appbrand.appusage.l3.f76504e);
    }
}
