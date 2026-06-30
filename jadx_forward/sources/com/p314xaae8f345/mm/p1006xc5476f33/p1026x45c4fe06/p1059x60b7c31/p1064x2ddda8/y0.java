package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f161324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 f161325e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042, java.util.LinkedList linkedList) {
        this.f161325e = c11999x85898042;
        this.f161324d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.util.LinkedList linkedList = this.f161324d;
        r45.jv5 jv5Var = (r45.jv5) linkedList.get(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y(jv5Var.f459664d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042 = this.f161325e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = c11999x85898042.f160864g.t3();
        boolean b17 = si1.d1.b(jv5Var.f459664d, t37.E0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = c11999x85898042.f160864g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z0(this, yVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.jv5 jv5Var2 = (r45.jv5) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jv5Var2, "<this>");
            arrayList.add(new ui1.b0(jv5Var2.f459664d, jv5Var2.f459665e, jv5Var2.f459666f, jv5Var2.f459667g, jv5Var2.f459668h, jv5Var2.f459669i, jv5Var2.f459670m));
            it = it;
            yVar = yVar;
            b17 = b17;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y yVar3 = yVar;
        boolean z18 = b17;
        ui1.z a17 = ui1.w.a(yVar2, z0Var, arrayList);
        a17.mo2026xce3d2713(t37.E0().f387374d);
        a17.mo2027xea2586cc(c11999x85898042.f160878x);
        a17.mo2039xb4c13ffe(jv5Var.f459665e);
        a17.mo2036xc499c596(c11999x85898042.f160879y);
        a17.mo2038xd611ee5a(c11999x85898042.f160880z);
        a17.mo2033x12ec1b74(c11999x85898042.f160877w);
        a17.mo2005x1f85dcf7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) c11999x85898042.f160864g.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class));
        if ((t37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37).u0().L1.c() : false) || !c11999x85898042.A || android.text.TextUtils.isEmpty(c11999x85898042.B)) {
            a17.o(false);
        } else {
            a17.o(true);
            a17.mo2028x78fb63c8(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a1(this, a17));
        }
        if ("scope.userInfo".equals(jv5Var.f459664d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a0 a0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c0.f160953a;
            android.content.Context f229340d = c11999x85898042.f160864g.getF229340d();
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str = c11999x85898042.C;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            a0Var.e(f229340d, com.p314xaae8f345.mm.p943x351df9c2.z.h(str, null, false), c11999x85898042.D, jv5Var.f459664d, a17);
            z17 = false;
        } else if (linkedList.size() > 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(new fl1.h1(1, ((r45.jv5) linkedList.get(0)).f459670m, ((r45.jv5) linkedList.get(0)).f459664d, true));
            for (int i17 = 1; i17 < linkedList.size(); i17++) {
                arrayList2.add(new fl1.h1(1, ((r45.jv5) linkedList.get(i17)).f459670m, ((r45.jv5) linkedList.get(i17)).f459664d, false));
            }
            z17 = false;
            a17.mo2032xf1caf25e(8);
            a17.mo2041x3f8132ef(arrayList2);
            a17.mo2040x53aeff12("");
        } else {
            z17 = false;
            a17.mo2040x53aeff12(jv5Var.f459664d);
        }
        if (!android.text.TextUtils.isEmpty(c11999x85898042.G)) {
            a17.mo2042x364e0e56(c11999x85898042.G);
        } else if (z18) {
            if (android.text.TextUtils.isEmpty(si1.d1.a(jv5Var.f459664d, t37))) {
                c11999x85898042.C("fail:require permission desc");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "error = fail:require permission desc");
                return;
            }
            a17.mo2042x364e0e56(si1.d1.a(jv5Var.f459664d, t37));
        }
        if (c11999x85898042.P.f161013d && (!r26.n0.N(r1.f161014e))) {
            z17 = true;
        }
        if (z17) {
            a17.mo2015xf085c78(c11999x85898042.P.f161014e);
            yVar3.f161321b = true;
            a17.mo2016x99ddcea6(new fl1.j2() { // from class: com.tencent.mm.plugin.appbrand.jsapi.auth.y0$$a
                @Override // fl1.j2
                public final void a() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y.this.f161322c = true;
                }
            });
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "Confirm dialog scope=%s desc =%s auth_desc=%s ext_desc=%s", jv5Var.f459664d, jv5Var.f459665e, jv5Var.f459668h, jv5Var.f459667g);
        c11999x85898042.R = true;
        a17.r(c11999x85898042.f160864g);
    }
}
