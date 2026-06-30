package bm2;

/* loaded from: classes10.dex */
public final class i8 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f21984d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f21985e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f21986f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f21987g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f21988h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f21989i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f21990m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(bm2.k8 k8Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) itemView.findViewById(com.tencent.mm.R.id.f486940my3);
        this.f21984d = mMPAGView;
        this.f21985e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486938my1);
        this.f21986f = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486936my0);
        this.f21987g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.mya);
        this.f21988h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.mxs);
        this.f21989i = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.mxq);
        this.f21990m = (androidx.constraintlayout.widget.ConstraintLayout) itemView.findViewById(com.tencent.mm.R.id.mxv);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        if (mMPAGView != null) {
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.T1));
        }
        if (mMPAGView != null) {
            android.content.res.AssetManager assets = mMPAGView.getContext().getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView.k(assets, k8Var.f22047e);
        }
        if (mMPAGView != null) {
            mMPAGView.setRepeatCount(0);
        }
    }
}
