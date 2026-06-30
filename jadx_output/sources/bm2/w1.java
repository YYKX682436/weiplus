package bm2;

/* loaded from: classes3.dex */
public final class w1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f22398d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f22399e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f22400f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f22401g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f22402h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f22403i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(android.view.View mItemView) {
        super(mItemView);
        kotlin.jvm.internal.o.g(mItemView, "mItemView");
        this.f22398d = mItemView;
        android.view.View findViewById = mItemView.findViewById(com.tencent.mm.R.id.d66);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f22399e = findViewById;
        android.view.View findViewById2 = mItemView.findViewById(com.tencent.mm.R.id.f484155d65);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f22400f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = mItemView.findViewById(com.tencent.mm.R.id.d6k);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f22401g = textView;
        android.view.View findViewById4 = mItemView.findViewById(com.tencent.mm.R.id.d6m);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f22402h = findViewById4;
        android.view.View findViewById5 = mItemView.findViewById(com.tencent.mm.R.id.d6n);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f22403i = textView2;
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = mItemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 12.0f, 0.0f, 8, null);
        android.content.Context context2 = mItemView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 12.0f, 0.0f, 8, null);
    }
}
