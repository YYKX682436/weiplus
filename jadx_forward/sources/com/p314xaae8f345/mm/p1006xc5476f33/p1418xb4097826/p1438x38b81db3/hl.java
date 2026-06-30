package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class hl extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.SparseArray f185127f;

    /* renamed from: e, reason: collision with root package name */
    public final int f185128e;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fl(null);
        f185127f = new android.util.SparseArray();
    }

    public hl(int i17) {
        this.f185128e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569387t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.c2 item = (so2.c2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.util.SparseArray sparseArray = f185127f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i19 = this.f185128e;
        sparseArray.put(i19, valueOf);
        android.text.SpannableString spannableString = item.f491827f;
        int i27 = item.f491828g;
        if (i27 != 1) {
            if (i27 == 2) {
                android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568319mh2);
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.e0g);
                holder.s(com.p314xaae8f345.mm.R.id.e0g, spannableString);
                if (p18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderHistoryDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderHistoryDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gl(this, holder));
                return;
            }
            return;
        }
        holder.w(com.p314xaae8f345.mm.R.id.f568319mh2, 8);
        holder.w(com.p314xaae8f345.mm.R.id.e0g, 0);
        holder.s(com.p314xaae8f345.mm.R.id.e0g, spannableString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        int bl6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(i19);
        o3Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6596x6c8aec33 c6596x6c8aec33 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6596x6c8aec33();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6596x6c8aec33.f139450d = c6596x6c8aec33.b("sessionid", Ri, true);
        c6596x6c8aec33.f139451e = 2;
        c6596x6c8aec33.f139452f = 1;
        c6596x6c8aec33.f139453g = 0;
        c6596x6c8aec33.f139454h = bl6;
        c6596x6c8aec33.k();
        o3Var.Zk(c6596x6c8aec33);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e0h)).setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.H2(4, "")));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e0h)).setVisibility(8);
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e0h)).setVisibility(0);
        }
    }
}
