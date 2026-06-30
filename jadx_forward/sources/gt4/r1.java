package gt4;

/* loaded from: classes13.dex */
public class r1 extends android.view.View {
    public boolean A;
    public final float B;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a C;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f357046d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Canvas f357047e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f357048f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f357049g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f357050h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f357051i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Path f357052m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Path f357053n;

    /* renamed from: o, reason: collision with root package name */
    public float f357054o;

    /* renamed from: p, reason: collision with root package name */
    public float f357055p;

    /* renamed from: q, reason: collision with root package name */
    public int f357056q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f357057r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f357058s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f357059t;

    /* renamed from: u, reason: collision with root package name */
    public q35.d f357060u;

    /* renamed from: v, reason: collision with root package name */
    public float f357061v;

    /* renamed from: w, reason: collision with root package name */
    public float f357062w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f357063x;

    /* renamed from: y, reason: collision with root package name */
    public long f357064y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f357065z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a c19149x469f632a, android.content.Context context) {
        super(context);
        this.C = c19149x469f632a;
        this.f357065z = false;
        this.B = 0.9f;
    }

    public boolean a(android.view.MotionEvent motionEvent) {
        if (this.f357046d == null) {
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && motionEvent.getAction() != 0) {
            return false;
        }
        int width = getWidth();
        getHeight();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int i17 = (width * y17) + x17;
        getWidth();
        getHeight();
        motionEvent.getX();
        motionEvent.getY();
        return i17 > 0 && x17 > 0 && y17 > 0 && x17 < getWidth() && y17 < getHeight() && this.f357046d.getPixel(x17, y17) == 0;
    }

    public final boolean b() {
        if (this.f357062w < getHeight()) {
            return false;
        }
        this.A = true;
        if (!this.f357059t) {
            gt4.l1 l1Var = this.C.f262263g;
            if (l1Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onFinishScratchOrShake");
                int i17 = ((gt4.v1) l1Var).f357103a.f262274p.f82644n;
            }
            this.f357059t = true;
        }
        if (this.f357047e != null) {
            this.f357053n.reset();
            this.f357053n.moveTo(0.0f, 0.0f);
            this.f357053n.lineTo(getWidth(), 0.0f);
            this.f357053n.lineTo(getWidth(), getHeight());
            this.f357053n.lineTo(0.0f, getHeight());
            this.f357047e.drawPath(this.f357053n, this.f357051i);
        }
        invalidate();
        return true;
    }

    public final void c() {
        if (this.f357047e != null) {
            this.f357053n.reset();
            this.f357053n.moveTo(0.0f, this.f357062w);
            this.f357053n.cubicTo(getWidth() / 2, getHeight(), getWidth() / 2, 0.0f, getWidth(), this.f357061v);
            this.f357053n.lineTo(getWidth(), 0.0f);
            this.f357053n.lineTo(0.0f, 0.0f);
            this.f357047e.drawPath(this.f357053n, this.f357051i);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        if (this.f357046d == null) {
            int width = getWidth();
            int height = getHeight();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "createMasker width: %s, height: %s, waterMark: %s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), this.f357049g);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", "createMasker", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", "createMasker", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f357046d = createBitmap;
            this.f357047e = new android.graphics.Canvas(this.f357046d);
            if (this.f357049g != null) {
                this.f357049g.setBounds(new android.graphics.Rect(0, 0, width, height));
                this.f357049g.draw(this.f357047e);
            }
            this.f357057r = new int[width * height];
        }
        canvas.drawBitmap(this.f357046d, 0.0f, 0.0f, this.f357048f);
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        if (!this.C.f262262f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x17 = motionEvent.getX();
                    float y17 = motionEvent.getY();
                    if (this.f357047e != null) {
                        int abs = (int) java.lang.Math.abs(x17 - this.f357054o);
                        int abs2 = (int) java.lang.Math.abs(y17 - this.f357055p);
                        int i17 = this.f357056q;
                        if (abs >= i17 || abs2 >= i17) {
                            this.f357054o = x17;
                            this.f357055p = y17;
                            this.f357052m.quadTo((x17 + x17) / 2.0f, (y17 + y17) / 2.0f, x17, y17);
                            this.f357047e.drawPath(this.f357052m, this.f357050h);
                            this.f357052m.reset();
                            this.f357052m.moveTo(this.f357054o, this.f357055p);
                        }
                    }
                    invalidate();
                } else if (action != 3) {
                    z17 = false;
                    if (this.A && !a(motionEvent) && z17) {
                        return true;
                    }
                    return super.onTouchEvent(motionEvent);
                }
            }
            this.f357054o = 0.0f;
            this.f357055p = 0.0f;
            this.f357052m.reset();
            s75.d.b(new gt4.p1(this), "ScratchShakeView_calcErasePercentAndCallEnd");
            invalidate();
        } else {
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            this.f357052m.reset();
            this.f357052m.moveTo(x18, y18);
            this.f357054o = x18;
            this.f357055p = y18;
            invalidate();
            if (!this.f357058s) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gt4.o1(this), 50L);
                this.f357058s = true;
            }
        }
        z17 = true;
        if (this.A) {
        }
        return super.onTouchEvent(motionEvent);
    }
}
