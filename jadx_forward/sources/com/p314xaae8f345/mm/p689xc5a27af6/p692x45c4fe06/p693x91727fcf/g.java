package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class g<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.g f146606a = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.g();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7 c10457xa2522bd7;
        com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9 c10459x397611e9;
        java.util.List<ft.b> R6 = ((ft.e) i95.n0.c(ft.e.class)).R6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R6, "getAllProcesses(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(R6, 10));
        for (ft.b bVar : R6) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            if (bVar instanceof com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7) {
                c10457xa2522bd7 = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7) bVar;
            } else {
                java.lang.String f146571d = bVar.getF146571d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146571d, "processName(...)");
                boolean z17 = false;
                if (r26.i0.n(f146571d, ":appbrand1", false) && com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229371c) {
                    z17 = true;
                }
                boolean z18 = z17;
                java.lang.String f146571d2 = bVar.getF146571d();
                java.util.List<ft.c> f146572e = bVar.getF146572e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146572e, "appList(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(f146572e, 10));
                for (ft.c cVar : f146572e) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                    if (cVar instanceof com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9) {
                        c10459x397611e9 = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9) cVar;
                    } else {
                        java.lang.String f146577d = cVar.getF146577d();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146577d, "appId(...)");
                        ft.d f146578e = cVar.getF146578e();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146578e, "appType(...)");
                        c10459x397611e9 = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9(f146577d, f146578e, cVar.getF146579f());
                    }
                    arrayList2.add(c10459x397611e9);
                }
                ft.d f146573f = bVar.getF146573f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146573f, "preferUsedAsType(...)");
                c10457xa2522bd7 = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7(f146571d2, arrayList2, f146573f, z18, 0, 16, null);
            }
            arrayList.add(c10457xa2522bd7);
        }
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff(arrayList);
    }
}
