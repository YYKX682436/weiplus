package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class fj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm f210775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f210776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(2);
        this.f210775d = qmVar;
        this.f210776e = activityC15076x7a6c76b6;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 nb0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this.f210775d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) nb0Var).c7(qmVar.f187954d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f210776e;
        activityC15076x7a6c76b6.R7(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = qmVar.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = i0Var != null ? i0Var.m56068x4905e9fa() : null;
        if (m56068x4905e9fa != null) {
            m56068x4905e9fa.setVisibility(8);
        }
        android.view.View view = activityC15076x7a6c76b6.Z;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsLayout");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cti);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        if (intValue != -5002) {
            if (intValue == -4036) {
                android.view.View view2 = activityC15076x7a6c76b6.Z;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573602f45);
            } else if (intValue == -4033) {
                android.view.View view3 = activityC15076x7a6c76b6.Z;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cwu);
            } else if (intValue != -4011) {
                activityC15076x7a6c76b6.S7(true);
            } else {
                android.view.View view4 = activityC15076x7a6c76b6.Z;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cv_);
            }
        } else if (str != null) {
            hc2.i.d(activityC15076x7a6c76b6, str);
        }
        return jz5.f0.f384359a;
    }
}
