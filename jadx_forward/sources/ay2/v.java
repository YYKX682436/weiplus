package ay2;

/* loaded from: classes2.dex */
public final class v extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f96807d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96808e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f96809f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Button f96810g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f96811h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f96812i;

    /* renamed from: m, reason: collision with root package name */
    public ay2.r f96813m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.app.Activity activity, java.lang.String feedID) {
        super(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f576329wi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedID, "feedID");
        this.f96807d = activity;
        this.f96808e = feedID;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.eeo, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f96809f = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565043sn5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f96810g = (android.widget.Button) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.pnq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f96811h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vje);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f96812i = (android.widget.TextView) findViewById3;
        this.f96813m = ay2.r.f96799e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, this.f96807d, "eye_care_reminder", "view_clk", false, kz5.c1.k(new jz5.l("feed_id", this.f96808e), new jz5.l("toast_action", java.lang.Integer.valueOf(this.f96813m.f96803d))), 8, null);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575731gv);
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
        }
        android.view.View view = this.f96809f;
        setContentView(view);
        view.setOnClickListener(new ay2.s(this));
        this.f96810g.setOnClickListener(new ay2.t(this));
        this.f96811h.setOnClickListener(new ay2.u(this));
    }
}
