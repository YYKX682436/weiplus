package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class c20 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f215483d;

    public c20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var) {
        this.f215483d = f50Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        boolean z17 = true;
        boolean z18 = z9Var != null && z9Var.f186860a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f215483d;
        if (z18) {
            java.lang.String e17 = xy2.c.e(f50Var.m158354x19263085());
            if (e17 != null && e17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.view.View mo144222x4ff8c0f0 = f50Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
                ym5.a1.h(mo144222x4ff8c0f0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a20(f50Var));
                android.view.View mo144222x4ff8c0f02 = f50Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqo);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f02, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = (android.widget.TextView) f50Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqp);
                r45.f03 f03Var = z9Var.f186861b;
                if (f03Var == null || (str = f03Var.f455422f) == null) {
                    str = "";
                }
                textView.setText(str);
                f50Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqo).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b20(z9Var, f50Var));
                return;
            }
        }
        android.view.View mo144222x4ff8c0f03 = f50Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqo);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo144222x4ff8c0f03, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f03.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
