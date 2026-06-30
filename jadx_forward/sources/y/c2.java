package y;

/* loaded from: classes16.dex */
public final class c2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {
    public final /* synthetic */ mi2.h S1;

    public c2(mi2.h hVar) {
        this.S1 = hVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.S1.f408288l1.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        y.e2 holder = (y.e2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        mi2.h hVar = this.S1;
        java.lang.Object obj = hVar.f408288l1.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        y.d2 d2Var = (y.d2) obj;
        holder.f539872p1.setText(d2Var.f539861a);
        holder.f539873x1.setVisibility(d2Var.f539862b ? 0 : 8);
        android.view.View view = holder.f539874y1;
        int i18 = i17 != 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f3639x46306858.setOnClickListener(new y.b2(hVar, d2Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup p07, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.view.View inflate = android.view.LayoutInflater.from(p07.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.auh, p07, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new y.e2(this.S1, inflate);
    }
}
