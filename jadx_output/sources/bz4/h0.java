package bz4;

/* loaded from: classes12.dex */
public class h0 extends com.tencent.mm.sdk.event.n {
    public h0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        long j18;
        r45.jq0 jq0Var;
        r45.bq0 bq0Var;
        boolean z17;
        com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = (com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent) iEvent;
        am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
        int i17 = zlVar.f8578a;
        if (i17 != 0) {
            str = "";
            if (i17 != 2) {
                if (i17 == 9) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_ADD");
                    hz4.p pVar = new hz4.p();
                    pVar.f286422p = cz4.f.u0(notifyWNNoteOperationEvent.f54554g);
                    pVar.f286423q = 1;
                    pVar.f286445u = notifyWNNoteOperationEvent.f54554g.field_localId;
                    pVar.f286418i.f286426b = 1;
                    ((hz4.f) hz4.f.wi()).f286407d = pVar;
                    android.content.Context context = notifyWNNoteOperationEvent.f54554g.f8581d;
                    pVar.f286420n = true;
                    pVar.t(context, 2);
                } else if (i17 == 10) {
                    hz4.l.h(zlVar.field_localId, zlVar.f8587j);
                } else if (i17 == 12) {
                    new com.tencent.mm.autogen.events.FavNoteSaveEvent(null).e();
                } else if (i17 == 13 && zlVar.field_localId > 0 && o72.d3.f343325e) {
                    if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
                        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(notifyWNNoteOperationEvent.f54554g.field_localId);
                        if (F != null) {
                            r72.k kVar = new r72.k();
                            r72.l.a(kVar, F);
                            java.lang.String xml = kVar.toXml();
                            if (com.tencent.mm.sdk.platformtools.t8.K0(xml)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyWNNoteOperationListener", "onBatchGetUpdate, xml is null, localId=%d", java.lang.Long.valueOf(notifyWNNoteOperationEvent.f54554g.field_localId));
                            } else {
                                com.tencent.wechat.aff.wenote.k.f217694b.g(notifyWNNoteOperationEvent.f54554g.field_localId, xml);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NotifyWNNoteOperationListener", "onBatchGetUpdate, serverItem is null, localId=%d", java.lang.Long.valueOf(notifyWNNoteOperationEvent.f54554g.field_localId));
                        }
                    } else {
                        long j19 = notifyWNNoteOperationEvent.f54554g.field_localId;
                        final mz4.j0 j0Var = mz4.j0.f333290v;
                        if (j0Var != null) {
                            long j27 = j0Var.f333303k;
                            if (j27 != j19) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "onBatchGetUpdate not match to curLocalId=%d, updateLocalId=%d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19));
                            } else {
                                hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
                                if (hVar instanceof hz4.p) {
                                    hz4.p pVar2 = (hz4.p) hVar;
                                    long j28 = pVar2.f286445u;
                                    if (j28 != j19) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate local id not match, processFavLocalID=%d, updateLocalId=%d", java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j19));
                                    } else {
                                        o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j19);
                                        if (F2 == null || (bq0Var = F2.field_favProto) == null) {
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            objArr[0] = java.lang.Boolean.valueOf(F2 == null);
                                            objArr[1] = java.lang.Long.valueOf(j19);
                                            com.tencent.mars.xlog.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate error, serverItem is null=%b, favLocalId=%d", objArr);
                                        } else if (java.util.Objects.equals(bq0Var.R, wo.w0.k())) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "onBatchGetUpdate ignore, is same device, favLocalId=%d", java.lang.Long.valueOf(j19));
                                        } else {
                                            boolean e17 = j0Var.e("onBatchGetUpdate");
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "onBatchGetUpdate favLocalId=%d, editBeginTime=%d, isSameHtmlContent=%b", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j0Var.f333301i), java.lang.Boolean.valueOf(e17));
                                            if (j0Var.f333301i <= 0 || e17) {
                                                pVar2.v();
                                                pVar2.u();
                                                pVar2.b(pVar2.f286413d.f296123a, true, 3);
                                                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
                                                noteEditorUI.getClass();
                                                noteEditorUI.q7(true, true);
                                                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: mz4.j0$$a
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        mz4.j0 j0Var2 = mz4.j0.this;
                                                        j0Var2.f333302j = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var2.f333300h).J1.p(false);
                                                    }
                                                });
                                            } else {
                                                java.lang.String p17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h).J1.p(false);
                                                java.lang.String str4 = F2.field_favProto.f370972q;
                                                com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
                                                am.z9 z9Var = favoriteOperationEvent.f54243g;
                                                z9Var.f8528a = 19;
                                                r45.bq0 n17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h).J1.n(p17);
                                                z9Var.f8531d = n17;
                                                if (n17 == null) {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.Note.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
                                                    z17 = false;
                                                } else {
                                                    java.lang.String wi6 = ((a40.i) ((o72.u3) i95.n0.c(o72.u3.class))).wi(str4 != null ? str4 : "");
                                                    z9Var.f8531d.p(wi6);
                                                    j0Var.f333302j = p17;
                                                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                                                    j0Var.f333303k = currentTimeMillis;
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "addNewConflictNote: conflictTitle:%s, favLocalId:%d", wi6, java.lang.Long.valueOf(currentTimeMillis));
                                                    z9Var.f8529b = p17;
                                                    z9Var.f8532e = j0Var.f333303k;
                                                    z9Var.f8530c = "fav_add_new_note";
                                                    favoriteOperationEvent.e();
                                                    j0Var.f333305m = false;
                                                    j0Var.f333306n = -1;
                                                    j0Var.f333307o = null;
                                                    j0Var.f333308p = -1L;
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    long j29 = j0Var.f333303k;
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteFavProcess", "changeToNewNote: start, localId=%d", java.lang.Long.valueOf(j29));
                                                    pVar2.f286445u = j29;
                                                    pVar2.v();
                                                    pVar2.u();
                                                    pVar2.b(pVar2.f286413d.f296123a, true, 3);
                                                    com.tencent.mm.plugin.wenote.ui.nativenote.g2 g2Var = j0Var.f333300h;
                                                    long j37 = j0Var.f333303k;
                                                    final com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var;
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "notifyNoteConflict: newFavLocalId=%d, oldLocalId=%d", java.lang.Long.valueOf(j37), java.lang.Long.valueOf(noteEditorUI2.A));
                                                    noteEditorUI2.A = j37;
                                                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$$b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i18 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
                                                            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI3 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.this;
                                                            noteEditorUI3.getClass();
                                                            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                                            u1Var.g(noteEditorUI3.getString(com.tencent.mm.R.string.f493880ph2));
                                                            u1Var.l(new com.tencent.mm.plugin.wenote.ui.nativenote.b0(noteEditorUI3));
                                                            u1Var.q(false);
                                                        }
                                                    });
                                                } else {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate error, addNewConflictNote fail");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.Note.WXRTManager", "onBatchGetUpdate error, noteBase is null");
                                }
                            }
                        }
                    }
                }
                return false;
            }
            new com.tencent.mm.autogen.events.FavNoteSaveEvent(null).e();
            hz4.p pVar3 = new hz4.p();
            pVar3.f286422p = cz4.f.u0(notifyWNNoteOperationEvent.f54554g);
            pVar3.f286423q = 1;
            ((hz4.f) hz4.f.wi()).f286407d = pVar3;
            int i18 = notifyWNNoteOperationEvent.f54554g.f8588k;
            if (i18 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_SNS");
                pVar3.f286418i.f286426b = 4;
                am.zl zlVar2 = notifyWNNoteOperationEvent.f54554g;
                android.content.Context context2 = zlVar2.f8581d;
                r45.bq0 bq0Var2 = zlVar2.field_favProto;
                android.os.Bundle bundle = zlVar2.f8585h;
                boolean z18 = zlVar2.f8589l;
                if (bundle != null) {
                    java.lang.String string = bundle.getString("noteauthor", "");
                    str2 = bundle.getString("noteeditor", "");
                    j17 = bundle.getLong("edittime", 0L);
                    pVar3.f286448x = bundle.getString("snslocalid");
                    pVar3.f286449y = bundle.getString("notexml", "");
                    pVar3.L = bundle.getByteArray("key_multi_task_common_info");
                    pVar3.f286444J = bundle.getString("snsthumbpath", "");
                    pVar3.K = bundle.getString("snsnotelinkxml", "");
                    pVar3.f286450z = bundle.getBoolean("openFormFloatBall", false);
                    pVar3.N = bundle.getString("serverMsgID");
                    pVar3.P = bundle.getString("geta8key_username");
                    str = string;
                } else {
                    j17 = 0;
                    str2 = "";
                }
                pVar3.f286445u = java.lang.System.currentTimeMillis();
                pVar3.C = z18;
                pVar3.f286420n = false;
                pVar3.F = str + ";" + str2 + ";" + j17;
                k82.c.f304887a.c(pVar3.f286445u, 0L, 18, 5, 0);
                pVar3.t(context2, 4);
                gm0.j1.e().j(new hz4.m(pVar3, bq0Var2));
            } else if (i18 != 6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_FAV");
                pVar3.f286418i.f286426b = 1;
                am.zl zlVar3 = notifyWNNoteOperationEvent.f54554g;
                boolean z19 = zlVar3.f8588k == 5;
                r45.bq0 bq0Var3 = zlVar3.field_favProto;
                if (bq0Var3 != null && (jq0Var = bq0Var3.f370962d) != null) {
                    pVar3.G = jq0Var.f378034d;
                }
                android.os.Bundle bundle2 = zlVar3.f8585h;
                if (bundle2 != null) {
                    pVar3.H = bundle2.getLong("edittime", 0L);
                    pVar3.f286450z = notifyWNNoteOperationEvent.f54554g.f8585h.getBoolean("openFormFloatBall", false);
                    pVar3.L = notifyWNNoteOperationEvent.f54554g.f8585h.getByteArray("key_multi_task_common_info");
                    int i19 = notifyWNNoteOperationEvent.f54554g.f8585h.getInt("favId", 0);
                    pVar3.f286446v = i19;
                    if (i19 == 0) {
                        pVar3.f286446v = com.tencent.mm.sdk.platformtools.t8.D1(notifyWNNoteOperationEvent.f54554g.f8585h.getString("favId", "0"), 0);
                    }
                    pVar3.f286447w = notifyWNNoteOperationEvent.f54554g.f8585h.getInt("favUpdateSeq", 0);
                    int i27 = notifyWNNoteOperationEvent.f54554g.f8585h.getInt("favSourceType", 0);
                    if (i27 != 0) {
                        pVar3.G = i27;
                    }
                }
                hz4.j jVar = new hz4.j();
                am.zl zlVar4 = notifyWNNoteOperationEvent.f54554g;
                jVar.f286428a = zlVar4.field_localId;
                jVar.f286429b = zlVar4.f8581d;
                jVar.f286430c = zlVar4.f8579b;
                jVar.f286431d = java.lang.Boolean.valueOf(zlVar4.f8589l);
                jVar.f286433f = 0;
                am.zl zlVar5 = notifyWNNoteOperationEvent.f54554g;
                jVar.f286434g = zlVar5.f8590m;
                jVar.f286436i = pVar3.L;
                if (z19) {
                    pVar3.A = true;
                    pVar3.M = true;
                    jVar.f286432e = 0;
                    jVar.f286435h = zlVar5.field_favProto;
                    jVar.f286437j = false;
                } else {
                    jVar.f286432e = zlVar5.f8580c;
                    jVar.f286435h = null;
                    jVar.f286437j = pVar3.f286450z;
                }
                pVar3.x(jVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyWNNoteOperationListener", "OPEN_NOTE_FROM_FAV, actual from MsgRecord.");
                pVar3.f286418i.f286426b = 5;
                android.os.Bundle bundle3 = notifyWNNoteOperationEvent.f54554g.f8585h;
                if (bundle3 != null) {
                    java.lang.String string2 = bundle3.getString("noteauthor", "");
                    str3 = bundle3.getString("noteeditor", "");
                    j18 = bundle3.getLong("edittime", 0L);
                    pVar3.f286450z = bundle3.getBoolean("openFormFloatBall", false);
                    pVar3.f286449y = bundle3.getString("notexml", "");
                    pVar3.L = bundle3.getByteArray("key_multi_task_common_info");
                    str = string2;
                } else {
                    str3 = "";
                    j18 = 0;
                }
                am.zl zlVar6 = notifyWNNoteOperationEvent.f54554g;
                pVar3.f286445u = zlVar6.field_localId;
                pVar3.C = zlVar6.f8589l;
                pVar3.f286420n = false;
                pVar3.F = str + ";" + str3 + ";" + j18;
                if (!pVar3.f286450z) {
                    k82.c.f304887a.c(pVar3.f286445u, 0L, 18, 6, 0);
                }
                if (pVar3.q()) {
                    o72.r2 r2Var = new o72.r2();
                    r2Var.field_localId = pVar3.f286445u;
                    r45.bq0 bq0Var4 = notifyWNNoteOperationEvent.f54554g.field_favProto;
                    r2Var.field_favProto = bq0Var4;
                    pVar3.f286421o = bq0Var4;
                    pVar3.f286414e = r2Var;
                    pVar3.B = r2Var;
                }
                pVar3.t(notifyWNNoteOperationEvent.f54554g.f8581d, 5);
                gm0.j1.e().j(new hz4.n(pVar3, notifyWNNoteOperationEvent));
            }
        } else {
            ((hz4.f) hz4.f.wi()).f286407d.p(notifyWNNoteOperationEvent);
        }
        return false;
    }
}
