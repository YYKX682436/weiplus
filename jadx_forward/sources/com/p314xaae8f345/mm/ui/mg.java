package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class mg extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.rg f290676d;

    public mg(com.p314xaae8f345.mm.ui.rg rgVar, com.p314xaae8f345.mm.ui.hg hgVar) {
        this.f290676d = rgVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f290676d.f291273s.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.rg rgVar = this.f290676d;
        com.p314xaae8f345.mm.ui.og ogVar = (com.p314xaae8f345.mm.ui.og) rgVar.f291273s.get(i17);
        android.content.Context context = rgVar.f291274t;
        com.p314xaae8f345.mm.ui.qg qgVar = new com.p314xaae8f345.mm.ui.qg(context, ogVar);
        boolean z17 = i17 == getCount() - 1;
        android.view.View inflate = rgVar.f291271q.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1i, viewGroup, false);
        qgVar.f291091f = inflate;
        qgVar.f291092g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        qgVar.f291093h = (android.widget.ImageView) qgVar.f291091f.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        qgVar.f291094i = (android.widget.TextView) qgVar.f291091f.findViewById(com.p314xaae8f345.mm.R.id.k_3);
        qgVar.f291095m = (android.widget.TextView) qgVar.f291091f.findViewById(com.p314xaae8f345.mm.R.id.osp);
        qgVar.f291096n = qgVar.f291091f.findViewById(com.p314xaae8f345.mm.R.id.k7m);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ogVar.f291009b.f291039a);
        com.p314xaae8f345.mm.ui.pg pgVar = ogVar.f291009b;
        if (!K0) {
            qgVar.f291092g.setText(pgVar.f291039a);
        }
        int i18 = pgVar.f291042d;
        if (i18 > 0) {
            qgVar.f291092g.setTextColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18));
        }
        int i19 = pgVar.f291040b;
        if (i19 > 0) {
            qgVar.f291093h.setVisibility(0);
            qgVar.f291093h.setImageResource(i19);
        } else {
            qgVar.f291093h.setVisibility(8);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            qgVar.f291093h.setContentDescription("");
        }
        qgVar.f291095m.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(context));
        if (z17) {
            qgVar.f291091f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b4h);
        } else {
            qgVar.f291091f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b4g);
        }
        qgVar.f291094i.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562163ad4));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(ogVar.f291008a, qgVar)) {
            boolean z18 = ogVar.f291008a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
            if (z18) {
                android.view.View view2 = qgVar.f291096n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(qgVar, rVar, true);
            } else {
                qgVar.f291094i.setVisibility(8);
                qgVar.f291095m.setVisibility(8);
                android.view.View view3 = qgVar.f291096n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(qgVar, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_NEW, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(qgVar, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_COUNTER, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(qgVar, rVar, false);
            }
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(qgVar);
        return qgVar.f291091f;
    }
}
