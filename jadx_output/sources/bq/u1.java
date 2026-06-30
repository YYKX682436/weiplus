package bq;

/* loaded from: classes8.dex */
public final class u1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public cz2.f f23533o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04eb A[LOOP:5: B:154:0x04e5->B:156:0x04eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u1(java.lang.String r20, java.util.List r21, byte[] r22, int r23, int r24, int r25, int r26, r45.jy2 r27, r45.ky2 r28, java.lang.String r29, r45.sz0 r30, java.util.LinkedList r31, ya2.t1 r32) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.u1.<init>(java.lang.String, java.util.List, byte[], int, int, int, int, r45.jy2, r45.ky2, java.lang.String, r45.sz0, java.util.LinkedList, ya2.t1):void");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList list;
        r45.az2 resp = (r45.az2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderSyncCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 >= 4) {
            this.f23533o = cz2.f.f225002d;
        }
        if (i17 != 0 || i18 != 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 12L, 1L, false);
            return;
        }
        com.tencent.mm.protobuf.g byteString = resp.getByteString(10);
        if (byteString != null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(byteString.f192156a));
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, "");
        }
        jx3.f.INSTANCE.idkeyStat(1279L, 11L, 1L, false);
        r45.qw0 qw0Var = (r45.qw0) resp.getCustom(8);
        if (qw0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSyncCGI", "[processCgiResult] check_expire_info=" + bq.v1.b(qw0Var));
            if (qw0Var.getInteger(0) == 1) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(qw0Var.toByteArray()));
            }
        }
        r45.ml2 ml2Var = (r45.ml2) resp.getCustom(11);
        if (ml2Var != null && (list = ml2Var.getList(0)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.jm2) it.next()).getCustom(0);
                if (finderObject != null) {
                    arrayList.add(finderObject);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) it6.next();
                bu2.j jVar = bu2.j.f24534a;
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject2);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject2, 0);
                com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                r45.kv0 kv0Var = (r45.kv0) ((r45.zy2) fVar2).getCustom(6);
                jVar.n(a17, new bu2.h(3565, kv0Var != null ? kv0Var.getLong(5) : 0L));
            }
        }
        java.util.LinkedList<r45.om5> list2 = resp.getList(13);
        if (list2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("discardReddotInFindMoreTab config=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.om5 om5Var : list2) {
                arrayList2.add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE + om5Var.getInteger(1) + ",accumulate_expose_interval=" + om5Var.getInteger(2) + ",last_expose_interval=" + om5Var.getInteger(3) + ",path=" + com.tencent.mm.sdk.platformtools.t8.c1(om5Var.getList(0), ","));
            }
            sb6.append(arrayList2);
            com.tencent.mars.xlog.Log.i("Finder.FinderSyncCGI", sb6.toString());
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_RED_DOT_DISCARD_CONFIG_STRING_SYNC;
            r45.qc4 qc4Var = new r45.qc4();
            qc4Var.set(0, list2);
            c17.x(u3Var, com.tencent.mm.sdk.platformtools.t8.l(qc4Var.toByteArray()));
        }
        java.util.LinkedList list3 = resp.getList(12);
        if (list3 != null) {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_RED_DOT_FREQ_CTRL_CONFIG_STRING_SYNC;
            r45.tm5 tm5Var = new r45.tm5();
            tm5Var.set(0, list3);
            c18.x(u3Var2, com.tencent.mm.sdk.platformtools.t8.l(tm5Var.toByteArray()));
        }
        r45.ep2 ep2Var = (r45.ep2) resp.getCustom(14);
        if (ep2Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSyncCGI", "popup_client_freq_config expose_quota=" + ep2Var.getInteger(0) + ",expose_interval=" + ep2Var.getInteger(1));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_POPUP_CLIENT_FREQ_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(ep2Var.toByteArray()));
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return this.f23533o;
    }
}
