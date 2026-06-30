package com.tencent.mm.plugin.appbrand.appusage;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class l extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f76500d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f76501e = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.appusage.i(this), false);

    public static final void Ai(com.tencent.mm.plugin.appbrand.appusage.l lVar, java.util.List list) {
        lVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        lVar.requireAccountInitialized();
        synchronized (lVar.f76500d) {
            lVar.requireAccountInitialized();
            lVar.f76500d.addAll(0, list);
        }
    }

    public static final r45.id6 wi(com.tencent.mm.plugin.appbrand.appusage.l lVar, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo) {
        lVar.getClass();
        if (localUsageInfo == null) {
            return null;
        }
        r45.id6 id6Var = new r45.id6();
        id6Var.f376955d = localUsageInfo.f76361d;
        id6Var.f376956e = localUsageInfo.f76363f;
        return id6Var;
    }

    public final void Bi(r45.jd6 op6, com.tencent.mm.plugin.appbrand.appusage.l3 reason) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(reason, "reason");
        requireAccountInitialized();
        synchronized (this.f76500d) {
            requireAccountInitialized();
            this.f76500d.addLast(op6);
        }
        if (com.tencent.mm.plugin.appbrand.appusage.g.f76439a[reason.ordinal()] == 1) {
            this.f76501e.c(30000L, 30000L);
        } else {
            Di(reason);
        }
    }

    public final void Di(com.tencent.mm.plugin.appbrand.appusage.l3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason = " + reason.name());
        this.f76501e.d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        requireAccountInitialized();
        synchronized (this.f76500d) {
            requireAccountInitialized();
            linkedList.addAll(this.f76500d);
            requireAccountInitialized();
            this.f76500d.clear();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "run cgi reason=[" + reason.f76511d + "], queue_size=" + linkedList.size());
            new com.tencent.mm.plugin.appbrand.appusage.m3(linkedList, reason.f76511d).l().H(new com.tencent.mm.plugin.appbrand.appusage.k(reason, this, linkedList));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason=[" + reason.f76511d + "], queue empty");
        if (reason == com.tencent.mm.plugin.appbrand.appusage.l3.f76506g) {
            com.tencent.mm.plugin.appbrand.appusage.t5.a(com.tencent.mm.plugin.appbrand.appusage.v5.f76600a, 2, 0, new com.tencent.mm.plugin.appbrand.appusage.j(), 2, null);
        } else if (reason == com.tencent.mm.plugin.appbrand.appusage.l3.f76507h) {
            com.tencent.mm.plugin.appbrand.appusage.t5.a(com.tencent.mm.plugin.appbrand.appusage.v5.f76600a, 2, 0, null, 6, null);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
        com.tencent.mm.plugin.appbrand.app.r9.mj();
        byte[] z07 = ((qj1.b) com.tencent.mm.plugin.appbrand.app.r9.fj(qj1.b.class)).z0("AppBrandCollectionModifyQueue");
        if (z07 != null) {
            if (z07.length == 0) {
                return;
            }
            ((qj1.b) com.tencent.mm.plugin.appbrand.app.r9.fj(qj1.b.class)).y0("AppBrandCollectionModifyQueue");
            try {
                r45.k8 k8Var = new r45.k8();
                k8Var.parseFrom(z07);
                requireAccountInitialized();
                synchronized (this.f76500d) {
                    requireAccountInitialized();
                    this.f76500d.addAll(k8Var.f378479d);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "deserializeFromDisk, read kv failed, e = " + e17);
            }
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.k8 k8Var = new r45.k8();
        requireAccountInitialized();
        synchronized (this.f76500d) {
            java.util.LinkedList linkedList = k8Var.f378479d;
            requireAccountInitialized();
            linkedList.addAll(this.f76500d);
        }
        if (k8Var.f378479d.isEmpty()) {
            return;
        }
        try {
            ((qj1.b) com.tencent.mm.plugin.appbrand.app.r9.fj(qj1.b.class)).D0("AppBrandCollectionModifyQueue", k8Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "serializeToDisk, write kv failed, e = " + e17);
        }
    }
}
