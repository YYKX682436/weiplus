package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class k7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f165600a;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f165600a = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class);
            java.lang.String appId = this.f165600a.f156336n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623 event = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) u5Var;
            u0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            u0Var.f173851e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "handleByAppBrandProcess: appId:" + appId + " event:" + event);
            int ordinal = event.f170148e.ordinal();
            if (ordinal == 0) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.e1(appId));
                return;
            }
            if (ordinal != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "handleByAppBrandProcess event:" + event + " not support");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "restoreRuntime: appId:" + appId + " event:" + event.f170149f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(appId);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = b17 != null ? b17.f156329e : null;
            android.os.Parcelable parcelable = event.f170149f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12581x2c911bb0 c12581x2c911bb0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12581x2c911bb0) parcelable;
            if (hcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2) {
                final java.util.List list = c12581x2c911bb0.f170150d;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2) hcVar);
                c11529x5d7a34bb.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "restoreRuntime appIdList:%s", list);
                c11529x5d7a34bb.Y(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.this;
                        c11529x5d7a34bb2.getClass();
                        for (java.lang.String str : list) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = b18 != null ? b18.u0() : null;
                            if (u07 == null) {
                                u07 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4();
                                u07.f158811d = str;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeContainerWC", "restoreRuntime use mock init config");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v1.a(u07, c11529x5d7a34bb2);
                            if (a17 != null) {
                                java.util.LinkedList linkedList = c11529x5d7a34bb2.f156372r;
                                if (!linkedList.contains(a17)) {
                                    linkedList.addLast(a17);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = a17.f156343s;
                                    if (qVar.getParent() != null) {
                                        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                        ((android.view.ViewGroup) qVar.getParent()).removeView(qVar);
                                    }
                                    c11529x5d7a34bb2.f156371q.addView(qVar, 0);
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeContainerWC", "restoreRuntime appId:%s: stashedRt is null", str);
                            }
                        }
                    }
                });
            }
        }
    }
}
