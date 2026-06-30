package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class z2 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y2 f187576c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y2(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f187577a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f187578b;

    public z2(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187577a = "Finder.RedDotCacheFeedHandler";
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb newReddot) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        r45.xs2 xs2Var3;
        r45.xs2 xs2Var4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newReddot, "newReddot");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkClearCacheFeed isInFinder=");
        sb6.append(this.f187578b);
        sb6.append(',');
        java.lang.Object obj = null;
        sb6.append(hc2.u0.e(jbVar != null ? jbVar.f65874xb5f7102a : null));
        sb6.append(",cacheReddot tabType=");
        sb6.append((jbVar == null || (xs2Var4 = jbVar.N) == null) ? null : java.lang.Integer.valueOf(xs2Var4.m75939xb282bd08(9)));
        sb6.append(",feedId=");
        sb6.append(pm0.v.u((jbVar == null || (xs2Var3 = jbVar.N) == null) ? 0L : xs2Var3.m75942xfb822ef2(3)));
        sb6.append(" \n ");
        sb6.append(hc2.u0.e(newReddot.f65874xb5f7102a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187577a, sb6.toString());
        r45.s30 s30Var = newReddot.f65874xb5f7102a.A;
        if (s30Var != null && s30Var.f466991d) {
            if ((jbVar == null || (xs2Var2 = jbVar.N) == null || xs2Var2.m75942xfb822ef2(3) != newReddot.N.m75942xfb822ef2(3)) ? false : true) {
                return;
            }
            r45.s30 s30Var2 = newReddot.f65874xb5f7102a.A;
            java.util.LinkedList linkedList = s30Var2 != null ? s30Var2.f466994g : null;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    r45.r30 r30Var = (r45.r30) next;
                    if ((jbVar != null && (xs2Var = jbVar.N) != null && r30Var.f466031d == xs2Var.m75939xb282bd08(9)) && r30Var.f466032e == jbVar.f65875xb5fc3ab6) {
                        obj = next;
                        break;
                    }
                }
                obj = (r45.r30) obj;
            }
            if (obj == null || this.f187578b || !b("checkClearCacheFeed", jbVar)) {
                return;
            }
            jx3.f.INSTANCE.u(1279L, 210L);
        }
    }

    public final boolean b(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        r45.xs2 xs2Var;
        java.util.ArrayList arrayList;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (jbVar == null || (xs2Var = jbVar.N) == null) {
            return false;
        }
        bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).R6(xs2Var.m75939xb282bd08(9));
        if (R6 != null) {
            long m75942xfb822ef2 = xs2Var.m75942xfb822ef2(3);
            bs2.b0 b0Var = R6.f105458s;
            java.util.concurrent.locks.ReentrantLock reentrantLock = R6.f105456q;
            reentrantLock.lock();
            try {
                db2.c3 c3Var = b0Var.f105339b;
                boolean v17 = (c3Var == null || (m75941xfb8219142 = c3Var.m75941xfb821914(1)) == null) ? false : R6.v(m75942xfb822ef2, m75941xfb8219142);
                if (!v17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeCacheFeed ");
                    sb6.append(pm0.v.u(m75942xfb822ef2));
                    sb6.append(" fail,resp is null=");
                    sb6.append(b0Var.f105339b == null);
                    sb6.append(' ');
                    db2.c3 c3Var2 = b0Var.f105339b;
                    if (c3Var2 == null || (m75941xfb821914 = c3Var2.m75941xfb821914(1)) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (it.hasNext()) {
                            arrayList.add(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
                        }
                    }
                    sb6.append(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(R6.f105442c, sb6.toString());
                    R6.f105453n = m75942xfb822ef2;
                }
                r0 = v17;
            } finally {
                reentrantLock.unlock();
            }
        }
        cu2.u.f303974a.b(xs2Var.m75942xfb822ef2(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187577a, source + " clearRedDotCacheFeed " + jbVar.f65882x5364c75d + '(' + pm0.v.u(xs2Var.m75942xfb822ef2(3)) + ") removeFromCache=" + r0 + ",removeFromStorage=true");
        return true;
    }

    public final void c(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        boolean z17 = this.f187578b;
        java.lang.String str = this.f187577a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, source.concat(" [clearRedDotCacheFeedWithControl] is in Finder, can't remove cache feed!"));
            pm0.z.b(xy2.b.f539688b, "disableClearRedDotCache", false, null, null, false, false, null, 124, null);
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.C()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, source.concat(" [clearRedDotCacheFeedWithControl] can't remove cache feed!"));
            return;
        }
        r45.vs2 field_ctrInfo = ctrlInfo.f65874xb5f7102a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
        int i17 = field_ctrInfo.f470020e;
        if (i17 == 7 || i17 == 8 || i17 == 10) {
            if (b(source.concat("_clearRedDotCacheFeedWithControl"), ctrlInfo)) {
                jx3.f.INSTANCE.u(1279L, 211L);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, source + " [clearRedDotCacheFeedWithControl] can't clear cache feed (redDot type" + ctrlInfo.m55856xfb85f7b0() + ")!");
        }
    }

    public final void d(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        if (this.f187578b) {
            return;
        }
        boolean booleanValue = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "撤回红点时是否删除3tab流的预加载数据", e42.c0.clicfg_finder_remove_cacbe_feed_when_revoke_reddot, java.lang.Boolean.TRUE, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mh0.f208731d, 8, null)).booleanValue() : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207979d).mo141623x754a37bb()).r()).booleanValue();
        java.lang.String str = this.f187577a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[revokeRedDot] can't remove cache feed!");
            return;
        }
        r45.vs2 field_ctrInfo = ctrlInfo.f65874xb5f7102a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
        int i17 = field_ctrInfo.f470020e;
        if (i17 == 7 || i17 == 8 || i17 == 10) {
            if (b(source, ctrlInfo)) {
                jx3.f.INSTANCE.u(1279L, 211L);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[revokeRedDot] can't clear cache feed (redDot type" + ctrlInfo.m55856xfb85f7b0() + ")!");
        }
    }
}
