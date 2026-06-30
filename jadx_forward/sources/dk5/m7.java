package dk5;

/* loaded from: classes9.dex */
public class m7 extends android.app.Dialog implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public dk5.l7 f316272d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f316273e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f316274f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f316275g;

    public m7(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.f316272d = null;
        this.f316273e = context;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d1f, null);
        this.f316274f = linearLayout;
        this.f316275g = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.oef);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f316274f.findViewById(com.p314xaae8f345.mm.R.id.oe_);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgl);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgm);
        }
        this.f316275g.setOnClickListener(new dk5.j7(this));
    }

    public static void b(android.content.Context context, dk5.l7 l7Var) {
        dk5.m7 m7Var = new dk5.m7(context);
        m7Var.f316272d = l7Var;
        m7Var.setCancelable(false);
        m7Var.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new dk5.k7(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.grouptodo.TodoIntroduceView", "dialog dismiss error!");
            return;
        }
        try {
            android.content.Context context = this.f316273e;
            if (context == null || !(context instanceof android.app.Activity)) {
                super.dismiss();
            } else if (!((android.app.Activity) context).isFinishing()) {
                super.dismiss();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.grouptodo.TodoIntroduceView", "dismiss exception, e = " + e17.getMessage());
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f316274f);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.grouptodo.TodoIntroduceView", "%s:%s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
