package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "Lut3/d;", "<init>", "()V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderAlbumUI */
/* loaded from: classes10.dex */
public final class ActivityC15010xb447a21d extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd implements ut3.d {
    public static final /* synthetic */ int L2 = 0;
    public org.json.JSONObject A2;
    public boolean B2;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl C2;
    public final zy2.pa D2;
    public final m40.k0 E2;
    public final w40.e F2;
    public final pp0.h0 G2;
    public final uy0.h H2;
    public final e42.e0 I2;
    public final jz5.g J2;
    public final java.util.List K2;

    /* renamed from: u2, reason: collision with root package name */
    public java.lang.String f210037u2 = "";

    /* renamed from: v2, reason: collision with root package name */
    public boolean f210038v2;

    /* renamed from: w2, reason: collision with root package name */
    public long f210039w2;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f210040x2;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f210041y2;

    /* renamed from: z2, reason: collision with root package name */
    public long f210042z2;

    public ActivityC15010xb447a21d() {
        i95.m c17 = i95.n0.c(zy2.pa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.D2 = (zy2.pa) c17;
        i95.m c18 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        this.E2 = (m40.k0) c18;
        i95.m c19 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        this.F2 = (w40.e) c19;
        i95.m c27 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        this.G2 = (pp0.h0) c27;
        i95.m c28 = i95.n0.c(uy0.h.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
        this.H2 = (uy0.h) c28;
        i95.m c29 = i95.n0.c(e42.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
        this.I2 = (e42.e0) c29;
        this.J2 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p0(this));
        this.K2 = kz5.c0.i(38, 39, 40, 47);
    }

    public static void m8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            i19 = 3;
        }
        activityC15010xb447a21d.getClass();
        android.content.Intent intent = new android.content.Intent(activityC15010xb447a21d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15057x806846b6.class);
        intent.putStringArrayListExtra("preview_image_list", activityC15010xb447a21d.f220061m.K());
        intent.putParcelableArrayListExtra("preview_media_item_list", activityC15010xb447a21d.f220061m.f328664g);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", i17);
        activityC15010xb447a21d.H7(i17, true);
        intent.putExtra("send_raw_img", activityC15010xb447a21d.D);
        if (t23.p0.k().f496830f != 37) {
            intent.putExtra("key_force_hide_edit_image_button", true);
        }
        intent.putExtra("max_select_count", i18);
        intent.putExtra("GalleryUI_FromUser", activityC15010xb447a21d.U);
        intent.putExtra("GalleryUI_ToUser", activityC15010xb447a21d.V);
        intent.putExtra("album_business_tag", activityC15010xb447a21d.f220081x0);
        int i28 = activityC15010xb447a21d.f220084y0;
        int Ni = ((h62.d) activityC15010xb447a21d.I2).Ni(e42.d0.clicfg_ultron_album_video_max_select_duration_android, 300);
        int j86 = activityC15010xb447a21d.j8() - 1;
        if (Ni < j86) {
            Ni = j86;
        }
        intent.putExtra("album_video_max_duration", java.lang.Math.max(i28, Ni));
        intent.putExtra("album_video_min_duration", activityC15010xb447a21d.f220059l1);
        intent.putExtra("media_type", i19);
        intent.putExtra("key_support_max_ratio", 3.0f);
        if (t23.p0.k().f496830f == 14) {
            intent.putExtra("key_edit_video_max_time_length", 300500);
        }
        activityC15010xb447a21d.startActivityForResult(intent, 288);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void I7(java.util.List selectedMediaItems, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedMediaItems, "selectedMediaItems");
        super.I7(this.f220061m.f328664g, abstractC15633xee433078, i17, i18, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar = this.C2;
        if (slVar != null) {
            slVar.d(this.f220061m.J());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void J7() {
        ((qs2.q) this.F2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.C(3, null);
        xo4.b.a(xo4.b.f537301a, 100, 1, java.lang.System.currentTimeMillis() - this.f210042z2, 0, this.A2, null, null, 96, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K7() {
        /*
            r11 = this;
            java.lang.String r0 = "onHeaderClicked: "
            java.lang.String r1 = "Finder.AlbumUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "KEY_FINDER_POST_ORIGIN_MUSIC_INFO"
            byte[] r0 = r0.getByteArrayExtra(r2)
            r45.zi2 r2 = new r45.zi2
            r2.<init>()
            r3 = 0
            if (r0 != 0) goto L1b
        L19:
            r8 = r3
            goto L2d
        L1b:
            r2.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L20
            r8 = r2
            goto L2d
        L20:
            r0 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r2, r0)
            goto L19
        L2d:
            if (r8 != 0) goto L35
            java.lang.String r0 = "onHeaderClicked: get music info pb error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            return
        L35:
            androidx.appcompat.app.AppCompatActivity r0 = r11.mo55332x76847179()
            androidx.appcompat.app.AppCompatActivity r1 = r11.mo55332x76847179()
            r2 = 2131762544(0x7f101d70, float:1.9156168E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 1
            r4 = 2
            com.tencent.mm.ui.widget.dialog.u3 r10 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(r0, r1, r2, r4, r3)
            w40.e r0 = r11.F2
            qs2.q r0 = (qs2.q) r0
            r0.getClass()
            com.tencent.mm.plugin.finder.assist.e9 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a
            java.lang.String r6 = r0.c(r8)
            java.lang.Class<qc0.i1> r0 = qc0.i1.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            qc0.i1 r0 = (qc0.i1) r0
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            int r2 = (int) r2
            r1.f237244e = r2
            r2 = 5
            java.lang.String r2 = r8.m75945x2fec8307(r2)
            r1.f237245f = r2
            r1.f237248i = r6
            androidx.appcompat.app.AppCompatActivity r2 = r11.mo55332x76847179()
            java.lang.String r3 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            com.tencent.mm.plugin.finder.ui.r0 r3 = new com.tencent.mm.plugin.finder.ui.r0
            r5 = r3
            r7 = r11
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            pc0.k2 r0 = (pc0.k2) r0
            r0.wi(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.K7():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void M7(int i17, android.view.View itemView, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = this.f220061m.E(i17);
        if (E == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(E.f219963e)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(E == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.AlbumUI", "item is null %s, item original path is null", objArr);
            return;
        }
        int i19 = this.E1;
        if (i19 == 25 || i19 == 37 || i19 == 39) {
            if (i19 == 37 && this.f220061m.J() != 0 && (E instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b)) {
                db5.e1.T(mo55332x76847179(), i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.fiq));
                return;
            }
            if (!(E instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b)) {
                java.util.ArrayList arrayList = this.f220061m.f328663f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getAllMediaItems(...)");
                t23.p0.p(arrayList);
                m8(this, arrayList.indexOf(E), this.Q, 0, 4, null);
                return;
            }
            e42.d0 d0Var = e42.d0.clicfg_ultron_album_video_max_select_duration_android;
            int Ni = ((h62.d) this.I2).Ni(d0Var, 300);
            int j86 = j8();
            if (Ni < j86) {
                Ni = j86;
            }
            int Ni2 = ((h62.d) this.I2).Ni(d0Var, 300);
            int j87 = j8() - 1;
            if (Ni2 < j87) {
                Ni2 = j87;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) E;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c15635xf0ea441b.f219963e, "getOriginalPath(...)");
            if (c15635xf0ea441b.f219979x < d11.s.fj().hj().f152729i * 1000) {
                db5.e1.F(mo55332x76847179(), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573727fk5, java.lang.Integer.valueOf(d11.s.fj().hj().f152729i)), "", false);
                return;
            }
            if (c15635xf0ea441b.f219979x > Ni * 1000) {
                db5.e1.F(mo55332x76847179(), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fk6, java.lang.Integer.valueOf(Ni2)), "", false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "onMediaClick, video mime:" + c15635xf0ea441b.f219977v + ", audio mime:" + c15635xf0ea441b.f219978w + ", path:" + E.f219963e);
            java.lang.String str = c15635xf0ea441b.f219963e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o0(str));
            if ((j33.e.f378967a.c(25, c15635xf0ea441b) == 0) == true) {
                new java.util.ArrayList(1).add(E);
                java.util.ArrayList arrayList2 = this.f220061m.f328663f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList2, "getAllMediaItems(...)");
                t23.p0.p(arrayList2);
                m8(this, arrayList2.indexOf(E), this.E1 != 37 ? this.Q : 1, 0, 4, null);
                return;
            }
            o8(c15635xf0ea441b.f219977v, c15635xf0ea441b.f219978w, E.f219963e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
            u1Var.u(i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f573720fj5));
            u1Var.n(i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.fil));
            u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s0.f211321a);
            u1Var.q(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public boolean N7() {
        java.lang.String m76317x2a881cd1;
        java.lang.String m76255x7117c88d;
        xo4.b.a(xo4.b.f537301a, 100, 1, java.lang.System.currentTimeMillis() - this.f210042z2, 1, this.A2, null, null, 96, null);
        ((ez0.i) this.H2).getClass();
        bz0.j.f118283a.c(2);
        int i17 = this.E1;
        if (i17 == 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f220061m.f328664g);
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                return false;
            }
            java.lang.Object obj = arrayList.get(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) obj : null;
            int i18 = c15635xf0ea441b != null ? c15635xf0ea441b.f219979x : 0;
            if (arrayList.size() == 1) {
                long j17 = i18;
                c61.p7 p7Var = (c61.p7) this.E2;
                if (j17 >= (p7Var.mj() + 1) * 1000 && j17 < j8() * 1000 && !this.f210038v2) {
                    boolean aj6 = ((yy0.m0) this.G2).aj();
                    if (p7Var.wi() == 1 || aj6) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f <= 0) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f = android.os.SystemClock.elapsedRealtime();
                        }
                        h8(arrayList);
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(mo55332x76847179());
                        java.lang.Object obj2 = arrayList.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) obj2;
                        y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5m);
                        android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.czu);
                        if (textView != null) {
                            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                        }
                        android.view.View findViewById = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.cyz);
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t0(y1Var));
                        }
                        android.view.View findViewById2 = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.ipx);
                        if (findViewById2 != null) {
                            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u0(this, y1Var, c15635xf0ea441b2));
                        }
                        android.view.View findViewById3 = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.f568445mv3);
                        if (findViewById3 != null) {
                            findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.v0(this, y1Var, arrayList));
                        }
                        y1Var.f293570s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w0(this);
                        y1Var.s();
                        ((qs2.q) this.F2).getClass();
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                        java.lang.String str = (c19783xd9a946b7 == null || (m76255x7117c88d = c19783xd9a946b7.m76255x7117c88d()) == null) ? "" : m76255x7117c88d;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                        n8(str, (c19783xd9a946b72 == null || (m76317x2a881cd1 = c19783xd9a946b72.m76317x2a881cd1()) == null) ? "" : m76317x2a881cd1, 1, c01.id.c() / 1000, 0);
                    }
                    return true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f <= 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f = android.os.SystemClock.elapsedRealtime();
            }
            h8(arrayList);
            return true;
        }
        if (i17 == 32) {
            int intExtra = getIntent().getIntExtra("min_select_count", 0);
            if (this.f220061m.f328664g.size() < intExtra) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                android.content.res.Resources resources = mo55332x76847179().getResources();
                db5.e1.T(mo55332x76847179, resources != null ? resources.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571213q, intExtra, java.lang.Integer.valueOf(intExtra)) : null);
                return false;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f220061m.f328664g);
            if (arrayList2.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                return false;
            }
            if (this.E1 == 32) {
                ut3.f.f512709c.f512710a = this;
            }
            g8(arrayList2);
            return true;
        }
        if (i17 != 47) {
            if (i17 == 48) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                l8(arrayList3, new java.util.ArrayList());
                android.content.Intent intent = new android.content.Intent();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add((java.lang.String) ((jz5.l) it.next()).f384366d);
                }
                intent.putStringArrayListExtra("key_select_image_list", new java.util.ArrayList<>(arrayList4));
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f384367e).longValue()));
                }
                intent.putExtra("SELECT_IMAGES_MODIFIED_TIME", kz5.n0.T0(arrayList5));
                setResult(-1, intent);
                finish();
                return true;
            }
            switch (i17) {
                case 37:
                    if (new java.util.ArrayList(this.f220061m.f328664g).isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                        return false;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    l8(arrayList6, arrayList7);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList7, 10));
                    java.util.Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        arrayList8.add((java.lang.String) ((jz5.l) it7.next()).f384366d);
                    }
                    intent2.putStringArrayListExtra("key_select_video_list", new java.util.ArrayList<>(arrayList8));
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList6, 10));
                    java.util.Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        arrayList9.add((java.lang.String) ((jz5.l) it8.next()).f384366d);
                    }
                    intent2.putStringArrayListExtra("key_select_image_list", new java.util.ArrayList<>(arrayList9));
                    java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(arrayList6, 10));
                    java.util.Iterator it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        arrayList10.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it9.next()).f384367e).longValue()));
                    }
                    intent2.putExtra("SELECT_IMAGES_MODIFIED_TIME", kz5.n0.T0(arrayList10));
                    setResult(-1, intent2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f <= 0) {
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f = android.os.SystemClock.elapsedRealtime();
                    }
                    finish();
                    return false;
                case 38:
                case 39:
                case 41:
                    break;
                case 40:
                    java.util.ArrayList arrayList11 = new java.util.ArrayList(this.f220061m.f328664g);
                    if (arrayList11.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                        return false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f <= 0) {
                        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f = android.os.SystemClock.elapsedRealtime();
                    }
                    h8(arrayList11);
                    return true;
                default:
                    return false;
            }
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList12 = new java.util.ArrayList<>(this.f220061m.f328664g);
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putParcelableArrayListExtra("key_select_mix_media_list", arrayList12);
        setResult(-1, intent3);
        finish();
        return true;
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    public final boolean f8() {
        if (getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO") != null) {
            return ((h62.d) this.I2).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20375x9d151a2d()) == 1;
        }
        return true;
    }

    public final void g8(java.util.ArrayList mediaList) {
        java.lang.Object obj;
        uy0.h hVar = this.H2;
        ((ez0.i) hVar).Ai(true);
        if (f8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "perform enter template preview ui");
            android.content.Intent intent = getIntent();
            intent.putExtra("key_maas_entrance", 200);
            ((ez0.i) hVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMJTemplate", "enterFinderAlbumTemplatePreviewUI");
            com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9.f151289g.a(this, intent, 294, sy0.b.f495360e, mediaList, (com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f) intent.getParcelableExtra("mj_template_session"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "perform enter music template preview ui");
        java.util.Iterator it = mediaList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj).mo63659xfb85f7b0() == 2) {
                    break;
                }
            }
        }
        boolean z17 = obj == null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 i86 = i8(mediaList);
        int i17 = z17 ? 3 : 4;
        android.content.Intent intent2 = getIntent();
        ((c61.w8) this.D2).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "intent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, this, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        intent2.putExtra("KEY_PARAMS_CONFIG", i86);
        intent2.putExtra("KEY_PARAMS_TO_WHERE", i17);
        intent2.putExtra("KEY_PARAMS_EXIT_ANIM", 0);
        intent2.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", 0);
        intent2.putExtra("key_maas_entrance", 200);
        ((ez0.i) hVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMJTemplate", "enterMultiTemplatePreviewUI");
        intent2.setClass(this, com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952.class);
        intent2.putExtra("request_params", new com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb(mediaList, false, false, false, null, 30, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(294);
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/app/Activity;ILjava/util/List;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void h8(java.util.ArrayList arrayList) {
        java.lang.String str;
        java.lang.Object obj;
        ((qs2.q) this.F2).getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76281x194b99df()) == null) {
            str = "";
        }
        ((c61.w8) this.D2).getClass();
        ft2.b.f348052a.b(str, ft2.c.f348055c);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj).mo63659xfb85f7b0() == 2) {
                    break;
                }
            }
        }
        boolean z17 = obj == null;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next()).mo63659xfb85f7b0() == 6) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 i86 = i8(arrayList);
        int i17 = z17 ? 3 : 4;
        ut3.f.f512709c.f512710a = this;
        c61.p7 p7Var = (c61.p7) this.E2;
        int Vi = p7Var.Vi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "doEnterMMRecordVLogUI: imageFeedAssetsMaxCount=" + Vi);
        boolean z18 = z17 && arrayList.size() <= Vi;
        yy0.m0 m0Var = (yy0.m0) this.G2;
        boolean aj6 = m0Var.aj();
        ut3.m mVar = ut3.m.f512715a;
        if (aj6 && !z18) {
            mVar.h(mo55332x76847179(), 296, 0, 0, i86, i17, 0, this.B2, null, true, false);
            return;
        }
        boolean z19 = m0Var.Zi(false) && p7Var.hj(m40.j0.f404947m);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it7.next()).f219963e);
        }
        arrayList2.addAll(arrayList3);
        i86.G = arrayList2;
        if (!z19) {
            mVar.f(mo55332x76847179(), 292, 0, 0, i86, i17, 0);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        boolean z27 = this.B2;
        android.content.Intent a17 = mVar.a(mo55332x76847179, "com.tencent.mm.mj_publisher.finder.image_composing.ImageComposingUI", i17);
        if (a17 == null) {
            return;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", i86);
        a17.putExtra("KEY_FROM_SHOOT_COMPOSING", z27);
        a17.putExtra("KEY_VIDEO_SOURCE_FROM_ALBUM", true);
        a17.putExtra("KEY_SHOOT_COMPOSING_ONLY_PREVIEW", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCaptureJumper", "configProvider: %s", i86);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList4.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k0.f33801x366c91de));
        arrayList4.add(a17);
        java.util.Collections.reverse(arrayList4);
        yj0.a.k(mo55332x76847179, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToMJImageComposingForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;IZLcom/tencent/mm/protocal/protobuf/FinderVideoTemplateInfo;ZZ)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        mVar.b(mo55332x76847179, 0, 0);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 i8(java.util.ArrayList arrayList) {
        arrayList.size();
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String stringExtra = getIntent().getStringExtra("key_finder_context_id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_click_tab_context_id");
        bundle.putParcelableArrayList("media_list", arrayList);
        bundle.putString("FINDER_CONTEXT_ID", stringExtra);
        bundle.putString("FINDER_SESSION_ID", getIntent().getStringExtra("key_finder_session_id"));
        bundle.putString("key_click_tab_context_id", stringExtra2);
        bundle.putInt("key_from_comment_scene", 101);
        bundle.putString("post_id", this.f210037u2);
        bundle.putString("KEY_ORIGIN_MUSIC_ID", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
        bundle.putString("KEY_ORIGIN_BGM_URL", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_BGM_URL"));
        bundle.putString("KEY_ORIGIN_MUSIC_PATH", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH"));
        bundle.putString("KEY_ORIGIN_MUSIC_NAME", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME"));
        bundle.putString("KEY_ORIGIN_MUSIC_COVER_URL", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL"));
        bundle.putInt("KEY_ORIGIN_MUSIC_PLAY_DURATION", getIntent().getIntExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", 0));
        bundle.putString("KEY_ORIGIN_MUSIC_AUTHOR", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_AUTHOR"));
        bundle.putByteArray("KEY_ORIGIN_MUSIC_INFO", getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO"));
        bundle.putBoolean("KEY_BGM_IF_ORIGIN", getIntent().getBooleanExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false));
        bundle.putBoolean("KEY_FULLSCREEN", true);
        bundle.putInt("KEY_MEDIA_SOURCE_FROM", 1);
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this);
        i95.m c17 = i95.n0.c(c50.b1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context baseContext = getBaseContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseContext, "getBaseContext(...)");
        jz5.o Ai = ((c61.s9) ((c50.b1) c17)).Ai(baseContext, h17.x, h17.y);
        android.graphics.Point point = new android.graphics.Point(((java.lang.Number) Ai.f384375e).intValue(), ((java.lang.Number) Ai.f384376f).intValue());
        bundle.putInt("KEY_PREVIEW_WIDTH", point.x);
        bundle.putInt("KEY_PREVIEW_HEIGHT", point.y);
        m40.k0 k0Var = this.E2;
        bundle.putLong("video_max_duration", (((c61.p7) k0Var).wi() == 1 ? j8() : r8.mj()) * 1000);
        bundle.putLong("video_track_max_duration", (((c61.p7) k0Var).wi() == 1 ? j8() : r8.mj()) * 1000);
        c61.p7 p7Var = (c61.p7) k0Var;
        p7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        bundle.putInt("image_max_height", t70Var.l2());
        p7Var.getClass();
        bundle.putInt("image_max_width", t70Var.k2());
        bundle.putInt("image_compress_quality", p7Var.cj());
        qs2.q qVar = (qs2.q) this.F2;
        qVar.getClass();
        bundle.putString("output_dir", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183679o);
        uu2.b bVar = uu2.b.f512802a;
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_MediaAudioPanelV2UI_Int, 0);
        boolean fj6 = g17 != 1 ? g17 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_finder_media_editor_music_panel_v2, true) : false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoEditorConfig", "enableUseMusicPanelV2: " + fj6);
        bundle.putBoolean("key_use_music_panel_v2", fj6);
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_ref_feed_dup_flag");
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo55332x76847179, "null cannot be cast to non-null type android.app.Activity");
        r45.qt2 wi6 = ((c61.w8) this.D2).wi(mo55332x76847179);
        if (intExtra == 0) {
            intExtra = wi6 != null ? wi6.m75939xb282bd08(5) : 101;
        }
        qVar.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        int m76275xbcc8608a = c19783xd9a946b7 != null ? c19783xd9a946b7.m76275xbcc8608a() : 0;
        bundle.putLong("key_ref_feed_id", longExtra);
        bundle.putString("key_ref_feed_dup_flag", stringExtra3);
        bundle.putInt("key_ref_comment_scene", intExtra);
        bundle.putInt("key_ref_enter_scene", m76275xbcc8608a);
        bundle.putString("KEY_FINDER_POST_MUSIC_FEEDID", getIntent().getStringExtra("KEY_FINDER_POST_MUSIC_FEEDID"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 a17 = bVar.a();
        a17.M = bundle;
        if (a17.I == null) {
            a17.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = a17.I;
        if (c16995x8ab634cd != null) {
            c16995x8ab634cd.f237227h = longExtra;
            c16995x8ab634cd.f237228i = stringExtra3;
            c16995x8ab634cd.f237226g = 101;
            c16995x8ab634cd.f237229m = m76275xbcc8608a;
            c16995x8ab634cd.f237233q = intExtra;
            c16995x8ab634cd.f237230n = stringExtra;
            c16995x8ab634cd.f237231o = stringExtra2;
        }
        if (this.E1 == 40) {
            a17.M.putInt("KEY_POST_ENTERSCENE", getIntent().getIntExtra("KEY_POST_ENTERSCENE", 0));
        }
        return a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (f8() != false) goto L31;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.mo43517x10010bd5():void");
    }

    public final int j8() {
        return ((java.lang.Number) ((jz5.n) this.J2).mo141623x754a37bb()).intValue();
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        byte[] byteArray;
        byte[] byteArray2;
        byte[] byteArray3;
        byte[] byteArray4;
        byte[] byteArray5;
        java.util.ArrayList parcelableArrayList;
        byte[] byteArray6;
        byte[] byteArray7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 reportInfo = nu3.i.f421751a.l();
        w40.e eVar = this.F2;
        qs2.q qVar = (qs2.q) eVar;
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.f(reportInfo);
        if (c16991x15ced046 != null) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f210041y2) {
                intent.putExtras(getIntent());
            }
            if (context != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context.getClass().getName(), "com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI")) {
                intent.putExtras(getIntent());
            }
            i95.m c17 = i95.n0.c(pp0.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            r45.df2 wi6 = ((yy0.m7) ((pp0.l0) c17)).wi();
            intent.putExtra("KEY_POST_MJ_PUBLISHER_INFO", wi6.mo14344x5f01b1f6());
            qVar.getClass();
            p2Var.Y(wi6);
            i95.m c18 = i95.n0.c(pp0.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.a1(m7Var, null), 3, null);
            m7Var.cj("Completed");
            m7Var.bj("Completed");
            m7Var.mj();
            if (bundle != null && (byteArray7 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) != null) {
                intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray7);
            }
            if (bundle != null && (byteArray6 = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
                intent.putExtra("ORIGIN_MUSIC_INFO", byteArray6);
            }
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_ID");
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_PATH");
            pm0.v.l(intent, bundle, "ORIGIN_BGM_URL");
            pm0.v.e(intent, bundle, "MEDIA_IS_MUTE", false, 4, null);
            pm0.v.e(intent, bundle, "MUSIC_IS_MUTE", false, 4, null);
            pm0.v.h(intent, bundle, "SOUND_TRACK_TYPE", 0, 4, null);
            pm0.v.l(intent, bundle, "MUSIC_FEED_ID");
            if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("KEY_POST_HALF_RECT_LIST")) != null) {
                intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
            }
            pm0.v.i(intent, bundle, "key_ref_feed_id", 0L, 4, null);
            pm0.v.l(intent, bundle, "key_ref_feed_dup_flag");
            pm0.v.h(intent, bundle, "key_ref_enter_scene", 0, 4, null);
            pm0.v.l(intent, bundle, "KEY_POST_VIDEO_TITLE");
            pm0.v.e(intent, bundle, "KEY_POST_ASSETS_IS_REAL_SHOOT", false, 4, null);
            java.util.ArrayList arrayList = (java.util.ArrayList) c16991x15ced046.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
            java.util.List<java.lang.String> list = c16991x15ced046.f237199m;
            if (list == null || list.size() <= 0) {
                if (bundle != null && (byteArray = bundle.getByteArray("video_composition")) != null) {
                    intent.putExtra("video_composition", byteArray);
                }
                intent.putExtra("postType", 4);
                intent.putExtra("postMediaList", kz5.c0.d(c16991x15ced046.f237194e));
                boolean z17 = true;
                intent.putExtra("postTypeList", kz5.c0.d(4));
                intent.putExtra("postThumbList", kz5.c0.d(c16991x15ced046.f237195f));
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                java.lang.String string = bundle != null ? bundle.getString("KEY_POST_MIAOJIAN_TONGKUAN_META") : null;
                if (string != null && string.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    intent.putExtra("KEY_POST_MIAOJIAN_TONGKUAN_META", string);
                    if (intent.getIntExtra("KEY_POST_FROM_APP_SOURCE", 0) == 0) {
                        intent.putExtra("KEY_POST_FROM_APP_SOURCE", 4);
                    }
                }
            } else {
                intent.putExtra("postType", 2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) it.next());
                }
                intent.putExtra("postMediaList", arrayList2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str : list) {
                    arrayList3.add(2);
                }
                intent.putExtra("postTypeList", arrayList3);
                intent.putExtra("postThumbList", kz5.c0.d(c16991x15ced046.f237195f));
                if (arrayList != null && arrayList.size() == list.size()) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                pm0.v.j(intent, bundle, "KEY_POST_HALF_IMAGE_LIST");
            }
            intent.putExtra("post_id", this.f210037u2);
            intent.putExtra("edit_id", (java.lang.String) c16991x15ced046.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_ID", (java.lang.String) c16991x15ced046.a().b("KEY_MUSIC_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID", (java.lang.String) c16991x15ced046.a().b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b17 = c16991x15ced046.a().b("KEY_MUSIC_TYPE_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
            intent.putExtra("KEY_MUSIC_TYPE", ((java.lang.Number) b17).intValue());
            intent.putExtra("KEY_MUSIC_SESSION_BUFFER", (java.lang.String) c16991x15ced046.a().b("KEY_MUSIC_SESSION_BUFFER", ""));
            pm0.v.l(intent, bundle, "KEY_POST_ORIGIN_FILE_PATH");
            pm0.v.e(intent, bundle, "isLongVideoPost", false, 4, null);
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", bundle != null ? bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE") : null);
            intent.putExtra("KEY_POST_VIDEO_COVER_START_TIME", bundle != null ? java.lang.Double.valueOf(bundle.getDouble("KEY_POST_VIDEO_COVER_START_TIME")) : null);
            if (bundle != null && (byteArray5 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", byteArray5);
            }
            if (bundle != null && (byteArray4 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", byteArray4);
            }
            if (bundle != null && (byteArray3 = bundle.getByteArray("KEY_POST_ASSET_INFO")) != null) {
                intent.putExtra("KEY_POST_ASSET_INFO", byteArray3);
            }
            if (bundle != null && (byteArray2 = bundle.getByteArray("KEY_CREATE_TEMPLATE_INFO")) != null) {
                intent.putExtra("KEY_CREATE_TEMPLATE_INFO", byteArray2);
            }
            eVar.getClass();
            android.content.Intent curIntent = getIntent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curIntent, "curIntent");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).nl(intent, curIntent);
            int i17 = this.E1;
            qs2.v vVar = qs2.v.f447860a;
            if (i17 == 32 && (context instanceof android.app.Activity)) {
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1);
                activity.finish();
                activity.overridePendingTransition(0, 0);
                intent.removeExtra("KEY_FROM_SHOOT_COMPOSING");
                eVar.getClass();
                vVar.e(this, intent);
            } else if (this.B2 && (context instanceof android.app.Activity) && ((context instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373) || (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) || (this.C2 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context.getClass().getName(), "com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI")))) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("KEY_POST_INTENT", intent);
                android.app.Activity activity2 = (android.app.Activity) context;
                activity2.setResult(-1, intent2);
                activity2.finish();
                activity2.overridePendingTransition(0, 0);
            } else {
                intent.removeExtra("KEY_FROM_SHOOT_COMPOSING");
                eVar.getClass();
                vVar.e(this, intent);
            }
            ut3.f.f512709c.f512710a = null;
        }
    }

    public final java.lang.String k8() {
        int size = this.f220061m.f328664g.size();
        if (size <= 0) {
            java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        return mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + '(' + size + '/' + this.Q + ')';
    }

    public final void l8(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = this.f220061m.f328664g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getSelectedMediaItems(...)");
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(arrayList)).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            u23.f0 f0Var = u23.f0.f505607a;
            android.net.Uri c17 = f0Var.c(abstractC15633xee433078);
            java.lang.String b17 = f0Var.b(abstractC15633xee433078);
            if (abstractC15633xee433078.mo63659xfb85f7b0() == 1) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC15633xee433078.f219971p, "edit")) {
                    java.lang.String str = abstractC15633xee433078.f219965g;
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str2 = abstractC15633xee433078.f219965g;
                        if (!(str2 == null || str2.length() == 0)) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                            list.add(new jz5.l(str2, java.lang.Long.valueOf(abstractC15633xee433078.f219968m)));
                        }
                    }
                }
                java.lang.String d17 = dw3.c0.f325715a.d(this.f220049f.getContext(), null, abstractC15633xee433078.f219963e, b17, c17);
                if (!(d17 == null || d17.length() == 0)) {
                    list.add(new jz5.l(d17, java.lang.Long.valueOf(abstractC15633xee433078.f219968m)));
                }
            } else if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                java.lang.String h17 = dw3.c0.f325715a.h(this.f220049f.getContext(), null, abstractC15633xee433078.f219963e, b17, c17);
                if (!(h17 == null || h17.length() == 0)) {
                    list2.add(new jz5.l(h17, java.lang.Long.valueOf(abstractC15633xee433078.f219968m)));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b
            r1 = 0
            if (r0 == 0) goto L4a
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r2 = 1
            r0.inJustDecodeBounds = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) r9
            java.lang.String r9 = r9.f219963e
            com.p314xaae8f345.mm.p786x600aa8b.e.d(r9, r0)
            int r9 = r0.outWidth
            int r0 = r0.outHeight
            if (r9 == 0) goto L2f
            if (r0 != 0) goto L1d
            goto L2f
        L1d:
            float r9 = (float) r9
            float r0 = (float) r0
            float r9 = r9 / r0
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r0 = 1073741824(0x40000000, float:2.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L2f
            r9 = r2
            goto L30
        L2f:
            r9 = r1
        L30:
            if (r9 != 0) goto L49
            r9 = 2131768830(0x7f1035fe, float:1.9168917E38)
            java.lang.String r3 = r8.getString(r9)
            java.lang.String r4 = ""
            r9 = 2131756151(0x7f100477, float:1.9143201E38)
            java.lang.String r5 = r8.getString(r9)
            r6 = 0
            r7 = 0
            r2 = r8
            db5.e1.E(r2, r3, r4, r5, r6, r7)
            return r1
        L49:
            return r2
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.m7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n7(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b
            r1 = 0
            if (r0 == 0) goto Ld4
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "key_filter_hdr_video"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            java.lang.String r2 = "getOriginalPath(...)"
            if (r0 == 0) goto L2e
            j33.p r0 = j33.p.f378984a
            r3 = r11
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) r3
            java.lang.String r3 = r3.f219963e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r2)
            boolean r0 = r0.b(r3)
            if (r0 != 0) goto L2e
            r11 = 2131768833(0x7f103601, float:1.9168924E38)
            java.lang.String r11 = r10.getString(r11)
            db5.e1.W(r10, r11)
            return r1
        L2e:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r3 = "key_max_video_duration"
            int r0 = r0.getIntExtra(r3, r1)
            android.content.Intent r3 = r10.getIntent()
            java.lang.String r4 = "key_min_video_duration"
            int r3 = r3.getIntExtra(r4, r1)
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) r11
            java.lang.String r4 = r11.f219963e
            int r4 = j33.d0.a(r4)
            if (r4 <= r0) goto L57
            r11 = 2131768837(0x7f103605, float:1.9168932E38)
            java.lang.String r11 = r10.getString(r11)
            db5.e1.W(r10, r11)
            return r1
        L57:
            if (r4 >= r3) goto L64
            r11 = 2131768838(0x7f103606, float:1.9168934E38)
            java.lang.String r11 = r10.getString(r11)
            db5.e1.W(r10, r11)
            return r1
        L64:
            int r0 = r11.f219981z
            int r3 = r11.f219980y
            r4 = 1
            if (r0 == 0) goto L80
            if (r3 != 0) goto L6e
            goto L80
        L6e:
            float r0 = (float) r0
            float r3 = (float) r3
            float r0 = r0 / r3
            r3 = 1077936128(0x40400000, float:3.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L80
            r3 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L80
            r0 = r4
            goto L81
        L80:
            r0 = r1
        L81:
            r3 = 2131756151(0x7f100477, float:1.9143201E38)
            if (r0 != 0) goto L9a
            r11 = 2131768835(0x7f103603, float:1.9168928E38)
            java.lang.String r5 = r10.getString(r11)
            java.lang.String r6 = ""
            java.lang.String r7 = r10.getString(r3)
            r8 = 0
            r9 = 0
            r4 = r10
            db5.e1.E(r4, r5, r6, r7, r8, r9)
            return r1
        L9a:
            java.lang.String r0 = r11.f219963e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            ku5.u0 r2 = ku5.t0.f394148d
            com.tencent.mm.plugin.finder.ui.o0 r5 = new com.tencent.mm.plugin.finder.ui.o0
            r5.<init>(r0)
            ku5.t0 r2 = (ku5.t0) r2
            r2.g(r5)
            j33.e r0 = j33.e.f378967a
            r2 = 25
            int r0 = r0.c(r2, r11)
            if (r0 != 0) goto Lb6
            r1 = r4
        Lb6:
            if (r1 != 0) goto Ld4
            java.lang.String r0 = r11.f219977v
            java.lang.String r2 = r11.f219978w
            java.lang.String r11 = r11.f219963e
            r10.o8(r0, r2, r11)
            r11 = 2131768807(0x7f1035e7, float:1.916887E38)
            java.lang.String r5 = r10.getString(r11)
            java.lang.String r6 = ""
            java.lang.String r7 = r10.getString(r3)
            r8 = 0
            r9 = 0
            r4 = r10
            db5.e1.E(r4, r5, r6, r7, r8, r9)
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.n7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):boolean");
    }

    public final void n8(java.lang.String str, java.lang.String str2, int i17, long j17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6560x6997f09c c6560x6997f09c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6560x6997f09c();
        c6560x6997f09c.f139086d = c6560x6997f09c.b("ClickId", str, true);
        c6560x6997f09c.f139087e = c6560x6997f09c.b("PostId", str2, true);
        c6560x6997f09c.f139088f = i17;
        c6560x6997f09c.f139089g = j17;
        c6560x6997f09c.f139090h = i18;
        c6560x6997f09c.k();
        java.lang.String n17 = c6560x6997f09c.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "report21149 ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
    }

    public final void o8(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[2] = str3;
        g0Var.d(19441, objArr);
        g0Var.C(1253L, 33L, 1L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        e33.b0 b0Var;
        e33.b0 b0Var2;
        e33.b0 b0Var3;
        e33.b0 b0Var4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "onActivityResult requestCode:" + i17 + " resultCode:" + i18 + " isFromShootComposing:" + this.B2);
        if (i17 == 1001 && i18 == -1) {
            setResult(-1, intent);
            finish();
            return;
        }
        if (i18 == 25 || i18 == 37 || i18 == 39) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra != null && (b0Var = this.f220061m) != null) {
                java.util.ArrayList l17 = t23.p0.l();
                if (l17 == null) {
                    l17 = this.f220061m.f328663f;
                }
                b0Var.O(stringArrayListExtra, l17);
                this.f220061m.m8146xced61ae5();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar = this.C2;
                if (slVar != null) {
                    slVar.d(stringArrayListExtra.size());
                }
                c8(stringArrayListExtra.size());
            }
            N7();
            return;
        }
        if (i17 == 298) {
            if (i18 != 48) {
                finish();
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra2 == null || (b0Var4 = this.f220061m) == null) {
                return;
            }
            java.util.ArrayList l18 = t23.p0.l();
            if (l18 == null) {
                l18 = this.f220061m.f328663f;
            }
            b0Var4.O(stringArrayListExtra2, l18);
            this.f220061m.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar2 = this.C2;
            if (slVar2 != null) {
                slVar2.d(stringArrayListExtra2.size());
            }
            c8(stringArrayListExtra2.size());
            N7();
            return;
        }
        if (292 == i17 || 296 == i17 || 297 == i17) {
            if (!this.B2 || i18 != -1) {
                k3(this, intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null, ut3.f.f512709c.f512711b);
                return;
            }
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (294 == i17 && i18 == -1) {
            ((ez0.i) this.H2).getClass();
            az0.i5.x(az0.i5.f97090a, false, false, 3, null);
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (4382 == i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
            java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent != null ? intent.getStringArrayListExtra("key_select_video_list") : null;
            if (stringArrayListExtra3 != null) {
                arrayList.addAll(stringArrayListExtra3);
            }
            if (stringArrayListExtra4 != null) {
                arrayList.addAll(stringArrayListExtra4);
            }
            if ((!arrayList.isEmpty()) && (b0Var3 = this.f220061m) != null) {
                android.net.Uri uri = t23.o2.f496749e;
                b0Var3.O(arrayList, t23.n2.f496742a.f496753d);
                this.f220061m.m8146xced61ae5();
                c8(arrayList.size());
            }
            N7();
            return;
        }
        if (295 == i17 && i18 == -1) {
            setResult(-1);
            finish();
            return;
        }
        if (288 == i17) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra5 == null || (b0Var2 = this.f220061m) == null) {
                return;
            }
            java.util.ArrayList l19 = t23.p0.l();
            if (l19 == null) {
                l19 = this.f220061m.f328663f;
            }
            b0Var2.O(stringArrayListExtra5, l19);
            this.f220061m.m8146xced61ae5();
            c8(stringArrayListExtra5.size());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        mo55332x76847179().setResult(0);
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (!this.K2.contains(java.lang.Integer.valueOf(this.E1))) {
            ut3.f.f512709c.f512710a = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f210042z2 = java.lang.System.currentTimeMillis();
        xo4.b.a(xo4.b.f537301a, 100, 0, 0L, 0, this.A2, null, null, 108, null);
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        ((qs2.q) this.F2).getClass();
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n0.class);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: updateOptionMenuText */
    public void mo60878xf6b21fea(int i17, java.lang.String str) {
        super.mo60878xf6b21fea(i17, k8());
    }
}
