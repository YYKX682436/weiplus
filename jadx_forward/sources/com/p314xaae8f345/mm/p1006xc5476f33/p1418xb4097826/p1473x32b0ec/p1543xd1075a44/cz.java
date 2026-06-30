package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class cz extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz f199565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar) {
        super(2);
        this.f199565d = dzVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar = this.f199565d;
        if (longValue2 != dzVar.f199708n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + dzVar.f199708n);
        } else {
            if (longValue < 0) {
                dk2.xf xfVar = dzVar.f199712r;
                longValue = xfVar != null ? ((dk2.r4) xfVar).U() : -1L;
            }
            if (longValue >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = dzVar.f199713s;
                mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
                if (c1Var != null) {
                    c1Var.w8(longValue);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance " + longValue);
                android.view.ViewGroup viewGroup = dzVar.f199706i;
                if (viewGroup != null) {
                    viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a3f);
                }
                android.view.View view = dzVar.f199703f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = dzVar.f199704g;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = dzVar.f199704g;
                if (textView2 != null) {
                    textView2.setText(java.lang.String.valueOf(longValue));
                }
                android.view.View view2 = dzVar.f199705h;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ProgressBar progressBar = dzVar.f199707m;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
