package bl2;

/* loaded from: classes3.dex */
public final class f extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController f21703h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f21704i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f21705m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f21706n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f21707o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController) {
        super(context, false, zl2.u4.f473988d, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f21703h = liveRoomController;
        this.f21707o = "";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dns;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.r9_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21705m = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.r5_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21704i = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.r5e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f21706n = (android.widget.TextView) findViewById3;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void s() {
        a();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        a();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        android.widget.TextView textView = this.f21705m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("tvTitle");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f21705m;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("tvTitle");
            throw null;
        }
        textView2.setText(this.f21707o);
        android.view.View view = this.f21704i;
        if (view == null) {
            kotlin.jvm.internal.o.o("btnGoToWrite");
            throw null;
        }
        view.setOnClickListener(new bl2.d(this));
        android.widget.TextView textView3 = this.f21706n;
        if (textView3 != null) {
            textView3.setOnClickListener(new bl2.e(this));
        } else {
            kotlin.jvm.internal.o.o("btnStartLive");
            throw null;
        }
    }
}
