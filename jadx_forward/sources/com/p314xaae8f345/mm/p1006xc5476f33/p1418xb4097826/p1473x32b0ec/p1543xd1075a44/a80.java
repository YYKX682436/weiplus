package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class a80 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f199277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80 f199278e;

    public a80(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80 c80Var) {
        this.f199277d = context;
        this.f199278e = c80Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.LinkedList) ((jz5.n) this.f199278e.I).mo141623x754a37bb()).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v70 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v70) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80 c80Var = this.f199278e;
        java.lang.Object obj = ((java.util.LinkedList) ((jz5.n) c80Var.I).mo141623x754a37bb()).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w70 w70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w70) obj;
        android.widget.TextView textView = holder.f201583e;
        textView.setText(w70Var.f201692b);
        android.widget.TextView textView2 = holder.f201584f;
        textView2.setText(w70Var.f201693c);
        android.view.View view = holder.f201585g;
        r45.vw4 vw4Var = c80Var.f199508J;
        r45.vw4 vw4Var2 = w70Var.f201691a;
        int i18 = vw4Var2 == vw4Var ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z70 z70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z70(c80Var, w70Var, this);
        android.view.View view2 = holder.f201582d;
        view2.setOnClickListener(z70Var);
        r45.vw4 vw4Var3 = r45.vw4.Manual;
        android.content.Context context = this.f199277d;
        if (vw4Var2 == vw4Var3) {
            r45.h32 h32Var = c80Var.K;
            if ((h32Var == null || zl2.r4.f555483a.e2(h32Var)) ? false : true) {
                android.view.View view3 = holder.f201585g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setOnClickListener(null);
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
                return;
            }
        }
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f199277d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.do7, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v70(inflate);
    }
}
