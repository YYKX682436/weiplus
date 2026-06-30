package ao5;

/* loaded from: classes14.dex */
public final class z implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.tr trVar = (r45.tr) it.next();
                if (trVar.f468253e == 1) {
                    r45.w3 w3Var = new r45.w3();
                    w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                    r45.j4 j4Var = w3Var.f470359d;
                    if (j4Var.f459093g != 10002) {
                        continue;
                    } else {
                        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                        if (g17 == null) {
                            return;
                        }
                        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
                        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                        if (str == null) {
                            return;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onReceive] voipmsg by byp content ");
                        sb6.append(g17);
                        sb6.append(',');
                        sb6.append(w3Var.f470359d.f459098o);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBypSyncHandler", sb6.toString());
                        if (!iq.b.H() || ((jp5.o) i95.n0.c(jp5.o.class)).ib()) {
                            jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
                            r45.j4 j4Var2 = w3Var.f470359d;
                            long j17 = j4Var2.f459098o;
                            java.lang.String str2 = j4Var2.f459091e.f454289d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
                            oVar.e9(str, g17, j17, str2, er4.b.CONF_NOTIFY_FROM_BYPASS);
                        } else {
                            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.voipmt.invite");
                            if (str3 == null) {
                                str3 = "";
                            }
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            byte[] bytes = str3.getBytes(r26.c.f450398a);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                            byte[] decode = android.util.Base64.decode(bytes, 0);
                            ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ai().f231475n == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ai().f231475n = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t1();
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ai().f231475n.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.L(decode, decode.length);
                        }
                    }
                }
            }
        }
    }
}
