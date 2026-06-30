package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter */
/* loaded from: classes15.dex */
public class C18846x292f7cd4 extends android.view.View {

    /* renamed from: r, reason: collision with root package name */
    public static int f257740r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f257741s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f257742t;

    /* renamed from: u, reason: collision with root package name */
    public static final float f257743u;

    /* renamed from: v, reason: collision with root package name */
    public static final float f257744v;

    /* renamed from: w, reason: collision with root package name */
    public static final float f257745w;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f257746d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f257747e;

    /* renamed from: f, reason: collision with root package name */
    public int f257748f;

    /* renamed from: g, reason: collision with root package name */
    public int f257749g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f257750h;

    /* renamed from: i, reason: collision with root package name */
    public float f257751i;

    /* renamed from: m, reason: collision with root package name */
    public float f257752m;

    /* renamed from: n, reason: collision with root package name */
    public float f257753n;

    /* renamed from: o, reason: collision with root package name */
    public float f257754o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f257755p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f257756q;

    static {
        android.graphics.Color.rgb(240, 250, 235);
        f257740r = android.graphics.Color.rgb(210, 240, 200);
        f257741s = 100;
        f257742t = 20;
        f257743u = 2.0f;
        f257744v = 0.1f;
        f257745w = 0.05f;
    }

    public C18846x292f7cd4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257748f = -1;
        this.f257749g = -1;
        this.f257750h = null;
        this.f257751i = 0.0f;
        this.f257752m = 0.0f;
        this.f257753n = 0.0f;
        this.f257754o = -1.0f;
        this.f257755p = true;
        this.f257756q = false;
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f257746d = new android.graphics.Paint();
        context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289);
        f257740r = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77747x91fa628b);
        this.f257750h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("VoicePrintVolumeMeter", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.t0(this), true);
    }

    public final void b() {
        android.view.View view = this.f257747e;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int[] iArr = new int[2];
        this.f257747e.getLocationOnScreen(iArr);
        if (iArr[0] == 0 || iArr[1] == 0) {
            return;
        }
        int width = this.f257747e.getWidth();
        int height = this.f257747e.getHeight();
        if (height == 0 || width == 0) {
            return;
        }
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        this.f257748f = iArr[0] + (width / 2);
        this.f257749g = (iArr[1] + (height / 2)) - iArr2[1];
        float f17 = width / 2.0f;
        this.f257751i = f17;
        this.f257752m = f257743u * f17;
        this.f257753n = f17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f257756q) {
            if (this.f257748f == -1 || this.f257749g == -1) {
                b();
            }
            this.f257746d.setAlpha(f257741s);
            float f17 = this.f257753n;
            float f18 = this.f257752m;
            if (f17 > f18) {
                this.f257753n = f18;
            }
            float f19 = this.f257753n;
            float f27 = this.f257751i;
            if (f19 < f27) {
                this.f257753n = f27;
            }
            this.f257746d.setColor(f257740r);
            canvas.drawCircle(this.f257748f, this.f257749g, this.f257753n, this.f257746d);
        }
    }

    /* renamed from: setArchView */
    public void m72723x103d029d(android.view.View view) {
        this.f257747e = view;
    }

    /* renamed from: setVolume */
    public void m72724x27f73e1c(float f17) {
        if (f17 > this.f257754o) {
            this.f257755p = true;
        } else {
            this.f257755p = false;
        }
        this.f257754o = f17;
    }

    public C18846x292f7cd4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f257748f = -1;
        this.f257749g = -1;
        this.f257750h = null;
        this.f257751i = 0.0f;
        this.f257752m = 0.0f;
        this.f257753n = 0.0f;
        this.f257754o = -1.0f;
        this.f257755p = true;
        this.f257756q = false;
        a(context);
    }
}
