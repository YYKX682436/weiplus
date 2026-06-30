package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes8.dex */
public class n8 implements xa1.b {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f167588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167589c;

    public n8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 c16091x79ac7403;
        this.f167589c = o6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o6Var, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
        java.lang.String str = u07.f158813f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = u07.f158812e;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = u07.f158811d;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = u07.f128811x;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = u07.f158816i;
        java.lang.String str10 = str9 == null ? "" : str9;
        if (u07.g()) {
            i95.m c17 = i95.n0.c(b70.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String key = com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260.f37025x233c02ec.a(4, 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            c16091x79ac7403 = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16090x79ac73fa(str2, str4, str6, str10, str8, 1, "", "", key);
        } else {
            i95.m c18 = i95.n0.c(b70.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            java.lang.String key2 = com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260.f37025x233c02ec.a(3, 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key2, "key");
            c16091x79ac7403 = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16091x79ac7403(str2, str4, str6, str10, str8, 1, "", "", key2);
        }
        this.f167588b = c16091x79ac7403;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xa1.b
    public void a(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167589c;
        if (o6Var.u0() == null || o6Var.u0().f158825e2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = this.f167588b;
        abstractC16085x8c838260.m65039xcd356818(i17);
        ((b70.f) abstractC16085x8c838260).mo9907x7be342b9(str);
        ((d73.i) i95.n0.c(d73.i.class)).f6(abstractC16085x8c838260);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xa1.b
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167589c;
        if (o6Var.a2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "is pre render mode, not handoff");
        } else {
            if (o6Var.u0() == null || o6Var.u0().f158825e2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = this.f167588b;
            ((b70.f) abstractC16085x8c838260).mo9907x7be342b9(str);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(abstractC16085x8c838260);
        }
    }

    @Override // xa1.b
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167589c;
        if (o6Var.a2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "is pre render mode, not delete handoff");
        } else {
            if (o6Var.u0() == null || o6Var.u0().f158825e2) {
                return;
            }
            ((d73.i) i95.n0.c(d73.i.class)).A8(this.f167588b.getKey());
        }
    }
}
