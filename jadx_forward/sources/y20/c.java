package y20;

/* loaded from: classes.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f540526d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f540527e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f540528f;

    public c(java.util.List options, java.lang.Object obj, yz5.l onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f540526d = options;
        this.f540527e = obj;
        this.f540528f = onItemClick;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f540526d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        y20.b holder = (y20.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        qq.c option = (qq.c) this.f540526d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        yz5.l onItemClick = this.f540528f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(option.f447393a);
        sb6.append(" (");
        java.lang.Object obj = option.f447394b;
        sb6.append(obj);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        android.widget.TextView textView = holder.f540523d;
        textView.setText(sb7);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f540527e)) {
            android.view.View view = holder.f540524e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(holder.f3639x46306858.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560372aj0));
        } else {
            android.view.View view2 = holder.f540524e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(holder.f3639x46306858.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.amz));
        }
        holder.f3639x46306858.setOnClickListener(new y20.a(onItemClick, option));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4n, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new y20.b(inflate);
    }
}
