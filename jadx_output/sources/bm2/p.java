package bm2;

/* loaded from: classes3.dex */
public final class p extends bm2.n {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.CheckBox f22209e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f22210f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f22211g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f22212h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f22213i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f22214m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22215n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bm2.t tVar, android.view.View itemView) {
        super(tVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f22209e = (android.widget.CheckBox) itemView.findViewById(com.tencent.mm.R.id.jyp);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) itemView.findViewById(com.tencent.mm.R.id.f486040jz2);
        this.f22210f = mMPAGView;
        this.f22211g = (com.tencent.mm.ui.widget.MMRoundCornerImageView) itemView.findViewById(com.tencent.mm.R.id.f484549qf5);
        this.f22212h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.jyj);
        this.f22213i = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.qg7);
        this.f22214m = itemView.findViewById(com.tencent.mm.R.id.qg_);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        if (mMPAGView != null) {
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.V1));
        }
        if (mMPAGView != null) {
            mMPAGView.setRepeatCount(0);
        }
    }
}
