package g22;

/* loaded from: classes12.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f349335d;

    /* renamed from: e, reason: collision with root package name */
    public final g22.a f349336e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f349337f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ri0 f349338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.View itemView, g22.a aVar) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f349335d = itemView;
        this.f349336e = aVar;
        this.f349337f = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dav);
        itemView.setOnClickListener(new g22.d(this));
    }
}
