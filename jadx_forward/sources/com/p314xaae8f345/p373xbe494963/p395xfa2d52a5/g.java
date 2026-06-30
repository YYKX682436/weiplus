package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    final android.content.Context f128074c;

    /* renamed from: e, reason: collision with root package name */
    final android.widget.ArrayAdapter<java.lang.String> f128076e;

    /* renamed from: f, reason: collision with root package name */
    android.view.WindowManager f128077f;

    /* renamed from: g, reason: collision with root package name */
    android.view.View f128078g;

    /* renamed from: h, reason: collision with root package name */
    android.widget.TextView f128079h;

    /* renamed from: i, reason: collision with root package name */
    android.widget.TextView f128080i;

    /* renamed from: j, reason: collision with root package name */
    android.widget.Spinner f128081j;

    /* renamed from: k, reason: collision with root package name */
    android.widget.ScrollView f128082k;

    /* renamed from: l, reason: collision with root package name */
    java.lang.String f128083l;

    /* renamed from: o, reason: collision with root package name */
    final com.tencent.liteav.sdkcommon.g.a f128086o;

    /* renamed from: a, reason: collision with root package name */
    final android.util.DisplayMetrics f128072a = new android.util.DisplayMetrics();

    /* renamed from: b, reason: collision with root package name */
    final android.view.WindowManager.LayoutParams f128073b = new android.view.WindowManager.LayoutParams();

    /* renamed from: p, reason: collision with root package name */
    private final int f128087p = -65536;

    /* renamed from: q, reason: collision with root package name */
    private boolean f128088q = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f128084m = false;

    /* renamed from: n, reason: collision with root package name */
    int f128085n = 1920;

    /* renamed from: d, reason: collision with root package name */
    final android.os.Handler f128075d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* loaded from: classes15.dex */
    public interface a {
        void a(int i17);
    }

    /* loaded from: classes15.dex */
    public class b implements android.view.View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        private int f128090b;

        /* renamed from: c, reason: collision with root package name */
        private int f128091c;

        private b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f128090b = (int) motionEvent.getRawX();
                this.f128091c = (int) motionEvent.getRawY();
            } else if (action == 2) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int i17 = rawX - this.f128090b;
                int i18 = rawY - this.f128091c;
                android.view.WindowManager.LayoutParams layoutParams = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this.f128073b;
                int i19 = layoutParams.x + i17;
                layoutParams.x = i19;
                layoutParams.y += i18;
                this.f128090b = rawX;
                this.f128091c = rawY;
                layoutParams.x = java.lang.Math.max(i19, 0);
                android.view.WindowManager.LayoutParams layoutParams2 = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this.f128073b;
                layoutParams2.y = java.lang.Math.max(layoutParams2.y, 0);
                com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this;
                android.view.WindowManager.LayoutParams layoutParams3 = gVar.f128073b;
                int i27 = layoutParams3.x;
                android.util.DisplayMetrics displayMetrics = gVar.f128072a;
                int i28 = displayMetrics.widthPixels;
                if (i27 + i28 > i28) {
                    layoutParams3.width = i28 - i27;
                } else {
                    layoutParams3.width = i28;
                }
                int i29 = gVar.f128085n;
                layoutParams3.height = i29;
                if (gVar.f128084m) {
                    layoutParams3.height = i29 / 2;
                }
                int i37 = layoutParams3.y;
                int i38 = layoutParams3.height + i37;
                int i39 = displayMetrics.heightPixels;
                if (i38 > i39) {
                    layoutParams3.height = i39 - i37;
                }
                android.view.ViewGroup.LayoutParams layoutParams4 = gVar.f128082k.getLayoutParams();
                layoutParams4.height = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this.b();
                com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this.f128082k.setLayoutParams(layoutParams4);
                com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar2 = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this;
                gVar2.f128077f.updateViewLayout(view, gVar2.f128073b);
            }
            view.performClick();
            return false;
        }

        public /* synthetic */ b(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar, byte b17) {
            this();
        }
    }

    /* loaded from: classes15.dex */
    public class c implements android.widget.AdapterView.OnItemSelectedListener {
        private c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i17, long j17) {
            if (view == null) {
                return;
            }
            ((android.widget.TextView) view).setTextColor(-65536);
            com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this;
            gVar.f128083l = gVar.f128076e.getItem(i17);
            com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g.this.f128086o.a(i17);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(android.widget.AdapterView<?> adapterView) {
        }

        public /* synthetic */ c(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar, byte b17) {
            this();
        }
    }

    public g(android.content.Context context, com.tencent.liteav.sdkcommon.g.a aVar) {
        this.f128074c = context;
        this.f128086o = aVar;
        this.f128076e = new android.widget.ArrayAdapter<>(context, android.R.layout.simple_spinner_item);
    }

    public final void a(boolean z17) {
        if (z17 == this.f128088q) {
            return;
        }
        if (z17) {
            this.f128077f.addView(this.f128078g, this.f128073b);
        } else {
            this.f128077f.removeView(this.f128078g);
        }
        this.f128088q = z17;
    }

    public final void b(java.lang.String str) {
        android.widget.TextView textView = this.f128079h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final int b() {
        return java.lang.Math.max((this.f128073b.height - a(230)) - a(20), 0);
    }

    public final void a(java.lang.String str) {
        android.widget.TextView textView = this.f128080i;
        if (textView != null) {
            textView.setText(str);
        }
        this.f128075d.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.h.a(this));
    }

    public final void a() {
        android.widget.TextView textView;
        android.widget.Spinner spinner = this.f128081j;
        if (spinner == null || (textView = (android.widget.TextView) spinner.getChildAt(spinner.getSelectedItemPosition())) == null) {
            return;
        }
        textView.setTextColor(-65536);
    }

    public final int a(int i17) {
        return (int) ((i17 * this.f128074c.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
