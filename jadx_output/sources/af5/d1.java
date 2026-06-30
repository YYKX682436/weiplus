package af5;

/* loaded from: classes5.dex */
public final class d1 extends com.tencent.mm.mvvm.MvvmView {

    /* renamed from: f, reason: collision with root package name */
    public em.b4 f4563f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4564g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4565h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489571eq0, (android.view.ViewGroup) null);
        this.f4563f = new em.b4(inflate);
        inflate.setOnClickListener(new af5.z0(this));
        em.b4 b4Var = this.f4563f;
        if (b4Var == null) {
            kotlin.jvm.internal.o.o("headerVB");
            throw null;
        }
        linearLayout.addView(b4Var.f254138a);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView(context, null, 0, 6, null);
        markdownNativeMvvmView.setPadding(0, i65.a.b(context, 8), 0, 0);
        markdownNativeMvvmView.getSelectableLayout$app_release().setPartialSelectionEnabled(false);
        this.f4564g = markdownNativeMvvmView;
        markdownNativeMvvmView.setVisibility(8);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView2 = this.f4564g;
        if (markdownNativeMvvmView2 != null) {
            linearLayout.addView(markdownNativeMvvmView2);
            return linearLayout;
        }
        kotlin.jvm.internal.o.o("thinkingMarkdownView");
        throw null;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        yz5.p pVar3;
        v11.n0 n0Var;
        v11.n0 n0Var2;
        v11.m0 m0Var = (v11.m0) pVar;
        v11.m0 m0Var2 = (v11.m0) pVar2;
        if (m0Var2 == null || (n0Var2 = m0Var2.f432442d) == (n0Var = v11.n0.f432445d)) {
            if (this.f4565h) {
                this.f4565h = false;
                if (m0Var != null && (pVar3 = m0Var.f432443e) != null) {
                    pVar3.invoke(java.lang.Boolean.FALSE, af5.c1.f4558d);
                }
            }
            setVisibility(8);
            return;
        }
        setVisibility(0);
        em.b4 b4Var = this.f4563f;
        if (b4Var == null) {
            kotlin.jvm.internal.o.o("headerVB");
            throw null;
        }
        if (b4Var.f254141d == null) {
            b4Var.f254141d = (android.widget.ProgressBar) b4Var.f254138a.findViewById(com.tencent.mm.R.id.ve9);
        }
        android.widget.ProgressBar progressBar = b4Var.f254141d;
        v11.n0 n0Var3 = v11.n0.f432446e;
        progressBar.setVisibility((n0Var2 == n0Var3 || n0Var2 == v11.n0.f432447f) ? 0 : 8);
        em.b4 b4Var2 = this.f4563f;
        if (b4Var2 == null) {
            kotlin.jvm.internal.o.o("headerVB");
            throw null;
        }
        if (b4Var2.f254139b == null) {
            b4Var2.f254139b = (android.widget.TextView) b4Var2.f254138a.findViewById(com.tencent.mm.R.id.vea);
        }
        android.widget.TextView textView = b4Var2.f254139b;
        int ordinal = n0Var2.ordinal();
        textView.setText((ordinal == 1 || ordinal == 2) ? getContext().getString(com.tencent.mm.R.string.pk6) : getContext().getString(com.tencent.mm.R.string.f493902pk5));
        boolean z17 = (n0Var2 == n0Var3 || n0Var2 == n0Var) ? false : true;
        em.b4 b4Var3 = this.f4563f;
        if (b4Var3 == null) {
            kotlin.jvm.internal.o.o("headerVB");
            throw null;
        }
        b4Var3.a().setVisibility(z17 ? 0 : 8);
        em.b4 b4Var4 = this.f4563f;
        if (b4Var4 == null) {
            kotlin.jvm.internal.o.o("headerVB");
            throw null;
        }
        b4Var4.a().setRotation(this.f4565h ? 180.0f : 0.0f);
        n0Var2.name();
    }
}
