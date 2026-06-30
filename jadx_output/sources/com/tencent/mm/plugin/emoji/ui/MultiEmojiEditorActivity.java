package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity;", "Lcom/tencent/mm/plugin/emoji/ui/EmojiEditorActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MultiEmojiEditorActivity extends com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity {
    public static final /* synthetic */ int R = 0;
    public androidx.recyclerview.widget.RecyclerView F;
    public com.tencent.mm.plugin.emoji.ui.x4 G;
    public com.tencent.mm.ui.widget.imageview.WeImageView H;
    public android.view.View I;
    public int K;
    public java.util.List L;
    public boolean N;
    public java.lang.String Q;
    public final kotlinx.coroutines.y0 E = kotlinx.coroutines.z0.b();

    /* renamed from: J, reason: collision with root package name */
    public java.util.List f97883J = new java.util.ArrayList();
    public final long M = java.lang.System.currentTimeMillis();
    public final jz5.g P = jz5.h.b(new com.tencent.mm.plugin.emoji.ui.a5(this));

    public static final void o7(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        if (multiEmojiEditorActivity.N) {
            return;
        }
        multiEmojiEditorActivity.N = true;
        androidx.recyclerview.widget.RecyclerView recyclerView = multiEmojiEditorActivity.F;
        if (recyclerView != null) {
            recyclerView.post(new com.tencent.mm.plugin.emoji.ui.i5(multiEmojiEditorActivity));
        }
    }

    public static final void p7(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity, int i17) {
        if (i17 != multiEmojiEditorActivity.K) {
            if (i17 >= 0 && i17 < ((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchMedia: from=");
                sb6.append(multiEmojiEditorActivity.K);
                sb6.append(", to=");
                sb6.append(i17);
                sb6.append(", oldMedia=");
                com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(multiEmojiEditorActivity.f97883J, multiEmojiEditorActivity.K);
                sb6.append(g2Var != null ? g2Var.f98029a : null);
                sb6.append(", newMedia=");
                com.tencent.mm.plugin.emoji.ui.g2 g2Var2 = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(multiEmojiEditorActivity.f97883J, i17);
                sb6.append(g2Var2 != null ? g2Var2.f98029a : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
                int i18 = multiEmojiEditorActivity.K;
                multiEmojiEditorActivity.u7();
                multiEmojiEditorActivity.v7();
                multiEmojiEditorActivity.b7().removeAllViews();
                multiEmojiEditorActivity.b7().setVideoClipBounds(null);
                multiEmojiEditorActivity.d7().d();
                multiEmojiEditorActivity.c7().b();
                multiEmojiEditorActivity.K = i17;
                com.tencent.mm.plugin.emoji.ui.g2 g2Var3 = (com.tencent.mm.plugin.emoji.ui.g2) ((java.util.ArrayList) multiEmojiEditorActivity.f97883J).get(i17);
                multiEmojiEditorActivity.f97756d = g2Var3.b();
                boolean a17 = g2Var3.a();
                multiEmojiEditorActivity.f97757e = a17;
                boolean z17 = true ^ a17;
                android.view.View findViewById = multiEmojiEditorActivity.findViewById(com.tencent.mm.R.id.byi);
                int i19 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = multiEmojiEditorActivity.findViewById(com.tencent.mm.R.id.f482715ly);
                int i27 = z17 ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById3 = multiEmojiEditorActivity.findViewById(com.tencent.mm.R.id.ojo);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "updateEditButtonsVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = multiEmojiEditorActivity.f97766q;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("gifEditTip");
                    throw null;
                }
                textView.setVisibility(multiEmojiEditorActivity.f97757e ? 0 : 8);
                multiEmojiEditorActivity.e7();
                kotlinx.coroutines.l.d(multiEmojiEditorActivity.E, null, null, new com.tencent.mm.plugin.emoji.ui.u5(multiEmojiEditorActivity, null), 3, null);
                com.tencent.mm.plugin.emoji.ui.x4 x4Var = multiEmojiEditorActivity.G;
                if (x4Var != null) {
                    x4Var.notifyItemChanged(i18);
                    x4Var.notifyItemChanged(i17);
                }
            }
        }
    }

    public static final void q7(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        android.view.View view;
        androidx.recyclerview.widget.RecyclerView recyclerView = multiEmojiEditorActivity.F;
        if (recyclerView == null || (view = multiEmojiEditorActivity.I) == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        com.tencent.mm.plugin.emoji.ui.x4 x4Var = multiEmojiEditorActivity.G;
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition((x4Var != null ? x4Var.getItemCount() : 0) - 1);
        float f17 = findViewByPosition != null && linearLayoutManager.getDecoratedRight(findViewByPosition) <= recyclerView.getWidth() - recyclerView.getPaddingEnd() ? 0.0f : 1.0f;
        if ((view.getAlpha() == f17) && view.getAnimation() == null) {
            return;
        }
        view.animate().cancel();
        view.animate().alpha(f17).setDuration(300L).start();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void e7() {
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(this.f97883J, this.K);
        if (g2Var == null) {
            return;
        }
        this.f97757e = g2Var.a();
        this.f97756d = g2Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRenderViewController, path: ");
        java.lang.String str = g2Var.f98029a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
        this.f97771v = this.f97756d ? new p12.e(this, b7(), str) : g2Var.a() ? new p12.c(this, b7(), str) : new p12.d(this, b7(), str);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void f7() {
        android.graphics.Bitmap bitmap;
        int i17;
        int i18;
        java.lang.String str = this.Q;
        if (!(str == null || str.length() == 0)) {
            java.lang.String c17 = or.c.c("clk_edit_add_button", str, java.lang.Integer.valueOf(((java.util.ArrayList) this.f97883J).size()), or.c.d(r7()), null, 16, null);
            com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(this.f97883J, 0);
            or.d.c(str, 4, s7(), java.lang.Integer.valueOf(g2Var != null && g2Var.b() ? 3 : g2Var != null && g2Var.a() ? 4 : 1), 0, c17, 16, null);
        }
        if (getIntent().hasExtra("finder_object_bytes")) {
            android.util.Size size = (android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue();
            android.graphics.Rect videoClipBounds = b7().getVideoClipBounds();
            if (videoClipBounds == null) {
                videoClipBounds = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
            }
            X6(videoClipBounds);
            return;
        }
        u7();
        this.C = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f491099bw4), true, true, com.tencent.mm.plugin.emoji.ui.b5.f97904d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size2 = ((java.util.ArrayList) this.f97883J).size();
        int i19 = 0;
        while (true) {
            android.graphics.Bitmap bitmap2 = null;
            if (i19 >= size2) {
                t7();
                kotlinx.coroutines.l.d(this.E, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.emoji.ui.d5(arrayList, this, null), 2, null);
                return;
            }
            com.tencent.mm.plugin.emoji.ui.g2 g2Var2 = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(this.f97883J, i19);
            if (g2Var2 != null) {
                if (g2Var2.b()) {
                    i17 = g2Var2.f98037i.getWidth();
                    i18 = g2Var2.f98037i.getHeight();
                    bitmap = null;
                } else {
                    android.graphics.Bitmap a17 = p12.f.a(p12.g.f351019i, g2Var2.f98029a, 0, 0, 6, null);
                    int width = a17 != null ? a17.getWidth() : 0;
                    int height = a17 != null ? a17.getHeight() : 0;
                    bitmap = a17;
                    i17 = width;
                    i18 = height;
                }
                android.graphics.Rect rect = g2Var2.f98031c;
                android.graphics.Rect rect2 = rect != null ? new android.graphics.Rect(rect) : new android.graphics.Rect(0, 0, i17, i18);
                jz5.l U6 = U6(i17, i18, rect2);
                int intValue = ((java.lang.Number) U6.f302833d).intValue();
                int intValue2 = ((java.lang.Number) U6.f302834e).intValue();
                if (!g2Var2.f98032d.isEmpty()) {
                    d7().d();
                    for (o12.u uVar : g2Var2.f98032d) {
                        if (uVar.f342188f.isEmpty()) {
                            uVar.f342188f.set(b7().getInvisibleBounds());
                        }
                        d7().a(uVar);
                    }
                    android.graphics.Rect rect3 = g2Var2.f98035g;
                    bitmap2 = rect3 != null ? d7().b(rect2.width(), rect2.height(), rect3) : com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer.c(d7(), rect2.width(), rect2.height(), null, 4, null);
                    d7().d();
                }
                arrayList.add(new com.tencent.mm.plugin.emoji.ui.e5(g2Var2.f98029a, rect2, intValue, intValue2, bitmap2, g2Var2.a(), g2Var2.b(), bitmap, g2Var2.f98036h));
            }
            i19++;
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void h7(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "onActivityResult data is null");
            }
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void j7() {
        java.util.List list = this.L;
        if (list != null) {
            int i17 = this.K;
            if (list == null) {
                kotlin.jvm.internal.o.o("reportDataList");
                throw null;
            }
            if (i17 >= list.size()) {
                return;
            }
            v7();
            java.util.List list2 = this.L;
            if (list2 == null) {
                kotlin.jvm.internal.o.o("reportDataList");
                throw null;
            }
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct) it.next()).k();
            }
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void l7() {
        super.l7();
        findViewById(com.tencent.mm.R.id.twi).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.j5(this));
        findViewById(com.tencent.mm.R.id.l3w).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.k5(this));
        findViewById(com.tencent.mm.R.id.byi).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.l5(this));
        findViewById(com.tencent.mm.R.id.bye).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.m5(this));
        findViewById(com.tencent.mm.R.id.byg).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.n5(this));
        findViewById(com.tencent.mm.R.id.f486399ut2).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.r5(this));
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void m7() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (!getIntent().hasExtra("finder_object_bytes")) {
            com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(this.f97883J, this.K);
            if (g2Var == null) {
                return;
            }
            this.f97757e = g2Var.a();
            this.f97756d = g2Var.b();
        }
        int size = ((java.util.ArrayList) this.f97883J).size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.emoji.ui.g2 g2Var2 = (com.tencent.mm.plugin.emoji.ui.g2) ((java.util.ArrayList) this.f97883J).get(i17);
            com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct();
            emojiEditImageReportStruct.f55963d = this.f97775z == 46 ? 21L : 20L;
            emojiEditImageReportStruct.f55965f = g2Var2.b() ? 2L : g2Var2.a() ? 1L : 0L;
            emojiEditImageReportStruct.N = this.M;
            emojiEditImageReportStruct.f55985z = emojiEditImageReportStruct.b("EditStickerSessionID", this.f97773x, true);
            arrayList.add(emojiEditImageReportStruct);
        }
        this.L = arrayList;
        kotlinx.coroutines.l.d(this.E, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.emoji.ui.f5(this, null), 2, null);
        super.m7();
        this.H = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f486399ut2);
        if (((java.util.ArrayList) this.f97883J).size() <= 1) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.vet);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.twi);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.g6_);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.H;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.vet);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.twi);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.g6_);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById6, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.vep);
        this.F = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 0, false));
            com.tencent.mm.plugin.emoji.ui.x4 x4Var = new com.tencent.mm.plugin.emoji.ui.x4(new com.tencent.mm.plugin.emoji.ui.v5(this), new com.tencent.mm.plugin.emoji.ui.w5(this));
            this.G = x4Var;
            recyclerView2.setAdapter(x4Var);
        }
        com.tencent.mm.plugin.emoji.ui.x4 x4Var2 = this.G;
        if (x4Var2 != null) {
            x4Var2.f98559f = kz5.n0.S0(this.f97883J);
            x4Var2.notifyDataSetChanged();
        }
        this.I = findViewById(com.tencent.mm.R.id.ver);
        if (((java.util.ArrayList) this.f97883J).size() > 1 && (recyclerView = this.F) != null) {
            recyclerView.i(new com.tencent.mm.plugin.emoji.ui.x5(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.H;
        if (weImageView2 != null) {
            weImageView2.setEnableColorFilter(false);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.H;
        if (weImageView3 != null) {
            weImageView3.setImageResource(com.tencent.mm.R.raw.checkbox_select_filled);
        }
        o12.d0 d0Var = this.f97767r;
        d0Var.f342144h = new com.tencent.mm.plugin.emoji.ui.y5(d0Var.f342144h, this);
        d7().setOnTextDragEnd(new com.tencent.mm.plugin.emoji.ui.z5(d7().getOnTextDragEnd()));
        d7().setOnAnimateResetEnd(new com.tencent.mm.plugin.emoji.ui.a6(this));
        d7().setOnTextScaleEnd(new com.tencent.mm.plugin.emoji.ui.b6(this));
        d7().setOnTextRemoved(new com.tencent.mm.plugin.emoji.ui.c6(this));
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
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
                    kotlin.jvm.internal.o.d(str);
                    com.tencent.mm.plugin.emoji.ui.y4 y4Var = com.tencent.mm.plugin.emoji.ui.z4.f98575e;
                    int i19 = (i17 < 0 || i17 > intArrayExtra.length + (-1)) ? 0 : intArrayExtra[i17];
                    y4Var.getClass();
                    java.util.Iterator it = ((kz5.h) com.tencent.mm.plugin.emoji.ui.z4.f98580m).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((com.tencent.mm.plugin.emoji.ui.z4) next).f98581d == i19) {
                            obj2 = next;
                            break;
                        }
                    }
                    com.tencent.mm.plugin.emoji.ui.z4 z4Var = (com.tencent.mm.plugin.emoji.ui.z4) obj2;
                    if (z4Var == null) {
                        z4Var = com.tencent.mm.plugin.emoji.ui.z4.f98576f;
                    }
                    arrayList.add(new com.tencent.mm.plugin.emoji.ui.g2(str, z4Var));
                    i17 = i18;
                }
                this.f97883J = kz5.n0.V0(arrayList);
            }
        }
        this.Q = getIntent().getStringExtra("addstickers_sessionid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate: mediaList size=");
        sb6.append(this.f97883J.size());
        sb6.append(", paths=");
        java.util.List list = this.f97883J;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.emoji.ui.g2) it6.next()).f98029a);
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kotlinx.coroutines.z0.e(this.E, null, 1, null);
        c7().b();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.F = null;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.util.Iterator it = this.f97883J.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.emoji.ui.g2) it.next()).f98038j = null;
        }
    }

    public final java.util.List r7() {
        java.util.List list = this.f97883J;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) obj;
            arrayList.add(new or.a(i18, s7(), g2Var.b() ? 3 : g2Var.a() ? 4 : 1, null, 8, null));
            i17 = i18;
        }
        return arrayList;
    }

    public final int s7() {
        return ((java.lang.Number) ((jz5.n) this.P).getValue()).intValue();
    }

    public final void t7() {
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(this.f97883J, this.K);
        if (g2Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "restoreEditState: index=" + this.K + ", decorations count=" + g2Var.f98032d.size());
        b7().setVideoClipBounds(g2Var.f98031c);
        int i17 = 0;
        for (java.lang.Object obj : g2Var.f98032d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            o12.u uVar = (o12.u) obj;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreEditState: from media[");
            sb6.append(i17);
            sb6.append("] scale=");
            sb6.append(uVar.f342189g);
            sb6.append(", bounds=");
            android.graphics.Rect rect = uVar.f342186d;
            sb6.append(rect);
            sb6.append(", viewBounds=");
            android.graphics.Rect rect2 = uVar.f342188f;
            sb6.append(rect2);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
            o12.u a17 = o12.u.a(uVar, null, null, 0, new android.graphics.Rect(rect), 0.0f, new android.graphics.Rect(rect2), 0.0f, 0.0f, false, 471, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "restoreEditState: after copy[" + i17 + "] scale=" + a17.f342189g);
            android.graphics.Rect rect3 = a17.f342188f;
            if (rect3.isEmpty()) {
                android.graphics.Rect invisibleBounds = b7().getInvisibleBounds();
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "restoreEditState: viewBounds is empty, set to " + invisibleBounds);
                rect3.set(invisibleBounds);
            }
            d7().a(a17);
            i17 = i18;
        }
    }

    public final void u7() {
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(this.f97883J, this.K);
        if (g2Var == null) {
            return;
        }
        java.util.List<o12.u> decorations = d7().getDecorations();
        int i17 = 0;
        for (java.lang.Object obj : decorations) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            o12.u uVar = (o12.u) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "saveCurrentEditState: from container[" + i17 + "] scale=" + uVar.f342189g + ", bounds=" + uVar.f342186d + ", viewBounds=" + uVar.f342188f);
            i17 = i18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(decorations, 10));
        for (o12.u uVar2 : decorations) {
            o12.u a17 = o12.u.a(uVar2, null, null, 0, new android.graphics.Rect(uVar2.f342186d), 0.0f, new android.graphics.Rect(uVar2.f342188f), 0.0f, 0.0f, false, 471, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "saveCurrentEditState: after copy scale=" + a17.f342189g);
            arrayList.add(a17);
        }
        g2Var.f98032d = arrayList;
        g2Var.f98033e = a7().f97453e;
        android.util.Range range = c7().f351026e;
        kotlin.jvm.internal.o.g(range, "<set-?>");
        g2Var.f98036h = range;
        android.util.Size size = (android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue();
        kotlin.jvm.internal.o.g(size, "<set-?>");
        g2Var.f98037i = size;
        g2Var.f98035g = new android.graphics.Rect(b7().getVisibleBounds());
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "saveCurrentEditState: saved to media[" + this.K + "], decorations count=" + g2Var.f98032d.size() + ", timeRange=" + g2Var.f98036h + ", mediaSize=" + g2Var.f98037i + ", textVideoBounds=" + g2Var.f98035g);
    }

    public final void v7() {
        java.util.List list = this.L;
        if (list == null || this.K >= ((java.util.ArrayList) list).size()) {
            return;
        }
        java.util.List list2 = this.L;
        if (list2 == null) {
            kotlin.jvm.internal.o.o("reportDataList");
            throw null;
        }
        com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct = (com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct) ((java.util.ArrayList) list2).get(this.K);
        long j17 = emojiEditImageReportStruct.f55971l;
        com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct2 = this.B;
        emojiEditImageReportStruct.f55971l = j17 + emojiEditImageReportStruct2.f55971l;
        emojiEditImageReportStruct.f55969j += emojiEditImageReportStruct2.f55969j;
        emojiEditImageReportStruct.B += emojiEditImageReportStruct2.B;
        emojiEditImageReportStruct.C += emojiEditImageReportStruct2.C;
        emojiEditImageReportStruct.D += emojiEditImageReportStruct2.D;
        emojiEditImageReportStruct.E += emojiEditImageReportStruct2.E;
        emojiEditImageReportStruct.F += emojiEditImageReportStruct2.F;
        emojiEditImageReportStruct.G += emojiEditImageReportStruct2.G;
        emojiEditImageReportStruct.H = emojiEditImageReportStruct.b("ClickWithdrawCnt", emojiEditImageReportStruct.H + this.B.H, true);
        emojiEditImageReportStruct.I = emojiEditImageReportStruct.b("ClickRedoCnt", emojiEditImageReportStruct.I + this.B.I, true);
        emojiEditImageReportStruct.f55962J = emojiEditImageReportStruct.f55962J + this.B.f55962J;
        emojiEditImageReportStruct.f55966g = (long) c7().f351024c;
        emojiEditImageReportStruct.f55967h = (long) ((android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue()).getWidth();
        emojiEditImageReportStruct.f55968i = ((android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue()).getHeight();
        emojiEditImageReportStruct.f55970k = d7().getTextViews().size();
        int intValue = ((java.lang.Number) c7().f351026e.getUpper()).intValue();
        kotlin.jvm.internal.o.f(c7().f351026e.getLower(), "getLower(...)");
        emojiEditImageReportStruct.f55975p = intValue - ((java.lang.Number) r3).intValue();
        android.graphics.Rect b17 = a7().b();
        emojiEditImageReportStruct.f55972m = b17.width();
        emojiEditImageReportStruct.f55973n = b17.height();
        e06.k m17 = e06.p.m(0, d7().getChildCount());
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer d76 = d7();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        kz5.x0 it = m17.iterator();
        while (((e06.j) it).f246214f) {
            arrayList.add(d76.getChildAt(it.b()));
        }
        java.util.List I = kz5.j0.I(arrayList, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(I, 10));
        java.util.Iterator it6 = ((java.util.ArrayList) I).iterator();
        while (it6.hasNext()) {
            java.lang.Object tag = ((com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText) it6.next()).getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextInputViewController.TextDecoration");
            arrayList2.add((o12.u) tag);
        }
        emojiEditImageReportStruct.f55979t = emojiEditImageReportStruct.b("TextWidgetContentList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.tencent.mm.plugin.emoji.ui.d6.f97937d, 30, null), true);
        emojiEditImageReportStruct.f55983x = emojiEditImageReportStruct.b("TextWidgetContentColourList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.tencent.mm.plugin.emoji.ui.e6.f97964d, 30, null), true);
        emojiEditImageReportStruct.f55984y = emojiEditImageReportStruct.b("IsCroppedUsingPredefinedRatio", a7().f97453e ? "1.0" : "", true);
        emojiEditImageReportStruct.A = emojiEditImageReportStruct.b("TextWidgetContentStyleList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.tencent.mm.plugin.emoji.ui.f6.f97987d, 30, null), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "snapshotReportData: updated reportData for index=" + this.K);
        com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct();
        emojiEditImageReportStruct3.f55963d = this.f97775z == 46 ? 21L : 20L;
        emojiEditImageReportStruct3.f55964e = 0L;
        emojiEditImageReportStruct3.f55976q = 0L;
        emojiEditImageReportStruct3.N = this.M;
        this.B = emojiEditImageReportStruct3;
    }
}
