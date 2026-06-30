package sm3;

/* loaded from: classes5.dex */
public final class j0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f491414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16710x83571841 f491415e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16710x83571841 c16710x83571841) {
        this.f491415e = c16710x83571841;
        this.f491414d = android.view.LayoutInflater.from(c16710x83571841.getContext());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return (int) java.lang.Math.ceil(r0.getTotalDuration() / this.f491415e.f233585c2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        sm3.i0 holder = (sm3.i0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        double d17 = i17 * this.f491415e.f233585c2;
        holder.f491409d.setText(y46.b.a((long) d17, d17 >= 3600000.0d ? "H:mm:ss" : "mm:ss", true));
        if (i17 == mo1894x7e414b06() - 1) {
            android.view.View view = holder.f491410e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = holder.f491410e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = this.f491414d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4o, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new sm3.i0(inflate);
    }
}
