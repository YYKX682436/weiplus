package com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.star.ZIDL_xmiCPWJ3K */
/* loaded from: classes8.dex */
public class C27506x35f2d944 {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_BX */
    private void m116779x1964d19e(java.lang.Object obj, boolean z17) {
        lk3.b U6;
        lk3.b U62;
        ik3.k kVar = (ik3.k) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.c) obj);
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "insertByIdAsync result: " + z17);
        if (z17) {
            boolean z18 = kVar.f373432a;
            ik3.q qVar = kVar.f373435d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = kVar.f373434c;
            if (z18 && kVar.f373433b) {
                if (c16601x7ed0e40c == null || (U62 = qVar.U6()) == null) {
                    return;
                }
                lk3.c cVar = lk3.c.f400546g;
                java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                o75.c cVar2 = new o75.c(cVar, field_id, "MicroMsg.MultiTask.MultiTaskLiveStorage");
                cVar2.f425123d = c16601x7ed0e40c;
                U62.P6().mo127123xc2079749(cVar2);
                return;
            }
            if (c16601x7ed0e40c == null || (U6 = qVar.U6()) == null) {
                return;
            }
            o75.b bVar = o75.b.f425115c;
            java.lang.String field_id2 = c16601x7ed0e40c.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id2, "field_id");
            o75.c cVar3 = new o75.c(bVar, field_id2, "MicroMsg.MultiTask.MultiTaskLiveStorage");
            cVar3.f425123d = c16601x7ed0e40c;
            U6.P6().mo127123xc2079749(cVar3);
        }
    }

    /* renamed from: ZIDL_CX */
    private void m116780x1964d1bd(java.lang.Object obj, boolean z17) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_DX */
    private void m116781x1964d1dc(java.lang.Object obj, boolean z17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.a) obj).mo116804xdc453139(z17);
    }

    /* renamed from: ZIDL_FX */
    private void m116782x1964d21a(java.lang.Object obj, byte[][] bArr) {
        java.util.ArrayList m119629xd40dd8d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(bw5.a40.f106540h, bArr);
        ik3.j jVar = (ik3.j) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.b) obj);
        jVar.getClass();
        ik3.q qVar = jVar.f373430a;
        lk3.b U6 = qVar.U6();
        java.util.ArrayList arrayList = new java.util.ArrayList(U6 != null ? kz5.n0.S0(U6.Z6(null)) : kz5.p0.f395529d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m119629xd40dd8d);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m119629xd40dd8d, 10));
        int i17 = 0;
        for (java.lang.Object obj2 : m119629xd40dd8d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.a40 a40Var = (bw5.a40) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a40Var);
            arrayList2.add(qVar.W6(i17, a40Var));
            i17 = i18;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.n0.S0(arrayList2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "getAllStarData, allAffStarData size: " + m119629xd40dd8d.size() + ", localMultiTaskInfos size: " + arrayList.size());
        arrayList.addAll(arrayList3);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) next;
            if (hashSet.add(c16601x7ed0e40c.f66791xc8a07680 + '_' + c16601x7ed0e40c.f66793x2262335f + '}')) {
                arrayList4.add(next);
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new ik3.i());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_data_config");
        if (!M.getBoolean("multitask_key_web", false)) {
            M.putBoolean("multitask_key_web", true);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it6.next();
                if (c16601x7ed0e40c2.f66793x2262335f == 2) {
                    r45.k97 k97Var = new r45.k97();
                    try {
                        k97Var.mo11468x92b714fd(c16601x7ed0e40c2.f66790x225a93cf);
                    } catch (java.lang.Exception unused) {
                    }
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(k97Var.m75945x2fec8307(1))) {
                        c16601x7ed0e40c2.f66793x2262335f = 26;
                        lk3.b U62 = qVar.U6();
                        if (U62 != null) {
                            U62.X6(c16601x7ed0e40c2);
                        }
                    }
                }
            }
        }
        kk3.b bVar = jVar.f373431b;
        if (bVar != null) {
            bVar.a(arrayList);
        }
    }

    /* renamed from: ZIDL_A */
    public native boolean m116783x9db8edf9(long j17, byte[] bArr);

    /* renamed from: ZIDL_BV */
    public native void m116784x1964d19c(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_CV */
    public native void m116785x1964d1bb(long j17, java.lang.Object obj, long j18);

    /* renamed from: ZIDL_DV */
    public native void m116786x1964d1da(long j17, java.lang.Object obj, byte[] bArr, int i17);

    /* renamed from: ZIDL_E */
    public native byte[] m116787x9db8edfd(long j17, byte[] bArr, int i17);

    /* renamed from: ZIDL_FV */
    public native void m116788x1964d218(long j17, java.lang.Object obj, long j18);

    /* renamed from: ZIDL_G */
    public native boolean m116789x9db8edff(long j17);

    /* renamed from: ZIDL_xmiCPWJ3C */
    public native void m116790x35f2d93c(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
