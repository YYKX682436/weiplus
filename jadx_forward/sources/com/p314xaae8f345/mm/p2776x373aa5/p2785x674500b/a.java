package com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 f295239a;

    public com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 a() {
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = this.f295239a;
        if (c22840x82866af5 != null) {
            return c22840x82866af5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layout");
        throw null;
    }

    public void b() {
        hn5.c m82881xf939df19 = a().m82881xf939df19();
        int a17 = m82881xf939df19.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        for (int i18 = 0; i18 < a17; i18++) {
            hn5.b e17 = m82881xf939df19.e(i18);
            arrayList.add(m82881xf939df19.c(i18, m82881xf939df19.b(i18)));
            arrayList2.add(e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiAreaLayoutManager", "addView index:" + i18 + " layoutInfo:" + e17);
        }
        a().removeAllViews();
        if (arrayList.size() <= 0 || arrayList.size() != arrayList2.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiAreaLayoutManager", "viewList size:" + arrayList.size() + ", layoutInfoList size:" + arrayList2.size());
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) next;
            if (view.getParent() != null) {
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            m82881xf939df19.g(i17, view);
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 a18 = a();
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5.LayoutParams layoutParams = new com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5.LayoutParams(-1, -1);
            layoutParams.f295238a = (hn5.b) arrayList2.get(i17);
            a18.addView(view, layoutParams);
            i17 = i19;
        }
    }
}
