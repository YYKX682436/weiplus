package cm2;

/* loaded from: classes2.dex */
public final class q extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.alt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.t63 t63Var;
        java.util.LinkedList list2;
        java.lang.Object obj;
        cm2.p item = (cm2.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nz_);
        java.lang.String str = null;
        java.lang.Object Z = list != null ? kz5.n0.Z(list) : null;
        if (Z instanceof java.lang.String) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) Z;
            if (!(charSequence.length() == 0)) {
                textView.setText(charSequence);
                textView.setAlpha(1.0f);
            }
        }
        r45.xq1 xq1Var = item.f43376g;
        if (xq1Var != null && (t63Var = (r45.t63) xq1Var.getCustom(0)) != null && (list2 = t63Var.getList(0)) != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.u24) obj).getInteger(1) == xq1Var.getInteger(1)) {
                        break;
                    }
                }
            }
            r45.u24 u24Var = (r45.u24) obj;
            if (u24Var != null) {
                str = u24Var.getString(0);
            }
        }
        textView.setText(str);
        textView.setAlpha(1.0f);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
