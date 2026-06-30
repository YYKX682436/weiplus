package cm2;

/* loaded from: classes3.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ajw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String string;
        cm2.m item = (cm2.m) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ofy);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gpb);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.gln);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gjf);
        r45.n73 n73Var = item.f43365d;
        r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
        if (z53Var == null || (str = z53Var.getString(1)) == null) {
            str = "";
        }
        textView.setText(str);
        r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
        textView2.setVisibility(z53Var2 != null && z53Var2.getInteger(13) == 1 ? 0 : 8);
        if (!z17) {
            r45.z53 z53Var3 = (r45.z53) n73Var.getCustom(1);
            java.lang.String str2 = (z53Var3 == null || (string = z53Var3.getString(2)) == null) ? "" : string;
            i95.m c17 = i95.n0.c(vd2.i5.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            vd2.i5.l8((vd2.i5) c17, str2, imageView, null, 4, null);
        }
        holder.itemView.setTag(com.tencent.mm.R.id.e6a, textView.getText());
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
