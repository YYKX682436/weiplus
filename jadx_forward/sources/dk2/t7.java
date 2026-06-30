package dk2;

/* loaded from: classes3.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f315644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(ce2.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315644d = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.t7(this.f315644d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dk2.t7 t7Var = (dk2.t7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.oa0 F0;
        r45.oa0 oa0Var;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dk2.u7 u7Var = dk2.u7.f315714a;
        if (dk2.ef.f314937s) {
            ce2.i iVar = this.f315644d;
            r45.na0 D0 = iVar.D0();
            if (D0 != null) {
                u7Var.c("fetchCustomGiftResource", iVar, D0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "fetchCustomGiftResource resourceList size:" + D0.m75941xfb821914(2).size() + ",lazyLoadCustomGiftPagResource:" + dk2.ef.f314938t);
                java.util.LinkedList m75941xfb821914 = D0.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getResource_list(...)");
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.oa0 oa0Var2 = (r45.oa0) it.next();
                    if (dk2.ef.f314938t) {
                        oa0Var = oa0Var2;
                        i17 = 0;
                        str = "field_rewardProductId";
                        str2 = "field_name";
                    } else {
                        r45.gs5 gs5Var = (r45.gs5) oa0Var2.m75936x14adae67(3);
                        java.lang.String m75945x2fec8307 = gs5Var != null ? gs5Var.m75945x2fec8307(0) : null;
                        java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
                        java.lang.String field_name = iVar.f67809x225f1eb0;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
                        oa0Var = oa0Var2;
                        i17 = 0;
                        str = "field_rewardProductId";
                        u7Var.d(m75945x2fec8307, field_rewardProductId, field_name, false, false);
                        r45.gs5 gs5Var2 = (r45.gs5) oa0Var.m75936x14adae67(4);
                        java.lang.String m75945x2fec83072 = gs5Var2 != null ? gs5Var2.m75945x2fec8307(0) : null;
                        java.lang.String str3 = iVar.f67814x2c488eb6;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, str);
                        java.lang.String field_name2 = iVar.f67809x225f1eb0;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name2, "field_name");
                        str2 = "field_name";
                        u7Var.d(m75945x2fec83072, str3, field_name2, false, true);
                    }
                    r45.gs5 gs5Var3 = (r45.gs5) oa0Var.m75936x14adae67(2);
                    java.lang.String m75945x2fec83073 = gs5Var3 != null ? gs5Var3.m75945x2fec8307(i17) : null;
                    java.lang.String str4 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, str);
                    java.lang.String str5 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, str2);
                    u7Var.d(m75945x2fec83073, str4, str5, true, false);
                    r45.gs5 gs5Var4 = (r45.gs5) oa0Var.m75936x14adae67(5);
                    java.lang.String m75945x2fec83074 = gs5Var4 != null ? gs5Var4.m75945x2fec8307(i17) : null;
                    java.lang.String str6 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, str);
                    java.lang.String str7 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, str2);
                    u7Var.d(m75945x2fec83074, str6, str7, true, false);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchCustomGiftResource ");
                    sb6.append(iVar.f67809x225f1eb0);
                    sb6.append(" animation is null:");
                    r45.gs5 gs5Var5 = (r45.gs5) oa0Var.m75936x14adae67(3);
                    java.lang.String m75945x2fec83075 = gs5Var5 != null ? gs5Var5.m75945x2fec8307(i17) : null;
                    boolean z17 = 1;
                    z17 = 1;
                    sb6.append((m75945x2fec83075 == null || m75945x2fec83075.length() == 0) ? 1 : i17);
                    sb6.append(",landscape_animation is null:");
                    r45.gs5 gs5Var6 = (r45.gs5) oa0Var.m75936x14adae67(4);
                    java.lang.String m75945x2fec83076 = gs5Var6 != null ? gs5Var6.m75945x2fec8307(i17) : null;
                    if (m75945x2fec83076 != null && m75945x2fec83076.length() != 0) {
                        z17 = i17;
                    }
                    sb6.append(z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
                }
                if (dk2.ef.f314938t && (F0 = iVar.F0(iVar.y0())) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "fetchCustomGiftResource default resource:" + pm0.b0.g(F0));
                    r45.gs5 gs5Var7 = (r45.gs5) F0.m75936x14adae67(3);
                    java.lang.String m75945x2fec83077 = gs5Var7 != null ? gs5Var7.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId2 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId2, "field_rewardProductId");
                    java.lang.String field_name3 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name3, "field_name");
                    u7Var.d(m75945x2fec83077, field_rewardProductId2, field_name3, false, false);
                    r45.gs5 gs5Var8 = (r45.gs5) F0.m75936x14adae67(4);
                    java.lang.String m75945x2fec83078 = gs5Var8 != null ? gs5Var8.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId3 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId3, "field_rewardProductId");
                    java.lang.String field_name4 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name4, "field_name");
                    u7Var.d(m75945x2fec83078, field_rewardProductId3, field_name4, false, true);
                }
                r45.gs5 gs5Var9 = (r45.gs5) D0.m75936x14adae67(5);
                java.lang.String m75945x2fec83079 = gs5Var9 != null ? gs5Var9.m75945x2fec8307(0) : null;
                java.lang.String field_rewardProductId4 = iVar.f67814x2c488eb6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId4, "field_rewardProductId");
                java.lang.String field_name5 = iVar.f67809x225f1eb0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name5, "field_name");
                u7Var.d(m75945x2fec83079, field_rewardProductId4, field_name5, false, false);
                r45.gs5 gs5Var10 = (r45.gs5) D0.m75936x14adae67(6);
                java.lang.String m75945x2fec830710 = gs5Var10 != null ? gs5Var10.m75945x2fec8307(0) : null;
                java.lang.String field_rewardProductId5 = iVar.f67814x2c488eb6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId5, "field_rewardProductId");
                java.lang.String field_name6 = iVar.f67809x225f1eb0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name6, "field_name");
                u7Var.d(m75945x2fec830710, field_rewardProductId5, field_name6, false, true);
                r45.gs5 gs5Var11 = (r45.gs5) D0.m75936x14adae67(4);
                java.lang.String m75945x2fec830711 = gs5Var11 != null ? gs5Var11.m75945x2fec8307(0) : null;
                java.lang.String field_rewardProductId6 = iVar.f67814x2c488eb6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId6, "field_rewardProductId");
                java.lang.String field_name7 = iVar.f67809x225f1eb0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name7, "field_name");
                u7Var.d(m75945x2fec830711, field_rewardProductId6, field_name7, true, false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "fetchCustomGiftResource but disable!");
        }
        return jz5.f0.f384359a;
    }
}
