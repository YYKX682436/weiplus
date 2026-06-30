package bm2;

/* loaded from: classes9.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f103409e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f103408d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f103410f = "";

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103408d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        bm2.d holder = (bm2.d) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f103366g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            android.view.View view2 = holder.f103366g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object obj = this.f103408d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        cm2.k kVar = (cm2.k) obj;
        holder.f103367h = kVar;
        r45.b73 b73Var = (r45.b73) kVar.f124891d.m75936x14adae67(1);
        if (b73Var == null || (str = b73Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int L = r26.n0.L(spannableString, this.f103410f, 0, false, 6, null);
        if (L > 0 && this.f103410f.length() + L <= spannableString.length()) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)), L, this.f103410f.length() + L, 33);
        }
        holder.f103363d.setText(spannableString);
        r45.c73 c73Var = kVar.f124891d;
        r45.b73 b73Var2 = (r45.b73) c73Var.m75936x14adae67(1);
        holder.f103364e.setVisibility(b73Var2 != null && b73Var2.m75939xb282bd08(10) == 1 ? 0 : 8);
        r45.b73 b73Var3 = (r45.b73) c73Var.m75936x14adae67(1);
        java.lang.String str2 = (b73Var3 == null || (m75945x2fec8307 = b73Var3.m75945x2fec8307(2)) == null) ? "" : m75945x2fec8307;
        i95.m c17 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        vd2.i5.l8((vd2.i5) c17, str2, holder.f103365f, null, 4, null);
        holder.f3639x46306858.setOnClickListener(new bm2.e(this, kVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ajw, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.d(inflate);
    }
}
