package bm2;

/* loaded from: classes10.dex */
public final class e1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f21855d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f21856e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f21857f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f21858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(bm2.f1 f1Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f21855d = view;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.a57);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21856e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f483277a55);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21857f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.lcv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f21858g = (android.widget.TextView) findViewById3;
    }
}
