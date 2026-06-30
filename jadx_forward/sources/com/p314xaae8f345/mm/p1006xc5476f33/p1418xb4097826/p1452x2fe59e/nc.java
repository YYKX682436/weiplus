package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class nc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f190102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar) {
        super(1);
        this.f190102d = idVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar = this.f190102d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = idVar.f188536f;
        yw2.n nVar = idVar.f188543p;
        java.lang.Object obj2 = null;
        if (nVar != null) {
            android.content.Context context = nVar.f548192o;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            obj2 = context;
        }
        if (obj2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            int mo56041x7520bed6 = idVar.mo56041x7520bed6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
            if (mo56041x7520bed6 == 2 && c14994x9b99c079 != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                in5.s0 s0Var = idVar.f188542o;
                if (s0Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ni(s0Var, c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079);
                }
                so2.e2.f491861a.b(V6, 1, c14994x9b99c079, booleanValue, false, 2, (r25 & 64) != 0 ? false : false, (r25 & 128) != 0 ? false : false, (r25 & 256) != 0 ? false : false, (r25 & 512) != 0 ? null : null);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
                am.ia iaVar = c5445x963cab3.f135785g;
                iaVar.f88451a = m59251x5db1b11;
                iaVar.f88452b = 4;
                iaVar.f88455e = booleanValue ? 1 : 0;
                c5445x963cab3.e();
                int i17 = 3;
                if (booleanValue) {
                    idVar.f188546s++;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(pm0.v.u(c14994x9b99c079.m59251x5db1b11()));
                    sb6.append(",2,");
                    if (idVar.f188551x) {
                        i17 = 1;
                    } else if (!idVar.f188553z) {
                        i17 = 2;
                    }
                    sb6.append(i17);
                    g0Var.mo68478xbd3cda5f(20851, sb6.toString());
                } else {
                    idVar.f188546s--;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(pm0.v.u(c14994x9b99c079.m59251x5db1b11()));
                    sb7.append(",3,");
                    if (idVar.f188551x) {
                        i17 = 1;
                    } else if (!idVar.f188553z) {
                        i17 = 2;
                    }
                    sb7.append(i17);
                    g0Var2.mo68478xbd3cda5f(20851, sb7.toString());
                }
                idVar.o();
            }
        }
        return jz5.f0.f384359a;
    }
}
