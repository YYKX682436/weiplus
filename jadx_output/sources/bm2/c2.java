package bm2;

/* loaded from: classes3.dex */
public final class c2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f21808d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f21809e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f21810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(bm2.f2 f2Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.crx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21808d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.t2x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21809e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.crt);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f21810f = (android.widget.ImageView) findViewById3;
    }
}
