package com.tencent.mm.plugin.emojicapture.ui.capture;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b,\u0010.J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer;", "Landroid/widget/RelativeLayout;", "Lr22/b;", "Lgt0/a;", "Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureDecoration;", "getDecoration", "", "visibility", "Ljz5/f0;", "setVisibility", "getResolutionLimit", "Lct0/a;", "getEncodeConfig", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoTransPara", "Let0/q;", "getCameraPreviewView", "Lms0/c;", "getRecordRenderer", "getPreviewRenderer", "Lht0/b;", "getRecorder", "getRecordScene", "Lr22/a;", "t", "Lr22/a;", "getPresenter", "()Lr22/a;", "setPresenter", "(Lr22/a;)V", "presenter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "u", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CaptureContainer extends android.widget.RelativeLayout implements r22.b, gt0.a {
    public static final /* synthetic */ int L0 = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98641d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f98642e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView f98643f;

    /* renamed from: g, reason: collision with root package name */
    public d32.l f98644g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f98645h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f98646i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f98647m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f98648n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f98649o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration f98650p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView f98651q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f98652r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f98653s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public r22.a presenter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter;

    /* renamed from: v, reason: collision with root package name */
    public r45.p64 f98656v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f98657w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f98658x;

    /* renamed from: y, reason: collision with root package name */
    public final at0.n f98659y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f98660z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98641d = "MicroMsg.CaptureContainer";
        this.f98644g = new d32.l();
        this.f98658x = new a32.p(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.a5z, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484188da4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f98642e = viewGroup;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d_s);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = (com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton) findViewById2;
        this.f98645h = mMSightRecordButton;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.b6l);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f98646i = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.b6p);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f98647m = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.p5e);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f98649o = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.b6n);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f98650p = (com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.b6q);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView cameraFrontSightView = (com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView) findViewById7;
        this.f98651q = cameraFrontSightView;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.b6u);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f484185da1);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f98652r = textView;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.da6);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById10;
        this.f98653s = textView2;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.dab);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = (com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView) findViewById11;
        this.f98648n = editorStickerView;
        int b17 = i65.a.b(context, 120);
        cameraFrontSightView.b(b17, b17);
        this.f98643f = new com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView(context);
        at0.n nVar = new at0.n(this);
        this.f98659y = nVar;
        nVar.f(600L);
        viewGroup.addView(this.f98643f);
        this.f98643f.setOpaque(false);
        mMSightRecordButton.setHighLightOuter(getResources().getColor(com.tencent.mm.R.color.f478912ki));
        mMSightRecordButton.setInnerColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        mMSightRecordButton.setLongPressCallback(new a32.e(this));
        mMSightRecordButton.setSimpleTapCallback(new a32.f(this));
        mMSightRecordButton.setLongPressScrollCallback(new a32.g(this));
        ((com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView) findViewById8).setTouchCallback(new a32.h(this));
        findViewById3.setOnClickListener(new a32.i(this));
        findViewById4.setOnClickListener(new a32.j(this));
        textView2.setOnClickListener(new a32.k(this, context));
        editorStickerView.setSelectionCallback(new a32.l(this, context));
        editorStickerView.setVisibility(8);
        textView.setAlpha(0.0f);
        post(new a32.m(this));
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            findViewById3.setOnLongClickListener(new a32.d(context, this));
        }
    }

    public static final void a(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer, ct0.b bVar) {
        boolean z17;
        java.lang.String str = captureContainer.f98641d;
        com.tencent.mars.xlog.Log.i(str, "stopRecord: videoRecorder stop");
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = captureContainer.reporter;
        if (emojiCaptureReporter != null) {
            emojiCaptureReporter.f98601y = captureContainer.f98660z;
        }
        captureContainer.f98659y.k();
        if (com.tencent.mm.vfs.w6.j(bVar.f222204a) && !com.tencent.mm.vfs.w6.j(bVar.f222205b) && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f222205b)) {
            r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
            java.lang.String str2 = bVar.f222204a;
            ((q90.i) lVar).getClass();
            android.graphics.Bitmap p17 = ai3.d.p(str2);
            com.tencent.mars.xlog.Log.i(str, "retry get video thumb:" + p17 + ", videoPath:" + bVar.f222204a + ", thumbPath:" + bVar.f222205b);
            if (p17 != null) {
                com.tencent.mm.sdk.platformtools.x.D0(p17, 80, android.graphics.Bitmap.CompressFormat.JPEG, bVar.f222205b, true);
            }
        }
        if (!com.tencent.mm.vfs.w6.j(bVar.f222205b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoRecordNoThumb");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 11L, 1L);
        }
        r22.a aVar = captureContainer.presenter;
        if (aVar != null) {
            boolean z18 = captureContainer.f98660z;
            w22.g gVar = (w22.g) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "stopRecord: videoRecorder stop");
            java.lang.String str3 = bVar.f222204a;
            u22.b bVar2 = gVar.f442539j;
            bVar2.getClass();
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            bVar2.f423976c = str3;
            java.lang.String str4 = bVar.f222205b;
            kotlin.jvm.internal.o.g(str4, "<set-?>");
            bVar2.f423977d = str4;
            r22.b bVar3 = gVar.f442531b;
            bVar2.f423979f = bVar3.getF98650p().getTextColor();
            t85.j jVar = bVar2.f423978e;
            boolean z19 = (jVar != null ? jVar.f416482i : null) == null;
            bVar2.f423980g = z19;
            bVar2.f423981h = (z19 && z18) ? false : true;
            bVar2.f423982i = bVar3.getF98650p().getA();
            android.graphics.Matrix attachEmojiMatrix = bVar3.getF98650p().getAttachEmojiMatrix();
            kotlin.jvm.internal.o.g(attachEmojiMatrix, "<set-?>");
            bVar2.f423983j = attachEmojiMatrix;
            y22.m mVar = (y22.m) gVar.f442532c;
            mVar.getClass();
            com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI = mVar.f459104b;
            com.tencent.mars.xlog.Log.i(emojiCaptureUI.f98606d, "prepareEditor " + bVar2.f423976c);
            java.lang.String videoPath = bVar2.f423976c;
            kotlin.jvm.internal.o.g(videoPath, "videoPath");
            if (com.tencent.mm.vfs.w6.k(videoPath) > 0) {
                gp.c cVar = new gp.c();
                try {
                    try {
                        cVar.k(videoPath);
                        if (cVar.d() < 1) {
                            try {
                                cVar.g();
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e17, "checkVideoValid, release extractor error", new java.lang.Object[0]);
                            }
                        } else {
                            int d17 = cVar.d();
                            for (int i17 = 0; i17 < d17; i17++) {
                                android.media.MediaFormat e18 = cVar.e(i17);
                                kotlin.jvm.internal.o.f(e18, "getTrackFormat(...)");
                                if (e18.containsKey("mime")) {
                                    java.lang.String string = e18.getString("mime");
                                    if (string != null && r26.n0.B(string, "video", false)) {
                                        try {
                                            cVar.g();
                                        } catch (java.lang.Exception e19) {
                                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e19, "checkVideoValid, release extractor error", new java.lang.Object[0]);
                                        }
                                        z17 = true;
                                        break;
                                    }
                                }
                            }
                            try {
                                cVar.g();
                            } catch (java.lang.Exception e27) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e27, "checkVideoValid, release extractor error", new java.lang.Object[0]);
                            }
                        }
                    } catch (java.lang.Exception e28) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e28, "checkVideoValid error", new java.lang.Object[0]);
                        try {
                            cVar.g();
                        } catch (java.lang.Exception e29) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e29, "checkVideoValid, release extractor error", new java.lang.Object[0]);
                        }
                    }
                } finally {
                }
            }
            z17 = false;
            if (!z17) {
                com.tencent.mars.xlog.Log.i(emojiCaptureUI.f98606d, "prepareEditor: video invalid");
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(2, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoRecordFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 10L, 1L);
                mVar.d();
                return;
            }
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = emojiCaptureUI.f98608f;
            if (captureEditorContainer != null) {
                captureEditorContainer.setVisibility(0);
            }
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer2 = emojiCaptureUI.f98608f;
            if (captureEditorContainer2 != null) {
                captureEditorContainer2.setAlpha(0.0f);
            }
            r22.c cVar2 = emojiCaptureUI.f98610h;
            if (cVar2 != null) {
                w22.v vVar = (w22.v) cVar2;
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "setup");
                vVar.f442592m = bVar2;
                boolean z27 = bVar2.f423981h;
                vVar.f442590k = z27;
                vVar.f442586g = bVar2.f423979f;
                java.lang.String videoPath2 = bVar2.f423976c;
                boolean z28 = bVar2.f423980g;
                w22.r rVar = new w22.r(vVar);
                com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer3 = (com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer) vVar.f442581b;
                captureEditorContainer3.getClass();
                kotlin.jvm.internal.o.g(videoPath2, "videoPath");
                android.content.Context context = captureEditorContainer3.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = new com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView(context);
                captureEditorContainer3.f98697h = emojiVideoPlayTextureView;
                captureEditorContainer3.f98696g.addView(emojiVideoPlayTextureView);
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = captureEditorContainer3.f98697h;
                if (emojiVideoPlayTextureView2 != null) {
                    emojiVideoPlayTextureView2.setRemoveBgEnable(z28);
                }
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView3 = captureEditorContainer3.f98697h;
                if (emojiVideoPlayTextureView3 != null) {
                    emojiVideoPlayTextureView3.setRemoveBackground(z27);
                }
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView4 = captureEditorContainer3.f98697h;
                if (emojiVideoPlayTextureView4 != null) {
                    emojiVideoPlayTextureView4.setVideoCallback(captureEditorContainer3.D);
                }
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView5 = captureEditorContainer3.f98697h;
                if (emojiVideoPlayTextureView5 != null) {
                    emojiVideoPlayTextureView5.setVideoPath(videoPath2);
                }
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView6 = captureEditorContainer3.f98697h;
                if (emojiVideoPlayTextureView6 != null) {
                    emojiVideoPlayTextureView6.setAlpha(0.0f);
                }
                android.graphics.drawable.Drawable drawable = captureEditorContainer3.f98709w;
                android.widget.ImageView imageView = captureEditorContainer3.f98704r;
                android.view.View view = captureEditorContainer3.f98701o;
                if (z28) {
                    view.setEnabled(true);
                    android.view.View view2 = captureEditorContainer3.f98701o;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setSelected(z27);
                    if (view.isSelected()) {
                        drawable = captureEditorContainer3.f98708v;
                    }
                    imageView.setImageDrawable(drawable);
                } else {
                    view.setEnabled(false);
                    view.setSelected(false);
                    imageView.setImageDrawable(drawable);
                    android.view.View view3 = captureEditorContainer3.f98701o;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(0.3f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                captureEditorContainer3.C = rVar;
                pm0.v.L("EditorPresenter_setup", true, new w22.s(bVar2));
            }
            r22.a aVar2 = emojiCaptureUI.f98609g;
            if (aVar2 != null) {
                w22.g gVar2 = (w22.g) aVar2;
                com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "pauseCapture " + gVar2.f442537h);
                java.lang.String str5 = gVar2.f442538i;
                if (str5 != null || gVar2.f442537h) {
                    ((y22.m) gVar2.f442532c).e(str5);
                } else {
                    com.tencent.mm.sdk.platformtools.u3.i(new w22.c(gVar2), 1500L);
                }
            }
            emojiCaptureUI.f98611i = 2;
        }
    }

    public static final void b(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer, boolean z17) {
        java.lang.String str = captureContainer.f98641d;
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = captureContainer.f98648n;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "stopRecord true");
            captureContainer.f98645h.setTouchEnable(false);
            editorStickerView.getClass();
            pm0.v.X(new a32.d0(editorStickerView));
        } else {
            com.tencent.mars.xlog.Log.i(str, "stopRecord false");
            captureContainer.e(true, com.tencent.mm.R.string.aqn);
            editorStickerView.setShow(true);
            captureContainer.f98643f.l(new a32.s(captureContainer));
            captureContainer.f98659y.getClass();
            pm0.v.X(new a32.u(it0.c.a(), captureContainer));
            pm0.v.V(200L, new a32.e0(editorStickerView));
        }
        android.view.View view = captureContainer.f98646i;
        view.setEnabled(true);
        view.animate().cancel();
        android.view.View view2 = captureContainer.f98646i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "recordStop", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "recordStop", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void c() {
        com.tencent.mars.xlog.Log.i(this.f98641d, "resumeCapture");
        f(false);
        if (this.f98657w) {
            this.f98648n.setShow(true);
        }
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration f98650p = getF98650p();
        android.view.ViewGroup viewGroup = f98650p.f98661v.f98728g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                ((b32.c0) childAt).resume();
            }
        }
        f98650p.f98662w.a();
        this.f98643f.l(new a32.q(this));
        at0.n.i(this.f98659y, this.f98660z, null, new a32.r(this), 2, null);
    }

    public boolean d() {
        this.f98660z = this.f98659y.m(false);
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = this.reporter;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(5, emojiCaptureReporter != null ? emojiCaptureReporter.f98583d : 0L, 0L, 0L, 0L, 0L, 0L, 0, 0, emojiCaptureReporter != null ? emojiCaptureReporter.G : 0);
        return this.f98660z;
    }

    public final void e(boolean z17, int i17) {
        android.widget.TextView textView = this.f98652r;
        if (!z17) {
            textView.animate().cancel();
            textView.animate().alpha(0.0f).start();
            return;
        }
        if (textView.getTop() < getResources().getDimension(com.tencent.mm.R.dimen.f480352vd) + getResources().getDimension(com.tencent.mm.R.dimen.a7u) + getResources().getDimension(com.tencent.mm.R.dimen.f480353ve) + getResources().getDimension(com.tencent.mm.R.dimen.f480354vf) + i65.a.b(getContext(), 30)) {
            textView.setBackgroundResource(com.tencent.mm.R.drawable.emoji_capture_hint_bg);
        }
        java.lang.Runnable runnable = this.f98658x;
        removeCallbacks(runnable);
        textView.animate().cancel();
        textView.animate().alpha(1.0f).start();
        textView.setText(i17);
        postDelayed(runnable, 2000L);
    }

    public void f(boolean z17) {
        if (z17) {
            android.view.View view = this.f98649o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f98649o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // gt0.a
    public boolean g() {
        return ((q22.a) q22.b.f359805b.a()).f359801b;
    }

    @Override // gt0.a
    public et0.q getCameraPreviewView() {
        return this.f98643f;
    }

    @Override // gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getDaemonVideoTransPara() {
        return getVideoTransPara();
    }

    @Override // r22.b
    /* renamed from: getDecoration, reason: from getter */
    public com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration getF98650p() {
        return this.f98650p;
    }

    @Override // gt0.a
    public ct0.a getEncodeConfig() {
        return new a32.o();
    }

    public final r22.a getPresenter() {
        return this.presenter;
    }

    @Override // gt0.a
    public ms0.c getPreviewRenderer() {
        return this.f98644g;
    }

    @Override // gt0.a
    public ms0.c getRecordRenderer() {
        d32.m mVar = new d32.m();
        int i17 = t22.o.f415103d;
        mVar.u(i17, i17);
        return mVar;
    }

    @Override // gt0.d
    public int getRecordScene() {
        return 8;
    }

    @Override // gt0.a
    public ht0.b getRecorder() {
        ms0.c recordRenderer = getRecordRenderer();
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = getVideoTransPara();
        android.opengl.EGLContext eGLContext = getCameraPreviewView().getEGLContext();
        kotlin.jvm.internal.o.d(eGLContext);
        is0.c previewTexture = this.f98643f.getPreviewTexture();
        return new ht0.s(videoTransPara, recordRenderer, eGLContext, previewTexture != null ? previewTexture.f294395e : -1);
    }

    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter getReporter() {
        return this.reporter;
    }

    @Override // gt0.d
    public int getResolutionLimit() {
        return ((q22.a) q22.b.f359805b.a()).f359800a;
    }

    @Override // gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getVideoTransPara() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = di3.w.f232770d.f232701b;
        return videoTransPara != null ? videoTransPara : new com.tencent.mm.modelcontrol.VideoTransPara();
    }

    @Override // gt0.a
    public boolean isMute() {
        return true;
    }

    @Override // gt0.a
    public boolean m() {
        return wo.v1.f447822b.O;
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets != null) {
            findViewById(com.tencent.mm.R.id.f484184da0).setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
        }
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        kotlin.jvm.internal.o.f(onApplyWindowInsets, "onApplyWindowInsets(...)");
        return onApplyWindowInsets;
    }

    public final void setPresenter(r22.a aVar) {
        this.presenter = aVar;
    }

    public final void setReporter(com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter) {
        this.reporter = emojiCaptureReporter;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mars.xlog.Log.i(this.f98641d, "setVisibility:" + i17);
        super.setVisibility(i17);
        android.view.View view = this.f98646i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            this.f98645h.setTouchEnable(true);
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f98648n;
            editorStickerView.getClass();
            pm0.v.V(200L, new a32.e0(editorStickerView));
        }
        if (i17 == 8) {
            this.f98643f.setTextureChangeCallback(null);
            com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView emojiCaptureGLTextureView = this.f98643f;
            android.view.ViewGroup viewGroup = this.f98642e;
            viewGroup.removeView(emojiCaptureGLTextureView);
            com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView emojiCaptureGLTextureView2 = new com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView(getContext());
            this.f98643f = emojiCaptureGLTextureView2;
            viewGroup.addView(emojiCaptureGLTextureView2);
            d32.l lVar = new d32.l();
            this.f98644g = lVar;
            this.f98643f.m(lVar, g());
            this.f98643f.setOpaque(false);
        }
        this.f98643f.setVisibility(i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
