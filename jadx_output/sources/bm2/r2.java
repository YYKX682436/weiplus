package bm2;

/* loaded from: classes3.dex */
public final class r2 extends bm2.q2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f22267d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f22268e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f22269f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f22270g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f22271h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f22272i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(bm2.v2 v2Var, android.view.View itemView) {
        super(v2Var, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.lia);
        this.f22267d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.kbf);
        this.f22268e = textView2;
        this.f22269f = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.e5a);
        this.f22270g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.dsm);
        android.widget.TextView textView3 = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.bzt);
        this.f22271h = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.qic);
        this.f22272i = textView4;
        textView.setTextSize(1, 15.0f);
        textView2.setTextSize(1, 17.0f);
        textView3.setTextSize(1, 17.0f);
        textView4.setTextSize(1, 14.0f);
    }
}
