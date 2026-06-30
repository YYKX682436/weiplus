package ay2;

/* loaded from: classes2.dex */
public final class v extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f15274d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f15275e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f15276f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Button f15277g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f15278h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f15279i;

    /* renamed from: m, reason: collision with root package name */
    public ay2.r f15280m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.app.Activity activity, java.lang.String feedID) {
        super(activity, com.tencent.mm.R.style.f494796wi);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feedID, "feedID");
        this.f15274d = activity;
        this.f15275e = feedID;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.eeo, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f15276f = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483510sn5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f15277g = (android.widget.Button) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.pnq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f15278h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.vje);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f15279i = (android.widget.TextView) findViewById3;
        this.f15280m = ay2.r.f15266e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.tencent.mm.plugin.finder.report.d2.i(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f15274d, "eye_care_reminder", "view_clk", false, kz5.c1.k(new jz5.l("feed_id", this.f15275e), new jz5.l("toast_action", java.lang.Integer.valueOf(this.f15280m.f15270d))), 8, null);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494198gv);
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
        }
        android.view.View view = this.f15276f;
        setContentView(view);
        view.setOnClickListener(new ay2.s(this));
        this.f15277g.setOnClickListener(new ay2.t(this));
        this.f15278h.setOnClickListener(new ay2.u(this));
    }
}
