package bm2;

/* loaded from: classes3.dex */
public final class c8 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f21826d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f21827e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f21828f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f21829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(bm2.h8 h8Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.p3u);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21826d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.p49);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21827e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.p48);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f21828f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.p3v);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f21829g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
    }
}
