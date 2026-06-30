package com.tencent.mm.plugin.emojicapture.ui.capture;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016R:\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView;", "Landroid/widget/RelativeLayout;", "", "", "show", "Ljz5/f0;", "setShow", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "Lkotlin/Function2;", "Lt85/j;", "Lr45/p64;", "i", "Lyz5/p;", "getSelectionCallback", "()Lyz5/p;", "setSelectionCallback", "(Lyz5/p;)V", "selectionCallback", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "m", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EditorStickerView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98666d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame f98667e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f98668f;

    /* renamed from: g, reason: collision with root package name */
    public final z22.l f98669g;

    /* renamed from: h, reason: collision with root package name */
    public int f98670h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.p selectionCallback;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter;

    /* renamed from: n, reason: collision with root package name */
    public final u22.r f98673n;

    /* renamed from: o, reason: collision with root package name */
    public final u22.t f98674o;

    /* renamed from: p, reason: collision with root package name */
    public final u22.a f98675p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView f98676q;

    /* renamed from: r, reason: collision with root package name */
    public y9.i f98677r;

    /* renamed from: s, reason: collision with root package name */
    public r45.p64 f98678s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f98679t;

    /* renamed from: u, reason: collision with root package name */
    public r45.p64 f98680u;

    /* renamed from: v, reason: collision with root package name */
    public final a32.c0 f98681v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorStickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98666d = "MicroMsg.EditorStickerView";
        this.f98670h = -1;
        u22.a aVar = new u22.a();
        this.f98675p = aVar;
        this.f98681v = new a32.c0(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.a69, this);
        setLayerType(1, null);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dae);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame stickerSelectFrame = (com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame) findViewById;
        this.f98667e = stickerSelectFrame;
        stickerSelectFrame.setSelected(true);
        stickerSelectFrame.setVisibility(8);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dad);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f98668f = recyclerView;
        recyclerView.setVisibility(8);
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.emojicapture.ui.layout.StickerLayoutManager(context, 0));
        z22.l lVar = new z22.l();
        this.f98669g = lVar;
        e32.e eVar = new e32.e();
        eVar.b(recyclerView);
        eVar.f247106i = new a32.w(this);
        recyclerView.setAdapter(lVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setFocusable(false);
        lVar.f469727e = new a32.x(this);
        recyclerView.N(new e32.b(context));
        u22.t tVar = new u22.t(new a32.a0(this), lVar);
        this.f98674o = tVar;
        this.f98673n = new u22.r((com.tencent.mm.ui.MMActivity) context, new u22.k(tVar, aVar));
        recyclerView.i(new a32.b0(this));
    }

    public static final void a(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        androidx.recyclerview.widget.RecyclerView recyclerView = editorStickerView.f98668f;
        int childCount = recyclerView.getChildCount();
        boolean z17 = true;
        for (int i17 = 0; i17 < childCount; i17++) {
            t85.d x17 = editorStickerView.f98669g.x(recyclerView.u0(recyclerView.getChildAt(i17)));
            if (x17 != null) {
                r45.p64 p64Var = x17.f416456a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(p64Var.f382792d)) {
                    if (!z17) {
                        sb6.append("#");
                        sb7.append("#");
                    }
                    sb6.append(p64Var.f382792d);
                    sb7.append(p64Var.f382794f);
                    z17 = false;
                }
            }
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = editorStickerView.reporter;
        if (emojiCaptureReporter != null) {
            emojiCaptureReporter.a(sb6.toString(), sb7.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView r4, int r5) {
        /*
            r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "selectItem: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r4.f98666d
            com.tencent.mars.xlog.Log.i(r1, r0)
            z22.l r0 = r4.f98669g
            t85.d r0 = r0.x(r5)
            r1 = 0
            if (r0 == 0) goto L27
            r45.p64 r2 = r0.f416456a
            if (r2 == 0) goto L27
            java.lang.String r2 = r2.f382792d
            goto L28
        L27:
            r2 = r1
        L28:
            r4.f98679t = r2
            com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame r3 = r4.f98667e
            r3.a(r2)
            if (r0 == 0) goto L4b
            u22.l r2 = u22.r.f424006p
            r45.p64 r3 = r0.f416456a
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L4b
            r4.f98678s = r3
            u85.i r2 = u85.i.f425707a
            fp0.u r2 = r2.c(r3)
            fp0.u r3 = fp0.u.f265290f
            if (r2 != r3) goto L54
            r4.c(r2)
            goto L54
        L4b:
            r4.f98678s = r1
            yz5.p r2 = r4.selectionCallback
            if (r2 == 0) goto L54
            r2.invoke(r1, r1)
        L54:
            int r2 = r4.f98670h
            if (r2 == r5) goto L84
            if (r0 == 0) goto L60
            r45.p64 r2 = r0.f416456a
            if (r2 == 0) goto L60
            java.lang.String r1 = r2.f382792d
        L60:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L84
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter r1 = r4.reporter
            if (r1 == 0) goto L84
            kotlin.jvm.internal.o.d(r0)
            r45.p64 r2 = r0.f416456a
            java.lang.String r3 = r2.f382792d
            java.lang.String r2 = r2.f382794f
            r1.A = r3
            r1.D = r2
            int r2 = r0.f416457b
            r1.B = r2
            int r0 = r0.f416458c
            r1.C = r0
            r0 = 23
            r1.e(r0)
        L84:
            r4.f98670h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView.b(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView, int):void");
    }

    public final void c(fp0.u uVar) {
        java.lang.String str = "notifyStatus: " + this.f98679t;
        java.lang.String str2 = this.f98666d;
        com.tencent.mars.xlog.Log.i(str2, str);
        java.lang.String str3 = this.f98679t;
        if (str3 == null || uVar != fp0.u.f265290f) {
            yz5.p pVar = this.selectionCallback;
            if (pVar != null) {
                pVar.invoke(null, null);
                return;
            }
            return;
        }
        u85.i iVar = u85.i.f425707a;
        kotlin.jvm.internal.o.d(str3);
        java.lang.String packDir = iVar.b(str3);
        kotlin.jvm.internal.o.g(packDir, "packDir");
        t85.j jVar = new t85.j();
        jVar.f416476c = packDir;
        jVar.b(packDir);
        if (!jVar.a()) {
            com.tencent.mars.xlog.Log.i(str2, "onLoaderFin: sticker is not valid");
            com.tencent.mm.vfs.w6.f(packDir);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f416474a)) {
            java.lang.String str4 = this.f98679t;
            kotlin.jvm.internal.o.d(str4);
            jVar.f416474a = str4;
        }
        yz5.p pVar2 = this.selectionCallback;
        if (pVar2 != null) {
            pVar2.invoke(jVar, this.f98678s);
        }
    }

    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter getReporter() {
        return this.reporter;
    }

    public final yz5.p getSelectionCallback() {
        return this.selectionCallback;
    }

    public void setOnVisibleChangeCallback(yz5.l lVar) {
    }

    public final void setReporter(com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter) {
        this.reporter = emojiCaptureReporter;
    }

    public final void setSelectionCallback(yz5.p pVar) {
        this.selectionCallback = pVar;
    }

    public void setShow(boolean z17) {
        if (!z17) {
            if (getVisibility() == 0) {
                if (getAlpha() == 0.0f) {
                    return;
                }
                animate().cancel();
                animate().alpha(0.0f).withEndAction(new a32.f0(this)).start();
                return;
            }
            return;
        }
        u22.r rVar = this.f98673n;
        if (!rVar.f424021i) {
            rVar.f424021i = true;
            rVar.f424024l.clear();
            rVar.d();
            rVar.e();
            rVar.c();
            rVar.b();
            v85.e.f434110h = new u22.n(rVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", "checkHistory: " + v85.e.f434109g);
            if (v85.e.f434109g <= 0) {
                java.util.LinkedList<r45.p64> lensInfoList = v85.e.f434108f.f383710d;
                kotlin.jvm.internal.o.f(lensInfoList, "lensInfoList");
                for (r45.p64 p64Var : lensInfoList) {
                    v85.e.f434109g++;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", "checkHistory: " + p64Var.f382792d);
                    java.lang.String LensId = p64Var.f382792d;
                    kotlin.jvm.internal.o.f(LensId, "LensId");
                    v85.d dVar = new v85.d(p64Var);
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        new x85.f(null, LensId, dVar);
                    } else {
                        new x85.i(null, LensId, dVar);
                    }
                }
            }
        }
        if (getVisibility() == 0) {
            if (getAlpha() == 1.0f) {
                return;
            }
        }
        setVisibility(0);
        animate().cancel();
        animate().alpha(1.0f).start();
        com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView = this.f98676q;
        if (moreStickerView == null || kotlin.jvm.internal.o.b(moreStickerView.B, null)) {
            return;
        }
        z22.f fVar = moreStickerView.f98685y;
        int i17 = fVar.f469718e;
        if (i17 != -1) {
            fVar.notifyItemChanged(i17);
            fVar.f469718e = -1;
            fVar.notifyItemChanged(-1);
        }
        yz5.l lVar = moreStickerView.selectionCallback;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorStickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
