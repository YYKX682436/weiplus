package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class p8 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r8 f167862d;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r8 r8Var) {
        this.f167862d = r8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!this.f167862d.f169292b.L0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167862d.f169292b;
            o6Var.f167722u2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ae(o6Var);
            if (((java.lang.Boolean) ((jz5.n) this.f167862d.f169292b.f167722u2.f156486b).mo141623x754a37bb()).booleanValue()) {
                this.f167862d.f169292b.f167723v2 = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.p8$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var;
                        boolean hasNext;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p8.this;
                        if (p8Var.f167862d.f169292b.s2()) {
                            return;
                        }
                        p8Var.f167862d.f169292b.getClass();
                        boolean z17 = false;
                        p8Var.f167862d.f169292b.K("mEarlyNotifyServicePackageReadyLatch callback", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = p8Var.f167862d.f169292b.f167721t2;
                        if (j3Var == null || (c0Var = j3Var.f159989h) == null) {
                            return;
                        }
                        c0Var.s1(p8Var.f167862d.f169292b);
                        p8Var.f167862d.f169292b.p2();
                        c0Var.u(p8Var.f167862d.f169292b.E);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = p8Var.f167862d.f169292b.E0().f387385r;
                        c11667xc7e59dd6.getClass();
                        java.util.Iterator it = null;
                        while (true) {
                            if (z17) {
                                if (it == null) {
                                    it = c11667xc7e59dd6.f156935g.iterator();
                                }
                                hasNext = it.hasNext();
                            } else {
                                hasNext = true;
                            }
                            if (!hasNext) {
                                break;
                            }
                            if (z17) {
                                c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) it.next();
                            } else {
                                z17 = true;
                                c11656xaf63146e = c11667xc7e59dd6;
                            }
                            if (com.p314xaae8f345.mm.vfs.w6.j(c11656xaf63146e.mo49190xe121c411())) {
                                if (c11656xaf63146e.f33453xc73e777a) {
                                    linkedList.addFirst(c11656xaf63146e.f33454x337a8b);
                                } else {
                                    linkedList.addLast(c11656xaf63146e.f33454x337a8b);
                                }
                            }
                        }
                        if (linkedList.isEmpty()) {
                            return;
                        }
                        c0Var.J1(true);
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            c0Var.y((java.lang.String) it6.next());
                        }
                    }
                });
            }
        }
        return jz5.f0.f384359a;
    }
}
