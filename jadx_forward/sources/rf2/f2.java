package rf2;

/* loaded from: classes10.dex */
public final class f2 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.br_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522;
        int i19;
        int i27;
        rf2.d2 item = (rf2.d2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565246bu0);
        java.lang.String str = item.f476232h;
        if (textView != null) {
            textView.setText(str);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.agx);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f568010lc4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.mkk);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.m1w);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.m1t);
        p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cjg);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.f(p17, 12, 8);
        if (item.f476230f) {
            c22699x3dcdb3523.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            if (item.f476229e) {
                c22699x3dcdb3524.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView2, 13);
                if (textView != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 13);
                }
                i19 = 8;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.f(p18, 11, 8);
                i27 = 3;
            } else {
                i19 = 8;
                c22699x3dcdb3524.setVisibility(8);
                i27 = 3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView2, 3);
                if (textView != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 3);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.f(p18, 12, 8);
            }
            r45.l30 l30Var = item.f476228d;
            textView2.setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ds6, java.lang.String.valueOf(l30Var.m75939xb282bd08(i27))));
            if (item.f476231g > 0) {
                float m75939xb282bd08 = l30Var.m75939xb282bd08(i27) / ((float) item.f476231g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VoteConvert", "item pos:" + i17 + ' ' + str + ", progress:" + m75939xb282bd08 + ", count:" + l30Var.m75939xb282bd08(i27) + ", total:" + item.f476231g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                holder.f3639x46306858.post(new rf2.e2(holder.f374653d, p17, m75939xb282bd08, p18, this, i17, item));
                c22699x3dcdb3522 = c22699x3dcdb3523;
                c22699x3dcdb352 = c22699x3dcdb3524;
            } else {
                c22699x3dcdb3522 = c22699x3dcdb3523;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList3);
                c22699x3dcdb352 = c22699x3dcdb3524;
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VoteConvert", "item pos:" + i17 + ' ' + str + ", totalCount invalid: " + item.f476231g);
            }
        } else {
            c22699x3dcdb352 = c22699x3dcdb3524;
            c22699x3dcdb3522 = c22699x3dcdb3523;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(8);
            textView2.setVisibility(8);
            if (item.f476229e) {
                c22699x3dcdb3522.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.f(p17, 11, 8);
                if (textView != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 13);
                }
            } else {
                c22699x3dcdb3522.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.f(p17, 12, 8);
                if (textView != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 3);
                }
            }
        }
        if (c22699x3dcdb3522 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb3522, 13);
        }
        if (c22699x3dcdb352 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb352, 13);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565246bu0);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
    }
}
