package w41;

/* loaded from: classes15.dex */
public final class j extends p012xc85e97e9.p016x746ad0e3.app.i0 implements x41.b {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f524393f;

    /* renamed from: g, reason: collision with root package name */
    public final ah5.a f524394g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 f524395h;

    /* renamed from: i, reason: collision with root package name */
    public j41.i0 f524396i;

    /* renamed from: m, reason: collision with root package name */
    public v41.r f524397m;

    /* renamed from: n, reason: collision with root package name */
    public final w41.h f524398n;

    /* renamed from: o, reason: collision with root package name */
    public int f524399o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f524400p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f524401q;

    public j(android.content.Context context, ah5.a aVar) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.n_);
        this.f524393f = context;
        this.f524394g = aVar;
        this.f524398n = new w41.h(this);
        this.f524400p = jz5.h.b(new w41.g(this));
        this.f524401q = jz5.h.b(new w41.f(this));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d6;
        if (!isShowing() || (c11220xb94149d6 = this.f524395h) == null) {
            return;
        }
        c11220xb94149d6.b(5);
    }

    @Override // x41.b
    /* renamed from: dismissDialog */
    public void mo173204xf0b10c72(int i17) {
        try {
            if (isShowing()) {
                super.dismiss();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.WindowManager.LayoutParams attributes;
        android.view.View decorView;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmDialog", "OpenIMKefuConfirmDialog onCreate");
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null && (decorView = window5.getDecorView()) != null) {
            android.content.Context context = decorView.getContext();
            decorView.setMinimumWidth((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(decorView.getContext()) : displayMetrics.widthPixels);
            decorView.setPadding(0, 0, 0, 0);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null && (attributes = window6.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
        }
        android.content.Context context2 = this.f524393f;
        if (context2 == null) {
            context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        }
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d6 = new com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6(context2, null);
        this.f524395h = c11220xb94149d6;
        c11220xb94149d6.f153842i = this;
        c11220xb94149d6.m48386x84bba4c8(this.f524396i);
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d62 = this.f524395h;
        if (c11220xb94149d62 != null) {
            c11220xb94149d62.m48388x3110e4dc(this.f524397m);
        }
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d63 = this.f524395h;
        if (c11220xb94149d63 != null) {
            c11220xb94149d63.m48390xf45e5404(this.f524398n);
        }
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d64 = this.f524395h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11220xb94149d64);
        setContentView(c11220xb94149d64, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new w41.i(this));
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIMKefuConfirmDialog", "realShowDialog ui is finishing and ignore");
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenIMKefuConfirmDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }
}
