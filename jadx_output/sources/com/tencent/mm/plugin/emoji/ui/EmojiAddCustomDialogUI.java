package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class EmojiAddCustomDialogUI extends com.tencent.mm.ui.MMBaseActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int L = 0;
    public java.lang.Boolean A;
    public java.lang.Boolean B;
    public java.lang.Boolean C;
    public java.lang.Boolean D;
    public int E;
    public java.util.Queue H;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f97666e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97667f;

    /* renamed from: g, reason: collision with root package name */
    public int f97668g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f97669h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f97670i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f97671m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f97672n;

    /* renamed from: o, reason: collision with root package name */
    public qr.l f97673o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f97674p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f97675q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f97676r;

    /* renamed from: s, reason: collision with root package name */
    public im5.c f97677s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f97678t;

    /* renamed from: u, reason: collision with root package name */
    public int f97679u;

    /* renamed from: v, reason: collision with root package name */
    public r45.uu6 f97680v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f97681w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f97682x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f97683y;

    /* renamed from: z, reason: collision with root package name */
    public r45.sj0 f97684z;
    public int F = 0;
    public boolean G = false;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedHashMap f97665J = new java.util.LinkedHashMap();
    public final java.lang.Runnable K = new com.tencent.mm.plugin.emoji.ui.h(this);

    public static void O6(final com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI, final java.lang.String str, r45.ri0 ri0Var, final java.lang.String str2, final java.lang.String str3) {
        boolean z17;
        if (str != null && !str.equals(emojiAddCustomDialogUI.f97671m.getMd5())) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            emojiAddCustomDialogUI.f97671m = com.tencent.mm.storage.n5.f().c().u1(str);
        }
        if (ri0Var != null) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emojiAddCustomDialogUI.f97671m;
            long j17 = emojiInfo.field_emojiFlag;
            n22.m.a(ri0Var, emojiInfo);
            emojiAddCustomDialogUI.f97671m.field_emojiFlag = j17;
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiAddCustomDialogUI", "update emoji info for %s", str);
            z17 = true;
        } else {
            z17 = false;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = emojiAddCustomDialogUI.f97671m;
        int i17 = emojiInfo2.field_catalog;
        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        if (i17 != 81) {
            emojiInfo2.field_catalog = 81;
            wq.a.f().d(emojiAddCustomDialogUI.f97671m, false);
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            emojiAddCustomDialogUI.f97671m.field_reserved3 = com.tencent.mm.storage.n5.f().c().z1() + 1;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97668g);
            java.lang.String md52 = emojiAddCustomDialogUI.f97671m.getMd5();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = emojiAddCustomDialogUI.f97671m;
            g0Var.d(10431, valueOf, md52, emojiInfo3.field_designerID, emojiInfo3.field_groupId, 0, 0, java.lang.Integer.valueOf(emojiAddCustomDialogUI.f97671m.field_size), emojiAddCustomDialogUI.f97669h, emojiAddCustomDialogUI.f97671m.field_activityid, emojiAddCustomDialogUI.f97670i, emojiAddCustomDialogUI.V6(), "");
            z17 = true;
        }
        if (z17) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().G2(emojiAddCustomDialogUI.f97671m);
        }
        if (emojiAddCustomDialogUI.f97667f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(emojiAddCustomDialogUI.f97671m.getMd5());
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().y2(0, arrayList);
        }
        if (com.tencent.mm.storage.h5.f195006d.Ai()) {
            com.tencent.mm.smiley.c0 c0Var = com.tencent.mm.smiley.c0.f193225a;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "restart");
            c0Var.e(com.tencent.mm.smiley.v.f193398d);
        } else if (!android.text.TextUtils.isEmpty(emojiAddCustomDialogUI.f97671m.field_meanings)) {
            com.tencent.mm.storage.z4 z4Var = com.tencent.mm.storage.z4.f196391j;
            if (z4Var.e()) {
                z4Var.g();
            }
        }
        java.lang.String h07 = emojiAddCustomDialogUI.f97671m.h0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiAddCustomDialogUI.f97671m.field_thumbUrl) && !com.tencent.mm.vfs.w6.j(h07)) {
            o11.f fVar = new o11.f();
            fVar.f342082f = h07;
            fVar.f342078b = true;
            fVar.f342077a = false;
            n11.a.b().h(emojiAddCustomDialogUI.f97671m.field_thumbUrl, null, fVar.a());
        }
        com.tencent.mm.autogen.events.EmojiUpdatePanelEvent emojiUpdatePanelEvent = new com.tencent.mm.autogen.events.EmojiUpdatePanelEvent();
        emojiUpdatePanelEvent.f54105g.f7799a = 1;
        emojiUpdatePanelEvent.e();
        if (!emojiUpdatePanelEvent.f54106h.f7869a) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            r45.x66 D0 = com.tencent.mm.storage.n5.f().e().D0();
            if (D0 != null) {
                java.util.Iterator it = D0.f389834d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.y66 y66Var = (r45.y66) it.next();
                    if (y66Var.f390827d.equals(java.lang.String.valueOf(18))) {
                        y66Var.f390828e = 0;
                        break;
                    }
                }
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().e().L0(D0);
            h65.c.f279320b.a(-29414086, java.lang.String.valueOf(18));
        }
        if (emojiAddCustomDialogUI.G) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch upload success md5=" + emojiAddCustomDialogUI.f97666e + "gifMd5=" + emojiAddCustomDialogUI.f97671m.getMd5());
            emojiAddCustomDialogUI.f97665J.put(emojiAddCustomDialogUI.f97666e, 1);
            emojiAddCustomDialogUI.W6();
            return;
        }
        int i18 = emojiAddCustomDialogUI.F;
        if (i18 != 0) {
            n22.c.c(6, i18, 1, 0);
        }
        emojiAddCustomDialogUI.R6();
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI2 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.this;
                if (!emojiAddCustomDialogUI2.B.booleanValue()) {
                    db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, emojiAddCustomDialogUI2.getString(com.tencent.mm.R.string.byc));
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("extra_id", str);
                intent.putExtra("activityId", emojiAddCustomDialogUI2.f97671m.field_activityid);
                intent.putExtra("extra_md5", emojiAddCustomDialogUI2.f97671m.getMd5());
                intent.putExtra("upload_token", str2);
                intent.putExtra("upload_file_url", str3);
                emojiAddCustomDialogUI2.setResult(-1, intent);
                emojiAddCustomDialogUI2.finish();
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 300L, false);
    }

    public static void P6(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        if (emojiAddCustomDialogUI.isFinishing()) {
            return;
        }
        android.content.Context context = emojiAddCustomDialogUI.f97674p;
        db5.e1.y(context, context.getString(com.tencent.mm.R.string.bvl), "", emojiAddCustomDialogUI.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.emoji.ui.o(emojiAddCustomDialogUI));
    }

    public final void Q6(final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error." + str);
        if (this.G) {
            this.I++;
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch mode: fail count=" + this.I + ", md5=" + this.f97666e);
            W6();
            return;
        }
        int i17 = this.F;
        if (i17 != 0) {
            n22.c.c(6, i17, 0, 1);
        }
        R6();
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$d
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.L;
                com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.this;
                emojiAddCustomDialogUI.getClass();
                java.lang.String str2 = str;
                if (android.text.TextUtils.isEmpty(str2)) {
                    db5.e1.T(emojiAddCustomDialogUI.f97674p, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.buj));
                } else {
                    db5.e1.T(emojiAddCustomDialogUI.f97674p, str2);
                }
            }
        });
        if (this.f97671m != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f97668g);
            java.lang.String md52 = this.f97671m.getMd5();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f97671m;
            g0Var.d(10431, valueOf, md52, emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 3, java.lang.Integer.valueOf(this.f97671m.field_size), this.f97669h, this.f97671m.field_activityid, this.f97670i, V6(), "");
        }
        setResult(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "dealSaveFailed finish");
        finish();
    }

    public void R6() {
        com.tencent.mm.sdk.platformtools.u3.l(this.K);
        android.app.ProgressDialog progressDialog = this.f97675q;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f97675q.dismiss();
    }

    public final void S6(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji start.do NetSceneBackupEmojiOperate");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(emojiInfo.getMd5());
        pr.b bVar = new pr.b(0, 4, arrayList);
        bVar.f70649i = true;
        bVar.l().f(this.f97677s).h(new com.tencent.mm.plugin.emoji.ui.i(this, emojiInfo));
    }

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "emoji exits do move " + this.f97671m.getMd5());
        z12.g gVar = new z12.g(0, 3, java.util.Arrays.asList(this.f97671m.getMd5()), null);
        gm0.j1.n().f273288b.a(698, this);
        gm0.j1.n().f273288b.g(gVar);
    }

    public final void U6(r45.ri0 ri0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "start upload emoji");
        qr.l lVar = this.f97673o;
        if (lVar != null) {
            lVar.f366023e = null;
        }
        ck5.c cVar = new ck5.c(this.f97671m.N0());
        cVar.f42550b = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).L(this.f97671m, this.f97672n);
        int c17 = ip.c.c();
        cVar.f42551c = c17;
        cVar.f42552d = c17;
        cVar.a(new com.tencent.mm.plugin.emoji.ui.k(this, ri0Var));
    }

    public final java.lang.String V6() {
        java.lang.String str = this.f97682x;
        if (str != null && !str.isEmpty()) {
            return this.f97682x;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f97681w;
        return finderObject == null ? "" : pm0.v.u(finderObject.getId());
    }

    public final void W6() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        int i17;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        java.util.Queue queue = this.H;
        boolean z17 = false;
        if (queue != null && !queue.isEmpty()) {
            this.f97666e = (java.lang.String) this.H.poll();
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch: processing next md5=" + this.f97666e + ", remaining=" + this.H.size());
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = com.tencent.mm.storage.n5.f().c().u1(this.f97666e);
            this.f97671m = emojiInfo;
            if (emojiInfo != null) {
                kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
                java.util.Iterator it = ((java.util.ArrayList) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().o1(false)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).getMd5().equals(emojiInfo.getMd5())) {
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    T6();
                    return;
                }
            }
            X6(this.f97674p, this.f97671m, this.f97668g);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch upload, fail count " + this.I);
        java.lang.String stringExtra = getIntent().getStringExtra("addstickers_sessionid");
        if (!android.text.TextUtils.isEmpty(stringExtra) && (stringArrayListExtra = getIntent().getStringArrayListExtra("extra_id_list")) != null && !stringArrayListExtra.isEmpty()) {
            int size = stringArrayListExtra.size();
            int i18 = this.I;
            java.lang.String str = i18 > 0 ? "upload_failed" : "upload_succ";
            if (size >= i18 && (i17 = this.F) != 0) {
                n22.c.c(6, i17, size - i18, i18);
            }
            int intExtra = getIntent().getIntExtra("extra_edit_sticker_source", 1);
            int[] intArrayExtra = getIntent().getIntArrayExtra("extra_edit_sticker_types");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            while (i19 < size) {
                int i27 = (intArrayExtra == null || i19 >= intArrayExtra.length) ? 1 : intArrayExtra[i19];
                java.lang.Integer num = (java.lang.Integer) this.f97665J.get(stringArrayListExtra.get(i19));
                i19++;
                arrayList.add(new or.a(i19, intExtra, i27, java.lang.Integer.valueOf(num != null ? num.intValue() : 0)));
            }
            or.d.a(stringExtra, 7, intExtra, java.lang.Integer.valueOf((intArrayExtra == null || intArrayExtra.length <= 0) ? 0 : intArrayExtra[0]), 20, or.c.a(str, stringExtra, java.lang.Integer.valueOf(size), or.c.d(arrayList)));
        }
        if (!isFinishing() && !isDestroyed()) {
            R6();
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.this;
                int i28 = emojiAddCustomDialogUI.I;
                if (i28 > 0) {
                    db5.e1.F(emojiAddCustomDialogUI.f97674p, "", emojiAddCustomDialogUI.getString(com.tencent.mm.R.string.obw, java.lang.Integer.valueOf(i28)), true).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$e
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            int i29 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.L;
                            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI2 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.this;
                            emojiAddCustomDialogUI2.setResult(0);
                            emojiAddCustomDialogUI2.finish();
                        }
                    });
                    return;
                }
                db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, emojiAddCustomDialogUI.getString(com.tencent.mm.R.string.byc));
                emojiAddCustomDialogUI.setResult(-1);
                emojiAddCustomDialogUI.finish();
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 300L, false);
    }

    public boolean X6(android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, int i17) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. context is null");
            return false;
        }
        if (emojiInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. emoji is null");
            Q6("");
            return false;
        }
        gr.v vVar = gr.v.f274696a;
        vVar.a(false);
        if (vVar.b().getBoolean("custom_full", false) && !this.A.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. over max size.");
            if (this.G) {
                this.I++;
                W6();
            } else {
                R6();
                Z6(null);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f97668g);
            java.lang.String md52 = this.f97671m.getMd5();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f97671m;
            g0Var.d(10431, valueOf, md52, emojiInfo2.field_designerID, emojiInfo2.field_groupId, 1, 1, java.lang.Integer.valueOf(this.f97671m.field_size), this.f97669h, this.f97671m.field_activityid, this.f97670i, V6(), "");
            return false;
        }
        if (!n22.m.k(emojiInfo) && !n22.m.j(emojiInfo) && !com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_groupId)) {
            if (!((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(emojiInfo.field_groupId) && !emojiInfo.k()) {
                gm0.j1.n().f273288b.g(new z12.l(emojiInfo.field_groupId, null, "", null, null, null, 0, 1, 0, null));
                return true;
            }
        }
        if (java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.y1.g(emojiInfo.N0())).booleanValue() && this.D.booleanValue()) {
            U6(null);
        } else {
            S6(emojiInfo);
        }
        return true;
    }

    public final void Y6(java.lang.String str) {
        if (isFinishing()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 F = db5.e1.F(this, str, "", true);
        this.f97676r = F;
        F.setOnDismissListener(new com.tencent.mm.plugin.emoji.ui.q(this));
    }

    public final void Z6(java.lang.String str) {
        if (str != null && !str.equals(this.f97671m.getMd5())) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            this.f97671m = com.tencent.mm.storage.n5.f().c().u1(str);
        }
        if (isFinishing()) {
            return;
        }
        if (!this.C.booleanValue()) {
            n22.c.a(4);
            com.tencent.mm.ui.widget.dialog.j0 j17 = db5.e1.j(this.f97674p, com.tencent.mm.R.string.c0g, com.tencent.mm.R.string.f490386tj, com.tencent.mm.R.string.byz, com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.emoji.ui.l(this), new com.tencent.mm.plugin.emoji.ui.m(this));
            if (j17 != null) {
                j17.setOnDismissListener(new com.tencent.mm.plugin.emoji.ui.n(this));
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_id", str);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f97671m;
        if (emojiInfo != null) {
            intent.putExtra("activityId", emojiInfo.field_activityid);
        }
        setResult(1, intent);
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra;
        byte[] byteArrayExtra2;
        boolean z17 = true;
        requestWindowFeature(1);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        this.f97674p = this;
        this.f97677s = new im5.c();
        this.f97666e = getIntent().getStringExtra("extra_id");
        this.f97668g = getIntent().getIntExtra("extra_scence", -1);
        this.f97670i = getIntent().getStringExtra("EXTRA_SESSION_ID");
        this.f97669h = getIntent().getStringExtra("extra_username");
        if (getIntent().getBooleanExtra("extra_current", false) && this.f97669h == null) {
            this.f97669h = c01.z1.r();
        }
        this.f97667f = getIntent().getBooleanExtra("extra_move_to_top", true);
        this.f97672n = getIntent().getBooleanExtra("key_is_selfie", false);
        this.f97678t = getIntent().getStringArrayListExtra("extra_wordings");
        this.E = getIntent().getIntExtra("query_source_type", -1);
        this.f97679u = getIntent().getIntExtra("extra_upload_scene", 0);
        this.F = getIntent().getIntExtra("key_from_scene", 0);
        if (getIntent().hasExtra("finder_object_bytes")) {
            byte[] byteArrayExtra3 = getIntent().getByteArrayExtra("finder_object_bytes");
            com.tencent.mm.protocal.protobuf.FinderObject create = com.tencent.mm.protocal.protobuf.FinderObject.create();
            this.f97681w = create;
            try {
                create.parseFrom(byteArrayExtra3);
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        this.f97682x = getIntent().getStringExtra("feedId");
        if (getIntent().hasExtra("extra_finder_info") && (byteArrayExtra2 = getIntent().getByteArrayExtra("extra_finder_info")) != null) {
            try {
                r45.uu6 uu6Var = new r45.uu6();
                this.f97680v = uu6Var;
                uu6Var.parseFrom(byteArrayExtra2);
            } catch (java.io.IOException unused) {
                this.f97680v = null;
            }
        }
        this.f97683y = getIntent().getStringArrayListExtra("extra_meanings");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_id_list");
        this.G = getIntent().getBooleanExtra("enable_multi_upload", false);
        this.I = getIntent().getIntExtra("multi_upload_fail_count", 0);
        if (this.G) {
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 1) {
                java.util.LinkedList linkedList = new java.util.LinkedList(stringArrayListExtra);
                this.H = linkedList;
                this.f97666e = (java.lang.String) linkedList.poll();
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    this.f97665J.put(it.next(), 0);
                }
            } else if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
                this.f97666e = stringArrayListExtra.get(0);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f97666e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "md5 is null.");
            setResult(0);
            finish();
        }
        if (getIntent().hasExtra("upload_finder_link_info") && (byteArrayExtra = getIntent().getByteArrayExtra("upload_finder_link_info")) != null) {
            try {
                r45.sj0 sj0Var = new r45.sj0();
                this.f97684z = sj0Var;
                sj0Var.parseFrom(byteArrayExtra);
            } catch (java.io.IOException unused2) {
                this.f97684z = null;
            }
        }
        this.D = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("is_upload_wxam", false));
        this.A = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("allow_add_exceed_limit", false));
        this.B = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("hide_added_toast", false));
        this.C = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("hide_exceed_limit_hint", false));
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = com.tencent.mm.storage.n5.f().c().u1(this.f97666e);
        this.f97671m = emojiInfo;
        java.lang.Runnable runnable = this.K;
        if (emojiInfo != null) {
            kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
            java.util.Iterator it6 = ((java.util.ArrayList) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().o1(false)).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z17 = false;
                    break;
                } else if (((com.tencent.mm.storage.emotion.EmojiInfo) it6.next()).getMd5().equals(emojiInfo.getMd5())) {
                    break;
                }
            }
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.i(runnable, 300L);
                T6();
                return;
            }
        }
        gm0.j1.n().f273288b.a(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 300L);
        X6(this.f97674p, this.f97671m, this.f97668g);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
        gm0.j1.n().f273288b.q(698, this);
        com.tencent.mm.sdk.platformtools.u3.l(this.K);
        super.onDestroy();
        this.f97677s.dead();
        qr.l lVar = this.f97673o;
        if (lVar != null) {
            lVar.f366023e = null;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        int type = m1Var.getType();
        if (type == 698) {
            if (m1Var instanceof z12.g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "add backup %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 != 0 || i18 != 0) {
                    Q6("");
                    return;
                }
                gr.t.g().n(true);
                gr.t.g().l(true);
                com.tencent.mm.storage.n5.f().c().y2(0, java.util.Arrays.asList(this.f97671m.getMd5()));
                com.tencent.mm.storage.z4.f196391j.g();
                if (this.G) {
                    this.f97665J.put(this.f97666e, 1);
                    W6();
                    return;
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.this;
                        if (!emojiAddCustomDialogUI.B.booleanValue()) {
                            db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, emojiAddCustomDialogUI.getString(com.tencent.mm.R.string.byc));
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("extra_id", emojiAddCustomDialogUI.f97671m.getMd5());
                        intent.putExtra("activityId", emojiAddCustomDialogUI.f97671m.field_activityid);
                        emojiAddCustomDialogUI.setResult(-1, intent);
                        emojiAddCustomDialogUI.finish();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 300L, false);
                return;
            }
            return;
        }
        if (type == 423 && (m1Var instanceof z12.l)) {
            z12.l lVar = (z12.l) m1Var;
            if (com.tencent.mm.sdk.platformtools.t8.K0(lVar.f469320f) || (emojiInfo = this.f97671m) == null || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_groupId) || !this.f97671m.field_groupId.equalsIgnoreCase(lVar.f469320f)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "no the same product ID");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                S6(this.f97671m);
                return;
            }
            if (this.G) {
                this.I++;
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch exchange fail: errCode=" + i18 + ", md5=" + this.f97666e);
                W6();
                return;
            }
            if (i18 == 4) {
                R6();
                if (this.f97668g != 0) {
                    Y6(getString(com.tencent.mm.R.string.bun));
                    return;
                }
                java.lang.String str2 = this.f97671m.field_groupId;
                if (isFinishing()) {
                    return;
                }
                com.tencent.mm.ui.widget.dialog.j0 F = db5.e1.F(this, getString(com.tencent.mm.R.string.bun), "", true);
                this.f97676r = F;
                F.u(com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.emoji.ui.f(this));
                this.f97676r.z(com.tencent.mm.R.string.bup, new com.tencent.mm.plugin.emoji.ui.g(this, str2));
                return;
            }
            if (i18 == 8) {
                R6();
                Y6(getString(com.tencent.mm.R.string.bum));
            } else if (i18 == 9) {
                R6();
                Y6(getString(com.tencent.mm.R.string.bul));
            } else if (i18 == -2) {
                R6();
                Y6(getString(com.tencent.mm.R.string.buo));
            } else {
                R6();
                Y6(getString(com.tencent.mm.R.string.buj));
            }
        }
    }
}
