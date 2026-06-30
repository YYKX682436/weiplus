package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public final class dj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 f155346d;

    public dj(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 activityC11474x746047e0) {
        this.f155346d = activityC11474x746047e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 activityC11474x746047e0 = this.f155346d;
        activityC11474x746047e0.getClass();
        android.content.Intent intent = new android.content.Intent();
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e3.class);
        intent.putExtra("INTENT_KEY_INDEX", v61.h0.f514974a.a());
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = activityC11474x746047e0.mo55332x76847179();
        cVar.d(intent);
        cVar.e(true);
        cVar.a("com.tencent.mm.plugin.account.ui.ChooseLanguageUI");
        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11403x95bea34b.class);
        cVar.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.hj(activityC11474x746047e0));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
