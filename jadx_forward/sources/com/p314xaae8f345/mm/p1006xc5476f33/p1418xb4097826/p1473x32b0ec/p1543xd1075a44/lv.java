package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class lv extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sv f200511d;

    public lv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sv svVar) {
        this.f200511d = svVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f200511d.f201377e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        r45.h84 h84Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pv holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pv) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = holder.f200986o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        holder.f200978d.setVisibility(8);
        holder.f200979e.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f200984m.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(com.p314xaae8f345.mm.ui.zk.a(holder.f3639x46306858.getContext(), i17 == 0 ? 32 : 16), 0, 0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sv svVar = this.f200511d;
        java.lang.Object obj = svVar.f201377e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.h84 h84Var2 = (r45.h84) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv qvVar = svVar.f201378f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((qvVar == null || (h84Var = qvVar.f201088a) == null) ? null : h84Var.m75945x2fec8307(0), ((r45.h84) svVar.f201377e.get(i17)).m75945x2fec8307(0));
        android.view.View view = holder.f200983i;
        int i18 = b17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (b17) {
            svVar.f201379g = holder;
        }
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var2.m75945x2fec8307(0), "-1");
        android.widget.TextView textView = holder.f200981g;
        android.widget.ImageView imageView = holder.f200985n;
        android.widget.TextView textView2 = holder.f200980f;
        if (b18) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(h84Var2.m75945x2fec8307(1));
            imageView.setVisibility(0);
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(h84Var2.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.B));
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.iv(svVar, h84Var2, holder));
        p3325xe03a0797.p3326xc267989b.y0 y0Var = svVar.f201374b;
        holder.f200986o = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jv(h84Var2, holder, null), 3, null) : null;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kv(svVar, h84Var2));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dhf, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pv(this.f200511d, inflate);
    }
}
