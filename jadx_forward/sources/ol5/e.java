package ol5;

/* loaded from: classes15.dex */
public abstract class e extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6 f427753d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f427754e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f427755f;

    /* renamed from: g, reason: collision with root package name */
    public final int f427756g;

    /* renamed from: h, reason: collision with root package name */
    public ol5.d f427757h;

    /* renamed from: i, reason: collision with root package name */
    public ol5.d[] f427758i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f427759m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f427760n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f427761o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Activity f427762p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f427763q;

    public e(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.f427757h = ol5.d.TOP;
        this.f427758i = new ol5.d[4];
        this.f427759m = false;
        this.f427761o = new int[2];
        setCancelable(true);
        this.f427762p = (android.app.Activity) context;
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i17 = ol5.h.a(getContext())[0];
        this.f427756g = com.p314xaae8f345.mm.ui.bl.h(getContext());
        getWindow().getDecorView().setOnTouchListener(new ol5.a(this, attributes, i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r2 != 3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol5.e.b():void");
    }

    public final void c() {
        if (this.f427755f != null) {
            int i17 = 0;
            for (ol5.d dVar : this.f427758i) {
                if (dVar != null) {
                    i17++;
                }
            }
            if (i17 > 0) {
                int[] iArr = this.f427761o;
                int[] iArr2 = {iArr[0], iArr[1], (ol5.h.a(getContext())[0] - iArr[0]) - this.f427755f.width(), (ol5.h.a(getContext())[1] - iArr[1]) - this.f427755f.height()};
                int i18 = 0;
                for (ol5.d dVar2 : this.f427758i) {
                    if (dVar2 != null) {
                        i18++;
                    }
                }
                boolean z17 = i18 > 0;
                ol5.d dVar3 = ol5.d.BOTTOM;
                ol5.d dVar4 = ol5.d.RIGHT;
                ol5.d dVar5 = ol5.d.TOP;
                ol5.d dVar6 = ol5.d.LEFT;
                if (!z17) {
                    int i19 = 0;
                    for (int i27 = 0; i27 < 4; i27++) {
                        int i28 = iArr2[i27];
                        if (i28 > i19) {
                            i19 = i28;
                        }
                    }
                    if (i19 == iArr2[0]) {
                        this.f427757h = dVar6;
                        return;
                    }
                    if (i19 == iArr2[1]) {
                        this.f427757h = dVar5;
                        return;
                    } else if (i19 == iArr2[2]) {
                        this.f427757h = dVar4;
                        return;
                    } else {
                        if (i19 == iArr2[3]) {
                            this.f427757h = dVar3;
                            return;
                        }
                        return;
                    }
                }
                this.f427754e.measure(0, 0);
                for (ol5.d dVar7 : this.f427758i) {
                    if (dVar7 == null) {
                        return;
                    }
                    int ordinal = dVar7.ordinal();
                    if (ordinal == 0) {
                        if (iArr2[0] > this.f427754e.getMeasuredWidth()) {
                            this.f427757h = dVar6;
                            return;
                        }
                    } else if (ordinal == 1) {
                        if (iArr2[1] > this.f427754e.getMeasuredHeight()) {
                            this.f427757h = dVar5;
                            return;
                        }
                    } else if (ordinal == 2) {
                        if (iArr2[2] > this.f427754e.getMeasuredWidth()) {
                            this.f427757h = dVar4;
                            return;
                        }
                    } else if (ordinal == 3 && iArr2[3] > this.f427754e.getMeasuredHeight()) {
                        this.f427757h = dVar3;
                        return;
                    }
                }
                this.f427757h = this.f427758i[0];
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6 c22696x87b656f6 = this.f427753d;
        if (c22696x87b656f6 != null) {
            c22696x87b656f6.getViewTreeObserver().removeOnGlobalLayoutListener(this.f427763q);
        }
        super.dismiss();
    }

    public ol5.e e(int i17, int i18) {
        this.f427755f = new android.graphics.Rect(0, 0, 1, 1);
        int[] iArr = this.f427761o;
        iArr[0] = i17;
        iArr[1] = i18;
        c();
        if (this.f427763q != null) {
            f();
            b();
        }
        return this;
    }

    public final void f() {
        int ordinal = this.f427757h.ordinal();
        if (ordinal == 0) {
            this.f427753d.m81984x764cf621(ol5.f.RIGHT);
        } else if (ordinal == 1) {
            this.f427753d.m81984x764cf621(ol5.f.BOTTOM);
        } else if (ordinal == 2) {
            this.f427753d.m81984x764cf621(ol5.f.LEFT);
        } else if (ordinal == 3) {
            this.f427753d.m81984x764cf621(ol5.f.TOP);
        }
        this.f427753d.b();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.f427753d == null) {
            this.f427753d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6(getContext(), null);
        }
        android.view.View view = this.f427754e;
        if (view != null) {
            this.f427753d.addView(view);
        }
        setContentView(this.f427753d);
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(-2, -2);
        c();
        f();
        this.f427753d.measure(0, 0);
        b();
        this.f427763q = new ol5.b(this);
        this.f427753d.getViewTreeObserver().addOnGlobalLayoutListener(this.f427763q);
        this.f427753d.m81988xcd64ff58(new ol5.c(this));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (!this.f427759m || i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        dismiss();
        this.f427762p.onBackPressed();
        this.f427762p = null;
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.Window window = getWindow();
        if (window == null) {
            return false;
        }
        android.view.View decorView = window.getDecorView();
        if (this.f427760n && isShowing()) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            if (x17 <= 0 || y17 <= 0 || x17 > decorView.getWidth() || y17 > decorView.getHeight()) {
                cancel();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        this.f427760n = z17;
    }
}
