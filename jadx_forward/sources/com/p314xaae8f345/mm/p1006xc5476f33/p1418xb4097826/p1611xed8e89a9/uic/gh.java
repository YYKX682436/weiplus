package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class gh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.e6 f205276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca f205277e;

    public gh(db2.e6 e6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca c14905x694027ca) {
        this.f205276d = e6Var;
        this.f205277e = c14905x694027ca;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$initAudioPostLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.sd1 O = this.f205276d.O();
        if (O != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.fk.Q6(this.f205277e, O, null, 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderProfileTingAudioUIC", "gotoLiteApp but postLiteApp is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$initAudioPostLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
