package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes11.dex */
public class o1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 f225986d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285) {
        this.f225986d = activityC16255xf01eb285;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285 = this.f225986d;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 item = activityC16255xf01eb285.f225875f.getItem(i17);
        if (item != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", item.f14359x58b7f1c);
            if (item.f14359x58b7f1c.equals("TestFragment")) {
                android.content.Intent intent = new android.content.Intent(activityC16255xf01eb285.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16264xb71bcee9.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16255xf01eb285.mo55332x76847179();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (item.f14359x58b7f1c.equals("widget测试")) {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.v.f226042a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = activityC16255xf01eb285.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3325xe03a0797.p3326xc267989b.l.d(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.v.f226042a, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.u("wxalite57af7e6c7eea13b5e789762aecade923", context, null), 3, null);
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466.equals(item.f14359x58b7f1c)) {
                dp.a.m125854x26a183b(activityC16255xf01eb285.mo55332x76847179(), "Is Base Lib ", 0).show();
            } else {
                if (item.f14359x58b7f1c.equals("wxalite9f49cc96fb30017059f65139fee9f535")) {
                    bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
                sVar.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.l1(this));
                sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.m1(this, sVar);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, false, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.n1(this));
            }
        } else {
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285.f225872m;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
