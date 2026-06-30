package qf2;

/* loaded from: classes3.dex */
public final class v0 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public int f444147m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f444147m = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(qf2.v0 r17, long r18, java.lang.String r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.v0.a7(qf2.v0, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c7(qf2.v0 v0Var, r45.xn1 finderLiveContact, r45.kj1 kj1Var, int i17, byte[] bArr, java.lang.String str, yz5.a aVar, int i18, java.lang.Object obj) {
        r45.kj1 kj1Var2 = (i18 & 2) != 0 ? null : kj1Var;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        byte[] bArr2 = (i18 & 8) != 0 ? null : bArr;
        java.lang.String str2 = (i18 & 16) != 0 ? null : str;
        yz5.a aVar2 = (i18 & 32) != 0 ? null : aVar;
        v0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveContact, "finderLiveContact");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(v0Var, null, null, new qf2.z(v0Var, finderLiveContact, kj1Var2, i19, bArr2, str2, aVar2, null), 3, null);
    }

    public static /* synthetic */ void e7(qf2.v0 v0Var, java.lang.String str, boolean z17, boolean z18, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        v0Var.d7(str, z17, z18, lVar);
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.r0(this, null), 3, null);
    }

    public final void Z6(km2.q micUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUser, "micUser");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "acceptMicReport acceptMicTimeOut: " + micUser.L + " user: " + micUser);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.o(this, micUser, null), 3, null);
    }

    public final void b7(r45.xn1 xn1Var) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390705c, (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c())) {
                        break;
                    }
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "anchorAcceptWithAnchorMicTrtc fail userData = null");
        } else {
            ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).M7(qVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.w(qVar, this, null), 3, null);
        }
    }

    public final void d7(java.lang.String userName, boolean z17, boolean z18, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "close trace: " + android.util.Log.getStackTraceString(new java.lang.Throwable("Pk mic close")));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.l0(this, userName, z17, z18, lVar, null), 3, null);
    }

    public final void f7() {
        java.util.HashMap hashMap = new java.util.HashMap();
        mk2.h hVar = mk2.h.f408666a;
        hashMap.putAll(mk2.h.f408668c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "cancelAllAnchorApply task: " + hashMap.size());
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Runnable runnable = (java.lang.Runnable) entry.getValue();
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            }
            java.lang.String str = (java.lang.String) entry.getKey();
            if (str != null) {
                e7(this, str, false, false, null, 14, null);
            }
        }
        mk2.h hVar2 = mk2.h.f408666a;
        mk2.h.f408668c.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.q0(this, null), 3, null);
    }
}
