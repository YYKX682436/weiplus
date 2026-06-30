package com.tencent.liteav.sdkcommon;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    final android.content.Context f46541c;

    /* renamed from: e, reason: collision with root package name */
    final android.widget.ArrayAdapter<java.lang.String> f46543e;

    /* renamed from: f, reason: collision with root package name */
    android.view.WindowManager f46544f;

    /* renamed from: g, reason: collision with root package name */
    android.view.View f46545g;

    /* renamed from: h, reason: collision with root package name */
    android.widget.TextView f46546h;

    /* renamed from: i, reason: collision with root package name */
    android.widget.TextView f46547i;

    /* renamed from: j, reason: collision with root package name */
    android.widget.Spinner f46548j;

    /* renamed from: k, reason: collision with root package name */
    android.widget.ScrollView f46549k;

    /* renamed from: l, reason: collision with root package name */
    java.lang.String f46550l;

    /* renamed from: o, reason: collision with root package name */
    final com.tencent.liteav.sdkcommon.g.a f46553o;

    /* renamed from: a, reason: collision with root package name */
    final android.util.DisplayMetrics f46539a = new android.util.DisplayMetrics();

    /* renamed from: b, reason: collision with root package name */
    final android.view.WindowManager.LayoutParams f46540b = new android.view.WindowManager.LayoutParams();

    /* renamed from: p, reason: collision with root package name */
    private final int f46554p = -65536;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46555q = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f46551m = false;

    /* renamed from: n, reason: collision with root package name */
    int f46552n = 1920;

    /* renamed from: d, reason: collision with root package name */
    final android.os.Handler f46542d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* loaded from: classes15.dex */
    public interface a {
        void a(int i17);
    }

    /* loaded from: classes15.dex */
    public class b implements android.view.View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        private int f46557b;

        /* renamed from: c, reason: collision with root package name */
        private int f46558c;

        private b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f46557b = (int) motionEvent.getRawX();
                this.f46558c = (int) motionEvent.getRawY();
            } else if (action == 2) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int i17 = rawX - this.f46557b;
                int i18 = rawY - this.f46558c;
                android.view.WindowManager.LayoutParams layoutParams = com.tencent.liteav.sdkcommon.g.this.f46540b;
                int i19 = layoutParams.x + i17;
                layoutParams.x = i19;
                layoutParams.y += i18;
                this.f46557b = rawX;
                this.f46558c = rawY;
                layoutParams.x = java.lang.Math.max(i19, 0);
                android.view.WindowManager.LayoutParams layoutParams2 = com.tencent.liteav.sdkcommon.g.this.f46540b;
                layoutParams2.y = java.lang.Math.max(layoutParams2.y, 0);
                com.tencent.liteav.sdkcommon.g gVar = com.tencent.liteav.sdkcommon.g.this;
                android.view.WindowManager.LayoutParams layoutParams3 = gVar.f46540b;
                int i27 = layoutParams3.x;
                android.util.DisplayMetrics displayMetrics = gVar.f46539a;
                int i28 = displayMetrics.widthPixels;
                if (i27 + i28 > i28) {
                    layoutParams3.width = i28 - i27;
                } else {
                    layoutParams3.width = i28;
                }
                int i29 = gVar.f46552n;
                layoutParams3.height = i29;
                if (gVar.f46551m) {
                    layoutParams3.height = i29 / 2;
                }
                int i37 = layoutParams3.y;
                int i38 = layoutParams3.height + i37;
                int i39 = displayMetrics.heightPixels;
                if (i38 > i39) {
                    layoutParams3.height = i39 - i37;
                }
                android.view.ViewGroup.LayoutParams layoutParams4 = gVar.f46549k.getLayoutParams();
                layoutParams4.height = com.tencent.liteav.sdkcommon.g.this.b();
                com.tencent.liteav.sdkcommon.g.this.f46549k.setLayoutParams(layoutParams4);
                com.tencent.liteav.sdkcommon.g gVar2 = com.tencent.liteav.sdkcommon.g.this;
                gVar2.f46544f.updateViewLayout(view, gVar2.f46540b);
            }
            view.performClick();
            return false;
        }

        public /* synthetic */ b(com.tencent.liteav.sdkcommon.g gVar, byte b17) {
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
            com.tencent.liteav.sdkcommon.g gVar = com.tencent.liteav.sdkcommon.g.this;
            gVar.f46550l = gVar.f46543e.getItem(i17);
            com.tencent.liteav.sdkcommon.g.this.f46553o.a(i17);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(android.widget.AdapterView<?> adapterView) {
        }

        public /* synthetic */ c(com.tencent.liteav.sdkcommon.g gVar, byte b17) {
            this();
        }
    }

    public g(android.content.Context context, com.tencent.liteav.sdkcommon.g.a aVar) {
        this.f46541c = context;
        this.f46553o = aVar;
        this.f46543e = new android.widget.ArrayAdapter<>(context, android.R.layout.simple_spinner_item);
    }

    public final void a(boolean z17) {
        if (z17 == this.f46555q) {
            return;
        }
        if (z17) {
            this.f46544f.addView(this.f46545g, this.f46540b);
        } else {
            this.f46544f.removeView(this.f46545g);
        }
        this.f46555q = z17;
    }

    public final void b(java.lang.String str) {
        android.widget.TextView textView = this.f46546h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final int b() {
        return java.lang.Math.max((this.f46540b.height - a(230)) - a(20), 0);
    }

    public final void a(java.lang.String str) {
        android.widget.TextView textView = this.f46547i;
        if (textView != null) {
            textView.setText(str);
        }
        this.f46542d.post(com.tencent.liteav.sdkcommon.h.a(this));
    }

    public final void a() {
        android.widget.TextView textView;
        android.widget.Spinner spinner = this.f46548j;
        if (spinner == null || (textView = (android.widget.TextView) spinner.getChildAt(spinner.getSelectedItemPosition())) == null) {
            return;
        }
        textView.setTextColor(-65536);
    }

    public final int a(int i17) {
        return (int) ((i17 * this.f46541c.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
