package vi1;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.y1 f519017d;

    public w1(vi1.y1 y1Var) {
        this.f519017d = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.y1 y1Var = this.f519017d;
        java.lang.String str = y1Var.f519040y;
        android.content.Context context = y1Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        y1Var.f519041z = new vi1.l0(str, context, y1Var.A);
        y1Var.f518843q.mo7960x6cab2c8d(y1Var.f519041z);
        if (y1Var.A.size() == 0) {
            android.view.View view = y1Var.f518846t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y1Var.f518843q.setVisibility(8);
            y1Var.f518844r.setVisibility(8);
            return;
        }
        if (y1Var.A.size() == 1) {
            android.view.View view2 = y1Var.f518846t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y1Var.f518843q.setVisibility(0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = y1Var.f518843q.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            y1Var.f518844r.setVisibility(0);
            y1Var.f518844r.setText(y1Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3s));
            if (vi1.l1.f518932a.a().r8()) {
                return;
            }
            y1Var.f518844r.setVisibility(8);
            return;
        }
        android.view.View view3 = y1Var.f518846t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        y1Var.f518843q.setVisibility(0);
        y1Var.f518844r.setVisibility(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = y1Var.f518843q.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
        y1Var.f518844r.setText(y1Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3r));
        if (vi1.l1.f518932a.a().r8()) {
            return;
        }
        y1Var.f518844r.setVisibility(8);
    }
}
