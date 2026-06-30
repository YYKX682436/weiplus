package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.n1 f77826d;

    public r1(com.tencent.mm.plugin.appbrand.debugger.n1 n1Var) {
        this.f77826d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        if (this.f77826d.f77806b.c()) {
            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77826d;
            synchronized (n1Var) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = currentTimeMillis - n1Var.f77815k;
                int i17 = n1Var.f77814j;
                z17 = false;
                if (j17 >= i17) {
                    n1Var.f77815k = currentTimeMillis;
                    if (i17 < 5000) {
                        n1Var.f77814j = i17 + 1000;
                    } else {
                        n1Var.f77814j = 2000;
                    }
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it = n1Var.f77806b.f77615q.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.tencent.mm.plugin.appbrand.debugger.i1 i1Var = (com.tencent.mm.plugin.appbrand.debugger.i1) it.next();
                            if (currentTimeMillis - i1Var.f77769a > 5000) {
                                i1Var.f77769a = java.lang.System.currentTimeMillis();
                                linkedList.add(i1Var);
                                n1Var.h(linkedList, false, true);
                                break;
                            }
                        } else if (n1Var.f77806b.f77615q.size() > 0) {
                            com.tencent.mm.plugin.appbrand.debugger.i1 i1Var2 = (com.tencent.mm.plugin.appbrand.debugger.i1) n1Var.f77806b.f77615q.get(0);
                            i1Var2.getClass();
                            i1Var2.f77769a = java.lang.System.currentTimeMillis();
                            linkedList.add(i1Var2);
                            n1Var.h(linkedList, false, true);
                        }
                    }
                    z17 = true;
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "testServer");
                com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77826d.f77807c;
                l2Var.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.h2(l2Var));
            }
        }
        this.f77826d.j();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var2 = this.f77826d;
        if (currentTimeMillis2 - n1Var2.f77806b.f77609k >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            r45.b57 b57Var = new r45.b57();
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = n1Var2.f77806b;
            b57Var.f370534d = a1Var.f77600b;
            b57Var.f370535e = a1Var.a();
            n1Var2.f77805a.b(com.tencent.mm.plugin.appbrand.debugger.y1.b(1001, b57Var));
        }
        if (this.f77826d.f77806b.d()) {
            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var3 = this.f77826d;
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = n1Var3.f77806b;
            if (currentTimeMillis2 - a1Var2.f77610l >= 30000) {
                n1Var3.i(a1Var2.a(), Integer.MAX_VALUE);
            }
        }
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var2 = this.f77826d.f77807c;
        l2Var2.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.h2(l2Var2));
    }
}
