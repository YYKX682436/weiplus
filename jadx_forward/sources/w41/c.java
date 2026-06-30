package w41;

/* loaded from: classes15.dex */
public final class c extends p012xc85e97e9.p016x746ad0e3.app.i0 implements x41.b, ab0.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f524383f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f f524384g;

    /* renamed from: h, reason: collision with root package name */
    public w41.a f524385h;

    /* renamed from: i, reason: collision with root package name */
    public ab0.r f524386i;

    public c(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.n_);
        this.f524383f = context;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f c11219x5502277f;
        if (!isShowing() || (c11219x5502277f = this.f524384g) == null) {
            return;
        }
        c11219x5502277f.b(5);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMConfirmDialog", "onCreate");
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
        android.content.Context context2 = this.f524383f;
        if (context2 == null) {
            context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        }
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f c11219x5502277f = new com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f(context2, null);
        this.f524384g = c11219x5502277f;
        c11219x5502277f.f153842i = this;
        c11219x5502277f.m48383x84bba4c8(this.f524385h);
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f c11219x5502277f2 = this.f524384g;
        if (c11219x5502277f2 != null) {
            c11219x5502277f2.m48384x3110e4dc(this.f524386i);
        }
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f c11219x5502277f3 = this.f524384g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11219x5502277f3);
        setContentView(c11219x5502277f3, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new w41.b(this));
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIMConfirmDialog", "realShowDialog ui is finishing and ignore");
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenIMConfirmDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }
}
