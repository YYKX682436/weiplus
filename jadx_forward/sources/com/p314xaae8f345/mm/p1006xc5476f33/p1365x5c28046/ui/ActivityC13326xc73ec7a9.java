package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity;", "Lcom/tencent/mm/plugin/emoji/ui/EmojiEditorActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity */
/* loaded from: classes10.dex */
public final class ActivityC13326xc73ec7a9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 {
    public static final /* synthetic */ int R = 0;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 G;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 H;
    public android.view.View I;
    public int K;
    public java.util.List L;
    public boolean N;
    public java.lang.String Q;
    public final p3325xe03a0797.p3326xc267989b.y0 E = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: J, reason: collision with root package name */
    public java.util.List f179416J = new java.util.ArrayList();
    public final long M = java.lang.System.currentTimeMillis();
    public final jz5.g P = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.a5(this));

    public static final void o7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        if (activityC13326xc73ec7a9.N) {
            return;
        }
        activityC13326xc73ec7a9.N = true;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC13326xc73ec7a9.F;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i5(activityC13326xc73ec7a9));
        }
    }

    public static final void p7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9, int i17) {
        if (i17 != activityC13326xc73ec7a9.K) {
            if (i17 >= 0 && i17 < ((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchMedia: from=");
                sb6.append(activityC13326xc73ec7a9.K);
                sb6.append(", to=");
                sb6.append(i17);
                sb6.append(", oldMedia=");
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(activityC13326xc73ec7a9.f179416J, activityC13326xc73ec7a9.K);
                sb6.append(g2Var != null ? g2Var.f179562a : null);
                sb6.append(", newMedia=");
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(activityC13326xc73ec7a9.f179416J, i17);
                sb6.append(g2Var2 != null ? g2Var2.f179562a : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
                int i18 = activityC13326xc73ec7a9.K;
                activityC13326xc73ec7a9.u7();
                activityC13326xc73ec7a9.v7();
                activityC13326xc73ec7a9.b7().removeAllViews();
                activityC13326xc73ec7a9.b7().m54750xa0e1083e(null);
                activityC13326xc73ec7a9.d7().d();
                activityC13326xc73ec7a9.c7().b();
                activityC13326xc73ec7a9.K = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) ((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).get(i17);
                activityC13326xc73ec7a9.f179289d = g2Var3.b();
                boolean a17 = g2Var3.a();
                activityC13326xc73ec7a9.f179290e = a17;
                boolean z17 = true ^ a17;
                android.view.View findViewById = activityC13326xc73ec7a9.findViewById(com.p314xaae8f345.mm.R.id.byi);
                int i19 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = activityC13326xc73ec7a9.findViewById(com.p314xaae8f345.mm.R.id.f564248ly);
                int i27 = z17 ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById3 = activityC13326xc73ec7a9.findViewById(com.p314xaae8f345.mm.R.id.ojo);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = activityC13326xc73ec7a9.f179299q;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gifEditTip");
                    throw null;
                }
                textView.setVisibility(activityC13326xc73ec7a9.f179290e ? 0 : 8);
                activityC13326xc73ec7a9.e7();
                p3325xe03a0797.p3326xc267989b.l.d(activityC13326xc73ec7a9.E, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u5(activityC13326xc73ec7a9, null), 3, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var = activityC13326xc73ec7a9.G;
                if (x4Var != null) {
                    x4Var.m8147xed6e4d18(i18);
                    x4Var.m8147xed6e4d18(i17);
                }
            }
        }
    }

    public static final void q7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        android.view.View view;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC13326xc73ec7a9.F;
        if (c1163xf1deaba4 == null || (view = activityC13326xc73ec7a9.I) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var = activityC13326xc73ec7a9.G;
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e((x4Var != null ? x4Var.mo1894x7e414b06() : 0) - 1);
        float f17 = mo7935xa188593e != null && c1162x665295de.m8015x62a22a5b(mo7935xa188593e) <= c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingEnd() ? 0.0f : 1.0f;
        if ((view.getAlpha() == f17) && view.getAnimation() == null) {
            return;
        }
        view.animate().cancel();
        view.animate().alpha(f17).setDuration(300L).start();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(this.f179416J, this.K);
        if (g2Var == null) {
            return;
        }
        this.f179290e = g2Var.a();
        this.f179289d = g2Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRenderViewController, path: ");
        java.lang.String str = g2Var.f179562a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
        this.f179304v = this.f179289d ? new p12.e(this, b7(), str) : g2Var.a() ? new p12.c(this, b7(), str) : new p12.d(this, b7(), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void f7() {
        android.graphics.Bitmap bitmap;
        int i17;
        int i18;
        java.lang.String str = this.Q;
        if (!(str == null || str.length() == 0)) {
            java.lang.String c17 = or.c.c("clk_edit_add_button", str, java.lang.Integer.valueOf(((java.util.ArrayList) this.f179416J).size()), or.c.d(r7()), null, 16, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(this.f179416J, 0);
            or.d.c(str, 4, s7(), java.lang.Integer.valueOf(g2Var != null && g2Var.b() ? 3 : g2Var != null && g2Var.a() ? 4 : 1), 0, c17, 16, null);
        }
        if (getIntent().hasExtra("finder_object_bytes")) {
            android.util.Size size = (android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb();
            android.graphics.Rect videoClipBounds = b7().getVideoClipBounds();
            if (videoClipBounds == null) {
                videoClipBounds = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
            }
            X6(videoClipBounds);
            return;
        }
        u7();
        this.C = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572632bw4), true, true, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.b5.f179437d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size2 = ((java.util.ArrayList) this.f179416J).size();
        int i19 = 0;
        while (true) {
            android.graphics.Bitmap bitmap2 = null;
            if (i19 >= size2) {
                t7();
                p3325xe03a0797.p3326xc267989b.l.d(this.E, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d5(arrayList, this, null), 2, null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(this.f179416J, i19);
            if (g2Var2 != null) {
                if (g2Var2.b()) {
                    i17 = g2Var2.f179570i.getWidth();
                    i18 = g2Var2.f179570i.getHeight();
                    bitmap = null;
                } else {
                    android.graphics.Bitmap a17 = p12.f.a(p12.g.f432552i, g2Var2.f179562a, 0, 0, 6, null);
                    int width = a17 != null ? a17.getWidth() : 0;
                    int height = a17 != null ? a17.getHeight() : 0;
                    bitmap = a17;
                    i17 = width;
                    i18 = height;
                }
                android.graphics.Rect rect = g2Var2.f179564c;
                android.graphics.Rect rect2 = rect != null ? new android.graphics.Rect(rect) : new android.graphics.Rect(0, 0, i17, i18);
                jz5.l U6 = U6(i17, i18, rect2);
                int intValue = ((java.lang.Number) U6.f384366d).intValue();
                int intValue2 = ((java.lang.Number) U6.f384367e).intValue();
                if (!g2Var2.f179565d.isEmpty()) {
                    d7().d();
                    for (o12.u uVar : g2Var2.f179565d) {
                        if (uVar.f423721f.isEmpty()) {
                            uVar.f423721f.set(b7().m54744xe4c43e8c());
                        }
                        d7().a(uVar);
                    }
                    android.graphics.Rect rect3 = g2Var2.f179568g;
                    bitmap2 = rect3 != null ? d7().b(rect2.width(), rect2.height(), rect3) : com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e.c(d7(), rect2.width(), rect2.height(), null, 4, null);
                    d7().d();
                }
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e5(g2Var2.f179562a, rect2, intValue, intValue2, bitmap2, g2Var2.a(), g2Var2.b(), bitmap, g2Var2.f179569h));
            }
            i19++;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void h7(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "onActivityResult data is null");
            }
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void j7() {
        java.util.List list = this.L;
        if (list != null) {
            int i17 = this.K;
            if (list == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reportDataList");
                throw null;
            }
            if (i17 >= list.size()) {
                return;
            }
            v7();
            java.util.List list2 = this.L;
            if (list2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reportDataList");
                throw null;
            }
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4) it.next()).k();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void l7() {
        super.l7();
        findViewById(com.p314xaae8f345.mm.R.id.twi).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j5(this));
        findViewById(com.p314xaae8f345.mm.R.id.l3w).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k5(this));
        findViewById(com.p314xaae8f345.mm.R.id.byi).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l5(this));
        findViewById(com.p314xaae8f345.mm.R.id.bye).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m5(this));
        findViewById(com.p314xaae8f345.mm.R.id.byg).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n5(this));
        findViewById(com.p314xaae8f345.mm.R.id.f567932ut2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r5(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void m7() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        if (!getIntent().hasExtra("finder_object_bytes")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(this.f179416J, this.K);
            if (g2Var == null) {
                return;
            }
            this.f179290e = g2Var.a();
            this.f179289d = g2Var.b();
        }
        int size = ((java.util.ArrayList) this.f179416J).size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) ((java.util.ArrayList) this.f179416J).get(i17);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4();
            c6402x7f01bdb4.f137496d = this.f179308z == 46 ? 21L : 20L;
            c6402x7f01bdb4.f137498f = g2Var2.b() ? 2L : g2Var2.a() ? 1L : 0L;
            c6402x7f01bdb4.N = this.M;
            c6402x7f01bdb4.f137518z = c6402x7f01bdb4.b("EditStickerSessionID", this.f179306x, true);
            arrayList.add(c6402x7f01bdb4);
        }
        this.L = arrayList;
        p3325xe03a0797.p3326xc267989b.l.d(this.E, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.f5(this, null), 2, null);
        super.m7();
        this.H = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f567932ut2);
        if (((java.util.ArrayList) this.f179416J).size() <= 1) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.vet);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.twi);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.g6_);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.H;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.vet);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.twi);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.g6_);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById6, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.vep);
        this.F = c1163xf1deaba42;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 0, false));
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w5(this));
            this.G = x4Var;
            c1163xf1deaba42.mo7960x6cab2c8d(x4Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var2 = this.G;
        if (x4Var2 != null) {
            x4Var2.f180092f = kz5.n0.S0(this.f179416J);
            x4Var2.m8146xced61ae5();
        }
        this.I = findViewById(com.p314xaae8f345.mm.R.id.ver);
        if (((java.util.ArrayList) this.f179416J).size() > 1 && (c1163xf1deaba4 = this.F) != null) {
            c1163xf1deaba4.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x5(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.H;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82037xa10c26f6(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.H;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f78832xf55ebe89);
        }
        o12.d0 d0Var = this.f179300r;
        d0Var.f423677h = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y5(d0Var.f423677h, this);
        d7().m54765xacb2a879(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z5(d7().getOnTextDragEnd()));
        d7().m54764x9769c6ec(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.a6(this));
        d7().m54768xe6aaf7ff(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.b6(this));
        d7().m54767x7bc859d2(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c6(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int[] intArrayExtra = getIntent().getIntArrayExtra("media_type_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("media_path_list");
        if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty()) && intArrayExtra != null) {
            if (!(intArrayExtra.length == 0)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
                int i17 = 0;
                for (java.lang.Object obj : stringArrayListExtra) {
                    int i18 = i17 + 1;
                    java.lang.Object obj2 = null;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = (java.lang.String) obj;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4.f180108e;
                    int i19 = (i17 < 0 || i17 > intArrayExtra.length + (-1)) ? 0 : intArrayExtra[i17];
                    y4Var.getClass();
                    java.util.Iterator it = ((kz5.h) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4.f180113m).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4) next).f180114d == i19) {
                            obj2 = next;
                            break;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4 z4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4) obj2;
                    if (z4Var == null) {
                        z4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4.f180109f;
                    }
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2(str, z4Var));
                    i17 = i18;
                }
                this.f179416J = kz5.n0.V0(arrayList);
            }
        }
        this.Q = getIntent().getStringExtra("addstickers_sessionid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate: mediaList size=");
        sb6.append(this.f179416J.size());
        sb6.append(", paths=");
        java.util.List list = this.f179416J;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) it6.next()).f179562a);
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p3325xe03a0797.p3326xc267989b.z0.e(this.E, null, 1, null);
        c7().b();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.F;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(null);
        }
        this.F = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.util.Iterator it = this.f179416J.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) it.next()).f179571j = null;
        }
    }

    public final java.util.List r7() {
        java.util.List list = this.f179416J;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) obj;
            arrayList.add(new or.a(i18, s7(), g2Var.b() ? 3 : g2Var.a() ? 4 : 1, null, 8, null));
            i17 = i18;
        }
        return arrayList;
    }

    public final int s7() {
        return ((java.lang.Number) ((jz5.n) this.P).mo141623x754a37bb()).intValue();
    }

    public final void t7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(this.f179416J, this.K);
        if (g2Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "restoreEditState: index=" + this.K + ", decorations count=" + g2Var.f179565d.size());
        b7().m54750xa0e1083e(g2Var.f179564c);
        int i17 = 0;
        for (java.lang.Object obj : g2Var.f179565d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            o12.u uVar = (o12.u) obj;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreEditState: from media[");
            sb6.append(i17);
            sb6.append("] scale=");
            sb6.append(uVar.f423722g);
            sb6.append(", bounds=");
            android.graphics.Rect rect = uVar.f423719d;
            sb6.append(rect);
            sb6.append(", viewBounds=");
            android.graphics.Rect rect2 = uVar.f423721f;
            sb6.append(rect2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
            o12.u a17 = o12.u.a(uVar, null, null, 0, new android.graphics.Rect(rect), 0.0f, new android.graphics.Rect(rect2), 0.0f, 0.0f, false, 471, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "restoreEditState: after copy[" + i17 + "] scale=" + a17.f423722g);
            android.graphics.Rect rect3 = a17.f423721f;
            if (rect3.isEmpty()) {
                android.graphics.Rect m54744xe4c43e8c = b7().m54744xe4c43e8c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "restoreEditState: viewBounds is empty, set to " + m54744xe4c43e8c);
                rect3.set(m54744xe4c43e8c);
            }
            d7().a(a17);
            i17 = i18;
        }
    }

    public final void u7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(this.f179416J, this.K);
        if (g2Var == null) {
            return;
        }
        java.util.List<o12.u> m54753xffdfa48d = d7().m54753xffdfa48d();
        int i17 = 0;
        for (java.lang.Object obj : m54753xffdfa48d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            o12.u uVar = (o12.u) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "saveCurrentEditState: from container[" + i17 + "] scale=" + uVar.f423722g + ", bounds=" + uVar.f423719d + ", viewBounds=" + uVar.f423721f);
            i17 = i18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m54753xffdfa48d, 10));
        for (o12.u uVar2 : m54753xffdfa48d) {
            o12.u a17 = o12.u.a(uVar2, null, null, 0, new android.graphics.Rect(uVar2.f423719d), 0.0f, new android.graphics.Rect(uVar2.f423721f), 0.0f, 0.0f, false, 471, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "saveCurrentEditState: after copy scale=" + a17.f423722g);
            arrayList.add(a17);
        }
        g2Var.f179565d = arrayList;
        g2Var.f179566e = a7().f178986e;
        android.util.Range range = c7().f432559e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "<set-?>");
        g2Var.f179569h = range;
        android.util.Size size = (android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "<set-?>");
        g2Var.f179570i = size;
        g2Var.f179568g = new android.graphics.Rect(b7().getVisibleBounds());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "saveCurrentEditState: saved to media[" + this.K + "], decorations count=" + g2Var.f179565d.size() + ", timeRange=" + g2Var.f179569h + ", mediaSize=" + g2Var.f179570i + ", textVideoBounds=" + g2Var.f179568g);
    }

    public final void v7() {
        java.util.List list = this.L;
        if (list == null || this.K >= ((java.util.ArrayList) list).size()) {
            return;
        }
        java.util.List list2 = this.L;
        if (list2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reportDataList");
            throw null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb4 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4) ((java.util.ArrayList) list2).get(this.K);
        long j17 = c6402x7f01bdb4.f137504l;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb42 = this.B;
        c6402x7f01bdb4.f137504l = j17 + c6402x7f01bdb42.f137504l;
        c6402x7f01bdb4.f137502j += c6402x7f01bdb42.f137502j;
        c6402x7f01bdb4.B += c6402x7f01bdb42.B;
        c6402x7f01bdb4.C += c6402x7f01bdb42.C;
        c6402x7f01bdb4.D += c6402x7f01bdb42.D;
        c6402x7f01bdb4.E += c6402x7f01bdb42.E;
        c6402x7f01bdb4.F += c6402x7f01bdb42.F;
        c6402x7f01bdb4.G += c6402x7f01bdb42.G;
        c6402x7f01bdb4.H = c6402x7f01bdb4.b("ClickWithdrawCnt", c6402x7f01bdb4.H + this.B.H, true);
        c6402x7f01bdb4.I = c6402x7f01bdb4.b("ClickRedoCnt", c6402x7f01bdb4.I + this.B.I, true);
        c6402x7f01bdb4.f137495J = c6402x7f01bdb4.f137495J + this.B.f137495J;
        c6402x7f01bdb4.f137499g = (long) c7().f432557c;
        c6402x7f01bdb4.f137500h = (long) ((android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb()).getWidth();
        c6402x7f01bdb4.f137501i = ((android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb()).getHeight();
        c6402x7f01bdb4.f137503k = d7().m54761xc1118a8b().size();
        int intValue = ((java.lang.Number) c7().f432559e.getUpper()).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c7().f432559e.getLower(), "getLower(...)");
        c6402x7f01bdb4.f137508p = intValue - ((java.lang.Number) r3).intValue();
        android.graphics.Rect b17 = a7().b();
        c6402x7f01bdb4.f137505m = b17.width();
        c6402x7f01bdb4.f137506n = b17.height();
        e06.k m17 = e06.p.m(0, d7().getChildCount());
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e d76 = d7();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        kz5.x0 it = m17.iterator();
        while (((e06.j) it).f327747f) {
            arrayList.add(d76.getChildAt(it.b()));
        }
        java.util.List I = kz5.j0.I(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(I, 10));
        java.util.Iterator it6 = ((java.util.ArrayList) I).iterator();
        while (it6.hasNext()) {
            java.lang.Object tag = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84) it6.next()).getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextInputViewController.TextDecoration");
            arrayList2.add((o12.u) tag);
        }
        c6402x7f01bdb4.f137512t = c6402x7f01bdb4.b("TextWidgetContentList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d6.f179470d, 30, null), true);
        c6402x7f01bdb4.f137516x = c6402x7f01bdb4.b("TextWidgetContentColourList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e6.f179497d, 30, null), true);
        c6402x7f01bdb4.f137517y = c6402x7f01bdb4.b("IsCroppedUsingPredefinedRatio", a7().f178986e ? "1.0" : "", true);
        c6402x7f01bdb4.A = c6402x7f01bdb4.b("TextWidgetContentStyleList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.f6.f179520d, 30, null), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "snapshotReportData: updated reportData for index=" + this.K);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb43 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4();
        c6402x7f01bdb43.f137496d = this.f179308z == 46 ? 21L : 20L;
        c6402x7f01bdb43.f137497e = 0L;
        c6402x7f01bdb43.f137509q = 0L;
        c6402x7f01bdb43.N = this.M;
        this.B = c6402x7f01bdb43;
    }
}
