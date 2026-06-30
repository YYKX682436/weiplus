package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public final class q7 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 f292189d;

    public q7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7) {
        this.f292189d = activityC22515xdd3b1ad7;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView view, int i17, int i18, int i19) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7 = this.f292189d;
        java.util.List list = activityC22515xdd3b1ad7.f291649g;
        if (!(list == null || ((java.util.ArrayList) list).isEmpty()) && activityC22515xdd3b1ad7.f291657r != null && activityC22515xdd3b1ad7.f291658s != null) {
            android.widget.ListView listView = activityC22515xdd3b1ad7.f291646d;
            int headerViewsCount = i17 - (listView != null ? listView.getHeaderViewsCount() : 0);
            if (headerViewsCount >= 0) {
                java.util.List list2 = activityC22515xdd3b1ad7.f291649g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
                if (headerViewsCount < ((java.util.ArrayList) list2).size()) {
                    java.util.List list3 = activityC22515xdd3b1ad7.f291649g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
                    u11.a aVar = (u11.a) ((java.util.ArrayList) list3).get(headerViewsCount);
                    if (activityC22515xdd3b1ad7.f291647e == null || (str = java.lang.String.valueOf((char) aVar.f505264e)) == null) {
                        str = "";
                    }
                    if (activityC22515xdd3b1ad7.A) {
                        android.widget.LinearLayout linearLayout = activityC22515xdd3b1ad7.f291657r;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                    } else {
                        com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 c22514xd4b49a10 = activityC22515xdd3b1ad7.f291648f;
                        if (c22514xd4b49a10 != null) {
                            java.lang.String str2 = activityC22515xdd3b1ad7.f291663x;
                            if (str2.length() == 0) {
                                str2 = str;
                            }
                            c22514xd4b49a10.e(str2, true);
                        }
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, activityC22515xdd3b1ad7.f291659t)) {
                            android.widget.TextView textView = activityC22515xdd3b1ad7.f291658s;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            activityC22515xdd3b1ad7.f291659t = str;
                        }
                        android.widget.LinearLayout linearLayout2 = activityC22515xdd3b1ad7.f291657r;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, activityC22515xdd3b1ad7.f291663x)) {
                            android.widget.TextView textView2 = activityC22515xdd3b1ad7.f291658s;
                            if (textView2 != null) {
                                textView2.setTextColor(activityC22515xdd3b1ad7.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahg));
                            }
                            if (activityC22515xdd3b1ad7.f291662w) {
                                activityC22515xdd3b1ad7.W6(activityC22515xdd3b1ad7.f291663x, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
                                activityC22515xdd3b1ad7.f291662w = false;
                            } else {
                                activityC22515xdd3b1ad7.W6(activityC22515xdd3b1ad7.f291663x, com.p314xaae8f345.mm.R.C30859x5a72f63.ahg);
                                activityC22515xdd3b1ad7.f291663x = "";
                            }
                        } else if (activityC22515xdd3b1ad7.f291662w) {
                            android.widget.TextView textView3 = activityC22515xdd3b1ad7.f291658s;
                            if (textView3 != null) {
                                textView3.setTextColor(activityC22515xdd3b1ad7.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
                            }
                            activityC22515xdd3b1ad7.f291662w = false;
                        } else {
                            android.widget.TextView textView4 = activityC22515xdd3b1ad7.f291658s;
                            if (textView4 != null) {
                                textView4.setTextColor(activityC22515xdd3b1ad7.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahg));
                            }
                        }
                    }
                }
            }
            android.widget.LinearLayout linearLayout3 = activityC22515xdd3b1ad7.f291657r;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 c22514xd4b49a102 = activityC22515xdd3b1ad7.f291648f;
            if (c22514xd4b49a102 != null) {
                c22514xd4b49a102.e("", false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView view, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
