package com.tencent.mm.plugin.emoji.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiEditorActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/tools/c5;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public class EmojiEditorActivity extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct B;
    public com.tencent.mm.ui.widget.dialog.u3 C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f97756d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97757e;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f97760h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f97761i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f97762m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f97763n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f97764o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer f97765p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f97766q;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f97768s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView f97769t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout f97770u;

    /* renamed from: v, reason: collision with root package name */
    public p12.h f97771v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f97772w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f97773x;

    /* renamed from: y, reason: collision with root package name */
    public long f97774y;

    /* renamed from: z, reason: collision with root package name */
    public int f97775z;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f97758f = kotlinx.coroutines.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public l12.a f97759g = l12.a.f314979d;

    /* renamed from: r, reason: collision with root package name */
    public final o12.d0 f97767r = new o12.d0();

    public EmojiEditorActivity() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f97773x = uuid;
        this.f97774y = 1L;
        com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct();
        emojiEditImageReportStruct.f55963d = 20L;
        emojiEditImageReportStruct.f55964e = 0L;
        emojiEditImageReportStruct.f55976q = 0L;
        this.B = emojiEditImageReportStruct;
    }

    public void T6(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
    }

    public final jz5.l U6(int i17, int i18, android.graphics.Rect clipBounds) {
        kotlin.jvm.internal.o.g(clipBounds, "clipBounds");
        if (clipBounds.width() > 300 || clipBounds.height() > 300) {
            if (clipBounds.width() > clipBounds.height()) {
                float f17 = i17;
                int b17 = a06.d.b(f17 / (clipBounds.width() / 300));
                i18 = a06.d.b(b17 / (f17 / i18));
                rm5.o.b(clipBounds, 300.0f / clipBounds.width());
                i17 = b17;
            } else {
                float f18 = i18;
                int b18 = a06.d.b(f18 / (clipBounds.height() / 300));
                i17 = a06.d.b(b18 * (i17 / f18));
                rm5.o.b(clipBounds, 300.0f / clipBounds.height());
                i18 = b18;
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public long V6() {
        if (this.f97757e) {
            return 4L;
        }
        return this.f97756d ? 3L : 1L;
    }

    public long W6() {
        return getIntent().hasExtra("finder_object_bytes") ? 2L : 1L;
    }

    public final void X6(android.graphics.Rect clipBounds) {
        kotlin.jvm.internal.o.g(clipBounds, "clipBounds");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "generateEmoji: " + clipBounds);
            if (clipBounds.isEmpty()) {
                db5.e1.i(this, com.tencent.mm.R.string.f491100bw5, com.tencent.mm.R.string.bw6);
                return;
            }
            android.graphics.Rect rect = new android.graphics.Rect(clipBounds.left, clipBounds.top, clipBounds.right, clipBounds.bottom);
            this.B.f55976q = 1L;
            java.io.File file = c7().f351027f;
            if (file == null) {
                return;
            }
            this.C = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f491099bw4), true, true, com.tencent.mm.plugin.emoji.ui.z0.f98570d);
            rm5.c cVar = rm5.h.f397489h;
            rm5.h.f397490i.evictAll();
            android.util.Size size = (android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue();
            jz5.l U6 = U6(size.getWidth(), size.getHeight(), clipBounds);
            int intValue = ((java.lang.Number) U6.f302833d).intValue();
            int intValue2 = ((java.lang.Number) U6.f302834e).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "generate text bitmap with bounds: " + clipBounds);
            android.graphics.Bitmap c17 = com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer.c(d7(), clipBounds.width(), clipBounds.height(), null, 4, null);
            java.util.List<java.lang.String> texts = d7().getTexts();
            p12.h c76 = c7();
            p12.g gVar = c76 instanceof p12.g ? (p12.g) c76 : null;
            kotlinx.coroutines.l.d(this.f97758f, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.emoji.ui.e1(this, file, clipBounds, intValue, intValue2, c17, gVar != null ? gVar.f351021h : null, c7().f351026e, rect, texts, null), 2, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiEditorActivity", "something wrong while render " + th6);
            setResult(0);
            finish();
            this.f97774y = 1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y6(java.lang.String r18, android.graphics.Rect r19, int r20, int r21, android.graphics.Bitmap r22, boolean r23, boolean r24, android.graphics.Bitmap r25, android.util.Range r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity.Y6(java.lang.String, android.graphics.Rect, int, int, android.graphics.Bitmap, boolean, boolean, android.graphics.Bitmap, android.util.Range, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.view.ViewGroup Z6() {
        android.view.ViewGroup viewGroup = this.f97768s;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("clipControllerLayout");
        throw null;
    }

    public final com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a7() {
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView emojiEditorClipView = this.f97769t;
        if (emojiEditorClipView != null) {
            return emojiEditorClipView;
        }
        kotlin.jvm.internal.o.o("clipView");
        throw null;
    }

    public final com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout b7() {
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout emojiEditorPreviewLayout = this.f97770u;
        if (emojiEditorPreviewLayout != null) {
            return emojiEditorPreviewLayout;
        }
        kotlin.jvm.internal.o.o("previewLayout");
        throw null;
    }

    public final p12.h c7() {
        p12.h hVar = this.f97771v;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("renderViewController");
        throw null;
    }

    public final com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer d7() {
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer emojiEditorTextDecorationsContainer = this.f97765p;
        if (emojiEditorTextDecorationsContainer != null) {
            return emojiEditorTextDecorationsContainer;
        }
        kotlin.jvm.internal.o.o("textDecorationsContainer");
        throw null;
    }

    public void e7() {
        this.f97771v = this.f97756d ? new p12.w(this, b7()) : this.f97757e ? new p12.b(this, b7()) : new p12.g(this, b7());
    }

    public void f7() {
        android.util.Size size = (android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue();
        android.graphics.Rect videoClipBounds = b7().getVideoClipBounds();
        if (videoClipBounds == null) {
            videoClipBounds = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        X6(videoClipBounds);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        getIntent().putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477889ed);
        getIntent().putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        super.finish();
    }

    public void g7() {
        if (this.f97772w) {
            n7(l12.a.f314981f);
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a3c;
    }

    public void h7(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "onActivityResult data is null");
            }
            setResult(-1, intent);
            finish();
        }
    }

    public final void i7() {
        super.onBackPressed();
    }

    public void j7() {
        com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct = this.B;
        emojiEditImageReportStruct.f55966g = c7().f351024c;
        emojiEditImageReportStruct.f55967h = ((android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue()).getWidth();
        emojiEditImageReportStruct.f55968i = ((android.util.Size) ((kotlinx.coroutines.flow.h3) c7().f351025d).getValue()).getHeight();
        emojiEditImageReportStruct.f55970k = d7().getTextViews().size();
        emojiEditImageReportStruct.f55965f = this.f97756d ? 2L : this.f97757e ? 3L : 1L;
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
        emojiEditImageReportStruct.f55979t = emojiEditImageReportStruct.b("TextWidgetContentList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.tencent.mm.plugin.emoji.ui.g1.f98028d, 30, null), true);
        emojiEditImageReportStruct.f55983x = emojiEditImageReportStruct.b("TextWidgetContentColourList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.tencent.mm.plugin.emoji.ui.h1.f98049d, 30, null), true);
        emojiEditImageReportStruct.f55984y = emojiEditImageReportStruct.b("IsCroppedUsingPredefinedRatio", a7().f97453e ? "1.0" : "", true);
        java.lang.String str = this.f97773x;
        emojiEditImageReportStruct.f55985z = emojiEditImageReportStruct.b("EditStickerSessionID", str, true);
        emojiEditImageReportStruct.A = emojiEditImageReportStruct.b("TextWidgetContentStyleList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.tencent.mm.plugin.emoji.ui.i1.f98060d, 30, null), true);
        com.tencent.mm.autogen.mmdata.rpt.EmojiEditImageReportStruct emojiEditImageReportStruct2 = this.B;
        emojiEditImageReportStruct2.f55963d = this.f97775z == 46 ? 21L : 20L;
        emojiEditImageReportStruct2.k();
        com.tencent.mm.autogen.mmdata.rpt.EmoticonCustomCreateResultStruct emoticonCustomCreateResultStruct = new com.tencent.mm.autogen.mmdata.rpt.EmoticonCustomCreateResultStruct();
        emoticonCustomCreateResultStruct.f56019d = emoticonCustomCreateResultStruct.b("EditStickerSessionID", str, true);
        emoticonCustomCreateResultStruct.f56020e = this.f97774y;
        emoticonCustomCreateResultStruct.f56021f = W6();
        emoticonCustomCreateResultStruct.f56022g = V6();
        emoticonCustomCreateResultStruct.f56023h = this.f97775z != 46 ? 20L : 21L;
        emoticonCustomCreateResultStruct.k();
    }

    public int k7() {
        return getIntent().hasExtra("finder_object_bytes") ? 1000055 : 1;
    }

    public void l7() {
        findViewById(com.tencent.mm.R.id.l3w).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.l1(this));
        findViewById(com.tencent.mm.R.id.pys).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.m1(this));
        findViewById(com.tencent.mm.R.id.g6_).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.n1(this));
        findViewById(com.tencent.mm.R.id.ojo).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.o1(this));
        findViewById(com.tencent.mm.R.id.ojn).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.p1(this));
        findViewById(com.tencent.mm.R.id.ojm).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.q1(this));
        findViewById(com.tencent.mm.R.id.byi).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.r1(this));
        findViewById(com.tencent.mm.R.id.bye).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.s1(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.byl);
        weImageView.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.u1(this, weImageView));
        findViewById(com.tencent.mm.R.id.byk).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.t1(this, weImageView));
        findViewById(com.tencent.mm.R.id.byg).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.j1(this));
        findViewById(com.tencent.mm.R.id.f482715ly).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.k1(this));
    }

    public void m7() {
        android.widget.Button button;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d8v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f97761i = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l3y);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f97763n = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ojq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f97762m = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.o4g);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f97764o = (android.view.ViewGroup) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.o49);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f97765p = (com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer) findViewById5;
        o12.d0 d0Var = this.f97767r;
        android.view.ViewGroup viewGroup = this.f97764o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("textInputLayout");
            throw null;
        }
        d0Var.getClass();
        android.view.View findViewById6 = viewGroup.findViewById(com.tencent.mm.R.id.o4f);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        d0Var.f342137a = (com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText) findViewById6;
        android.view.View findViewById7 = viewGroup.findViewById(com.tencent.mm.R.id.f487287o53);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        d0Var.f342139c = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = viewGroup.findViewById(com.tencent.mm.R.id.f483835c64);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        d0Var.f342138b = (android.widget.LinearLayout) findViewById8;
        android.widget.ImageView imageView = d0Var.f342139c;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("switcherButton");
            throw null;
        }
        imageView.setOnClickListener(new o12.z(d0Var));
        o12.y yVar = d0Var.f342142f;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText = d0Var.f342137a;
        if (emojiEditorEditableText == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        yVar.a(emojiEditorEditableText, d0Var.f342140d);
        viewGroup.findViewById(com.tencent.mm.R.id.f482714lx).setOnClickListener(new o12.a0(d0Var));
        viewGroup.findViewById(com.tencent.mm.R.id.f482713lw).setOnClickListener(new o12.b0(d0Var));
        int[] iArr = o12.d0.f342136i;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 7) {
            int i19 = iArr[i17];
            int i27 = i18 + 1;
            if (i18 > 0) {
                android.widget.LinearLayout linearLayout = d0Var.f342138b;
                if (linearLayout == null) {
                    kotlin.jvm.internal.o.o("colorSelector");
                    throw null;
                }
                android.widget.LinearLayout linearLayout2 = d0Var.f342138b;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("colorSelector");
                    throw null;
                }
                linearLayout.addView(new android.view.View(linearLayout2.getContext()), new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            }
            android.widget.LinearLayout linearLayout3 = d0Var.f342138b;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("colorSelector");
                throw null;
            }
            android.content.Context context = linearLayout3.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextColorView emojiEditorTextColorView = new com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextColorView(context, null, 0, 6, null);
            emojiEditorTextColorView.setOnClickListener(new o12.c0(d0Var, i19));
            emojiEditorTextColorView.setColor(i19);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            emojiEditorTextColorView.setLayoutParams(layoutParams);
            android.widget.LinearLayout linearLayout4 = d0Var.f342138b;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("colorSelector");
                throw null;
            }
            linearLayout4.addView(emojiEditorTextColorView);
            i17++;
            i18 = i27;
        }
        d0Var.b();
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.f97760h = f5Var;
        f5Var.f210400e = this;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.byf);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f97768s = (android.view.ViewGroup) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.byn);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f97769t = (com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.l48);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f97770u = (com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout) findViewById11;
        a7().setOnSurfaceBoundsChanged(new com.tencent.mm.plugin.emoji.ui.y1(this));
        b7().setOnFitBoundsUpdated(new com.tencent.mm.plugin.emoji.ui.z1(this));
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.l3t);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer d76 = d7();
        d76.setGetRenderingBounds(new com.tencent.mm.plugin.emoji.ui.a2(this));
        d76.setOnUpdateText(new com.tencent.mm.plugin.emoji.ui.b2(this));
        d76.setOnTextDragStart(new com.tencent.mm.plugin.emoji.ui.c2(this, findViewById12));
        d76.setOnTextDragEnd(new com.tencent.mm.plugin.emoji.ui.d2(this, findViewById12));
        this.f97767r.f342144h = new com.tencent.mm.plugin.emoji.ui.e2(this);
        l7();
        if (!this.f97756d) {
            android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.ojo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById13, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById13.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById13, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.f485156u01);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f97766q = (android.widget.TextView) findViewById14;
        if (this.f97757e) {
            android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.byi);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById15, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById15.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById15, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.f482715ly);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById16, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById16.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById16, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f97766q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("gifEditTip");
                throw null;
            }
            textView.setVisibility(0);
        }
        if (this.f97775z != 46 || (button = (android.widget.Button) findViewById(com.tencent.mm.R.id.g6_)) == null) {
            return;
        }
        button.setText(getString(com.tencent.mm.R.string.f490502ww));
    }

    public final void n7(l12.a mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        l12.a aVar = l12.a.f314982g;
        if (mode == aVar) {
            android.view.ViewGroup viewGroup = this.f97761i;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
            changeBounds.f12383f = 300L;
            u4.g1.a(viewGroup, changeBounds);
        }
        android.view.ViewGroup viewGroup2 = this.f97761i;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        viewGroup2.setClipChildren(mode != aVar);
        this.f97759g = mode;
        android.view.ViewGroup viewGroup3 = this.f97762m;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("trimControllerLayout");
            throw null;
        }
        viewGroup3.setVisibility(mode == l12.a.f314980e ? 0 : 8);
        android.view.ViewGroup viewGroup4 = this.f97763n;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.o.o("previewControllerLayout");
            throw null;
        }
        viewGroup4.setVisibility(mode == l12.a.f314981f ? 0 : 8);
        android.view.ViewGroup viewGroup5 = this.f97764o;
        if (viewGroup5 == null) {
            kotlin.jvm.internal.o.o("textInputLayout");
            throw null;
        }
        viewGroup5.setVisibility(mode == l12.a.f314983h ? 0 : 8);
        Z6().setVisibility(mode != aVar ? 4 : 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        h7(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        o12.d0 d0Var;
        yz5.l lVar;
        this.f97774y = 2L;
        int ordinal = this.f97759g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                g7();
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4 && (lVar = (d0Var = this.f97767r).f342144h) != null) {
                        lVar.invoke(d0Var.f342143g);
                        return;
                    }
                    return;
                }
                b7().setFitBounds(null);
                n7(l12.a.f314981f);
                com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = a7();
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "restore states");
                a76.f97457i.set(a76.f97459n);
                a76.f97456h.set(a76.f97458m);
                return;
            }
        }
        super.onBackPressed();
        this.f97774y = c7().f351027f != null ? 3L : 2L;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        this.f97756d = getIntent().getBooleanExtra("is_video", false);
        this.f97757e = getIntent().getBooleanExtra("is_gif", false);
        this.f97775z = getIntent().getIntExtra("query_source_type", 0);
        this.A = getIntent().getIntExtra("key_from_scene", 0);
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.f2(this), com.tencent.mm.R.raw.icons_outlined_close);
        new n3.m3(getWindow(), getWindow().getDecorView()).a(1);
        setBackBtnVisible(false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        hideActionbarLine();
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        setActionbarColor(-16777216);
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-16777216);
        m7();
        e7();
        kotlinx.coroutines.l.d(this.f97758f, null, null, new com.tencent.mm.plugin.emoji.ui.x1(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j7();
        c7().b();
        kotlinx.coroutines.z0.e(this.f97758f, null, 1, null);
        com.tencent.mm.ui.tools.f5 f5Var = this.f97760h;
        if (f5Var == null) {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
        f5Var.d();
        rm5.c cVar = rm5.h.f397489h;
        rm5.h.f397490i.evictAll();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "onKeyboardHeightChanged, height: " + i17 + ", isResized: " + z17);
        android.view.ViewGroup viewGroup = this.f97764o;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, i17);
        } else {
            kotlin.jvm.internal.o.o("textInputLayout");
            throw null;
        }
    }
}
