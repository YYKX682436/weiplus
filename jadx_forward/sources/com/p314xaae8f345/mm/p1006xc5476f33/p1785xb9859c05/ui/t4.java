package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 f224546d;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14) {
        this.f224546d = activityC16146xeed29e14;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14 = this.f224546d;
        sb6.append(activityC16146xeed29e14.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4g));
        sb6.append("&usedcc=");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a();
        if (!a17.f224006c) {
            a17.b(false);
        }
        java.util.ArrayList arrayList2 = a17.f224004a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            sb7 = sb7 + t83.c.g(t83.f.f());
        } else {
            int size = arrayList2.size();
            if (size > 5) {
                size = 5;
            }
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String g17 = t83.c.g(((java.lang.Integer) arrayList2.get(i17)).toString());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    sb7 = sb7 + g17 + "|";
                }
            }
            if (sb7.endsWith("|")) {
                sb7 = sb7.substring(0, sb7.length() - 1);
            }
        }
        intent.putExtra("rawUrl", sb7);
        intent.putExtra("showShare", false);
        j45.l.j(activityC16146xeed29e14, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
