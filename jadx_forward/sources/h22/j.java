package h22;

/* loaded from: classes15.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f359838d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f359839e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f359840f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f359841g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f359842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.f565745de5);
        this.f359838d = frameLayout;
        this.f359839e = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) itemView.findViewById(com.p314xaae8f345.mm.R.id.d_q);
        this.f359840f = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.d_o);
        this.f359841g = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.d_p);
        int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307);
        int d18 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
        float a17 = ym5.x.a(context, 8.0f);
        android.graphics.drawable.Drawable b17 = n22.f.f415823a.b(d17, d18, a17, a17, a17, a17);
        this.f359842h = b17;
        itemView.setClickable(true);
        itemView.setBackground(b17);
        frameLayout.setOutlineProvider(new h22.i(context));
        frameLayout.setClipToOutline(true);
    }
}
