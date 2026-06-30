package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess;", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class h<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.h f146607a = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.h();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        ft.d dVar;
        ft.d dVar2;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
        synchronized (linkedHashMap) {
            linkedList = new java.util.LinkedList(linkedHashMap.values());
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = ft.d.WASERVICE;
            dVar2 = ft.d.WAGAME;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) it.next();
            java.lang.String str = o6Var.f156336n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
            if (o6Var.q2()) {
                dVar = dVar2;
            }
            if (o6Var.u0().W1 != com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS) {
                r4 = false;
            }
            linkedList2.add(new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9(str, dVar, r4));
        }
        if (linkedList2.isEmpty()) {
            java.lang.String a17 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
            if (!r26.i0.n(a17, ":appbrand1", false) && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME)) {
                dVar2 = dVar;
            }
        } else {
            dVar2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9) linkedList2.getLast()).f146578e;
        }
        java.lang.String a18 = bm5.f1.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7(a18, linkedList2, dVar2, r26.i0.n(a18, ":appbrand1", false) && com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229370b, android.os.Process.myPid());
    }
}
