package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFlutterUIC */
/* loaded from: classes2.dex */
public final class C14913x2c930e47 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.fk {

    /* renamed from: i, reason: collision with root package name */
    public pi0.l1 f205026i;

    /* renamed from: m, reason: collision with root package name */
    public pi0.n1 f205027m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f205028n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14913x2c930e47(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f205028n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6168x15d27965>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFlutterUIC$tingFinderProfileEvent$1
            {
                this.f39173x3fe91575 = 1837692789;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6168x15d27965 c6168x15d27965) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6168x15d27965 event = c6168x15d27965;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tingFinderProfileEvent type ");
                am.az azVar = event.f136428g;
                sb6.append(azVar.f87730a);
                sb6.append(", listType = ");
                sb6.append(azVar.f87731b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTIngMusicFlutterUIC", sb6.toString());
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(azVar.f87730a, "refreshList") || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(azVar.f87731b, "music")) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTIngMusicFlutterUIC", "tingFinderProfileEvent reloadPage!!");
                ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).getClass();
                com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24998xba98362a c24998xba98362a = dm4.b.f323288g;
                if (c24998xba98362a == null) {
                    return false;
                }
                c24998xba98362a.m92707x7cd14307(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25002x8b5f1ff4.f44840x78bc6776.ordinal(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.fi.f205254d);
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.df8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.i6, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14915xd4868304 c14915xd4868304 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14915xd4868304 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14915xd4868304) m158358x197d1fc6 : null;
        if (c14915xd4868304 != null && c14915xd4868304.f205029t != null) {
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.j8p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo144222x4ff8c0f0, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0;
            android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q5y);
            if (mo144222x4ff8c0f02 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f02, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingMusicFlutterUIC", "initLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingMusicFlutterUIC", "initLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ei(this, viewGroup, null), 3, null);
        }
        if (m58719xb9a8ab96() && m58720x17be6422()) {
            this.f205028n.mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (m58719xb9a8ab96() && m58720x17be6422()) {
            this.f205028n.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        pi0.n1 n1Var = this.f205027m;
        if (n1Var != null) {
            n1Var.a();
        }
    }
}
