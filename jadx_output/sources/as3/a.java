package as3;

/* loaded from: classes8.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488679a12;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vr3.a item = (vr3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        n11.a b17 = n11.a.b();
        r45.el5 el5Var = item.f439619d;
        b17.g(el5Var.f373593d.f370069f, (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ak7));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ak9)).setText(el5Var.f373593d.f370067d);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ak8)).setText(el5Var.f373594e);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ak_);
        int i19 = el5Var.f373593d.f370070g;
        if (i19 == 1) {
            imageView.setImageResource(com.tencent.mm.R.drawable.c6r);
        } else if (i19 != 2) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.c6t);
        }
        cl0.g a17 = item.a();
        a17.o("EventType", 5);
        a17.o("Pos", i17);
        lx3.r rVar = lx3.r.f322113a;
        java.lang.String gVar = a17.toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        rVar.a(0, gVar, new vr3.d(item), new vr3.e(item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
