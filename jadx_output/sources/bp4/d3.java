package bp4;

/* loaded from: classes8.dex */
public final class d3 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f23143d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f23144e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.o1_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f23143d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.o0w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f23144e = (android.widget.ImageView) findViewById2;
        this.f23145f = itemView.findViewById(com.tencent.mm.R.id.mkl);
    }
}
