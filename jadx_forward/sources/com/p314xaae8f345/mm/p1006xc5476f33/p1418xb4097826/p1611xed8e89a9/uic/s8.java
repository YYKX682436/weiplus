package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class s8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205742e;

    public s8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        this.f205741d = obVar;
        this.f205742e = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity m81193x1252e2cf;
        gx2.q qVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205741d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, obVar.m58738xfe9224be(), "link_halfscreen_profile_avatar_profile", 1, null, false, null, 56, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209500u9).mo141623x754a37bb()).r()).intValue() == 1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = obVar.m158354x19263085();
            jz5.f0 f0Var = null;
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085 : null;
            if (abstractActivityC22579xbed01a37 != null && (m81193x1252e2cf = abstractActivityC22579xbed01a37.m81193x1252e2cf()) != null) {
                pf5.z zVar = pf5.z.f435481a;
                if (!(m81193x1252e2cf instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
                if (c15471x9d199e5b != null && (qVar = c15471x9d199e5b.f215154f) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.r8(obVar, this.f205742e), 7, null);
                    f0Var = jz5.f0.f384359a;
                }
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "Skip clicking on nickname since there is no parent activity (Jumping to profile needs profile drawer)");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
