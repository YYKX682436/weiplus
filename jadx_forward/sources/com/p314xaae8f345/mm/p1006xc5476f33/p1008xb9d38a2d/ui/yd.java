package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af f155877d;

    public yd(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af) {
        this.f155877d = activityC11457x794a57af;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = this.f155877d;
        if (activityC11457x794a57af.f155066p) {
            activityC11457x794a57af.T6();
        } else {
            activityC11457x794a57af.f155057d.a();
            activityC11457x794a57af.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.DoSend);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
