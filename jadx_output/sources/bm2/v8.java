package bm2;

/* loaded from: classes3.dex */
public final class v8 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f22391d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f22392e = new java.util.LinkedList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22392e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((bm2.r8) this.f22392e.get(i17)).f22280c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        r45.il1 il1Var;
        r45.il1 il1Var2;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof bm2.s8)) {
            if (holder instanceof bm2.q8) {
                return;
            }
            return;
        }
        bm2.s8 s8Var = (bm2.s8) holder;
        java.lang.String str = null;
        bm2.r8 r8Var = i17 >= 0 && i17 < getItemCount() ? (bm2.r8) this.f22392e.get(i17) : null;
        boolean z17 = r8Var != null && r8Var.f22278a;
        android.widget.CheckBox checkBox = s8Var.f22294d;
        checkBox.setChecked(z17);
        if (r8Var != null && r8Var.f22281d) {
            checkBox.setEnabled(true);
            android.view.View view = s8Var.itemView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            s8Var.itemView.setOnClickListener(new bm2.t8(r8Var, s8Var, this));
        } else {
            checkBox.setEnabled(false);
            android.view.View view2 = s8Var.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            s8Var.itemView.setOnClickListener(new bm2.u8(s8Var));
        }
        java.lang.String string = (r8Var == null || (il1Var2 = r8Var.f22279b) == null) ? null : il1Var2.getString(1);
        android.widget.TextView textView = s8Var.f22295e;
        textView.setText(string);
        if (r8Var != null && (il1Var = r8Var.f22279b) != null) {
            str = il1Var.getString(0);
        }
        textView.setTag(str);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 2) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f489020b20, null);
            kotlin.jvm.internal.o.d(inflate);
            return new bm2.q8(this, inflate);
        }
        android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f489021b21, null);
        kotlin.jvm.internal.o.d(inflate2);
        return new bm2.s8(this, inflate2);
    }
}
