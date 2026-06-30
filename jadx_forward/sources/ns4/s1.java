package ns4;

/* loaded from: classes8.dex */
public final class s1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421184d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f421184d = activityC19067xb53aa1de;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.view.View view;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.Long l17 = (java.lang.Long) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f421184d;
        ms4.t tVar = activityC19067xb53aa1de.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        java.lang.Long l18 = (java.lang.Long) tVar.f412644f.mo3195x754a37bb();
        if (l18 == null) {
            l18 = 0L;
        }
        long longValue = l18.longValue();
        ms4.t tVar2 = activityC19067xb53aa1de.f260709s;
        if (tVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        if (tVar2.f412651p && longValue <= 0) {
            android.view.View view2 = activityC19067xb53aa1de.f260701h;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newIncomeLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = activityC19067xb53aa1de.B;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = activityC19067xb53aa1de.f260716z;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = activityC19067xb53aa1de.f260701h;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newIncomeLayout");
                throw null;
            }
            android.widget.TextView textView = (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.qda);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            ms4.t tVar3 = activityC19067xb53aa1de.f260709s;
            if (tVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            textView.setText(tVar3.f412652q);
            android.view.View view6 = activityC19067xb53aa1de.f260701h;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newIncomeLayout");
                throw null;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view6.findViewById(com.p314xaae8f345.mm.R.id.qdc);
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qdd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            if (l17.longValue() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.T6(activityC19067xb53aa1de, l17.longValue(), viewGroup, textView2);
                return;
            } else {
                viewGroup.setVisibility(8);
                return;
            }
        }
        android.view.View view7 = activityC19067xb53aa1de.f260701h;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newIncomeLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = activityC19067xb53aa1de.f260716z;
        if (view8 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view8, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        if (l17.longValue() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.T6(activityC19067xb53aa1de, l17.longValue(), activityC19067xb53aa1de.B, activityC19067xb53aa1de.C);
        } else {
            android.view.View view9 = activityC19067xb53aa1de.B;
            if (view9 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view9, arrayList6.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        ms4.t tVar4 = activityC19067xb53aa1de.f260709s;
        if (tVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        if (tVar4.f412652q.length() == 0) {
            android.widget.TextView textView3 = activityC19067xb53aa1de.A;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else {
            android.widget.TextView textView4 = activityC19067xb53aa1de.A;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            android.widget.TextView textView5 = activityC19067xb53aa1de.A;
            if (textView5 != null) {
                ms4.t tVar5 = activityC19067xb53aa1de.f260709s;
                if (tVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                    throw null;
                }
                textView5.setText(tVar5.f412652q);
            }
            android.view.View view10 = activityC19067xb53aa1de.B;
            if (view10 != null && view10.getVisibility() == 0) {
                android.widget.TextView textView6 = activityC19067xb53aa1de.A;
                java.lang.Object layoutParams = textView6 != null ? textView6.getLayoutParams() : null;
                marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = (int) activityC19067xb53aa1de.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                }
            } else {
                android.widget.TextView textView7 = activityC19067xb53aa1de.A;
                java.lang.Object layoutParams2 = textView7 != null ? textView7.getLayoutParams() : null;
                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = 0;
                }
            }
        }
        android.view.View view11 = activityC19067xb53aa1de.B;
        if (view11 != null && view11.getVisibility() == 0) {
            return;
        }
        android.widget.TextView textView8 = activityC19067xb53aa1de.A;
        if ((textView8 != null && textView8.getVisibility() == 0) || (view = activityC19067xb53aa1de.f260716z) == null) {
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
