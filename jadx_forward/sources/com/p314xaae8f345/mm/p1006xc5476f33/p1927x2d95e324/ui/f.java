package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class f implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 f233852d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1) {
        this.f233852d = abstractActivityC16727x398198e1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        r45.d64 d64Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            v();
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233852d;
        abstractActivityC16727x398198e1.W6(8);
        int i18 = abstractActivityC16727x398198e1.N;
        if (i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "block by autoQueryInterval: %d", java.lang.Integer.valueOf(i18));
            return;
        }
        if (abstractActivityC16727x398198e1.f233774q != null) {
            c01.d9.e().d(abstractActivityC16727x398198e1.f233774q);
            abstractActivityC16727x398198e1.f233774q = null;
        }
        if (((java.util.ArrayList) abstractActivityC16727x398198e1.f233776s).size() > 0) {
            d64Var = (r45.d64) ((java.util.ArrayList) abstractActivityC16727x398198e1.f233776s).get(0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "empty lbslist");
            d64Var = new r45.d64();
        }
        abstractActivityC16727x398198e1.f233775r = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar = abstractActivityC16727x398198e1.f233768h;
        if (str != null) {
            aVar.f233843r = str;
        } else {
            aVar.getClass();
        }
        abstractActivityC16727x398198e1.f233774q = new dn3.k(1, abstractActivityC16727x398198e1.L, d64Var.f453707d, d64Var.f453708e, d64Var.f453709f, d64Var.f453712i, d64Var.f453710g, d64Var.f453711h, null, abstractActivityC16727x398198e1.I ? abstractActivityC16727x398198e1.f233768h.f233843r : "", abstractActivityC16727x398198e1.P, false, true, abstractActivityC16727x398198e1.M);
        c01.d9.e().g(abstractActivityC16727x398198e1.f233774q);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233852d;
        abstractActivityC16727x398198e1.D = true;
        abstractActivityC16727x398198e1.H.q(abstractActivityC16727x398198e1.getString(abstractActivityC16727x398198e1.M ? com.p314xaae8f345.mm.R.C30867xcad56011.f574150m22 : com.p314xaae8f345.mm.R.C30867xcad56011.h5s));
        abstractActivityC16727x398198e1.I = true;
        abstractActivityC16727x398198e1.f233768h.c();
        abstractActivityC16727x398198e1.f233764d.setAdapter((android.widget.ListAdapter) abstractActivityC16727x398198e1.f233768h);
        abstractActivityC16727x398198e1.f233768h.notifyDataSetChanged();
        abstractActivityC16727x398198e1.f233764d.b();
        abstractActivityC16727x398198e1.f233766f.b(abstractActivityC16727x398198e1.f233768h.f233844s);
        android.view.View view = abstractActivityC16727x398198e1.f233765e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        abstractActivityC16727x398198e1.f233764d.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.e(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1.U6(abstractActivityC16727x398198e1, abstractActivityC16727x398198e1.f233768h);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233852d;
        abstractActivityC16727x398198e1.I = false;
        abstractActivityC16727x398198e1.f233764d.setAdapter((android.widget.ListAdapter) abstractActivityC16727x398198e1.f233767g);
        abstractActivityC16727x398198e1.f233767g.notifyDataSetChanged();
        abstractActivityC16727x398198e1.f233766f.b(abstractActivityC16727x398198e1.f233767g.f233844s);
        if (!abstractActivityC16727x398198e1.f233767g.d() && (view = abstractActivityC16727x398198e1.f233765e) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        abstractActivityC16727x398198e1.f233764d.setOnTouchListener(null);
        abstractActivityC16727x398198e1.W6(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1.U6(abstractActivityC16727x398198e1, abstractActivityC16727x398198e1.f233767g);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        dn3.k kVar;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233852d;
        abstractActivityC16727x398198e1.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((kVar = abstractActivityC16727x398198e1.f233774q) == null || !str.equals(kVar.f323560g))) {
            abstractActivityC16727x398198e1.W6(8);
            if (abstractActivityC16727x398198e1.f233774q != null) {
                c01.d9.e().d(abstractActivityC16727x398198e1.f233774q);
            }
            if (abstractActivityC16727x398198e1.f233777t != null) {
                abstractActivityC16727x398198e1.f233768h.c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar = abstractActivityC16727x398198e1.f233768h;
                if (str != null) {
                    aVar.f233843r = str;
                } else {
                    aVar.getClass();
                }
                abstractActivityC16727x398198e1.d7(false);
                abstractActivityC16727x398198e1.f233764d.c();
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233852d;
        if (abstractActivityC16727x398198e1.f233774q != null) {
            c01.d9.e().d(abstractActivityC16727x398198e1.f233774q);
            abstractActivityC16727x398198e1.f233774q = null;
        }
        abstractActivityC16727x398198e1.f233768h.c();
        abstractActivityC16727x398198e1.W6(8);
    }
}
