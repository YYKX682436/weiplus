package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class u10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 f201461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var) {
        super(1);
        this.f201461d = z10Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = this.f201461d;
            android.view.View view = z10Var.f202031g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$initContentView$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$initContentView$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = z10Var.f202027c;
            lVar.K0(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0) lVar : null;
            if (ai0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ai0Var.f193422q, "releaseDynamicCardEnv");
                hq0.e0 e0Var = ai0Var.f193425t;
                if (e0Var != null && (str = e0Var.f364517e) != null) {
                    ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(str);
                }
                ai0Var.f193425t = null;
                ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(null);
                ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
                xg4.m.f535979a.a(2000L);
            }
        }
        return jz5.f0.f384359a;
    }
}
