package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p2 implements eb2.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.s2 f108242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f108243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108245d;

    public p2(com.tencent.mm.plugin.finder.feed.model.s2 s2Var, com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar) {
        this.f108242a = s2Var;
        this.f108243b = finderLbsLoader;
        this.f108244c = n0Var;
        this.f108245d = rVar;
    }

    public void a(com.tencent.mm.plugin.finder.feed.model.n2 response) {
        r45.gk2 gk2Var;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.feed.model.s2 s2Var = this.f108242a;
        com.tencent.mars.xlog.Log.i(s2Var.getTAG(), "[call] onFetchDone... pullType=" + response.getPullType());
        if (response.getPullType() != 2) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.List incrementList = response.getIncrementList();
            if (incrementList != null) {
                java.util.Iterator it = incrementList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.finder.storage.ja0 ja0Var = ((so2.k) it.next()).f410451d;
                    com.tencent.mm.plugin.finder.storage.o90 o90Var = ja0Var.f126993b;
                    if ((o90Var != null ? o90Var.f127298a : null) != null) {
                        long j17 = ja0Var.f126998g;
                        if (o90Var == null || (gk2Var = o90Var.f127298a) == null) {
                            gk2Var = new r45.gk2();
                        }
                        linkedList.add(new bu2.m0(0, j17, 1, gk2Var));
                    }
                }
            }
            if (linkedList.size() > 0) {
                bu2.e0.f24498a.a(9, xy2.c.f(this.f108243b.getContextObj()), linkedList);
                com.tencent.mm.protobuf.g lastBuffer = response.getLastBuffer();
                java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(lastBuffer != null ? lastBuffer.g() : null);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_LBS_SECTION_LASTBUF_STRING_SYNC, l17);
                com.tencent.mars.xlog.Log.i(s2Var.getTAG(), "save firstPage and lastBuffer, size:" + linkedList.size() + ", lastBuffer:" + l17);
            }
            com.tencent.mars.xlog.Log.i(s2Var.getTAG(), "lxl FinderLbsLoader FinderPage size: " + linkedList.size());
        }
        this.f108244c.onFetchDone(response);
        this.f108245d.b(fp0.u.f265290f);
    }
}
