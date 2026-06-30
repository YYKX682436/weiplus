package bx3;

/* loaded from: classes5.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f36319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bx3.c cVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.oko);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f36319d = (android.widget.TextView) findViewById;
    }
}
