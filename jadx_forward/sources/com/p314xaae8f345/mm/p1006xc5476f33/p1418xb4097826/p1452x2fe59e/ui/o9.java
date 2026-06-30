package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class o9 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f191902d = new java.util.ArrayList();

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.q21 getItem(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 < this.f191902d.size()) {
            z17 = true;
        }
        if (!z17) {
            return new r45.q21();
        }
        java.lang.Object obj = this.f191902d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (r45.q21) obj;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f191902d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aqe, null);
            view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n9(this, view));
        }
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n9 n9Var = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n9 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n9) tag : null;
        if (n9Var != null) {
            r45.q21 item = getItem(i17);
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d l17 = g1Var.l();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76175x6d346f39()) == null) {
                str = "";
            }
            l17.c(new mn2.n(str, null, 2, null), n9Var.f191865d, g1Var.h(mn2.f1.f411494o));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.widget.TextView textView = n9Var.f191866e;
            android.content.Context context = textView.getContext();
            zl2.q4 q4Var = zl2.q4.f555466a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
            java.lang.String m76197x6c03c64c = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
            java.lang.String p17 = q4Var.p(m76197x6c03c64c, c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76184x8010e5e4() : null, false);
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, p17));
        }
        return view;
    }
}
