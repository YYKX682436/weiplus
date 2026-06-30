package on2;

/* loaded from: classes3.dex */
public final class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f428518b;

    public p2(on2.z2 z2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f428517a = z2Var;
        this.f428518b = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String sb6;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean e17 = xg2.g.e(fVar);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f428518b;
        if (e17) {
            int m75939xb282bd08 = ((r45.dt1) fVar.f152151d).m75939xb282bd08(3);
            on2.z2 z2Var = this.f428517a;
            r45.dt1 dt1Var = (r45.dt1) z2Var.f428622g.mo3195x754a37bb();
            int i17 = 0;
            if (m75939xb282bd08 >= (dt1Var != null ? dt1Var.m75939xb282bd08(3) : 0)) {
                z2Var.f428622g.mo7808x76db6cb1(fVar.f152151d);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getLotteryPanelInfo resp,");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                r45.dt1 dt1Var2 = (r45.dt1) resp;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("item_list:");
                java.util.LinkedList m75941xfb821914 = dt1Var2.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItem_list(...)");
                if (m75941xfb821914.isEmpty()) {
                    sb6 = "";
                } else {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    for (java.lang.Object obj2 : m75941xfb821914) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        sb10.append("[index:" + i17 + ",item:" + pm0.b0.g((r45.dz1) obj2) + ']');
                        i17 = i18;
                    }
                    sb6 = sb10.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, "toString(...)");
                }
                sb9.append(sb6);
                sb9.append(";\n");
                sb8.append(sb9.toString());
                sb8.append("location_id:" + dt1Var2.m75939xb282bd08(2) + ';');
                java.lang.String sb11 = sb8.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb11, "toString(...)");
                sb7.append(sb11);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", sb7.toString());
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMFinder.LiveLotterySlice", "getLotteryPanelInfo fail:" + fVar.f152149b + ',' + fVar.f152148a + ',' + fVar.f152150c + ",data_version:" + ((r45.dt1) fVar.f152151d).m75939xb282bd08(3));
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        return jz5.f0.f384359a;
    }
}
