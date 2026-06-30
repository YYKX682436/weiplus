package bl2;

/* loaded from: classes3.dex */
public final class c extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.ub f21697h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f21698i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f21699m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f21700n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.tencent.mm.plugin.finder.live.view.ub ubVar) {
        super(context, context.getResources().getConfiguration().orientation == 2, zl2.u4.f473988d, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f21697h = ubVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dlf;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.oqh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21699m = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b0n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21698i = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.qxe);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f21700n = (android.widget.TextView) findViewById3;
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
        android.widget.TextView textView = this.f21699m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("tvTitle");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        android.view.View view = this.f21698i;
        if (view == null) {
            kotlin.jvm.internal.o.o("btnIKnow");
            throw null;
        }
        view.setOnClickListener(new bl2.a(this));
        android.widget.TextView textView2 = this.f21700n;
        if (textView2 != null) {
            textView2.setOnClickListener(new bl2.b(this));
        } else {
            kotlin.jvm.internal.o.o("tvGoSettings");
            throw null;
        }
    }
}
