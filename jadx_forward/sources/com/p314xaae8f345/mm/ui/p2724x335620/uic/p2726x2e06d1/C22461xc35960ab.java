package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1;

/* renamed from: com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC */
/* loaded from: classes16.dex */
public final class C22461xc35960ab extends wm3.a {
    public final com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1.C22462x73c16f7a A6;
    public final jz5.g B6;

    /* renamed from: z6, reason: collision with root package name */
    public java.util.List f290790z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC$contactListChangeByOutsideListener$1] */
    public C22461xc35960ab(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f290790z6 = kz5.p0.f395529d;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.A6 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5983x81f5fabe>(a0Var) { // from class: com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC$contactListChangeByOutsideListener$1
            {
                this.f39173x3fe91575 = 1324291278;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5983x81f5fabe c5983x81f5fabe) {
                j75.f m67437x4bd5310;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5983x81f5fabe event = c5983x81f5fabe;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                h.i iVar = event.f136278m;
                java.util.ArrayList arrayList = iVar.f359301a;
                java.util.ArrayList arrayList2 = iVar.f359302b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("contactListChangeByOutsideListener: selectList:");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                sb6.append(" excludeList: ");
                sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
                sb6.append(" selectContactList: ");
                com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1.C22461xc35960ab c22461xc35960ab = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1.C22461xc35960ab.this;
                sb6.append(c22461xc35960ab.f290790z6.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCustomCombineProxyUIC", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = c22461xc35960ab.P6();
                if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
                    return true;
                }
                java.util.List list = arrayList2;
                if (arrayList2 == null) {
                    list = kz5.p0.f395529d;
                }
                m67437x4bd5310.B3(new p0.h(list));
                for (java.lang.String str : c22461xc35960ab.f290790z6) {
                    if (!arrayList.contains(str)) {
                        m67437x4bd5310.B3(new wi5.t0(new ri5.j("", 0, str, "", new vi5.b(0L, 0L), 0), 0, 7));
                    }
                }
                return true;
            }
        };
        this.B6 = jz5.h.b(new q0.o(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.L2(m158354x19263085(), new q0.n(this));
        }
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mo48814x2efc64();
    }
}
