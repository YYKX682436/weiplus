package bk1;

/* loaded from: classes4.dex */
public final class p extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f21343d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f21344e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f21345f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f21346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.ViewGroup parent) {
        super(android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488070g1, parent, false));
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f21343d = (android.widget.ImageView) this.itemView.findViewById(com.tencent.mm.R.id.a18);
        this.f21344e = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.a1q);
        this.f21345f = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.f483080w1);
        this.f21346g = this.itemView.findViewById(com.tencent.mm.R.id.d1y);
    }
}
