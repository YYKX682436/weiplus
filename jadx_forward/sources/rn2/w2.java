package rn2;

/* loaded from: classes3.dex */
public final class w2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f479440d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f479441e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f479440d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list;
        rn2.u2 holder = (rn2.u2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.f0 f0Var = null;
        rn2.b bVar = (!(i17 >= 0 && i17 < mo1894x7e414b06()) || (list = this.f479440d) == null) ? null : (rn2.b) list.get(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f479422f;
        android.widget.TextView textView = holder.f479420d;
        android.widget.TextView textView2 = holder.f479421e;
        if (bVar != null) {
            textView.setText(bVar.f479177a);
            c22699x3dcdb352.setVisibility(bVar.f479181e ? 0 : 8);
            if (bVar.f479180d) {
                holder.f3639x46306858.setEnabled(true);
                java.lang.String str = bVar.f479178b;
                if (str != null && str.length() != 0) {
                    r3 = false;
                }
                if (r3) {
                    textView2.setVisibility(8);
                    textView2.setText("");
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                }
                textView.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
            } else {
                holder.f3639x46306858.setEnabled(false);
                textView2.setVisibility(0);
                textView.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
                java.lang.String str2 = bVar.f479184h;
                if (str2.length() == 0) {
                    str2 = holder.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573156dp3, bVar.f479177a);
                }
                textView2.setText(str2);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            holder.f3639x46306858.setEnabled(false);
            textView.setText("");
            textView2.setText("");
            c22699x3dcdb352.setVisibility(8);
            android.view.View view2 = holder.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.f3639x46306858.setOnClickListener(new rn2.v2(this, bVar, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570450au0, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new rn2.u2(inflate);
    }
}
