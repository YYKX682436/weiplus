package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes12.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22308x8618c28d f288151d;

    public b3(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22308x8618c28d activityC22308x8618c28d) {
        this.f288151d = activityC22308x8618c28d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnDelete$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22308x8618c28d activityC22308x8618c28d = this.f288151d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = activityC22308x8618c28d.f287944d;
        if (c22506x89e75b89 == null || activityC22308x8618c28d.f287951n == null) {
            i17 = -1;
        } else {
            activityC22308x8618c28d.f287950m = true;
            int selectedItemPosition = c22506x89e75b89.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b892 = activityC22308x8618c28d.f287944d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22506x89e75b892);
                if (selectedItemPosition < c22506x89e75b892.getCount()) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.z2 z2Var = activityC22308x8618c28d.f287951n;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z2Var);
                    java.util.ArrayList arrayList2 = z2Var.f288801d;
                    if (arrayList2 != null) {
                        arrayList2.remove(selectedItemPosition);
                    }
                    com.p314xaae8f345.mm.ui.p2690x38b72420.z2 z2Var2 = activityC22308x8618c28d.f287951n;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z2Var2);
                    z2Var2.notifyDataSetChanged();
                }
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.z2 z2Var3 = activityC22308x8618c28d.f287951n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z2Var3);
            i17 = z2Var3.getCount();
        }
        if (i17 == 0) {
            activityC22308x8618c28d.U6();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnDelete$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
