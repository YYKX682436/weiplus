package ao5;

/* loaded from: classes14.dex */
public final class z implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.tr trVar = (r45.tr) it.next();
                if (trVar.f386720e == 1) {
                    r45.w3 w3Var = new r45.w3();
                    w3Var.parseFrom(trVar.f386721f.f192156a);
                    r45.j4 j4Var = w3Var.f388826d;
                    if (j4Var.f377560g != 10002) {
                        continue;
                    } else {
                        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                        if (g17 == null) {
                            return;
                        }
                        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
                        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                        if (str == null) {
                            return;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onReceive] voipmsg by byp content ");
                        sb6.append(g17);
                        sb6.append(',');
                        sb6.append(w3Var.f388826d.f377565o);
                        com.tencent.mars.xlog.Log.i("VoipBypSyncHandler", sb6.toString());
                        if (!iq.b.H() || ((jp5.o) i95.n0.c(jp5.o.class)).ib()) {
                            jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
                            r45.j4 j4Var2 = w3Var.f388826d;
                            long j17 = j4Var2.f377565o;
                            java.lang.String str2 = j4Var2.f377558e.f372756d;
                            kotlin.jvm.internal.o.f(str2, "toString(...)");
                            oVar.e9(str, g17, j17, str2, er4.b.CONF_NOTIFY_FROM_BYPASS);
                        } else {
                            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.voipmt.invite");
                            if (str3 == null) {
                                str3 = "";
                            }
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            byte[] bytes = str3.getBytes(r26.c.f368865a);
                            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                            byte[] decode = android.util.Base64.decode(bytes, 0);
                            ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
                            if (com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n == null) {
                                com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n = new com.tencent.mm.plugin.multitalk.model.t1();
                            }
                            com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n.getClass();
                            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.L(decode, decode.length);
                        }
                    }
                }
            }
        }
    }
}
