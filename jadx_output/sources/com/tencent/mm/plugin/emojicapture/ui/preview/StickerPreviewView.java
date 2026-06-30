package com.tencent.mm.plugin.emojicapture.ui.preview;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgt0/a;", "", "url", "Ljz5/f0;", "setStickerUrl", "", "getRecordScene", "getResolutionLimit", "Lct0/a;", "getEncodeConfig", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoTransPara", "Let0/q;", "getCameraPreviewView", "Lms0/c;", "getPreviewRenderer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class StickerPreviewView extends androidx.constraintlayout.widget.ConstraintLayout implements gt0.a {
    public final android.view.View A;
    public final com.tencent.mm.sticker.ui.view.CaptureStickerHint B;
    public final com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView C;
    public final at0.n D;
    public final d32.t E;
    public final int F;
    public final int G;
    public final android.graphics.Rect H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f98791J;
    public final f32.j K;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f98792v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ViewGroup f98793w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView f98794x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView f98795y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f98796z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98792v = "MicroMsg.StickerPreviewView";
        this.E = new d32.t(0, 1, null);
        this.H = new android.graphics.Rect();
        this.f98791J = "";
        f32.j jVar = new f32.j(this);
        this.K = jVar;
        android.view.View.inflate(context, com.tencent.mm.R.layout.cvy, this);
        this.F = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480352vd);
        this.G = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479675cc);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nir);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98793w = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.niz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView = (com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView) findViewById2;
        this.f98794x = cameraPreviewGLTextureView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.niq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView cameraFrontSightView = (com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView) findViewById3;
        this.f98795y = cameraFrontSightView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.niy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.niv);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f98796z = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.nis);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.A = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.niw);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.nit);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        y22.n.d((android.widget.ImageView) findViewById8, com.tencent.mm.R.raw.icons_filled_camera_switch, -1);
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.nj9);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        ((androidx.constraintlayout.widget.Guideline) findViewById9).setGuidelineEnd(com.tencent.mm.ui.bl.c(context) + getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7));
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.f487111nj1);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.B = (com.tencent.mm.sticker.ui.view.CaptureStickerHint) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.nj7);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.C = (com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView) findViewById11;
        int b17 = i65.a.b(context, 120);
        cameraFrontSightView.b(b17, b17);
        cameraPreviewGLTextureView.setOpaque(false);
        this.D = new at0.n(this);
        ((com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView) findViewById4).setTouchCallback(new f32.d(this));
        findViewById5.setOnClickListener(new f32.h(context, this));
        findViewById6.setOnClickListener(new f32.i(this));
        u85.i.f425707a.e(jVar);
        t85.j jVar2 = new t85.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = u85.i.f425710d;
        sb6.append(str);
        sb6.append("preview/");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.g(sb7, "<set-?>");
        jVar2.f416476c = sb7;
        jVar2.b(str + "preview/");
        A(jVar2);
    }

    public final void A(t85.j jVar) {
        pm0.v.X(new f32.k(jVar, this));
        this.f98794x.l(new f32.l(this, jVar));
    }

    @Override // gt0.a
    public boolean g() {
        return ((q22.a) q22.b.f359805b.a()).f359801b;
    }

    @Override // gt0.a
    public et0.q getCameraPreviewView() {
        return this.f98794x;
    }

    @Override // gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getDaemonVideoTransPara() {
        return getVideoTransPara();
    }

    @Override // gt0.a
    public ct0.a getEncodeConfig() {
        return new f32.m();
    }

    @Override // gt0.a
    public ms0.c getPreviewRenderer() {
        return this.E;
    }

    @Override // gt0.a
    public /* bridge */ /* synthetic */ ms0.c getRecordRenderer() {
        return null;
    }

    @Override // gt0.d
    public int getRecordScene() {
        return 10;
    }

    @Override // gt0.a
    public /* bridge */ /* synthetic */ ht0.b getRecorder() {
        return null;
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

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 == i19 || i17 <= 0) {
            return;
        }
        int width = getWidth();
        int i28 = this.F;
        int i29 = (width - i28) / 2;
        int i37 = this.G;
        android.graphics.Rect previewRect = this.H;
        previewRect.set(i29, i37, i29 + i28, i28 + i37);
        d32.t tVar = this.E;
        tVar.getClass();
        kotlin.jvm.internal.o.g(previewRect, "previewRect");
        tVar.B.set(previewRect);
    }

    public final void setStickerUrl(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f98791J = url;
        u85.i iVar = u85.i.f425707a;
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = new com.tencent.mm.sticker.loader.StickerLoadInfo(1);
        stickerLoadInfo.f193694i = url;
        iVar.d(stickerLoadInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerPreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
