package dp;

/* loaded from: classes15.dex */
public class a extends android.widget.Toast {

    /* renamed from: h, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicBoolean f323624h;

    /* renamed from: i, reason: collision with root package name */
    public static final dp.e f323625i = new dp.C28238x2ca3e0();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f323626a;

    /* renamed from: b, reason: collision with root package name */
    public int f323627b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f323628c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f323629d;

    /* renamed from: e, reason: collision with root package name */
    public dp.d f323630e;

    /* renamed from: f, reason: collision with root package name */
    public dp.c f323631f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Toast f323632g;

    public a(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        super(context);
        android.content.Context applicationContext = context.getApplicationContext();
        this.f323626a = applicationContext;
        this.f323628c = charSequence;
        this.f323627b = i17;
        this.f323632g = android.widget.Toast.makeText(applicationContext, charSequence, i17);
    }

    /* renamed from: makeText */
    public static android.widget.Toast m125853x26a183b(android.content.Context context, int i17, int i18) {
        return m125854x26a183b(context, context.getResources().getText(i17), i18);
    }

    @Override // android.widget.Toast
    public void cancel() {
        try {
            this.f323632g.cancel();
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }

    @Override // android.widget.Toast
    public void setDuration(int i17) {
        this.f323627b = i17;
        this.f323632g.setDuration(i17);
        super.setDuration(i17);
    }

    @Override // android.widget.Toast
    public void setGravity(int i17, int i18, int i19) {
        if (this.f323630e == null) {
            this.f323630e = new dp.d(null);
        }
        dp.d dVar = this.f323630e;
        dVar.f323636a = i17;
        dVar.f323637b = i18;
        dVar.f323638c = i19;
        this.f323632g.setGravity(i17, i18, i19);
        super.setGravity(i17, i18, i19);
    }

    @Override // android.widget.Toast
    public void setMargin(float f17, float f18) {
        if (this.f323631f == null) {
            this.f323631f = new dp.c(null);
        }
        dp.c cVar = this.f323631f;
        cVar.f323635b = f17;
        cVar.f323634a = f18;
        this.f323632g.setMargin(f17, f18);
        super.setMargin(f17, f18);
    }

    @Override // android.widget.Toast
    public void setText(java.lang.CharSequence charSequence) {
        this.f323628c = charSequence;
        this.f323632g.setText(charSequence);
        try {
            super.setText(charSequence);
        } catch (java.lang.RuntimeException unused) {
            android.widget.TextView textView = new android.widget.TextView(this.f323626a);
            textView.setText(charSequence);
            super.setView(textView);
        }
    }

    @Override // android.widget.Toast
    public void setView(android.view.View view) {
        this.f323629d = view;
        this.f323632g.setView(view);
        super.setView(view);
    }

    @Override // android.widget.Toast
    public void show() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: dp.a$$b
            @Override // java.lang.Runnable
            public final void run() {
                dp.a aVar = dp.a.this;
                aVar.getClass();
                try {
                    aVar.f323632g.show();
                } catch (java.lang.Throwable th6) {
                    th6.getMessage();
                    try {
                        ((dp.C28238x2ca3e0) dp.a.f323625i).a(aVar.f323626a, aVar.f323628c, aVar.f323629d, aVar.f323630e, aVar.f323631f, aVar.f323627b);
                    } catch (java.lang.Throwable th7) {
                        th7.getMessage();
                    }
                }
            }
        };
        if (android.os.Looper.myLooper() == null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: makeText */
    public static android.widget.Toast m125854x26a183b(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        boolean z17;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f323624h;
        if (atomicBoolean != null) {
            z17 = atomicBoolean.get();
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 30 && context.getApplicationInfo().targetSdkVersion >= 30) {
                if (java.util.Arrays.asList("vivo").contains(java.lang.String.valueOf(android.os.Build.MANUFACTURER).toLowerCase())) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
                    f323624h = atomicBoolean2;
                    z17 = atomicBoolean2.get();
                }
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = new java.util.concurrent.atomic.AtomicBoolean(true);
            f323624h = atomicBoolean3;
            z17 = atomicBoolean3.get();
        }
        if (z17) {
            return android.widget.Toast.makeText(context.getApplicationContext(), charSequence, i17);
        }
        return new dp.a(context, charSequence, i17);
    }

    @Override // android.widget.Toast
    public void setText(int i17) {
        setText(this.f323626a.getText(i17));
    }
}
