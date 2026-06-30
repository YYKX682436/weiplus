package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiEditorActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/tools/c5;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity */
/* loaded from: classes10.dex */
public class ActivityC13304x9b00dd62 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f179289d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f179290e;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f179293h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f179294i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f179295m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f179296n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f179297o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e f179298p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f179299q;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f179301s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 f179302t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f f179303u;

    /* renamed from: v, reason: collision with root package name */
    public p12.h f179304v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f179305w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f179306x;

    /* renamed from: y, reason: collision with root package name */
    public long f179307y;

    /* renamed from: z, reason: collision with root package name */
    public int f179308z;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f179291f = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public l12.a f179292g = l12.a.f396512d;

    /* renamed from: r, reason: collision with root package name */
    public final o12.d0 f179300r = new o12.d0();

    public ActivityC13304x9b00dd62() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f179306x = uuid;
        this.f179307y = 1L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4();
        c6402x7f01bdb4.f137496d = 20L;
        c6402x7f01bdb4.f137497e = 0L;
        c6402x7f01bdb4.f137509q = 0L;
        this.B = c6402x7f01bdb4;
    }

    public void T6(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
    }

    public final jz5.l U6(int i17, int i18, android.graphics.Rect clipBounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipBounds, "clipBounds");
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
        if (this.f179290e) {
            return 4L;
        }
        return this.f179289d ? 3L : 1L;
    }

    public long W6() {
        return getIntent().hasExtra("finder_object_bytes") ? 2L : 1L;
    }

    public final void X6(android.graphics.Rect clipBounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipBounds, "clipBounds");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "generateEmoji: " + clipBounds);
            if (clipBounds.isEmpty()) {
                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572633bw5, com.p314xaae8f345.mm.R.C30867xcad56011.bw6);
                return;
            }
            android.graphics.Rect rect = new android.graphics.Rect(clipBounds.left, clipBounds.top, clipBounds.right, clipBounds.bottom);
            this.B.f137509q = 1L;
            java.io.File file = c7().f432560f;
            if (file == null) {
                return;
            }
            this.C = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572632bw4), true, true, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z0.f180103d);
            rm5.c cVar = rm5.h.f479022h;
            rm5.h.f479023i.evictAll();
            android.util.Size size = (android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb();
            jz5.l U6 = U6(size.getWidth(), size.getHeight(), clipBounds);
            int intValue = ((java.lang.Number) U6.f384366d).intValue();
            int intValue2 = ((java.lang.Number) U6.f384367e).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "generate text bitmap with bounds: " + clipBounds);
            android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e.c(d7(), clipBounds.width(), clipBounds.height(), null, 4, null);
            java.util.List<java.lang.String> m54762x75300730 = d7().m54762x75300730();
            p12.h c76 = c7();
            p12.g gVar = c76 instanceof p12.g ? (p12.g) c76 : null;
            p3325xe03a0797.p3326xc267989b.l.d(this.f179291f, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e1(this, file, clipBounds, intValue, intValue2, c17, gVar != null ? gVar.f432554h : null, c7().f432559e, rect, m54762x75300730, null), 2, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiEditorActivity", "something wrong while render " + th6);
            setResult(0);
            finish();
            this.f179307y = 1L;
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
    public final java.lang.Object Y6(java.lang.String r18, android.graphics.Rect r19, int r20, int r21, android.graphics.Bitmap r22, boolean r23, boolean r24, android.graphics.Bitmap r25, android.util.Range r26, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62.Y6(java.lang.String, android.graphics.Rect, int, int, android.graphics.Bitmap, boolean, boolean, android.graphics.Bitmap, android.util.Range, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.view.ViewGroup Z6() {
        android.view.ViewGroup viewGroup = this.f179301s;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clipControllerLayout");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 scaleGestureDetectorOnScaleGestureListenerC13256x346a1468 = this.f179302t;
        if (scaleGestureDetectorOnScaleGestureListenerC13256x346a1468 != null) {
            return scaleGestureDetectorOnScaleGestureListenerC13256x346a1468;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clipView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f c13258x5720669f = this.f179303u;
        if (c13258x5720669f != null) {
            return c13258x5720669f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewLayout");
        throw null;
    }

    public final p12.h c7() {
        p12.h hVar = this.f179304v;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderViewController");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e c13260x7cd1df1e = this.f179298p;
        if (c13260x7cd1df1e != null) {
            return c13260x7cd1df1e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textDecorationsContainer");
        throw null;
    }

    public void e7() {
        this.f179304v = this.f179289d ? new p12.w(this, b7()) : this.f179290e ? new p12.b(this, b7()) : new p12.g(this, b7());
    }

    public void f7() {
        android.util.Size size = (android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb();
        android.graphics.Rect videoClipBounds = b7().getVideoClipBounds();
        if (videoClipBounds == null) {
            videoClipBounds = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        X6(videoClipBounds);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        getIntent().putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        getIntent().putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        super.finish();
    }

    public void g7() {
        if (this.f179305w) {
            n7(l12.a.f396514f);
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a3c;
    }

    public void h7(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "onActivityResult data is null");
            }
            setResult(-1, intent);
            finish();
        }
    }

    public final void i7() {
        super.onBackPressed();
    }

    public void j7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb4 = this.B;
        c6402x7f01bdb4.f137499g = c7().f432557c;
        c6402x7f01bdb4.f137500h = ((android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb()).getWidth();
        c6402x7f01bdb4.f137501i = ((android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c7().f432558d).mo144003x754a37bb()).getHeight();
        c6402x7f01bdb4.f137503k = d7().m54761xc1118a8b().size();
        c6402x7f01bdb4.f137498f = this.f179289d ? 2L : this.f179290e ? 3L : 1L;
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
        c6402x7f01bdb4.f137512t = c6402x7f01bdb4.b("TextWidgetContentList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g1.f179561d, 30, null), true);
        c6402x7f01bdb4.f137516x = c6402x7f01bdb4.b("TextWidgetContentColourList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h1.f179582d, 30, null), true);
        c6402x7f01bdb4.f137517y = c6402x7f01bdb4.b("IsCroppedUsingPredefinedRatio", a7().f178986e ? "1.0" : "", true);
        java.lang.String str = this.f179306x;
        c6402x7f01bdb4.f137518z = c6402x7f01bdb4.b("EditStickerSessionID", str, true);
        c6402x7f01bdb4.A = c6402x7f01bdb4.b("TextWidgetContentStyleList", kz5.n0.g0(arrayList2, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i1.f179593d, 30, null), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6402x7f01bdb4 c6402x7f01bdb42 = this.B;
        c6402x7f01bdb42.f137496d = this.f179308z == 46 ? 21L : 20L;
        c6402x7f01bdb42.k();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6410x1a153385 c6410x1a153385 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6410x1a153385();
        c6410x1a153385.f137552d = c6410x1a153385.b("EditStickerSessionID", str, true);
        c6410x1a153385.f137553e = this.f179307y;
        c6410x1a153385.f137554f = W6();
        c6410x1a153385.f137555g = V6();
        c6410x1a153385.f137556h = this.f179308z != 46 ? 20L : 21L;
        c6410x1a153385.k();
    }

    public int k7() {
        return getIntent().hasExtra("finder_object_bytes") ? 1000055 : 1;
    }

    public void l7() {
        findViewById(com.p314xaae8f345.mm.R.id.l3w).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l1(this));
        findViewById(com.p314xaae8f345.mm.R.id.pys).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m1(this));
        findViewById(com.p314xaae8f345.mm.R.id.g6_).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n1(this));
        findViewById(com.p314xaae8f345.mm.R.id.ojo).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o1(this));
        findViewById(com.p314xaae8f345.mm.R.id.ojn).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1(this));
        findViewById(com.p314xaae8f345.mm.R.id.ojm).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q1(this));
        findViewById(com.p314xaae8f345.mm.R.id.byi).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r1(this));
        findViewById(com.p314xaae8f345.mm.R.id.bye).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s1(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.byl);
        c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u1(this, c22699x3dcdb352));
        findViewById(com.p314xaae8f345.mm.R.id.byk).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t1(this, c22699x3dcdb352));
        findViewById(com.p314xaae8f345.mm.R.id.byg).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j1(this));
        findViewById(com.p314xaae8f345.mm.R.id.f564248ly).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k1(this));
    }

    public void m7() {
        android.widget.Button button;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d8v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f179294i = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.l3y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f179296n = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ojq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f179295m = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.o4g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f179297o = (android.view.ViewGroup) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.o49);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f179298p = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e) findViewById5;
        o12.d0 d0Var = this.f179300r;
        android.view.ViewGroup viewGroup = this.f179297o;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textInputLayout");
            throw null;
        }
        d0Var.getClass();
        android.view.View findViewById6 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o4f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        d0Var.f423670a = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84) findViewById6;
        android.view.View findViewById7 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568820o53);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        d0Var.f423672c = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565368c64);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        d0Var.f423671b = (android.widget.LinearLayout) findViewById8;
        android.widget.ImageView imageView = d0Var.f423672c;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switcherButton");
            throw null;
        }
        imageView.setOnClickListener(new o12.z(d0Var));
        o12.y yVar = d0Var.f423675f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e84 = d0Var.f423670a;
        if (c13257xd7c65e84 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        yVar.a(c13257xd7c65e84, d0Var.f423673d);
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564247lx).setOnClickListener(new o12.a0(d0Var));
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564246lw).setOnClickListener(new o12.b0(d0Var));
        int[] iArr = o12.d0.f423669i;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 7) {
            int i19 = iArr[i17];
            int i27 = i18 + 1;
            if (i18 > 0) {
                android.widget.LinearLayout linearLayout = d0Var.f423671b;
                if (linearLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorSelector");
                    throw null;
                }
                android.widget.LinearLayout linearLayout2 = d0Var.f423671b;
                if (linearLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorSelector");
                    throw null;
                }
                linearLayout.addView(new android.view.View(linearLayout2.getContext()), new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            }
            android.widget.LinearLayout linearLayout3 = d0Var.f423671b;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorSelector");
                throw null;
            }
            android.content.Context context = linearLayout3.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13259xd4e56388 c13259xd4e56388 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13259xd4e56388(context, null, 0, 6, null);
            c13259xd4e56388.setOnClickListener(new o12.c0(d0Var, i19));
            c13259xd4e56388.m54752x52d2f021(i19);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            c13259xd4e56388.setLayoutParams(layoutParams);
            android.widget.LinearLayout linearLayout4 = d0Var.f423671b;
            if (linearLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorSelector");
                throw null;
            }
            linearLayout4.addView(c13259xd4e56388);
            i17++;
            i18 = i27;
        }
        d0Var.b();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.f179293h = f5Var;
        f5Var.f291933e = this;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.byf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f179301s = (android.view.ViewGroup) findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.byn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f179302t = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468) findViewById10;
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.l48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f179303u = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f) findViewById11;
        a7().m54736x6f6cb213(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y1(this));
        b7().m54749x322b9bb6(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z1(this));
        android.view.View findViewById12 = findViewById(com.p314xaae8f345.mm.R.id.l3t);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e d76 = d7();
        d76.m54763xe627662d(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.a2(this));
        d76.m54769x4cb55257(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.b2(this));
        d76.m54766x4b727480(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c2(this, findViewById12));
        d76.m54765xacb2a879(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d2(this, findViewById12));
        this.f179300r.f423677h = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e2(this);
        l7();
        if (!this.f179289d) {
            android.view.View findViewById13 = findViewById(com.p314xaae8f345.mm.R.id.ojo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById13, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById13.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById13, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById14 = findViewById(com.p314xaae8f345.mm.R.id.f566689u01);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f179299q = (android.widget.TextView) findViewById14;
        if (this.f179290e) {
            android.view.View findViewById15 = findViewById(com.p314xaae8f345.mm.R.id.byi);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById15, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById15.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById15, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById16 = findViewById(com.p314xaae8f345.mm.R.id.f564248ly);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById16, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById16.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById16, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity", "setupViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f179299q;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gifEditTip");
                throw null;
            }
            textView.setVisibility(0);
        }
        if (this.f179308z != 46 || (button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g6_)) == null) {
            return;
        }
        button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww));
    }

    public final void n7(l12.a mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        l12.a aVar = l12.a.f396515g;
        if (mode == aVar) {
            android.view.ViewGroup viewGroup = this.f179294i;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5 = new p012xc85e97e9.p112x993b6d55.C1173xe703c6a5();
            c1173xe703c6a5.f93916f = 300L;
            u4.g1.a(viewGroup, c1173xe703c6a5);
        }
        android.view.ViewGroup viewGroup2 = this.f179294i;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        viewGroup2.setClipChildren(mode != aVar);
        this.f179292g = mode;
        android.view.ViewGroup viewGroup3 = this.f179295m;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimControllerLayout");
            throw null;
        }
        viewGroup3.setVisibility(mode == l12.a.f396513e ? 0 : 8);
        android.view.ViewGroup viewGroup4 = this.f179296n;
        if (viewGroup4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewControllerLayout");
            throw null;
        }
        viewGroup4.setVisibility(mode == l12.a.f396514f ? 0 : 8);
        android.view.ViewGroup viewGroup5 = this.f179297o;
        if (viewGroup5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textInputLayout");
            throw null;
        }
        viewGroup5.setVisibility(mode == l12.a.f396516h ? 0 : 8);
        Z6().setVisibility(mode != aVar ? 4 : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        h7(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        o12.d0 d0Var;
        yz5.l lVar;
        this.f179307y = 2L;
        int ordinal = this.f179292g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                g7();
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4 && (lVar = (d0Var = this.f179300r).f423677h) != null) {
                        lVar.mo146xb9724478(d0Var.f423676g);
                        return;
                    }
                    return;
                }
                b7().m54748x79a68fe4(null);
                n7(l12.a.f396514f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = a7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorClipView", "restore states");
                a76.f178990i.set(a76.f178992n);
                a76.f178989h.set(a76.f178991m);
                return;
            }
        }
        super.onBackPressed();
        this.f179307y = c7().f432560f != null ? 3L : 2L;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        this.f179289d = getIntent().getBooleanExtra("is_video", false);
        this.f179290e = getIntent().getBooleanExtra("is_gif", false);
        this.f179308z = getIntent().getIntExtra("query_source_type", 0);
        this.A = getIntent().getIntExtra("key_from_scene", 0);
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.f2(this), com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        new n3.m3(getWindow(), getWindow().getDecorView()).a(1);
        m78560xe21cbbf(false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78530x8b45058f();
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        mo64405x4dab7448(-16777216);
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-16777216);
        m7();
        e7();
        p3325xe03a0797.p3326xc267989b.l.d(this.f179291f, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x1(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j7();
        c7().b();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f179291f, null, 1, null);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f179293h;
        if (f5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
        f5Var.d();
        rm5.c cVar = rm5.h.f479022h;
        rm5.h.f479023i.evictAll();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "onKeyboardHeightChanged, height: " + i17 + ", isResized: " + z17);
        android.view.ViewGroup viewGroup = this.f179297o;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textInputLayout");
            throw null;
        }
    }
}
