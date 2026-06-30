package db5;

/* loaded from: classes14.dex */
public class h7 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f309917d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f309918e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f309919f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f309920g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f309921h;

    public h7(android.content.Context context, int i17, int i18) {
        super(context, i17);
        int i19;
        this.f309921h = new db5.f7(this, android.os.Looper.getMainLooper());
        this.f309919f = context;
        if (i18 != 0) {
            if (i18 == 1) {
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1n;
            } else if (i18 == 2) {
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1g;
            }
            android.view.View inflate = android.view.View.inflate(context, i19, null);
            this.f309920g = inflate;
            this.f309917d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jsu);
            this.f309918e = (android.widget.ImageView) this.f309920g.findViewById(com.p314xaae8f345.mm.R.id.h5n);
            setCanceledOnTouchOutside(true);
        }
        i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1m;
        android.view.View inflate2 = android.view.View.inflate(context, i19, null);
        this.f309920g = inflate2;
        this.f309917d = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.jsu);
        this.f309918e = (android.widget.ImageView) this.f309920g.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        setCanceledOnTouchOutside(true);
    }

    public static db5.h7 c(android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, android.content.Context context, int i17, android.content.DialogInterface.OnDismissListener onDismissListener) {
        int i18 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576329wi;
        if (i17 != 0 && i17 == 1) {
            i18 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd;
        }
        db5.g7 g7Var = new db5.g7(context);
        com.p314xaae8f345.mm.ui.vj vjVar = g7Var.f309885c;
        vjVar.f292695a = i18;
        vjVar.f292696b = i17;
        vjVar.f292697c = charSequence;
        vjVar.f292698d = drawable;
        vjVar.f292699e = true;
        vjVar.f292700f = onDismissListener;
        if (g7Var.f309884b instanceof android.app.Activity) {
            if (g7Var.f309883a == null) {
                g7Var.f309883a = g7Var.a();
            }
            g7Var.f309883a.show();
        } else {
            com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278090n = g7Var;
            android.content.Intent intent = new android.content.Intent(g7Var.f309884b, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 2);
            android.content.Context context2 = g7Var.f309884b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/base/MMTipsDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/base/MMTipsDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return g7Var.f309883a;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f309920g, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.d("MicroMsg.MMTipsDialog", e17, "", new java.lang.Object[0]);
        }
        this.f309921h.sendEmptyMessageDelayed(0, 1000L);
    }
}
