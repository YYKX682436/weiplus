package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class z2 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.y2 f106043c = new com.tencent.mm.plugin.finder.extension.reddot.y2(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f106044a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f106045b;

    public z2(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f106044a = "Finder.RedDotCacheFeedHandler";
    }

    public final void a(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, com.tencent.mm.plugin.finder.extension.reddot.jb newReddot) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        r45.xs2 xs2Var3;
        r45.xs2 xs2Var4;
        kotlin.jvm.internal.o.g(newReddot, "newReddot");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkClearCacheFeed isInFinder=");
        sb6.append(this.f106045b);
        sb6.append(',');
        java.lang.Object obj = null;
        sb6.append(hc2.u0.e(jbVar != null ? jbVar.field_ctrInfo : null));
        sb6.append(",cacheReddot tabType=");
        sb6.append((jbVar == null || (xs2Var4 = jbVar.N) == null) ? null : java.lang.Integer.valueOf(xs2Var4.getInteger(9)));
        sb6.append(",feedId=");
        sb6.append(pm0.v.u((jbVar == null || (xs2Var3 = jbVar.N) == null) ? 0L : xs2Var3.getLong(3)));
        sb6.append(" \n ");
        sb6.append(hc2.u0.e(newReddot.field_ctrInfo));
        com.tencent.mars.xlog.Log.i(this.f106044a, sb6.toString());
        r45.s30 s30Var = newReddot.field_ctrInfo.A;
        if (s30Var != null && s30Var.f385458d) {
            if ((jbVar == null || (xs2Var2 = jbVar.N) == null || xs2Var2.getLong(3) != newReddot.N.getLong(3)) ? false : true) {
                return;
            }
            r45.s30 s30Var2 = newReddot.field_ctrInfo.A;
            java.util.LinkedList linkedList = s30Var2 != null ? s30Var2.f385461g : null;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    r45.r30 r30Var = (r45.r30) next;
                    if ((jbVar != null && (xs2Var = jbVar.N) != null && r30Var.f384498d == xs2Var.getInteger(9)) && r30Var.f384499e == jbVar.field_ctrType) {
                        obj = next;
                        break;
                    }
                }
                obj = (r45.r30) obj;
            }
            if (obj == null || this.f106045b || !b("checkClearCacheFeed", jbVar)) {
                return;
            }
            jx3.f.INSTANCE.u(1279L, 210L);
        }
    }

    public final boolean b(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        r45.xs2 xs2Var;
        java.util.ArrayList arrayList;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        kotlin.jvm.internal.o.g(source, "source");
        if (jbVar == null || (xs2Var = jbVar.N) == null) {
            return false;
        }
        bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(xs2Var.getInteger(9));
        if (R6 != null) {
            long j17 = xs2Var.getLong(3);
            bs2.b0 b0Var = R6.f23925s;
            java.util.concurrent.locks.ReentrantLock reentrantLock = R6.f23923q;
            reentrantLock.lock();
            try {
                db2.c3 c3Var = b0Var.f23806b;
                boolean v17 = (c3Var == null || (list2 = c3Var.getList(1)) == null) ? false : R6.v(j17, list2);
                if (!v17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeCacheFeed ");
                    sb6.append(pm0.v.u(j17));
                    sb6.append(" fail,resp is null=");
                    sb6.append(b0Var.f23806b == null);
                    sb6.append(' ');
                    db2.c3 c3Var2 = b0Var.f23806b;
                    if (c3Var2 == null || (list = c3Var2.getList(1)) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
                        }
                    }
                    sb6.append(arrayList);
                    com.tencent.mars.xlog.Log.i(R6.f23909c, sb6.toString());
                    R6.f23920n = j17;
                }
                r0 = v17;
            } finally {
                reentrantLock.unlock();
            }
        }
        cu2.u.f222441a.b(xs2Var.getLong(3));
        com.tencent.mars.xlog.Log.i(this.f106044a, source + " clearRedDotCacheFeed " + jbVar.field_tips_uuid + '(' + pm0.v.u(xs2Var.getLong(3)) + ") removeFromCache=" + r0 + ",removeFromStorage=true");
        return true;
    }

    public final void c(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        boolean z17 = this.f106045b;
        java.lang.String str = this.f106044a;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, source.concat(" [clearRedDotCacheFeedWithControl] is in Finder, can't remove cache feed!"));
            pm0.z.b(xy2.b.f458155b, "disableClearRedDotCache", false, null, null, false, false, null, 124, null);
            return;
        }
        if (!com.tencent.mm.plugin.finder.storage.aj0.f126440a.C()) {
            com.tencent.mars.xlog.Log.i(str, source.concat(" [clearRedDotCacheFeedWithControl] can't remove cache feed!"));
            return;
        }
        r45.vs2 field_ctrInfo = ctrlInfo.field_ctrInfo;
        kotlin.jvm.internal.o.f(field_ctrInfo, "field_ctrInfo");
        int i17 = field_ctrInfo.f388487e;
        if (i17 == 7 || i17 == 8 || i17 == 10) {
            if (b(source.concat("_clearRedDotCacheFeedWithControl"), ctrlInfo)) {
                jx3.f.INSTANCE.u(1279L, 211L);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, source + " [clearRedDotCacheFeedWithControl] can't clear cache feed (redDot type" + ctrlInfo.getType() + ")!");
        }
    }

    public final void d(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        if (this.f106045b) {
            return;
        }
        boolean booleanValue = com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "撤回红点时是否删除3tab流的预加载数据", e42.c0.clicfg_finder_remove_cacbe_feed_when_revoke_reddot, java.lang.Boolean.TRUE, false, com.tencent.mm.plugin.finder.storage.mh0.f127198d, 8, null)).booleanValue() : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126446d).getValue()).r()).booleanValue();
        java.lang.String str = this.f106044a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.i(str, "[revokeRedDot] can't remove cache feed!");
            return;
        }
        r45.vs2 field_ctrInfo = ctrlInfo.field_ctrInfo;
        kotlin.jvm.internal.o.f(field_ctrInfo, "field_ctrInfo");
        int i17 = field_ctrInfo.f388487e;
        if (i17 == 7 || i17 == 8 || i17 == 10) {
            if (b(source, ctrlInfo)) {
                jx3.f.INSTANCE.u(1279L, 211L);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "[revokeRedDot] can't clear cache feed (redDot type" + ctrlInfo.getType() + ")!");
        }
    }
}
