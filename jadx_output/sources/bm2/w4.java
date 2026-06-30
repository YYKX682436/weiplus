package bm2;

/* loaded from: classes3.dex */
public final class w4 extends bm2.l4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(bm2.n5 n5Var, android.view.View itemView) {
        super(n5Var, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.uza);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setOnClickListener(new bm2.v4(n5Var));
    }
}
