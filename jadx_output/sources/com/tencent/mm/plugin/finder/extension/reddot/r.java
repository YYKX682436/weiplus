package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class r implements ya2.x1 {
    public final void a(r45.hx0 hx0Var) {
        r45.r21 r21Var = new r45.r21();
        com.tencent.mm.protobuf.g byteString = hx0Var.getByteString(1);
        r21Var.parseFrom(byteString != null ? byteString.g() : null);
        java.lang.String string = r21Var.getString(2);
        if (string == null) {
            string = "";
        }
        com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[processFansCount] finderUsername=" + string + " fansCount " + r21Var.getInteger(0) + " fansAddCount:" + r21Var.getInteger(1));
        g92.b bVar = g92.b.f269769e;
        if (bVar.v(string)) {
            m92.c cVar = new m92.c(string);
            cVar.u0().set(20, java.lang.Integer.valueOf(r21Var.getInteger(0)));
            if (r21Var.getInteger(1) != 0) {
                cVar.field_fansAddCount = r21Var.getInteger(1);
            }
            bVar.C(cVar, m92.j.B);
        }
        int integer = r21Var.getInteger(1);
        if (integer <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[notifyFinderFansAddCount] server error.");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[notifyFinderFansAddCount] count = " + integer);
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f388490h = java.lang.String.valueOf(c01.id.c());
        vs2Var.f388486d = 100000;
        vs2Var.f388487e = 2;
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = 2;
        f03Var.f373891h = 1;
        f03Var.f373892i = "AuthorProfileFans";
        f03Var.f373888e = integer;
        vs2Var.f388489g.add(f03Var);
        zy2.fa.D(((c61.l7) i95.n0.c(c61.l7.class)).nk(), vs2Var, "notifyFinderFansAddCount", null, true, null, 20, null);
    }

    public final void b(r45.hx0 hx0Var) {
        r45.dg2 dg2Var = new r45.dg2();
        com.tencent.mm.protobuf.g byteString = hx0Var.getByteString(1);
        dg2Var.parseFrom(byteString != null ? byteString.g() : null);
        com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[processGetMemberMentionCount] finderUsername=" + dg2Var.getString(0) + ", msg like count:" + dg2Var.getInteger(2) + ", mentionCommentCount:" + dg2Var.getInteger(3) + ", followCount:" + dg2Var.getInteger(5) + ",  updatetime:" + dg2Var.getLong(1));
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        int integer = dg2Var.getInteger(2);
        int integer2 = dg2Var.getInteger(3);
        int integer3 = dg2Var.getInteger(5);
        java.lang.String string = dg2Var.getString(0);
        if (string == null) {
            string = "";
        }
        nk6.m(integer, integer2, integer3, string);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r45.hx0 r21) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.r.c(r45.hx0):void");
    }

    public final void d(r45.hx0 hx0Var) {
        r45.mj2 mj2Var = new r45.mj2();
        boolean z17 = true;
        com.tencent.mm.protobuf.g byteString = hx0Var.getByteString(1);
        mj2Var.parseFrom(byteString != null ? byteString.g() : null);
        com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[processMyAccountSync] finderUsername=" + mj2Var.getString(1));
        java.lang.String string = mj2Var.getString(1);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        pm0.z.b(xy2.b.f458155b, "processMyAccountSync", false, null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.q(mj2Var), 60, null);
    }

    public final void e(r45.hx0 hx0Var) {
        com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[processReInit] ...");
        r45.fs2 fs2Var = new r45.fs2();
        com.tencent.mm.protobuf.g byteString = hx0Var.getByteString(1);
        if (byteString != null) {
            fs2Var.parseFrom(byteString.g());
            if (fs2Var.getInteger(2) != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 20L, 1L);
                kotlin.jvm.internal.o.f(fs2Var.getList(0), "getSelf(...)");
                if (!r3.isEmpty()) {
                    java.util.LinkedList list = fs2Var.getList(0);
                    kotlin.jvm.internal.o.f(list, "getSelf(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.tencent.mm.protocal.protobuf.FinderContact) it.next()).getUsername());
                    }
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
                    com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "replace new finder username %s", c17);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, c17);
                } else {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, java.lang.Integer.valueOf(fs2Var.getInteger(1)));
                int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
                com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[processReInit] userVersion=" + r17 + " userVersion=" + fs2Var.getInteger(1));
                if (r17 == fs2Var.getInteger(1) || fs2Var.getInteger(1) == 0) {
                    return;
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC, 1);
            }
        }
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        com.tencent.mars.xlog.Log.i("Finder.AccountSyncHandler", "[handleCmd] cmdId=" + cmdItem.getInteger(0) + " selector=" + i17 + " scene=" + i18 + ", " + cmdItem.getString(2));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int integer = cmdItem.getInteger(0);
            if (integer == 101) {
                c(cmdItem);
            } else if (integer == 106) {
                a(cmdItem);
            } else if (integer == 118) {
                r45.of1 of1Var = new r45.of1();
                com.tencent.mm.protobuf.g byteString = cmdItem.getByteString(1);
                of1Var.parseFrom(byteString != null ? byteString.g() : null);
                ((c61.l7) i95.n0.c(c61.l7.class)).Vk(of1Var, true, "FinderAccountSyncHandler");
            } else if (integer == 121) {
                b(cmdItem);
            } else if (integer == 110) {
                e(cmdItem);
            } else if (integer == 111) {
                d(cmdItem);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.AccountSyncHandler", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
            pm0.z.b(xy2.b.f458155b, "Finder.AccountSyncHandler", false, null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.p(cmdItem, i17, i18), 60, null);
        }
    }
}
