package aq1;

/* loaded from: classes11.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f94582d;

    public h0(aq1.q0 q0Var) {
        this.f94582d = q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r17;
        aq1.q0 q0Var = this.f94582d;
        java.lang.String[] b17 = q0Var.Bi().b();
        if (b17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.i0.y(str, "voip-invite-", false)) {
                    arrayList.add(str);
                }
            }
            r17 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r17.add(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.api.C19576x6601f2ed.a(q0Var.Bi().j((java.lang.String) it.next())));
            }
        } else {
            r17 = kz5.p0.f395529d;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.api.C19576x6601f2ed c19576x6601f2ed : r17) {
            long currentTimeMillis = (java.lang.System.currentTimeMillis() - c19576x6601f2ed.f270156f) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect leak: duringMin=" + currentTimeMillis + ", id=" + c19576x6601f2ed.f270155e);
            if (currentTimeMillis > 10) {
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = java.lang.String.valueOf(currentTimeMillis);
                strArr[1] = java.lang.String.valueOf(c19576x6601f2ed.f270155e);
                strArr[2] = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Ri() ? "1" : "0";
                ap.a.a(1, "voipInviteLeak", null, null, strArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect clear last voipInviteInfo: " + c19576x6601f2ed.f270155e);
                q0Var.Bi().remove("voip-invite-" + c19576x6601f2ed.f270155e);
            }
        }
    }
}
