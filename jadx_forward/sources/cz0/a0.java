package cz0;

/* loaded from: classes5.dex */
public final class a0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.r2 r2Var = event.f135586g;
        if (r2Var.f89292a == 103) {
            int i17 = r2Var.f89293b;
            java.lang.String str = r2Var.f89294c;
            boolean z17 = r2Var.f89296e;
            int i18 = r2Var.f89295d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSdkResEventListener", "get res version:" + i18 + " subtype:" + i17 + " path:" + str + " updated:" + z17);
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MassSdkResEventListener", "download failed: path is null, subtype=" + i17 + " version=" + i18);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f26181 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
                c6712x32f26181.f140536d = cz0.y.f306503b;
                c6712x32f26181.f140539g = 7;
                c6712x32f26181.f140540h = i17;
                c6712x32f26181.f140538f = 0;
                c6712x32f26181.f140544l = 2;
                bz0.k.a(c6712x32f26181, false);
            } else if (z17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f261812 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
                int i19 = cz0.y.f306503b;
                c6712x32f261812.f140536d = i19;
                c6712x32f261812.f140539g = 7;
                c6712x32f261812.f140540h = i17;
                c6712x32f261812.f140538f = 1;
                c6712x32f261812.f140544l = 2;
                c6712x32f261812.f140542j = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSdkResEventListener", "download success: subtype=" + i17 + " version=" + i18);
                c6712x32f261812.k();
                jz5.l j17 = cz0.y.f306502a.j(i17, str, 2);
                boolean booleanValue = ((java.lang.Boolean) j17.f384366d).booleanValue();
                cz0.k kVar = (cz0.k) j17.f384367e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unzipRes isSuccess:");
                sb6.append(booleanValue);
                sb6.append(" SdkCompatVersion:");
                sb6.append(i19);
                sb6.append(" compatVersion:");
                sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f306482b) : null);
                sb6.append(" resVersion:");
                sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f306483c) : null);
                sb6.append(" baseVersion:");
                sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f306484d) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSdkResEventListener", sb6.toString());
                if (booleanValue) {
                    if (kVar != null && kVar.f306482b == i19) {
                        i95.m c17 = i95.n0.c(zy.r.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ((yy.a) ((zy.r) c17)).Ri(103, i17, -1);
                    }
                }
            }
        }
        return false;
    }
}
