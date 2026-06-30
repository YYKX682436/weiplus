package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI */
/* loaded from: classes12.dex */
public class ActivityC13272x96cd1be8 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int L = 0;
    public java.lang.Boolean A;
    public java.lang.Boolean B;
    public java.lang.Boolean C;
    public java.lang.Boolean D;
    public int E;
    public java.util.Queue H;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179199e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f179200f;

    /* renamed from: g, reason: collision with root package name */
    public int f179201g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179202h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179203i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f179204m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f179205n;

    /* renamed from: o, reason: collision with root package name */
    public qr.l f179206o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f179207p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f179208q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f179209r;

    /* renamed from: s, reason: collision with root package name */
    public im5.c f179210s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f179211t;

    /* renamed from: u, reason: collision with root package name */
    public int f179212u;

    /* renamed from: v, reason: collision with root package name */
    public r45.uu6 f179213v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f179214w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f179215x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f179216y;

    /* renamed from: z, reason: collision with root package name */
    public r45.sj0 f179217z;
    public int F = 0;
    public boolean G = false;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedHashMap f179198J = new java.util.LinkedHashMap();
    public final java.lang.Runnable K = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h(this);

    public static void O6(final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8, final java.lang.String str, r45.ri0 ri0Var, final java.lang.String str2, final java.lang.String str3) {
        boolean z17;
        if (str != null && !str.equals(activityC13272x96cd1be8.f179204m.mo42933xb5885648())) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            activityC13272x96cd1be8.f179204m = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(str);
        }
        if (ri0Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = activityC13272x96cd1be8.f179204m;
            long j17 = c21053xdbf1e5f4.f68658xff1c8bcd;
            n22.m.a(ri0Var, c21053xdbf1e5f4);
            activityC13272x96cd1be8.f179204m.f68658xff1c8bcd = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiAddCustomDialogUI", "update emoji info for %s", str);
            z17 = true;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = activityC13272x96cd1be8.f179204m;
        int i17 = c21053xdbf1e5f42.f68653x95b20dd4;
        l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
        if (i17 != 81) {
            c21053xdbf1e5f42.f68653x95b20dd4 = 81;
            wq.a.f().d(activityC13272x96cd1be8.f179204m, false);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            activityC13272x96cd1be8.f179204m.f68677x13320506 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().z1() + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC13272x96cd1be8.f179201g);
            java.lang.String mo42933xb5885648 = activityC13272x96cd1be8.f179204m.mo42933xb5885648();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f43 = activityC13272x96cd1be8.f179204m;
            g0Var.d(10431, valueOf, mo42933xb5885648, c21053xdbf1e5f43.f68657xb76d85ab, c21053xdbf1e5f43.f68663x861009b5, 0, 0, java.lang.Integer.valueOf(activityC13272x96cd1be8.f179204m.f68679x22618426), activityC13272x96cd1be8.f179202h, activityC13272x96cd1be8.f179204m.f68641x3342accf, activityC13272x96cd1be8.f179203i, activityC13272x96cd1be8.V6(), "");
            z17 = true;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(activityC13272x96cd1be8.f179204m);
        }
        if (activityC13272x96cd1be8.f179200f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(activityC13272x96cd1be8.f179204m.mo42933xb5885648());
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().y2(0, arrayList);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ai()) {
            com.p314xaae8f345.mm.p2614xca6eae71.c0 c0Var = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "restart");
            c0Var.e(com.p314xaae8f345.mm.p2614xca6eae71.v.f274931d);
        } else if (!android.text.TextUtils.isEmpty(activityC13272x96cd1be8.f179204m.f68672xe33e17bb)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z4 z4Var = com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j;
            if (z4Var.e()) {
                z4Var.g();
            }
        }
        java.lang.String h07 = activityC13272x96cd1be8.f179204m.h0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13272x96cd1be8.f179204m.f68686x7b284d5e) && !com.p314xaae8f345.mm.vfs.w6.j(h07)) {
            o11.f fVar = new o11.f();
            fVar.f423615f = h07;
            fVar.f423611b = true;
            fVar.f423610a = false;
            n11.a.b().h(activityC13272x96cd1be8.f179204m.f68686x7b284d5e, null, fVar.a());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5 c5326x794c50e5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5();
        c5326x794c50e5.f135638g.f89332a = 1;
        c5326x794c50e5.e();
        if (!c5326x794c50e5.f135639h.f89402a) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            r45.x66 D0 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().D0();
            if (D0 != null) {
                java.util.Iterator it = D0.f471367d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.y66 y66Var = (r45.y66) it.next();
                    if (y66Var.f472360d.equals(java.lang.String.valueOf(18))) {
                        y66Var.f472361e = 0;
                        break;
                    }
                }
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().L0(D0);
            h65.c.f360853b.a(-29414086, java.lang.String.valueOf(18));
        }
        if (activityC13272x96cd1be8.G) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch upload success md5=" + activityC13272x96cd1be8.f179199e + "gifMd5=" + activityC13272x96cd1be8.f179204m.mo42933xb5885648());
            activityC13272x96cd1be8.f179198J.put(activityC13272x96cd1be8.f179199e, 1);
            activityC13272x96cd1be8.W6();
            return;
        }
        int i18 = activityC13272x96cd1be8.F;
        if (i18 != 0) {
            n22.c.c(6, i18, 1, 0);
        }
        activityC13272x96cd1be8.R6();
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be82 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.this;
                if (!activityC13272x96cd1be82.B.booleanValue()) {
                    db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, activityC13272x96cd1be82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byc));
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("extra_id", str);
                intent.putExtra("activityId", activityC13272x96cd1be82.f179204m.f68641x3342accf);
                intent.putExtra("extra_md5", activityC13272x96cd1be82.f179204m.mo42933xb5885648());
                intent.putExtra("upload_token", str2);
                intent.putExtra("upload_file_url", str3);
                activityC13272x96cd1be82.setResult(-1, intent);
                activityC13272x96cd1be82.finish();
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 300L, false);
    }

    public static void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8) {
        if (activityC13272x96cd1be8.isFinishing()) {
            return;
        }
        android.content.Context context = activityC13272x96cd1be8.f179207p;
        db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvl), "", activityC13272x96cd1be8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o(activityC13272x96cd1be8));
    }

    public final void Q6(final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error." + str);
        if (this.G) {
            this.I++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch mode: fail count=" + this.I + ", md5=" + this.f179199e);
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
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.L;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.this;
                activityC13272x96cd1be8.getClass();
                java.lang.String str2 = str;
                if (android.text.TextUtils.isEmpty(str2)) {
                    db5.e1.T(activityC13272x96cd1be8.f179207p, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buj));
                } else {
                    db5.e1.T(activityC13272x96cd1be8.f179207p, str2);
                }
            }
        });
        if (this.f179204m != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f179201g);
            java.lang.String mo42933xb5885648 = this.f179204m.mo42933xb5885648();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f179204m;
            g0Var.d(10431, valueOf, mo42933xb5885648, c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 1, 3, java.lang.Integer.valueOf(this.f179204m.f68679x22618426), this.f179202h, this.f179204m.f68641x3342accf, this.f179203i, V6(), "");
        }
        setResult(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "dealSaveFailed finish");
        finish();
    }

    public void R6() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.K);
        android.app.ProgressDialog progressDialog = this.f179208q;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f179208q.dismiss();
    }

    public final void S6(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji start.do NetSceneBackupEmojiOperate");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c21053xdbf1e5f4.mo42933xb5885648());
        pr.b bVar = new pr.b(0, 4, arrayList);
        bVar.f152182i = true;
        bVar.l().f(this.f179210s).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i(this, c21053xdbf1e5f4));
    }

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "emoji exits do move " + this.f179204m.mo42933xb5885648());
        z12.g gVar = new z12.g(0, 3, java.util.Arrays.asList(this.f179204m.mo42933xb5885648()), null);
        gm0.j1.n().f354821b.a(698, this);
        gm0.j1.n().f354821b.g(gVar);
    }

    public final void U6(r45.ri0 ri0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "start upload emoji");
        qr.l lVar = this.f179206o;
        if (lVar != null) {
            lVar.f447556e = null;
        }
        ck5.c cVar = new ck5.c(this.f179204m.N0());
        cVar.f124083b = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).L(this.f179204m, this.f179205n);
        int c17 = ip.c.c();
        cVar.f124084c = c17;
        cVar.f124085d = c17;
        cVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k(this, ri0Var));
    }

    public final java.lang.String V6() {
        java.lang.String str = this.f179215x;
        if (str != null && !str.isEmpty()) {
            return this.f179215x;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f179214w;
        return c19792x256d2725 == null ? "" : pm0.v.u(c19792x256d2725.m76784x5db1b11());
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
            this.f179199e = (java.lang.String) this.H.poll();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch: processing next md5=" + this.f179199e + ", remaining=" + this.H.size());
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(this.f179199e);
            this.f179204m = emojiInfo;
            if (emojiInfo != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
                java.util.Iterator it = ((java.util.ArrayList) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().o1(false)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next()).mo42933xb5885648().equals(emojiInfo.mo42933xb5885648())) {
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    T6();
                    return;
                }
            }
            X6(this.f179207p, this.f179204m, this.f179201g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch upload, fail count " + this.I);
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
                java.lang.Integer num = (java.lang.Integer) this.f179198J.get(stringArrayListExtra.get(i19));
                i19++;
                arrayList.add(new or.a(i19, intExtra, i27, java.lang.Integer.valueOf(num != null ? num.intValue() : 0)));
            }
            or.d.a(stringExtra, 7, intExtra, java.lang.Integer.valueOf((intArrayExtra == null || intArrayExtra.length <= 0) ? 0 : intArrayExtra[0]), 20, or.c.a(str, stringExtra, java.lang.Integer.valueOf(size), or.c.d(arrayList)));
        }
        if (!isFinishing() && !isDestroyed()) {
            R6();
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.this;
                int i28 = activityC13272x96cd1be8.I;
                if (i28 > 0) {
                    db5.e1.F(activityC13272x96cd1be8.f179207p, "", activityC13272x96cd1be8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obw, java.lang.Integer.valueOf(i28)), true).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$e
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.L;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be82 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.this;
                            activityC13272x96cd1be82.setResult(0);
                            activityC13272x96cd1be82.finish();
                        }
                    });
                    return;
                }
                db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, activityC13272x96cd1be8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byc));
                activityC13272x96cd1be8.setResult(-1);
                activityC13272x96cd1be8.finish();
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 300L, false);
    }

    public boolean X6(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, int i17) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. context is null");
            return false;
        }
        if (c21053xdbf1e5f4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. emoji is null");
            Q6("");
            return false;
        }
        gr.v vVar = gr.v.f356229a;
        vVar.a(false);
        if (vVar.b().getBoolean("custom_full", false) && !this.A.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. over max size.");
            if (this.G) {
                this.I++;
                W6();
            } else {
                R6();
                Z6(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f179201g);
            java.lang.String mo42933xb5885648 = this.f179204m.mo42933xb5885648();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = this.f179204m;
            g0Var.d(10431, valueOf, mo42933xb5885648, c21053xdbf1e5f42.f68657xb76d85ab, c21053xdbf1e5f42.f68663x861009b5, 1, 1, java.lang.Integer.valueOf(this.f179204m.f68679x22618426), this.f179202h, this.f179204m.f68641x3342accf, this.f179203i, V6(), "");
            return false;
        }
        if (!n22.m.k(c21053xdbf1e5f4) && !n22.m.j(c21053xdbf1e5f4) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68663x861009b5)) {
            if (!((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(c21053xdbf1e5f4.f68663x861009b5) && !c21053xdbf1e5f4.k()) {
                gm0.j1.n().f354821b.g(new z12.l(c21053xdbf1e5f4.f68663x861009b5, null, "", null, null, null, 0, 1, 0, null));
                return true;
            }
        }
        if (java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(c21053xdbf1e5f4.N0())).booleanValue() && this.D.booleanValue()) {
            U6(null);
        } else {
            S6(c21053xdbf1e5f4);
        }
        return true;
    }

    public final void Y6(java.lang.String str) {
        if (isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 F = db5.e1.F(this, str, "", true);
        this.f179209r = F;
        F.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q(this));
    }

    public final void Z6(java.lang.String str) {
        if (str != null && !str.equals(this.f179204m.mo42933xb5885648())) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            this.f179204m = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(str);
        }
        if (isFinishing()) {
            return;
        }
        if (!this.C.booleanValue()) {
            n22.c.a(4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j17 = db5.e1.j(this.f179207p, com.p314xaae8f345.mm.R.C30867xcad56011.c0g, com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj, com.p314xaae8f345.mm.R.C30867xcad56011.byz, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m(this));
            if (j17 != null) {
                j17.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n(this));
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_id", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f179204m;
        if (c21053xdbf1e5f4 != null) {
            intent.putExtra("activityId", c21053xdbf1e5f4.f68641x3342accf);
        }
        setResult(1, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra;
        byte[] byteArrayExtra2;
        boolean z17 = true;
        requestWindowFeature(1);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        this.f179207p = this;
        this.f179210s = new im5.c();
        this.f179199e = getIntent().getStringExtra("extra_id");
        this.f179201g = getIntent().getIntExtra("extra_scence", -1);
        this.f179203i = getIntent().getStringExtra("EXTRA_SESSION_ID");
        this.f179202h = getIntent().getStringExtra("extra_username");
        if (getIntent().getBooleanExtra("extra_current", false) && this.f179202h == null) {
            this.f179202h = c01.z1.r();
        }
        this.f179200f = getIntent().getBooleanExtra("extra_move_to_top", true);
        this.f179205n = getIntent().getBooleanExtra("key_is_selfie", false);
        this.f179211t = getIntent().getStringArrayListExtra("extra_wordings");
        this.E = getIntent().getIntExtra("query_source_type", -1);
        this.f179212u = getIntent().getIntExtra("extra_upload_scene", 0);
        this.F = getIntent().getIntExtra("key_from_scene", 0);
        if (getIntent().hasExtra("finder_object_bytes")) {
            byte[] byteArrayExtra3 = getIntent().getByteArrayExtra("finder_object_bytes");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m76746xaf65a0fc = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725.m76746xaf65a0fc();
            this.f179214w = m76746xaf65a0fc;
            try {
                m76746xaf65a0fc.mo11468x92b714fd(byteArrayExtra3);
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        this.f179215x = getIntent().getStringExtra("feedId");
        if (getIntent().hasExtra("extra_finder_info") && (byteArrayExtra2 = getIntent().getByteArrayExtra("extra_finder_info")) != null) {
            try {
                r45.uu6 uu6Var = new r45.uu6();
                this.f179213v = uu6Var;
                uu6Var.mo11468x92b714fd(byteArrayExtra2);
            } catch (java.io.IOException unused) {
                this.f179213v = null;
            }
        }
        this.f179216y = getIntent().getStringArrayListExtra("extra_meanings");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_id_list");
        this.G = getIntent().getBooleanExtra("enable_multi_upload", false);
        this.I = getIntent().getIntExtra("multi_upload_fail_count", 0);
        if (this.G) {
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 1) {
                java.util.LinkedList linkedList = new java.util.LinkedList(stringArrayListExtra);
                this.H = linkedList;
                this.f179199e = (java.lang.String) linkedList.poll();
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    this.f179198J.put(it.next(), 0);
                }
            } else if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
                this.f179199e = stringArrayListExtra.get(0);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179199e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "md5 is null.");
            setResult(0);
            finish();
        }
        if (getIntent().hasExtra("upload_finder_link_info") && (byteArrayExtra = getIntent().getByteArrayExtra("upload_finder_link_info")) != null) {
            try {
                r45.sj0 sj0Var = new r45.sj0();
                this.f179217z = sj0Var;
                sj0Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.io.IOException unused2) {
                this.f179217z = null;
            }
        }
        this.D = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("is_upload_wxam", false));
        this.A = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("allow_add_exceed_limit", false));
        this.B = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("hide_added_toast", false));
        this.C = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("hide_exceed_limit_hint", false));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(this.f179199e);
        this.f179204m = emojiInfo;
        java.lang.Runnable runnable = this.K;
        if (emojiInfo != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
            java.util.Iterator it6 = ((java.util.ArrayList) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().o1(false)).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z17 = false;
                    break;
                } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it6.next()).mo42933xb5885648().equals(emojiInfo.mo42933xb5885648())) {
                    break;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 300L);
                T6();
                return;
            }
        }
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 300L);
        X6(this.f179207p, this.f179204m, this.f179201g);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
        gm0.j1.n().f354821b.q(698, this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.K);
        super.onDestroy();
        this.f179210s.mo10668x2efc64();
        qr.l lVar = this.f179206o;
        if (lVar != null) {
            lVar.f447556e = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 == 698) {
            if (m1Var instanceof z12.g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "add backup %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 != 0 || i18 != 0) {
                    Q6("");
                    return;
                }
                gr.t.g().n(true);
                gr.t.g().l(true);
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().y2(0, java.util.Arrays.asList(this.f179204m.mo42933xb5885648()));
                com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.g();
                if (this.G) {
                    this.f179198J.put(this.f179199e, 1);
                    W6();
                    return;
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.this;
                        if (!activityC13272x96cd1be8.B.booleanValue()) {
                            db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, activityC13272x96cd1be8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byc));
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("extra_id", activityC13272x96cd1be8.f179204m.mo42933xb5885648());
                        intent.putExtra("activityId", activityC13272x96cd1be8.f179204m.f68641x3342accf);
                        activityC13272x96cd1be8.setResult(-1, intent);
                        activityC13272x96cd1be8.finish();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 300L, false);
                return;
            }
            return;
        }
        if (mo808xfb85f7b0 == 423 && (m1Var instanceof z12.l)) {
            z12.l lVar = (z12.l) m1Var;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f550853f) || (c21053xdbf1e5f4 = this.f179204m) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68663x861009b5) || !this.f179204m.f68663x861009b5.equalsIgnoreCase(lVar.f550853f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "no the same product ID");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                S6(this.f179204m);
                return;
            }
            if (this.G) {
                this.I++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch exchange fail: errCode=" + i18 + ", md5=" + this.f179199e);
                W6();
                return;
            }
            if (i18 == 4) {
                R6();
                if (this.f179201g != 0) {
                    Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bun));
                    return;
                }
                java.lang.String str2 = this.f179204m.f68663x861009b5;
                if (isFinishing()) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 F = db5.e1.F(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bun), "", true);
                this.f179209r = F;
                F.u(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.f(this));
                this.f179209r.z(com.p314xaae8f345.mm.R.C30867xcad56011.bup, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g(this, str2));
                return;
            }
            if (i18 == 8) {
                R6();
                Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bum));
            } else if (i18 == 9) {
                R6();
                Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bul));
            } else if (i18 == -2) {
                R6();
                Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.buo));
            } else {
                R6();
                Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.buj));
            }
        }
    }
}
