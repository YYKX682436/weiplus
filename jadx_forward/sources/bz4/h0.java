package bz4;

/* loaded from: classes12.dex */
public class h0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public h0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        long j18;
        r45.jq0 jq0Var;
        r45.bq0 bq0Var;
        boolean z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625) abstractC20979x809547d1;
        am.zl zlVar = c5773x64e6b625.f136087g;
        int i17 = zlVar.f90111a;
        if (i17 != 0) {
            str = "";
            if (i17 != 2) {
                if (i17 == 9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_ADD");
                    hz4.p pVar = new hz4.p();
                    pVar.f367955p = cz4.f.u0(c5773x64e6b625.f136087g);
                    pVar.f367956q = 1;
                    pVar.f367978u = c5773x64e6b625.f136087g.f56x88be67a1;
                    pVar.f367951i.f367959b = 1;
                    ((hz4.f) hz4.f.wi()).f367940d = pVar;
                    android.content.Context context = c5773x64e6b625.f136087g.f90114d;
                    pVar.f367953n = true;
                    pVar.t(context, 2);
                } else if (i17 == 10) {
                    hz4.l.h(zlVar.f56x88be67a1, zlVar.f90120j);
                } else if (i17 == 12) {
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5427x31cc7410(null).e();
                } else if (i17 == 13 && zlVar.f56x88be67a1 > 0 && o72.d3.f424858e) {
                    if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
                        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(c5773x64e6b625.f136087g.f56x88be67a1);
                        if (F != null) {
                            r72.k kVar = new r72.k();
                            r72.l.a(kVar, F);
                            java.lang.String m126747x696739c = kVar.m126747x696739c();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m126747x696739c)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyWNNoteOperationListener", "onBatchGetUpdate, xml is null, localId=%d", java.lang.Long.valueOf(c5773x64e6b625.f136087g.f56x88be67a1));
                            } else {
                                com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.k.f299227b.g(c5773x64e6b625.f136087g.f56x88be67a1, m126747x696739c);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyWNNoteOperationListener", "onBatchGetUpdate, serverItem is null, localId=%d", java.lang.Long.valueOf(c5773x64e6b625.f136087g.f56x88be67a1));
                        }
                    } else {
                        long j19 = c5773x64e6b625.f136087g.f56x88be67a1;
                        final mz4.j0 j0Var = mz4.j0.f414823v;
                        if (j0Var != null) {
                            long j27 = j0Var.f414836k;
                            if (j27 != j19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "onBatchGetUpdate not match to curLocalId=%d, updateLocalId=%d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19));
                            } else {
                                hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
                                if (hVar instanceof hz4.p) {
                                    hz4.p pVar2 = (hz4.p) hVar;
                                    long j28 = pVar2.f367978u;
                                    if (j28 != j19) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate local id not match, processFavLocalID=%d, updateLocalId=%d", java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j19));
                                    } else {
                                        o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j19);
                                        if (F2 == null || (bq0Var = F2.f67640x5ab01132) == null) {
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            objArr[0] = java.lang.Boolean.valueOf(F2 == null);
                                            objArr[1] = java.lang.Long.valueOf(j19);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate error, serverItem is null=%b, favLocalId=%d", objArr);
                                        } else if (java.util.Objects.equals(bq0Var.R, wo.w0.k())) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "onBatchGetUpdate ignore, is same device, favLocalId=%d", java.lang.Long.valueOf(j19));
                                        } else {
                                            boolean e17 = j0Var.e("onBatchGetUpdate");
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "onBatchGetUpdate favLocalId=%d, editBeginTime=%d, isSameHtmlContent=%b", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j0Var.f414834i), java.lang.Boolean.valueOf(e17));
                                            if (j0Var.f414834i <= 0 || e17) {
                                                pVar2.v();
                                                pVar2.u();
                                                pVar2.b(pVar2.f367946d.f377656a, true, 3);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h;
                                                activityC19519x7af4daf3.getClass();
                                                activityC19519x7af4daf3.q7(true, true);
                                                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: mz4.j0$$a
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        mz4.j0 j0Var2 = mz4.j0.this;
                                                        j0Var2.f414835j = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var2.f414833h).J1.p(false);
                                                    }
                                                });
                                            } else {
                                                java.lang.String p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h).J1.p(false);
                                                java.lang.String str4 = F2.f67640x5ab01132.f452505q;
                                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
                                                am.z9 z9Var = c5432x35bb364f.f135776g;
                                                z9Var.f90061a = 19;
                                                r45.bq0 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h).J1.n(p17);
                                                z9Var.f90064d = n17;
                                                if (n17 == null) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
                                                    z17 = false;
                                                } else {
                                                    java.lang.String wi6 = ((a40.i) ((o72.u3) i95.n0.c(o72.u3.class))).wi(str4 != null ? str4 : "");
                                                    z9Var.f90064d.p(wi6);
                                                    j0Var.f414835j = p17;
                                                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                                                    j0Var.f414836k = currentTimeMillis;
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "addNewConflictNote: conflictTitle:%s, favLocalId:%d", wi6, java.lang.Long.valueOf(currentTimeMillis));
                                                    z9Var.f90062b = p17;
                                                    z9Var.f90065e = j0Var.f414836k;
                                                    z9Var.f90063c = "fav_add_new_note";
                                                    c5432x35bb364f.e();
                                                    j0Var.f414838m = false;
                                                    j0Var.f414839n = -1;
                                                    j0Var.f414840o = null;
                                                    j0Var.f414841p = -1L;
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    long j29 = j0Var.f414836k;
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteFavProcess", "changeToNewNote: start, localId=%d", java.lang.Long.valueOf(j29));
                                                    pVar2.f367978u = j29;
                                                    pVar2.v();
                                                    pVar2.u();
                                                    pVar2.b(pVar2.f367946d.f377656a, true, 3);
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.g2 g2Var = j0Var.f414833h;
                                                    long j37 = j0Var.f414836k;
                                                    final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var;
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "notifyNoteConflict: newFavLocalId=%d, oldLocalId=%d", java.lang.Long.valueOf(j37), java.lang.Long.valueOf(activityC19519x7af4daf32.A));
                                                    activityC19519x7af4daf32.A = j37;
                                                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$$b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.f269673e2;
                                                            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf33 = com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.this;
                                                            activityC19519x7af4daf33.getClass();
                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                                            u1Var.g(activityC19519x7af4daf33.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575413ph2));
                                                            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.b0(activityC19519x7af4daf33));
                                                            u1Var.q(false);
                                                        }
                                                    });
                                                } else {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate error, addNewConflictNote fail");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate error, noteBase is null");
                                }
                            }
                        }
                    }
                }
                return false;
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5427x31cc7410(null).e();
            hz4.p pVar3 = new hz4.p();
            pVar3.f367955p = cz4.f.u0(c5773x64e6b625.f136087g);
            pVar3.f367956q = 1;
            ((hz4.f) hz4.f.wi()).f367940d = pVar3;
            int i18 = c5773x64e6b625.f136087g.f90121k;
            if (i18 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_SNS");
                pVar3.f367951i.f367959b = 4;
                am.zl zlVar2 = c5773x64e6b625.f136087g;
                android.content.Context context2 = zlVar2.f90114d;
                r45.bq0 bq0Var2 = zlVar2.f55x5ab01132;
                android.os.Bundle bundle = zlVar2.f90118h;
                boolean z18 = zlVar2.f90122l;
                if (bundle != null) {
                    java.lang.String string = bundle.getString("noteauthor", "");
                    str2 = bundle.getString("noteeditor", "");
                    j17 = bundle.getLong("edittime", 0L);
                    pVar3.f367981x = bundle.getString("snslocalid");
                    pVar3.f367982y = bundle.getString("notexml", "");
                    pVar3.L = bundle.getByteArray("key_multi_task_common_info");
                    pVar3.f367977J = bundle.getString("snsthumbpath", "");
                    pVar3.K = bundle.getString("snsnotelinkxml", "");
                    pVar3.f367983z = bundle.getBoolean("openFormFloatBall", false);
                    pVar3.N = bundle.getString("serverMsgID");
                    pVar3.P = bundle.getString("geta8key_username");
                    str = string;
                } else {
                    j17 = 0;
                    str2 = "";
                }
                pVar3.f367978u = java.lang.System.currentTimeMillis();
                pVar3.C = z18;
                pVar3.f367953n = false;
                pVar3.F = str + ";" + str2 + ";" + j17;
                k82.c.f386420a.c(pVar3.f367978u, 0L, 18, 5, 0);
                pVar3.t(context2, 4);
                gm0.j1.e().j(new hz4.m(pVar3, bq0Var2));
            } else if (i18 != 6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_FAV");
                pVar3.f367951i.f367959b = 1;
                am.zl zlVar3 = c5773x64e6b625.f136087g;
                boolean z19 = zlVar3.f90121k == 5;
                r45.bq0 bq0Var3 = zlVar3.f55x5ab01132;
                if (bq0Var3 != null && (jq0Var = bq0Var3.f452495d) != null) {
                    pVar3.G = jq0Var.f459567d;
                }
                android.os.Bundle bundle2 = zlVar3.f90118h;
                if (bundle2 != null) {
                    pVar3.H = bundle2.getLong("edittime", 0L);
                    pVar3.f367983z = c5773x64e6b625.f136087g.f90118h.getBoolean("openFormFloatBall", false);
                    pVar3.L = c5773x64e6b625.f136087g.f90118h.getByteArray("key_multi_task_common_info");
                    int i19 = c5773x64e6b625.f136087g.f90118h.getInt("favId", 0);
                    pVar3.f367979v = i19;
                    if (i19 == 0) {
                        pVar3.f367979v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(c5773x64e6b625.f136087g.f90118h.getString("favId", "0"), 0);
                    }
                    pVar3.f367980w = c5773x64e6b625.f136087g.f90118h.getInt("favUpdateSeq", 0);
                    int i27 = c5773x64e6b625.f136087g.f90118h.getInt("favSourceType", 0);
                    if (i27 != 0) {
                        pVar3.G = i27;
                    }
                }
                hz4.j jVar = new hz4.j();
                am.zl zlVar4 = c5773x64e6b625.f136087g;
                jVar.f367961a = zlVar4.f56x88be67a1;
                jVar.f367962b = zlVar4.f90114d;
                jVar.f367963c = zlVar4.f90112b;
                jVar.f367964d = java.lang.Boolean.valueOf(zlVar4.f90122l);
                jVar.f367966f = 0;
                am.zl zlVar5 = c5773x64e6b625.f136087g;
                jVar.f367967g = zlVar5.f90123m;
                jVar.f367969i = pVar3.L;
                if (z19) {
                    pVar3.A = true;
                    pVar3.M = true;
                    jVar.f367965e = 0;
                    jVar.f367968h = zlVar5.f55x5ab01132;
                    jVar.f367970j = false;
                } else {
                    jVar.f367965e = zlVar5.f90113c;
                    jVar.f367968h = null;
                    jVar.f367970j = pVar3.f367983z;
                }
                pVar3.x(jVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyWNNoteOperationListener", "OPEN_NOTE_FROM_FAV, actual from MsgRecord.");
                pVar3.f367951i.f367959b = 5;
                android.os.Bundle bundle3 = c5773x64e6b625.f136087g.f90118h;
                if (bundle3 != null) {
                    java.lang.String string2 = bundle3.getString("noteauthor", "");
                    str3 = bundle3.getString("noteeditor", "");
                    j18 = bundle3.getLong("edittime", 0L);
                    pVar3.f367983z = bundle3.getBoolean("openFormFloatBall", false);
                    pVar3.f367982y = bundle3.getString("notexml", "");
                    pVar3.L = bundle3.getByteArray("key_multi_task_common_info");
                    str = string2;
                } else {
                    str3 = "";
                    j18 = 0;
                }
                am.zl zlVar6 = c5773x64e6b625.f136087g;
                pVar3.f367978u = zlVar6.f56x88be67a1;
                pVar3.C = zlVar6.f90122l;
                pVar3.f367953n = false;
                pVar3.F = str + ";" + str3 + ";" + j18;
                if (!pVar3.f367983z) {
                    k82.c.f386420a.c(pVar3.f367978u, 0L, 18, 6, 0);
                }
                if (pVar3.q()) {
                    o72.r2 r2Var = new o72.r2();
                    r2Var.f67645x88be67a1 = pVar3.f367978u;
                    r45.bq0 bq0Var4 = c5773x64e6b625.f136087g.f55x5ab01132;
                    r2Var.f67640x5ab01132 = bq0Var4;
                    pVar3.f367954o = bq0Var4;
                    pVar3.f367947e = r2Var;
                    pVar3.B = r2Var;
                }
                pVar3.t(c5773x64e6b625.f136087g.f90114d, 5);
                gm0.j1.e().j(new hz4.n(pVar3, c5773x64e6b625));
            }
        } else {
            ((hz4.f) hz4.f.wi()).f367940d.p(c5773x64e6b625);
        }
        return false;
    }
}
