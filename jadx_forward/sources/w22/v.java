package w22;

/* loaded from: classes10.dex */
public final class v implements r22.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f524113a;

    /* renamed from: b, reason: collision with root package name */
    public final r22.d f524114b;

    /* renamed from: c, reason: collision with root package name */
    public final y22.h f524115c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f524116d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 f524117e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f524118f;

    /* renamed from: g, reason: collision with root package name */
    public int f524119g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f524120h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f524121i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f524122j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f524123k;

    /* renamed from: l, reason: collision with root package name */
    public final x22.c f524124l;

    /* renamed from: m, reason: collision with root package name */
    public u22.b f524125m;

    /* renamed from: n, reason: collision with root package name */
    public v22.g f524126n;

    /* renamed from: o, reason: collision with root package name */
    public final w22.o f524127o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f524128p;

    public v(android.content.Context context, r22.d view, y22.h uiNavigation, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 reporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiNavigation, "uiNavigation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        this.f524113a = context;
        this.f524114b = view;
        this.f524115c = uiNavigation;
        this.f524116d = str;
        this.f524117e = reporter;
        this.f524124l = new x22.c();
        this.f524125m = new u22.b();
        this.f524127o = new w22.o(this);
        this.f524128p = new w22.l(this);
    }

    public static final void a(w22.v vVar, java.lang.String str, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        r22.d dVar = vVar.f524114b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 m54948x40031356 = dVar.getF180231i().m54948x40031356();
        h0Var.f391656d = m54948x40031356;
        if (m54948x40031356 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 f180231i = dVar.getF180231i();
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 c13403xae7eeb92 = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92(f180231i.getContext(), null);
            f180231i.f180261g.addView(c13403xae7eeb92, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            c13403xae7eeb92.b(f180231i.m54949xbd40714a(), f180231i.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561884vc));
            f180231i.f180262h.a(f180231i.m54949xbd40714a(), f180231i.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561884vc));
            h0Var.f391656d = c13403xae7eeb92;
            c13403xae7eeb92.setOnClickListener(new w22.u(vVar, h0Var));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92) h0Var.f391656d).f(str, i17, z17);
        dVar.getF180231i().m54951x40b67ed6((b32.c0) h0Var.f391656d);
    }

    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        if (emojiInfo instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) {
            r22.d dVar = this.f524114b;
            int size = dVar.getF180231i().m54943x298172e3().size();
            android.content.Context context = this.f524113a;
            if (size >= 8) {
                db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.bus, 0).show();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab c13401x43e552ab = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab(context);
            c13401x43e552ab.m43712xc040f7d2(emojiInfo);
            c13401x43e552ab.m64933xc84dc82d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 f180231i = dVar.getF180231i();
            f180231i.getClass();
            f180231i.c(new b32.y(f180231i, c13401x43e552ab, matrix));
        }
    }

    public final void c(java.lang.String str, yz5.l lVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        w22.k kVar = new w22.k(lVar);
        x22.c cVar = this.f524124l;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiEmojiTextSpam", "cgiEmojiTextSpam " + str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new x22.b(str, cVar, kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 d(java.lang.String r10, int r11, java.util.ArrayList r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w22.v.d(java.lang.String, int, java.util.ArrayList):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    public final void e() {
        int i17;
        boolean z17;
        int i18;
        int i19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start mix ");
        r22.d dVar = this.f524114b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h = dVar.getF180230h();
        sb6.append(f180230h != null ? f180230h.getF180158n() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", sb6.toString());
        v22.a aVar = new v22.a(dVar.getF180231i().m54949xbd40714a());
        java.util.List<b32.c0> m54944x220820f0 = dVar.getF180231i().m54944x220820f0();
        java.util.ArrayList<java.lang.String> m54943x298172e3 = dVar.getF180231i().m54943x298172e3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 m54948x40031356 = dVar.getF180231i().m54948x40031356();
        int m54962xc0089f80 = m54948x40031356 != null ? m54948x40031356.m54962xc0089f80() : 0;
        java.lang.String m54945xfdb75767 = dVar.getF180231i().m54945xfdb75767();
        java.util.Iterator<b32.c0> it = m54944x220820f0.iterator();
        while (it.hasNext()) {
            av3.a e17 = zu3.n.e(it.next(), null, 1, null);
            if (e17 != null) {
                ((java.util.ArrayList) aVar.f514326a).add(e17);
            }
        }
        v22.g gVar = this.f524126n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = this.f524117e;
        if (gVar == null) {
            c13384x547d8141.f180126q = dVar.getF180231i().m54945xfdb75767();
            c13384x547d8141.f180127r = m54962xc0089f80;
            c13384x547d8141.f180128s = this.f524123k;
            c13384x547d8141.f180129t = this.f524122j;
            c13384x547d8141.f180130u = m54943x298172e3.size();
            int i27 = m54962xc0089f80;
            c13384x547d8141.f180125p = java.lang.System.currentTimeMillis() - c13384x547d8141.f180116d;
            t85.j jVar = this.f524125m.f505511e;
            c13384x547d8141.A = jVar != null ? jVar.f498007a : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13384x547d8141.f180126q)) {
                c13384x547d8141.f180126q = c13384x547d8141.f180126q.replace(",", " ");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[20];
            objArr[0] = java.lang.Long.valueOf(c13384x547d8141.f180116d);
            objArr[1] = java.lang.Long.valueOf(c13384x547d8141.f180125p);
            objArr[2] = java.lang.Long.valueOf(c13384x547d8141.f180123n);
            objArr[3] = java.lang.Long.valueOf(c13384x547d8141.f180124o);
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = c13384x547d8141.f180126q;
            objArr[7] = java.lang.Integer.toHexString(c13384x547d8141.f180127r & 16777215);
            objArr[8] = java.lang.Integer.valueOf(c13384x547d8141.f180128s ? 1 : 0);
            objArr[9] = java.lang.Integer.valueOf(c13384x547d8141.f180129t ? 1 : 0);
            objArr[10] = java.lang.Integer.valueOf(c13384x547d8141.f180130u);
            objArr[11] = java.lang.Integer.valueOf(c13384x547d8141.f180131v ? 1 : 0);
            objArr[12] = java.lang.Integer.valueOf(c13384x547d8141.f180132w);
            objArr[13] = c13384x547d8141.f180133x;
            objArr[14] = "";
            objArr[15] = "";
            objArr[16] = java.lang.Integer.valueOf(c13384x547d8141.f180134y ? 2 : 1);
            objArr[17] = c13384x547d8141.f180135z;
            objArr[18] = c13384x547d8141.A;
            objArr[19] = c13384x547d8141.D;
            g0Var.d(15989, objArr);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 d17 = d(m54945xfdb75767, i27, m54943x298172e3);
            v22.j jVar2 = v22.j.f514357a;
            u22.b bVar = this.f524125m;
            int i28 = bVar.f505507a;
            long j17 = d17.f68648x46085dc4;
            java.lang.String str = bVar.f505509c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h2 = dVar.getF180230h();
            i17 = 3;
            int m54880xebd4cfaa = f180230h2 != null ? (int) f180230h2.m54880xebd4cfaa() : 1;
            i18 = 4;
            z17 = true;
            this.f524126n = jVar2.a(i28, j17, str, aVar, m54880xebd4cfaa, this.f524123k, this.f524125m.f505511e, d17);
            i19 = 5;
        } else {
            int i29 = m54962xc0089f80;
            i17 = 3;
            z17 = true;
            long j18 = c13384x547d8141.f180116d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "deleteEmojiInfoByEnterTime: " + j18);
            z85.l c17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c();
            c17.getClass();
            if (j18 != 0) {
                if (c17.f552341d.mo70514xb06685ab("EmojiInfo", "captureEnterTime=" + j18, null) > 0) {
                    c17.mo145247xf35bbb4("event_update_emoji");
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 d18 = d(m54945xfdb75767, i29, m54943x298172e3);
            v22.j jVar3 = v22.j.f514357a;
            u22.b bVar2 = this.f524125m;
            int i37 = bVar2.f505507a;
            long j19 = d18.f68648x46085dc4;
            java.lang.String str2 = bVar2.f505509c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h3 = dVar.getF180230h();
            int m54880xebd4cfaa2 = f180230h3 != null ? (int) f180230h3.m54880xebd4cfaa() : 1;
            i18 = 4;
            i19 = 5;
            this.f524126n = jVar3.a(i37, j19, str2, aVar, m54880xebd4cfaa2, this.f524123k, this.f524125m.f505511e, d18);
        }
        g();
        int i38 = this.f524125m.f505507a;
        boolean z18 = (i38 == i17 || i38 == i18 || i38 == i19) ? z17 : false;
        y22.h hVar = this.f524115c;
        if (!z18) {
            y22.h.a(hVar, z17, null, 2, null);
            return;
        }
        java.lang.Runnable runnable = this.f524128p;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 60000L);
        android.content.Context context = this.f524113a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ((y22.m) hVar).f(context, string, false, 0, null);
        qr.e eVar = qr.e.f447541a;
        long j27 = this.f524125m.f505508b;
        w22.o callback = this.f524127o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new qr.c(j27, callback));
    }

    public boolean f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBack: ");
        r22.d dVar = this.f524114b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e) dVar;
        sb6.append(c13397xbda8fd8e.getVisibility() == 0);
        sb6.append(' ');
        sb6.append(c13397xbda8fd8e.f180232m.getVisibility() == 0);
        sb6.append(' ');
        sb6.append(c13397xbda8fd8e.f180240u.getVisibility() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", sb6.toString());
        if (!(c13397xbda8fd8e.getVisibility() == 0)) {
            return false;
        }
        if (c13397xbda8fd8e.f180232m.getVisibility() == 0) {
            c13397xbda8fd8e.b(false, null, 0);
            return true;
        }
        if (c13397xbda8fd8e.f180240u.getVisibility() == 0) {
            c13397xbda8fd8e.a(false);
            return true;
        }
        this.f524123k = false;
        this.f524122j = false;
        this.f524118f = null;
        this.f524120h = false;
        this.f524121i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h = dVar.getF180230h();
        com.p314xaae8f345.mm.vfs.w6.h(f180230h != null ? f180230h.getF180158n() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e) dVar;
        c13397xbda8fd8e2.f180234o.setSelected(false);
        c13397xbda8fd8e2.f180235p.setSelected(false);
        c13397xbda8fd8e2.f180237r.setImageDrawable(c13397xbda8fd8e2.f180242w);
        c13397xbda8fd8e2.f180238s.setImageDrawable(c13397xbda8fd8e2.f180244y);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = c13397xbda8fd8e2.f180230h;
        if (c13390xb12545d7 != null) {
            c13390xb12545d7.m54890x360802();
        }
        c13397xbda8fd8e2.f180229g.removeView(c13397xbda8fd8e2.f180230h);
        c13397xbda8fd8e2.f180230h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 f180231i = dVar.getF180231i();
        f180231i.b();
        f180231i.f180261g.removeAllViews();
        this.f524126n = null;
        i(true);
        ((y22.m) this.f524115c).d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = this.f524117e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(9, c13384x547d8141.f180116d, 0L, 0L, 0L, 0L, 0L, 0, 0, c13384x547d8141.G);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if ((r1 != null ? r1.n() : false) == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.EditorPresenter"
            java.lang.String r1 = "pause"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r22.d r0 = r5.f524114b
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r1 = r0.getF180230h()
            r2 = 0
            if (r1 == 0) goto L1f
            ph3.k r1 = r1.f180159o
            if (r1 == 0) goto L1a
            boolean r1 = r1.n()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r3 = 1
            if (r1 != r3) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L45
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r1 = r0.getF180230h()
            if (r1 == 0) goto L45
            ph3.k r3 = r1.f180159o
            if (r3 == 0) goto L43
            boolean r3 = r3.n()
            if (r3 == 0) goto L43
            ph3.k r3 = r1.f180159o
            if (r3 == 0) goto L39
            r3.mo158541x65825f6()
        L39:
            y22.q r3 = new y22.q
            r3.<init>(r1)
            y22.g r4 = r1.f180157m
            r4.b(r3)
        L43:
            r1.f180167w = r2
        L45:
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r0.getF180231i()
            r0.b()
            r5.i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w22.v.g():void");
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "resume");
        r22.d dVar = this.f524114b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h = dVar.getF180230h();
        if (f180230h != null) {
            f180230h.m54889x68ac462();
        }
        android.view.ViewGroup viewGroup = dVar.getF180231i().f180261g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                ((b32.c0) childAt).mo9752xc84dc82d();
            }
        }
        i(true);
    }

    public final void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "toggleTouch: " + z17);
        android.content.Context context = this.f524113a;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (z17) {
                activity.getWindow().clearFlags(16);
            } else {
                activity.getWindow().addFlags(16);
            }
        }
    }

    public void j(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "updateText " + str);
        android.content.Context context = this.f524113a;
        c(str, new w22.t(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null), this, str, i17, z17));
    }
}
