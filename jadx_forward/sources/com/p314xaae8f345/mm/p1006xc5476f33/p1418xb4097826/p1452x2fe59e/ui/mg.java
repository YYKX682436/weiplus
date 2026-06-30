package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class mg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14051xa2b0bb65 f191842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14051xa2b0bb65 activityC14051xa2b0bb65) {
        super(2);
        this.f191842d = activityC14051xa2b0bb65;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongFeedDetailUI", "showErrUi: errCode=" + intValue + ", errMsg=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14051xa2b0bb65 activityC14051xa2b0bb65 = this.f191842d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z9 z9Var = activityC14051xa2b0bb65.f190776y;
        if (z9Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = z9Var.m56068x4905e9fa();
        if (m56068x4905e9fa != null) {
            m56068x4905e9fa.setVisibility(8);
        }
        android.view.View findViewById = activityC14051xa2b0bb65.findViewById(com.p314xaae8f345.mm.R.id.q7o);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.cti);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        android.view.View decorView = activityC14051xa2b0bb65.getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        android.view.ViewGroup viewGroup2 = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewWithTag(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.rl8)) : null;
        android.view.ViewGroup viewGroup3 = viewGroup2 instanceof android.view.ViewGroup ? viewGroup2 : null;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f);
        }
        if (intValue != -5002) {
            boolean z17 = true;
            if (intValue == -4036) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573602f45);
                } else {
                    textView.setText(str);
                }
            } else if (intValue == -4033) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cwu);
                } else {
                    textView.setText(str);
                }
            } else if (intValue == -4011) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cv_);
                } else {
                    textView.setText(str);
                }
            }
        } else if (str != null) {
            hc2.i.d(activityC14051xa2b0bb65, str);
        }
        return jz5.f0.f384359a;
    }
}
