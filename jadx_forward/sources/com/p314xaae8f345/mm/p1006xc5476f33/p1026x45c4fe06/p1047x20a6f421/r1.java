package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 f159359d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var) {
        this.f159359d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        if (this.f159359d.f159339b.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = this.f159359d;
            synchronized (n1Var) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = currentTimeMillis - n1Var.f159348k;
                int i17 = n1Var.f159347j;
                z17 = false;
                if (j17 >= i17) {
                    n1Var.f159348k = currentTimeMillis;
                    if (i17 < 5000) {
                        n1Var.f159347j = i17 + 1000;
                    } else {
                        n1Var.f159347j = 2000;
                    }
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it = n1Var.f159339b.f159148q.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1) it.next();
                            if (currentTimeMillis - i1Var.f159302a > 5000) {
                                i1Var.f159302a = java.lang.System.currentTimeMillis();
                                linkedList.add(i1Var);
                                n1Var.h(linkedList, false, true);
                                break;
                            }
                        } else if (n1Var.f159339b.f159148q.size() > 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 i1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1) n1Var.f159339b.f159148q.get(0);
                            i1Var2.getClass();
                            i1Var2.f159302a = java.lang.System.currentTimeMillis();
                            linkedList.add(i1Var2);
                            n1Var.h(linkedList, false, true);
                        }
                    }
                    z17 = true;
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "testServer");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159359d.f159340c;
                l2Var.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h2(l2Var));
            }
        }
        this.f159359d.j();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var2 = this.f159359d;
        if (currentTimeMillis2 - n1Var2.f159339b.f159142k >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            r45.b57 b57Var = new r45.b57();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = n1Var2.f159339b;
            b57Var.f452067d = a1Var.f159133b;
            b57Var.f452068e = a1Var.a();
            n1Var2.f159338a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.b(1001, b57Var));
        }
        if (this.f159359d.f159339b.d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var3 = this.f159359d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = n1Var3.f159339b;
            if (currentTimeMillis2 - a1Var2.f159143l >= 30000) {
                n1Var3.i(a1Var2.a(), Integer.MAX_VALUE);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var2 = this.f159359d.f159340c;
        l2Var2.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h2(l2Var2));
    }
}
