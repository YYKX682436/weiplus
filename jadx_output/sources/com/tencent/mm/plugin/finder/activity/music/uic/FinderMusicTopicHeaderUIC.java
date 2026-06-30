package com.tencent.mm.plugin.finder.activity.music.uic;

/* loaded from: classes2.dex */
public final class FinderMusicTopicHeaderUIC extends x92.r {

    /* renamed from: w, reason: collision with root package name */
    public static final ea2.g f101758w = new ea2.g(null);

    /* renamed from: g, reason: collision with root package name */
    public y9.i f101759g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f101760h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f101761i;

    /* renamed from: m, reason: collision with root package name */
    public long f101762m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f101763n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f101764o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f101765p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$musicPlayEventListener$1 f101766q;

    /* renamed from: r, reason: collision with root package name */
    public final ea2.c0 f101767r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f101768s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$finderTopicInfoListener$1 f101769t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.rf f101770u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f101771v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$musicPlayEventListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$finderTopicInfoListener$1] */
    public FinderMusicTopicHeaderUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f101761i = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127758ig).getValue()).r()).booleanValue();
        this.f101764o = jz5.h.b(new ea2.i0(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f101766q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$musicPlayEventListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.jk jkVar = event.f54512g;
                java.lang.Integer valueOf = jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null;
                boolean z17 = true;
                if ((((((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) || (valueOf != null && valueOf.intValue() == 7)) || (valueOf != null && valueOf.intValue() == 0)) || (valueOf != null && valueOf.intValue() == 1)) || (valueOf != null && valueOf.intValue() == 4)) {
                    java.lang.Integer valueOf2 = jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null;
                    com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.this;
                    if (finderMusicTopicHeaderUIC.k7()) {
                        if ((valueOf2 == null || valueOf2.intValue() != 0) && (valueOf2 == null || valueOf2.intValue() != 1)) {
                            z17 = false;
                        }
                        if (z17) {
                            finderMusicTopicHeaderUIC.m7();
                        }
                    }
                    finderMusicTopicHeaderUIC.t7();
                }
                return false;
            }
        };
        this.f101767r = new ea2.c0(this);
        this.f101768s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$musicCheckErrorListener$1
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.autogen.events.MusicCheckErrorEvent event = musicCheckErrorEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "musicCheckErrorListener check error");
                if (event.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("FinderMusicTopicHeaderUIC", "musicCheckErrorListener, must has error.");
                    return false;
                }
                com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.this.getClass();
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
        this.f101769t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTopicEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$finderTopicInfoListener$1
            {
                this.__eventId = 1705444769;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTopicEvent finderTopicEvent) {
                com.tencent.mm.autogen.events.FinderTopicEvent event = finderTopicEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.od odVar = event.f54335g;
                if (odVar != null && odVar.f7523a == 15) {
                    com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.this.g7();
                }
                return true;
            }
        };
        this.f101771v = jz5.h.b(new ea2.d0(this, activity));
    }

    public static final void V6(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        finderMusicTopicHeaderUIC.getClass();
        com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "playFeedVideoBgm");
        if (finderMusicTopicHeaderUIC.k7()) {
            finderMusicTopicHeaderUIC.m7();
            return;
        }
        com.tencent.mm.plugin.finder.storage.cd0.f126580a.a("", finderMusicTopicHeaderUIC.f7());
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127903qg).getValue()).r()).booleanValue()) {
            finderMusicTopicHeaderUIC.W6();
            return;
        }
        da2.g Z6 = finderMusicTopicHeaderUIC.Z6();
        ea2.b0 b0Var = new ea2.b0(finderMusicTopicHeaderUIC);
        com.tencent.mm.plugin.finder.storage.FinderItem c18 = Z6.c();
        if (c18 == null) {
            b0Var.invoke();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playFeedVideoBgm isPlaying=");
        zy2.g5 g5Var = Z6.f227757i;
        sb6.append(g5Var != null ? java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) g5Var).isPlaying()) : null);
        sb6.append(" feedId:");
        sb6.append(pm0.v.u(Z6.f227751c));
        sb6.append(" playerView:");
        sb6.append(Z6.f227757i);
        com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", sb6.toString());
        zy2.g5 g5Var2 = Z6.f227757i;
        if (g5Var2 != null) {
            if (((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) g5Var2).isPlaying()) {
                ((com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy) g5Var2).pause();
                return;
            } else {
                zy2.g5.u(g5Var2, null, 1, null);
                return;
            }
        }
        i95.m c19 = i95.n0.c(c50.b1.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.g5 Ri = ((c61.s9) ((c50.b1) c19)).Ri(c18.getFeedObject(), "", 0L, null, new da2.c(b0Var, Z6), null);
        ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) Ri).setOnlyAudio(true);
        Ri.setMute(false);
        ((com.tencent.mm.plugin.finder.video.FinderFluentVideoView) Ri).J(0);
        Z6.f227757i = Ri;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158 A[Catch: JSONException -> 0x00a0, TryCatch #2 {JSONException -> 0x00a0, blocks: (B:104:0x0087, B:106:0x008f, B:108:0x0097, B:22:0x00a7, B:24:0x00b2, B:26:0x00ba, B:28:0x00c4, B:30:0x00d2, B:32:0x00da, B:34:0x00e3, B:36:0x00eb, B:38:0x00f4, B:41:0x00fc, B:43:0x0108, B:45:0x0112, B:47:0x011b, B:49:0x0123, B:51:0x012c, B:52:0x0135, B:54:0x0158, B:55:0x0160, B:57:0x0166), top: B:103:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0 A[Catch: JSONException -> 0x019c, TryCatch #1 {JSONException -> 0x019c, blocks: (B:92:0x0180, B:94:0x018a, B:96:0x0190, B:97:0x0198, B:86:0x01a0, B:87:0x01a6), top: B:91:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p7(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC r24, int r25, java.util.Map r26, java.lang.Long r27, int r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.p7(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC, int, java.util.Map, java.lang.Long, int, int, java.lang.Object):void");
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        this.f101763n = (com.google.android.material.appbar.AppBarLayout) findViewById(com.tencent.mm.R.id.f483235a24);
    }

    @Override // x92.r
    public void T6(com.tencent.mm.protobuf.f fVar) {
        r45.hj2 hj2Var;
        r45.r03 r03Var = (r45.r03) fVar;
        super.T6(r03Var);
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null) {
            return;
        }
        Z6().f227749a = hj2Var;
        this.f101760h = hj2Var.getInteger(12) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0627  */
    @Override // x92.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U6() {
        /*
            Method dump skipped, instructions count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.U6():void");
    }

    public final void W6() {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        r45.zi2 musicInfo = (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null) ? null : (r45.zi2) hj2Var.getCustom(3);
        java.lang.String string = musicInfo != null ? musicInfo.getString(5) : null;
        if (string == null || string.length() == 0) {
            android.app.Activity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.nyb);
            e4Var.b(com.tencent.mm.R.raw.exclamation_mark_circle_filled);
            e4Var.c();
            return;
        }
        da2.g Z6 = Z6();
        Z6.getClass();
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        java.lang.String string2 = musicInfo.getString(5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_audio_bgm_");
        if (com.tencent.mm.sdk.platformtools.t8.K0("")) {
            if (string2 == null) {
                string2 = "";
            }
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str = com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes());
        } else {
            str = "";
        }
        sb6.append(str);
        dk4.a aVar = new dk4.a(sb6.toString(), com.tencent.mm.plugin.finder.assist.e9.f102140i + e9Var.k("bgm", "", musicInfo.getString(5)), musicInfo.getString(5), 0, 0);
        com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "generateMediaInfo for " + aVar.f234484u + ", mediaId:" + aVar.f234482s + ", path:" + aVar.f234483t + ", export path:" + com.tencent.mm.vfs.w6.i(aVar.f234483t, false));
        Z6.j();
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kk4.b Ai = ((cf0.q) qVar).Ai(context2);
        Z6.f227756h = Ai;
        kk4.g0 g0Var = Z6.f227752d;
        if (g0Var != null) {
            ((kk4.v) Ai).f308599x = g0Var;
        }
        ((kk4.v) Ai).B(aVar);
        kk4.b bVar = Z6.f227756h;
        if (bVar != null) {
            ((kk4.v) bVar).A(true);
        }
        kk4.b bVar2 = Z6.f227756h;
        if (bVar2 != null) {
            ((kk4.v) bVar2).f308585j = true;
        }
        if (bVar2 != null) {
            ((kk4.v) bVar2).O();
        }
    }

    public final long X6() {
        return hc2.m0.b(getActivity());
    }

    public final java.lang.String Y6() {
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String string = (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var.getCustom(3)) == null) ? null : zi2Var.getString(0);
        return string == null ? "" : string;
    }

    public final da2.g Z6() {
        return (da2.g) this.f101771v.getValue();
    }

    public final java.util.Map a7() {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        java.lang.String string;
        r45.hj2 hj2Var2;
        lz5.m mVar = new lz5.m();
        mVar.put("source_feedid", pm0.v.u(X6()));
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        mVar.put("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String str2 = "";
        if (r03Var == null || (hj2Var2 = (r45.hj2) r03Var.getCustom(19)) == null || (str = hj2Var2.getString(15)) == null) {
            str = "";
        }
        mVar.put("audioid", str);
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.getCustom(19)) != null && (zi2Var = (r45.zi2) hj2Var.getCustom(3)) != null && (string = zi2Var.getString(12)) != null) {
            str2 = string;
        }
        mVar.put("songid", str2);
        return kz5.b1.b(mVar);
    }

    @Override // x92.r, x92.q
    public void b2() {
        d7().f434726o.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_100));
        d7().f434724m.setTextColor(getResources().getColor(com.tencent.mm.R.color.Link_170));
    }

    public final java.util.Map b7(java.lang.String str) {
        java.lang.String str2;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        lz5.m mVar = new lz5.m();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var.getCustom(3)) == null || (str2 = zi2Var.getString(12)) == null) {
            str2 = "";
        }
        mVar.put("songid", str2);
        android.content.Intent intent = getContext().getIntent();
        mVar.put("music_hub_page_source", java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("key_source_postion", 0) : 0));
        mVar.put("source_feedid", pm0.v.u(X6()));
        if (str.length() > 0) {
            mVar.put("jumper_click_sessionid", str);
        }
        return kz5.b1.b(mVar);
    }

    public final jz5.l c7() {
        android.content.Intent intent = getActivity().getIntent();
        long longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(hc2.m0.b(activity));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = h17 != null ? cu2.u.f222441a.p(h17) : null;
        return p17 != null ? (longExtra == 0 || !hc2.b0.a(p17)) ? (longExtra == 0 && hc2.b0.a(p17)) ? new jz5.l(2, p17) : new jz5.l(0, p17) : new jz5.l(1, p17) : new jz5.l(0, null);
    }

    public final vb2.s d7() {
        return (vb2.s) this.f101764o.getValue();
    }

    public final void e7(java.lang.String str, android.content.Context context, long j17) {
        o7(1);
        da2.g Z6 = Z6();
        java.lang.String obj = d7().f434724m.getText().toString();
        Z6.getClass();
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        Z6.f227754f = obj;
        da2.g Z62 = Z6();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        Z62.g(str, context, 34, j17, r03Var != null ? r03Var.getLong(1) : 0L);
        if (kotlin.jvm.internal.o.b(str, "HeaderPost") || kotlin.jvm.internal.o.b(str, "BottomBar")) {
            p7(this, 104, null, null, kotlin.jvm.internal.o.b(str, "HeaderPost") ? 1 : 2, 6, null);
        }
    }

    public final boolean f7() {
        r45.hj2 hj2Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        return (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null || hj2Var.getInteger(13) != 0) ? false : true;
    }

    public final void g7() {
        d7().f434713b.setReferencedIds(new int[]{com.tencent.mm.R.id.k0_, com.tencent.mm.R.id.k0b, com.tencent.mm.R.id.k08});
        android.widget.LinearLayout musicTopicHeaderPost = d7().f434719h;
        kotlin.jvm.internal.o.f(musicTopicHeaderPost, "musicTopicHeaderPost");
        ym5.a1.h(musicTopicHeaderPost, new ea2.v(this));
        int i17 = 0;
        d7().f434719h.setVisibility(0);
        d7().f434719h.setOnClickListener(new ea2.w(this));
        d7().f434719h.setBackgroundResource(com.tencent.mm.R.drawable.aa7);
        android.widget.TextView textView = d7().f434720i;
        textView.setText(getActivity().getResources().getString(com.tencent.mm.R.string.cxz));
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f478553an));
        vb2.s d76 = d7();
        kotlin.jvm.internal.o.f(d76, "<get-uiBinding>(...)");
        r7(d76);
        android.widget.LinearLayout musicTopicHeaderPost2 = d7().f434719h;
        kotlin.jvm.internal.o.f(musicTopicHeaderPost2, "musicTopicHeaderPost");
        n7(musicTopicHeaderPost2, "music_topic_page_post_button", null);
        d7().f434718g.setOnClickListener(new ea2.r(this));
        vb2.s d77 = d7();
        kotlin.jvm.internal.o.f(d77, "<get-uiBinding>(...)");
        r7(d77);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(d7().f434718g, "music_topic_page_like");
        ((cy1.a) aVar.ik(d7().f434718g, 40, 25496)).Ai(d7().f434718g, new ea2.s(this));
        jz5.l c76 = c7();
        int intValue = ((java.lang.Number) c76.f302833d).intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                d7().f434721j.setVisibility(0);
            } else if (intValue == 2) {
                d7().f434721j.setVisibility(0);
            }
            d7().f434721j.setOnClickListener(new ea2.x(this, c76));
            vb2.s d78 = d7();
            kotlin.jvm.internal.o.f(d78, "<get-uiBinding>(...)");
            r7(d78);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) c76.f302834e;
            android.widget.LinearLayout musicTopicHeaderRingtone = d7().f434721j;
            kotlin.jvm.internal.o.f(musicTopicHeaderRingtone, "musicTopicHeaderRingtone");
            n7(musicTopicHeaderRingtone, "music_topic_page_set_ringtone", kz5.b1.e(new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L))));
        } else {
            d7().f434721j.setVisibility(8);
        }
        u7();
        if (d7().f434719h.getVisibility() == 0) {
            android.widget.LinearLayout linearLayout = d7().f434719h;
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (d7().f434718g.getVisibility() == 8 && d7().f434721j.getVisibility() == 8) {
                    i17 = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs);
                }
                marginLayoutParams.setMarginEnd(i17);
                linearLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[LOOP:0: B:16:0x002b->B:32:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h7(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.g(r6, r0)
            com.tencent.mm.protobuf.f r0 = r5.f452719d
            r45.r03 r0 = (r45.r03) r0
            r1 = 0
            if (r0 == 0) goto L5f
            r2 = 19
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.hj2 r0 = (r45.hj2) r0
            if (r0 == 0) goto L5f
            r2 = 2
            java.util.LinkedList r0 = r0.getList(r2)
            if (r0 == 0) goto L5f
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 == 0) goto L27
        L25:
            r6 = r1
            goto L5c
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            r45.iw2 r2 = (r45.iw2) r2
            int r4 = r6.length()
            if (r4 <= 0) goto L3f
            r4 = r3
            goto L40
        L3f:
            r4 = r1
        L40:
            if (r4 == 0) goto L58
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderContact r2 = (com.tencent.mm.protocal.protobuf.FinderContact) r2
            if (r2 == 0) goto L4f
            java.lang.String r2 = r2.getUsername()
            goto L50
        L4f:
            r2 = 0
        L50:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r6)
            if (r2 == 0) goto L58
            r2 = r3
            goto L59
        L58:
            r2 = r1
        L59:
            if (r2 == 0) goto L2b
            r6 = r3
        L5c:
            if (r6 != r3) goto L5f
            r1 = r3
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.h7(java.lang.String):boolean");
    }

    public final boolean i7() {
        java.lang.String Y6 = Y6();
        if (f7()) {
            return ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).oj(Y6);
        }
        b21.r b17 = b21.m.b();
        if ((b17 != null ? b17.f17346e : null) != null && b17.f17345d == 0 && b21.m.c()) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.D0(b17.f17346e, Y6)) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public final boolean k7() {
        da2.g Z6 = Z6();
        kk4.b bVar = Z6.f227756h;
        if (bVar != null && ((kk4.v) bVar).s()) {
            return true;
        }
        zy2.g5 g5Var = Z6.f227757i;
        return g5Var != null && g5Var.isPlaying();
    }

    public final void l7(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "[loadCover] source:" + str2 + " coverUrl:" + str);
        if (str.length() == 0) {
            pm0.v.X(new ea2.i(imageView));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329965s));
        ea2.y yVar = new ea2.y(str2, this, imageView);
        b17.getClass();
        b17.f447873d = yVar;
        b17.f447879j = new ea2.z(str2, this, imageView);
        b17.f447878i = new ea2.a0(str2, this, imageView);
        b17.c(imageView);
    }

    public final void m7() {
        da2.g Z6 = Z6();
        kk4.b bVar = Z6.f227756h;
        if (bVar != null) {
            kk4.b.i(bVar, false, false, 3, null);
        }
        zy2.g5 g5Var = Z6.f227757i;
        if (g5Var != null) {
            g5Var.pause();
        }
    }

    public final void n7(android.view.View view, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        r45.hj2 hj2Var;
        java.lang.String string;
        r45.hj2 hj2Var2;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var3;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 25496);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(X6()));
        r45.r03 r03Var = (r45.r03) this.f452719d;
        lVarArr[1] = new jz5.l("topicid", (r03Var == null || (hj2Var3 = (r45.hj2) r03Var.getCustom(19)) == null) ? null : pm0.v.u(hj2Var3.getLong(0)));
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        java.lang.String str3 = "";
        if (r03Var2 == null || (hj2Var2 = (r45.hj2) r03Var2.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var2.getCustom(3)) == null || (str2 = zi2Var.getString(12)) == null) {
            str2 = "";
        }
        lVarArr[2] = new jz5.l("songid", str2);
        r45.r03 r03Var3 = (r45.r03) this.f452719d;
        if (r03Var3 != null && (hj2Var = (r45.hj2) r03Var3.getCustom(19)) != null && (string = hj2Var.getString(15)) != null) {
            str3 = string;
        }
        lVarArr[3] = new jz5.l("audioId", str3);
        lVarArr[4] = new jz5.l("docid", Y6());
        android.content.Intent intent = getContext().getIntent();
        lVarArr[5] = new jz5.l("source_position", java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("key_source_postion", 0) : 0));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        if (map != null) {
            k17 = kz5.c1.m(k17, map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, k17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new ea2.e0(this));
    }

    public final void o7(int i17) {
        java.lang.String str;
        r45.hj2 hj2Var;
        java.lang.String string;
        r45.hj2 hj2Var2;
        r45.zi2 zi2Var;
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String str2 = "";
        if (r03Var == null || (hj2Var2 = (r45.hj2) r03Var.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var2.getCustom(3)) == null || (str = zi2Var.getString(12)) == null) {
            str = "";
        }
        jSONObject.put("songid", str);
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.getCustom(19)) != null && (string = hj2Var.getString(15)) != null) {
            str2 = string;
        }
        jSONObject.put("audioId", str2);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "song_start_publish", i17, jSONObject, false, null, 48, null);
    }

    @Override // x92.r, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        alive();
        this.f101768s.alive();
        alive();
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMusicFollowPatPostEvent>(activity) { // from class: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$onCreate$1
            {
                this.__eventId = -698928489;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderMusicFollowPatPostEvent finderMusicFollowPatPostEvent) {
                android.content.Intent intent;
                com.tencent.mm.autogen.events.FinderMusicFollowPatPostEvent event = finderMusicFollowPatPostEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.nc ncVar = event.f54308g;
                android.content.Context context = ncVar.f7419a;
                com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.this;
                if (context == null) {
                    context = finderMusicTopicHeaderUIC.getActivity();
                }
                android.content.Context context2 = ncVar.f7419a;
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                long j17 = 0;
                if (activity2 != null && (intent = activity2.getIntent()) != null) {
                    j17 = intent.getLongExtra("key_source_feed_id", 0L);
                }
                finderMusicTopicHeaderUIC.e7("", context, j17);
                return true;
            }
        }.alive();
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).ij();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
        this.f101768s.dead();
        dead();
        Z6().j();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        m7();
        if (!f7()) {
            b21.r b17 = b21.m.b();
            if ((b17 != null ? b17.f17346e : null) != null && com.tencent.mm.sdk.platformtools.t8.D0(b17.f17346e, Y6())) {
                b21.m.j();
            }
        }
        if (this.f101762m > 0) {
            p7(this, 111, null, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f101762m), 0, 8, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f101762m = java.lang.System.currentTimeMillis();
    }

    public final void q7(android.widget.ImageView imageView, ya2.b2 b2Var) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        r45.xk b17;
        if (imageView != null) {
            if (b2Var == null || (b17 = ya2.d.b(b2Var, false)) == null || (finderAuthInfo = ya2.d.e(b17)) == null) {
                finderAuthInfo = b2Var != null ? b2Var.field_authInfo : null;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f460511a, imageView, finderAuthInfo, 0, 4, null);
        }
    }

    public final void r7(vb2.s sVar) {
        android.widget.TextView musicTopicHeaderPostText = sVar.f434720i;
        kotlin.jvm.internal.o.f(musicTopicHeaderPostText, "musicTopicHeaderPostText");
        com.tencent.mm.ui.fk.b(musicTopicHeaderPostText);
        android.widget.TextView finderMusicTopicFav = sVar.f434715d;
        kotlin.jvm.internal.o.f(finderMusicTopicFav, "finderMusicTopicFav");
        com.tencent.mm.ui.fk.b(finderMusicTopicFav);
        android.widget.TextView musicTopicHeaderRingtoneText = sVar.f434722k;
        kotlin.jvm.internal.o.f(musicTopicHeaderRingtoneText, "musicTopicHeaderRingtoneText");
        com.tencent.mm.ui.fk.b(musicTopicHeaderRingtoneText);
    }

    public final void s7(r45.zi2 zi2Var) {
        java.lang.String string = zi2Var.getString(12);
        if (string == null || string.length() == 0) {
            return;
        }
        zi2Var.set(0, zi2Var.getString(12));
    }

    @Override // x92.r, x92.q
    public void setNormalStyle() {
        r45.hj2 hj2Var;
        java.util.LinkedList list;
        d7().f434726o.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        r45.r03 r03Var = (r45.r03) this.f452719d;
        boolean z17 = false;
        if (r03Var != null && (hj2Var = (r45.hj2) r03Var.getCustom(19)) != null && (list = hj2Var.getList(2)) != null && list.size() > 0 && ((r45.iw2) list.get(0)).getInteger(1) == 1) {
            z17 = true;
        }
        d7().f434724m.setTextColor(getResources().getColor(z17 ? com.tencent.mm.R.color.f479121qk : com.tencent.mm.R.color.BW_0_Alpha_0_5));
    }

    public final void t7() {
        d7().f434727p.setImageResource((k7() || (!this.f101761i && i7())) ? com.tencent.mm.R.raw.pause_filled : com.tencent.mm.R.raw.play_filled);
    }

    public final void u7() {
        if (this.f101760h) {
            d7().f434715d.setText(getContext().getResources().getString(com.tencent.mm.R.string.f491411li4));
        } else {
            d7().f434715d.setText(getContext().getResources().getString(com.tencent.mm.R.string.f491953lk3));
        }
        vb2.s d76 = d7();
        kotlin.jvm.internal.o.f(d76, "<get-uiBinding>(...)");
        r7(d76);
    }
}
