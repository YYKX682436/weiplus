package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 f236725d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69) {
        this.f236725d = activityC16959x6229db69;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69 = this.f236725d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16959x6229db69.mo55332x76847179();
        ((sb0.f) jVar).getClass();
        if (j35.u.a(mo55332x76847179, "android.permission.READ_CONTACTS", 48, null, null)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(activityC16959x6229db69, intent, true, false)) {
                try {
                    activityC16959x6229db69.startActivityForResult(intent, 1);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PhoneRechargeUI", e17, "", new java.lang.Object[0]);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
