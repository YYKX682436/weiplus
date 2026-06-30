package ht1;

/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Object m143895xf1229813;
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.j1 j1Var = event.f135552g;
        if (j1Var.f88525a != 11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypCommonBizEventListener", "skipped an event that is not of a BypNotifyActionEvent.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypCommonBizEventListener", "Received a BypNotifyActionEvent.");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            r45.fo5 fo5Var = new r45.fo5();
            fo5Var.mo11468x92b714fd(j1Var.f88526b);
            long j17 = fo5Var.f456025d;
            jz5.f0 f0Var = null;
            if (j17 > 0) {
                hashSet = new java.util.HashSet();
                int i17 = 0;
                while (true) {
                    long j18 = 1 << i17;
                    if (j18 > j17) {
                        break;
                    }
                    if ((j18 & j17) > 0) {
                        hashSet.add(java.lang.Integer.valueOf(i17));
                    }
                    i17++;
                }
            } else {
                hashSet = null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = fo5Var.f456026e;
            byte[] bArr = gVar != null ? gVar.f273689a : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("onDispatch BYPCommonEvent, bizTypeSet: ");
            sb6.append(hashSet);
            sb6.append(", dataBytes: ");
            sb6.append(bArr != null ? kz5.z.v0(bArr) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypCommonBizEventListener", sb6.toString());
            if (hashSet != null) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    java.util.List list = lt1.p.f402723a;
                    lt1.e eVar = (lt1.e) ((java.util.Map) ((jz5.n) lt1.p.f402724b).mo141623x754a37bb()).get(java.lang.Integer.valueOf(intValue));
                    if (eVar != null && eVar.a()) {
                        ((kt1.z) ((ct1.w) i95.n0.c(ct1.w.class))).Ai(bArr, intValue, 3);
                    } else if (intValue != 0) {
                        if (intValue == 1) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5217x2bbc51b5 c5217x2bbc51b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5217x2bbc51b5();
                            c5217x2bbc51b5.f135551g.f88425a = bArr;
                            c5217x2bbc51b5.e();
                        } else if (intValue == 2) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5208x21fb95ff c5208x21fb95ff = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5208x21fb95ff();
                            c5208x21fb95ff.f135548g.f88158a = true;
                            c5208x21fb95ff.e();
                        } else if (intValue == 3) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5208x21fb95ff c5208x21fb95ff2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5208x21fb95ff();
                            c5208x21fb95ff2.f135548g.f88158a = false;
                            c5208x21fb95ff2.e();
                        } else if (intValue == 4) {
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2().e();
                        } else if (intValue == 5) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5215x3fde532c c5215x3fde532c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5215x3fde532c();
                            c5215x3fde532c.f135550g.f88338a = fo5Var.f456026e.f273689a;
                            c5215x3fde532c.e();
                        } else if (intValue == 7) {
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5216x2580ba3f().e();
                        } else if (intValue == 27) {
                            i95.m c17 = i95.n0.c(zy2.y9.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            ((c61.k8) ((zy2.y9) c17)).wi(fo5Var.f456026e, "MicroMsg.BypCommonBizEventListener");
                        } else if (intValue == 9) {
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5212x2c470ec7().e();
                        } else if (intValue == 10) {
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5210xf1f3f327().e();
                        } else if (intValue == 18) {
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5209x21de1f1d().e();
                        } else if (intValue == 19) {
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5211x107ec8e8().e();
                        } else if (intValue == 21) {
                            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).mj();
                        } else if (intValue != 22) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BypCommonBizEventListener", "onDispatch BYPCommonEvent, unsupported bizType: " + intValue);
                        } else {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd c5213x5fcd2dcd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd();
                            c5213x5fcd2dcd.f135549g.f88260a = fo5Var.f456026e.f273689a;
                            c5213x5fcd2dcd.e();
                        }
                    }
                }
                f0Var = jz5.f0.f384359a;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BypCommonBizEventListener", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
        return true;
    }
}
