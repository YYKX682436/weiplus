package a45;

/* loaded from: classes4.dex */
public final class b extends xn.c {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.enz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xn.d item = (xn.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        u15.a aVar = (u15.a) item.f455404d;
        java.lang.Integer j17 = aVar.getScene() == 9 ? aVar.j() : null;
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            lb0.q.f317688a.a(textView, aVar.getScene(), true, j17);
        }
    }
}
