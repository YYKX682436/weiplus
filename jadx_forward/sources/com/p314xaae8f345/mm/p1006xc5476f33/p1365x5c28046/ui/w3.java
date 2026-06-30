package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes9.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 f180066d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 activityC13322x119d0e55) {
        this.f180066d = activityC13322x119d0e55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateResultView$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 activityC13322x119d0e55 = this.f180066d;
        if (activityC13322x119d0e55.f179400o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateResultView", "failed to send emojiInfo since it's null");
        } else {
            new lb5.a().n(activityC13322x119d0e55.f179392d);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5 s5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13322x119d0e55.mo55332x76847179();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = activityC13322x119d0e55.f179400o;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) s5Var).hj(mo55332x76847179, c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.mo42933xb5885648() : null, activityC13322x119d0e55.f179400o);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateResultView$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
