package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public final class n7 implements com.p314xaae8f345.mm.ui.p2740x696c9db.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 f292136a;

    public n7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7) {
        this.f292136a = activityC22515xdd3b1ad7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.q
    public void L(java.lang.String searchText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchText, "searchText");
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7 = this.f292136a;
        activityC22515xdd3b1ad7.f291653n = searchText;
        if (activityC22515xdd3b1ad7.A) {
            if (searchText.length() == 0) {
                android.view.View view = activityC22515xdd3b1ad7.B;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 c22514xd4b49a10 = activityC22515xdd3b1ad7.f291648f;
                if (c22514xd4b49a10 != null) {
                    c22514xd4b49a10.setVisibility(0);
                }
            } else {
                android.view.View view2 = activityC22515xdd3b1ad7.B;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 c22514xd4b49a102 = activityC22515xdd3b1ad7.f291648f;
                if (c22514xd4b49a102 != null) {
                    c22514xd4b49a102.setVisibility(8);
                }
            }
        }
        activityC22515xdd3b1ad7.V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.q
    public void v() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7 = this.f292136a;
        com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var = activityC22515xdd3b1ad7.f291665z;
        if (k7Var != null) {
            k7Var.mo81060xd7655c6f("");
        }
        activityC22515xdd3b1ad7.f291653n = "";
        activityC22515xdd3b1ad7.V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.q
    public void w() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.q
    public void x() {
    }
}
