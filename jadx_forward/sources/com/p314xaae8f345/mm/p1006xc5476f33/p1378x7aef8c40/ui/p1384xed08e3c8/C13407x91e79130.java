package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgt0/a;", "", "url", "Ljz5/f0;", "setStickerUrl", "", "getRecordScene", "getResolutionLimit", "Lct0/a;", "getEncodeConfig", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoTransPara", "Let0/q;", "getCameraPreviewView", "Lms0/c;", "getPreviewRenderer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView */
/* loaded from: classes10.dex */
public final class C13407x91e79130 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 implements gt0.a {
    public final android.view.View A;
    public final com.p314xaae8f345.mm.p2618x8f55093d.ui.p2620x373aa5.C21047xa624ea5e B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d.C13404xce5cc0b2 C;
    public final at0.n D;
    public final d32.t E;
    public final int F;
    public final int G;
    public final android.graphics.Rect H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f180324J;
    public final f32.j K;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f180325v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ViewGroup f180326w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 f180327x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e f180328y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f180329z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13407x91e79130(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180325v = "MicroMsg.StickerPreviewView";
        this.E = new d32.t(0, 1, null);
        this.H = new android.graphics.Rect();
        this.f180324J = "";
        f32.j jVar = new f32.j(this);
        this.K = jVar;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cvy, this);
        this.F = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561885vd);
        this.G = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nir);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f180326w = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.niz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58 = (com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58) findViewById2;
        this.f180327x = c10906xaf641c58;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.niq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e c16545x39e5705e = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e) findViewById3;
        this.f180328y = c16545x39e5705e;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.niy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.niv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f180329z = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.nis);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.A = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.niw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.nit);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        y22.n.d((android.widget.ImageView) findViewById8, com.p314xaae8f345.mm.R.raw.f79659x62521576, -1);
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.nj9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) findViewById9).m7187xdf772b4d(com.p314xaae8f345.mm.ui.bl.c(context) + getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.f568644nj1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.B = (com.p314xaae8f345.mm.p2618x8f55093d.ui.p2620x373aa5.C21047xa624ea5e) findViewById10;
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.nj7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.C = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d.C13404xce5cc0b2) findViewById11;
        int b17 = i65.a.b(context, 120);
        c16545x39e5705e.b(b17, b17);
        c10906xaf641c58.setOpaque(false);
        this.D = new at0.n(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16549xbfc1cbdb) findViewById4).m66959x73ebd762(new f32.d(this));
        findViewById5.setOnClickListener(new f32.h(context, this));
        findViewById6.setOnClickListener(new f32.i(this));
        u85.i.f507240a.e(jVar);
        t85.j jVar2 = new t85.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = u85.i.f507243d;
        sb6.append(str);
        sb6.append("preview/");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
        jVar2.f498009c = sb7;
        jVar2.b(str + "preview/");
        A(jVar2);
    }

    public final void A(t85.j jVar) {
        pm0.v.X(new f32.k(jVar, this));
        this.f180327x.l(new f32.l(this, jVar));
    }

    @Override // gt0.a
    public boolean g() {
        return ((q22.a) q22.b.f441338b.a()).f441334b;
    }

    @Override // gt0.a
    /* renamed from: getCameraPreviewView */
    public et0.q mo54891x9333e172() {
        return this.f180327x;
    }

    @Override // gt0.a
    /* renamed from: getDaemonVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54892x7cd80487() {
        return mo54902x402de963();
    }

    @Override // gt0.a
    /* renamed from: getEncodeConfig */
    public ct0.a mo54894x11cfd76e() {
        return new f32.m();
    }

    @Override // gt0.a
    /* renamed from: getPreviewRenderer */
    public ms0.c mo54896xb3aa1275() {
        return this.E;
    }

    @Override // gt0.a
    /* renamed from: getRecordRenderer */
    public /* bridge */ /* synthetic */ ms0.c mo54897xbfb4fd2a() {
        return null;
    }

    @Override // gt0.d
    /* renamed from: getRecordScene */
    public int mo54898x27ac0d85() {
        return 10;
    }

    @Override // gt0.a
    /* renamed from: getRecorder */
    public /* bridge */ /* synthetic */ ht0.b mo54899x4c36e634() {
        return null;
    }

    @Override // gt0.d
    /* renamed from: getResolutionLimit */
    public int mo54901x6fcd4039() {
        return ((q22.a) q22.b.f441338b.a()).f441333a;
    }

    @Override // gt0.a
    /* renamed from: getVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = di3.w.f314303d.f314234b;
        return c11120x15dce88d != null ? c11120x15dce88d : new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewRect, "previewRect");
        tVar.B.set(previewRect);
    }

    /* renamed from: setStickerUrl */
    public final void m54967xd52464f4(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f180324J = url;
        u85.i iVar = u85.i.f507240a;
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = new com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1(1);
        c21046x5cf452f1.f275227i = url;
        iVar.d(c21046x5cf452f1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13407x91e79130(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
