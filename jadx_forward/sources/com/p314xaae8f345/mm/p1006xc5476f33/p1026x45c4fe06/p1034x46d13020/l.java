package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class l extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f158033d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f158034e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i(this), false);

    public static final void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar, java.util.List list) {
        lVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        lVar.m134976x2690a4ac();
        synchronized (lVar.f158033d) {
            lVar.m134976x2690a4ac();
            lVar.f158033d.addAll(0, list);
        }
    }

    public static final r45.id6 wi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4) {
        lVar.getClass();
        if (c11714x918fd2e4 == null) {
            return null;
        }
        r45.id6 id6Var = new r45.id6();
        id6Var.f458488d = c11714x918fd2e4.f157894d;
        id6Var.f458489e = c11714x918fd2e4.f157896f;
        return id6Var;
    }

    public final void Bi(r45.jd6 op6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        m134976x2690a4ac();
        synchronized (this.f158033d) {
            m134976x2690a4ac();
            this.f158033d.addLast(op6);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g.f157972a[reason.ordinal()] == 1) {
            this.f158034e.c(30000L, 30000L);
        } else {
            Di(reason);
        }
    }

    public final void Di(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason = " + reason.name());
        this.f158034e.d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        m134976x2690a4ac();
        synchronized (this.f158033d) {
            m134976x2690a4ac();
            linkedList.addAll(this.f158033d);
            m134976x2690a4ac();
            this.f158033d.clear();
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "run cgi reason=[" + reason.f158044d + "], queue_size=" + linkedList.size());
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.m3(linkedList, reason.f158044d).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k(reason, this, linkedList));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason=[" + reason.f158044d + "], queue empty");
        if (reason == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3.f158039g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t5.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v5.f158133a, 2, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j(), 2, null);
        } else if (reason == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3.f158040h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t5.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v5.f158133a, 2, 0, null, 6, null);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
        byte[] z07 = ((qj1.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(qj1.b.class)).z0("AppBrandCollectionModifyQueue");
        if (z07 != null) {
            if (z07.length == 0) {
                return;
            }
            ((qj1.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(qj1.b.class)).y0("AppBrandCollectionModifyQueue");
            try {
                r45.k8 k8Var = new r45.k8();
                k8Var.mo11468x92b714fd(z07);
                m134976x2690a4ac();
                synchronized (this.f158033d) {
                    m134976x2690a4ac();
                    this.f158033d.addAll(k8Var.f460012d);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "deserializeFromDisk, read kv failed, e = " + e17);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.k8 k8Var = new r45.k8();
        m134976x2690a4ac();
        synchronized (this.f158033d) {
            java.util.LinkedList linkedList = k8Var.f460012d;
            m134976x2690a4ac();
            linkedList.addAll(this.f158033d);
        }
        if (k8Var.f460012d.isEmpty()) {
            return;
        }
        try {
            ((qj1.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(qj1.b.class)).D0("AppBrandCollectionModifyQueue", k8Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "serializeToDisk, write kv failed, e = " + e17);
        }
    }
}
