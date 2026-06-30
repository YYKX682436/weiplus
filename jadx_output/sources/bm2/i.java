package bm2;

/* loaded from: classes3.dex */
public final class i extends bm2.g {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f21956e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f21957f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f21958g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f21959h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f21960i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f21961m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21962n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bm2.m mVar, android.view.View itemView) {
        super(mVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) itemView.findViewById(com.tencent.mm.R.id.f486040jz2);
        this.f21956e = mMPAGView;
        this.f21957f = (com.tencent.mm.ui.widget.MMRoundCornerImageView) itemView.findViewById(com.tencent.mm.R.id.f484549qf5);
        this.f21958g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.jyj);
        this.f21959h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.qg7);
        this.f21960i = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.kwm);
        this.f21961m = itemView.findViewById(com.tencent.mm.R.id.qg_);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        if (mMPAGView != null) {
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.W1));
        }
        if (mMPAGView != null) {
            mMPAGView.setRepeatCount(0);
        }
    }
}
