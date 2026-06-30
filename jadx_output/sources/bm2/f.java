package bm2;

/* loaded from: classes9.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f21876e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f21875d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f21877f = "";

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21875d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        java.lang.String string;
        bm2.d holder = (bm2.d) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.f21833g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            android.view.View view2 = holder.f21833g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object obj = this.f21875d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        cm2.k kVar = (cm2.k) obj;
        holder.f21834h = kVar;
        r45.b73 b73Var = (r45.b73) kVar.f43358d.getCustom(1);
        if (b73Var == null || (str = b73Var.getString(1)) == null) {
            str = "";
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int L = r26.n0.L(spannableString, this.f21877f, 0, false, 6, null);
        if (L > 0 && this.f21877f.length() + L <= spannableString.length()) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(holder.itemView.getContext(), com.tencent.mm.R.color.f478502m)), L, this.f21877f.length() + L, 33);
        }
        holder.f21830d.setText(spannableString);
        r45.c73 c73Var = kVar.f43358d;
        r45.b73 b73Var2 = (r45.b73) c73Var.getCustom(1);
        holder.f21831e.setVisibility(b73Var2 != null && b73Var2.getInteger(10) == 1 ? 0 : 8);
        r45.b73 b73Var3 = (r45.b73) c73Var.getCustom(1);
        java.lang.String str2 = (b73Var3 == null || (string = b73Var3.getString(2)) == null) ? "" : string;
        i95.m c17 = i95.n0.c(vd2.i5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        vd2.i5.l8((vd2.i5) c17, str2, holder.f21832f, null, 4, null);
        holder.itemView.setOnClickListener(new bm2.e(this, kVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.ajw, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.d(inflate);
    }
}
