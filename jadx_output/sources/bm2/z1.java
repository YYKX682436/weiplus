package bm2;

/* loaded from: classes3.dex */
public final class z1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f22472d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f22473e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ma0 f22474f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f22475g;

    /* renamed from: h, reason: collision with root package name */
    public int f22476h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f22477i;

    public z1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f22472d = context;
        this.f22473e = "FinderLiveCustomGiftEditAdapter";
        this.f22475g = jz5.h.b(bm2.x1.f22425d);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return x().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        java.lang.String string;
        r45.gs5 gs5Var;
        bm2.w1 holder = (bm2.w1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.f70 f70Var = (i17 < 0 || i17 >= x().size()) ? null : (r45.f70) x().get(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" getView position:");
        sb6.append(i17);
        sb6.append(", curPos:");
        sb6.append(this.f22476h);
        sb6.append(", componentValue:");
        java.lang.String str2 = "";
        sb6.append(pm0.b0.g(f70Var == null ? "" : f70Var));
        com.tencent.mars.xlog.Log.i(this.f22473e, sb6.toString());
        if (f70Var == null || (gs5Var = (r45.gs5) f70Var.getCustom(4)) == null || (str = gs5Var.getString(0)) == null) {
            str = "";
        }
        ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(holder.f22400f);
        if (f70Var != null && (string = f70Var.getString(1)) != null) {
            str2 = string;
        }
        android.widget.TextView textView = holder.f22401g;
        textView.setText(str2);
        if (str2.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        float f17 = f70Var != null ? f70Var.getFloat(2) : 0.0f;
        if (f17 > 0.0f) {
            android.view.View view = holder.f22402h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f22403i.setText(java.lang.String.valueOf((int) f17));
        } else {
            android.view.View view2 = holder.f22402h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i18 = this.f22476h;
        android.view.View view3 = holder.f22399e;
        if (i17 == i18) {
            view3.setBackgroundResource(com.tencent.mm.R.drawable.ayy);
        } else {
            view3.setBackgroundResource(0);
        }
        holder.itemView.setOnClickListener(new bm2.y1(this, i17, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f22472d).inflate(com.tencent.mm.R.layout.apw, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.w1(inflate);
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f22475g).getValue();
    }
}
