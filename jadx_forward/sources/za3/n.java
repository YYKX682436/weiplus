package za3;

/* loaded from: classes8.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f552527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f552528e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f552529f;

    /* renamed from: g, reason: collision with root package name */
    public int f552530g;

    public n(android.content.Context context, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f552527d = context;
        this.f552528e = data;
        this.f552530g = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f552528e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        za3.l holder = (za3.l) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = this.f552527d;
        float a17 = ym5.x.a(context, 8.0f);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        gradientDrawable2.setCornerRadii(i17 == 0 ? new float[]{a17, a17, a17, a17, 0.0f, 0.0f, 0.0f, 0.0f} : i17 == mo1894x7e414b06() - 1 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, a17, a17, a17, a17} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        holder.f552506d.setBackground(stateListDrawable);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) this.f552528e.get(i17);
        holder.f552507e.setText(f0Var.f226344c);
        android.widget.TextView textView = holder.f552508f;
        boolean z17 = f0Var.f226343b;
        if (z17) {
            textView.setVisibility(0);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pgm));
        } else {
            textView.setVisibility(8);
        }
        java.lang.String str = f0Var.f226345d;
        boolean z18 = str == null || str.length() == 0;
        android.widget.TextView textView2 = holder.f552509g;
        if (z18) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        android.widget.ImageView imageView = holder.f552510h;
        boolean z19 = f0Var.f226342a;
        if (z19 || z17) {
            if (z19) {
                imageView.setColorFilter(this.f552530g, android.graphics.PorterDuff.Mode.SRC_IN);
            }
            java.lang.String str2 = f0Var.f226348g;
            if (str2 != null) {
                n11.a.b().g(str2, imageView);
            }
        } else {
            android.graphics.drawable.Drawable drawable = f0Var.f226347f;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        if (z19) {
            android.view.View view = holder.f552511i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = holder.f552511i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 < mo1894x7e414b06() - 1) {
            android.view.View view3 = holder.f552512m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = holder.f552512m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.f3639x46306858.setOnClickListener(new za3.m(this, f0Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.els, parent, false);
        this.f552530g = b3.l.m9702x7444d5ad(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560355i7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new za3.l(inflate);
    }
}
