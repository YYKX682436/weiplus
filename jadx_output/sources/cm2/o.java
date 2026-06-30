package cm2;

/* loaded from: classes2.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.als;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        cm2.p item = (cm2.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.dgn)).setText(item.f43378i);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
