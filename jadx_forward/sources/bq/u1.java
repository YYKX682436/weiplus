package bq;

/* loaded from: classes8.dex */
public final class u1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public cz2.f f105066o;

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
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList m75941xfb821914;
        r45.az2 resp = (r45.az2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSyncCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 >= 4) {
            this.f105066o = cz2.f.f306535d;
        }
        if (i17 != 0 || i18 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 12L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(10);
        if (m75934xbce7f2f != null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(m75934xbce7f2f.f273689a));
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, "");
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 11L, 1L, false);
        r45.qw0 qw0Var = (r45.qw0) resp.m75936x14adae67(8);
        if (qw0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSyncCGI", "[processCgiResult] check_expire_info=" + bq.v1.b(qw0Var));
            if (qw0Var.m75939xb282bd08(0) == 1) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(qw0Var.mo14344x5f01b1f6()));
            }
        }
        r45.ml2 ml2Var = (r45.ml2) resp.m75936x14adae67(11);
        if (ml2Var != null && (m75941xfb821914 = ml2Var.m75941xfb821914(0)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.jm2) it.next()).m75936x14adae67(0);
                if (c19792x256d2725 != null) {
                    arrayList.add(c19792x256d2725);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next();
                bu2.j jVar = bu2.j.f106067a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27252);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = h90Var.a(c19792x256d27252, 0);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152243a.f152217a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                r45.kv0 kv0Var = (r45.kv0) ((r45.zy2) fVar2).m75936x14adae67(6);
                jVar.n(a17, new bu2.h(3565, kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L));
            }
        }
        java.util.LinkedList<r45.om5> m75941xfb8219142 = resp.m75941xfb821914(13);
        if (m75941xfb8219142 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("discardReddotInFindMoreTab config=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            for (r45.om5 om5Var : m75941xfb8219142) {
                arrayList2.add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811 + om5Var.m75939xb282bd08(1) + ",accumulate_expose_interval=" + om5Var.m75939xb282bd08(2) + ",last_expose_interval=" + om5Var.m75939xb282bd08(3) + ",path=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(om5Var.m75941xfb821914(0), ","));
            }
            sb6.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSyncCGI", sb6.toString());
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_RED_DOT_DISCARD_CONFIG_STRING_SYNC;
            r45.qc4 qc4Var = new r45.qc4();
            qc4Var.set(0, m75941xfb8219142);
            c17.x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(qc4Var.mo14344x5f01b1f6()));
        }
        java.util.LinkedList m75941xfb8219143 = resp.m75941xfb821914(12);
        if (m75941xfb8219143 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_RED_DOT_FREQ_CTRL_CONFIG_STRING_SYNC;
            r45.tm5 tm5Var = new r45.tm5();
            tm5Var.set(0, m75941xfb8219143);
            c18.x(u3Var2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(tm5Var.mo14344x5f01b1f6()));
        }
        r45.ep2 ep2Var = (r45.ep2) resp.m75936x14adae67(14);
        if (ep2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSyncCGI", "popup_client_freq_config expose_quota=" + ep2Var.m75939xb282bd08(0) + ",expose_interval=" + ep2Var.m75939xb282bd08(1));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_POPUP_CLIENT_FREQ_CONFIG_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(ep2Var.mo14344x5f01b1f6()));
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return this.f105066o;
    }
}
