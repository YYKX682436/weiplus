package bm2;

/* loaded from: classes3.dex */
public class i3 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f21969d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f21970e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f21971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.uap);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21969d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.i_9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21970e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.i_a);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f21971f = (android.widget.FrameLayout) findViewById3;
    }
}
