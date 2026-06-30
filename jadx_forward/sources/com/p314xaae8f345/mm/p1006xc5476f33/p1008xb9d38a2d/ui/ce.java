package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class ce implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af f155311d;

    public ce(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af) {
        this.f155311d = activityC11457x794a57af;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = this.f155311d;
        int i17 = activityC11457x794a57af.f155070t;
        int i18 = 3;
        if (i17 == 2) {
            n71.a.e("R200_500");
        } else if (i17 == 3) {
            n71.a.e("F200_300");
        }
        android.content.Intent intent = new android.content.Intent(activityC11457x794a57af, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11465x677338b2.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bindmcontact_mobile", activityC11457x794a57af.f155061h);
        int i19 = activityC11457x794a57af.f155070t;
        if (i19 == 2) {
            i18 = 0;
        } else if (i19 == 3) {
            i18 = 2;
        }
        bundle.putInt("voice_verify_type", i18);
        intent.putExtras(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af2 = this.f155311d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC11457x794a57af2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11457x794a57af2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC11457x794a57af2, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
