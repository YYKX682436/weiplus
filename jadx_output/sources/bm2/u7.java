package bm2;

/* loaded from: classes3.dex */
public final class u7 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f22353d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f22354e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f22355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.w7 f22356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(bm2.w7 w7Var, android.view.View viewItem) {
        super(viewItem);
        kotlin.jvm.internal.o.g(viewItem, "viewItem");
        this.f22356g = w7Var;
        this.f22353d = viewItem;
        this.itemView.setOnTouchListener(bm2.q7.f22258d);
        this.itemView.setOnLongClickListener(new bm2.r7(this));
        android.view.View findViewById = viewItem.findViewById(com.tencent.mm.R.id.pnw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f22354e = (android.widget.TextView) findViewById;
        this.f22355f = "";
    }
}
