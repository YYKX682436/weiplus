package d04;

/* loaded from: classes8.dex */
public final class x1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f307081d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f307082e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f307083f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f307084g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f307085h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f307081d = (android.view.ViewGroup) itemView.findViewById(com.p314xaae8f345.mm.R.id.m_q);
        this.f307082e = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.m_p);
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.m_s);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f307083f = textView;
        this.f307084g = (android.widget.ProgressBar) itemView.findViewById(com.p314xaae8f345.mm.R.id.m_r);
        this.f307085h = itemView.findViewById(com.p314xaae8f345.mm.R.id.a4f);
    }
}
