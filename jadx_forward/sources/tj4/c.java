package tj4;

/* loaded from: classes11.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f501354d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f501355e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18627xdbbda7b2 f501356f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f501357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f501354d = itemView;
        this.f501355e = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.qdk);
        this.f501356f = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18627xdbbda7b2) itemView.findViewById(com.p314xaae8f345.mm.R.id.qdj);
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.qdl);
        this.f501357g = findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        ej4.d0 d0Var = ej4.e0.f334877c;
        int i17 = ej4.e0.f334878d;
        if (i17 != 0) {
            layoutParams2.width = i17;
        }
        findViewById.setLayoutParams(layoutParams2);
    }
}
