package cb1;

/* loaded from: classes7.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f121820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f121821c;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, cb1.j0 j0Var, fl1.g1 g1Var) {
        this.f121819a = v5Var;
        this.f121820b = j0Var;
        this.f121821c = g1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        eb1.d bf6;
        r45.pw6 pw6Var;
        java.lang.String str;
        r45.jv5 jv5Var;
        java.lang.String str2;
        r45.jv5 jv5Var2;
        java.lang.String str3;
        nm5.b bVar = (nm5.b) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 component = this.f121819a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        eb1.c cVar = (eb1.c) component.q(eb1.c.class);
        if (cVar == null || (bf6 = cVar.bf(component)) == null) {
            bf6 = eb1.b.f332240a.bf(component);
        }
        eb1.d dVar = bf6;
        vi1.l2 l2Var = vi1.l2.f518934a;
        java.lang.String mo48798x74292566 = component.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(mo48798x74292566);
        cb1.p pVar = new cb1.p(component);
        cb1.j0 j0Var = this.f121820b;
        j0Var.getClass();
        java.util.Collection collection = bVar != null ? (java.util.List) bVar.a(0) : null;
        cb1.i iVar = bVar != null ? (cb1.i) bVar.a(1) : null;
        km5.b c17 = km5.u.c();
        fl1.g2 mo50353x784fb1e3 = component.mo50353x784fb1e3();
        if (mo50353x784fb1e3 != null) {
            mo50353x784fb1e3.a(this.f121821c);
        }
        java.lang.String str4 = ((k91.z0) component.b(k91.z0.class)).f387374d;
        if (str4 == null) {
            str4 = "";
        }
        dVar.mo2001xce3d2713(str4);
        java.lang.String str5 = ((k91.z0) component.b(k91.z0.class)).f387376f;
        dVar.mo2006x12ec1b74(str5 != null ? str5 : "");
        if (iVar != null && (jv5Var2 = iVar.f121785a) != null && (str3 = jv5Var2.f459669i) != null) {
            dVar.mo2004x25fbcd47(str3);
        }
        if (iVar != null && (jv5Var = iVar.f121785a) != null && (str2 = jv5Var.f459665e) != null) {
            dVar.mo2003xb6e62716(str2);
        }
        if (iVar != null && (str = iVar.f121787c) != null) {
            dVar.mo2002x2c9d82b4(str);
        }
        dVar.mo2010x1be4cf8d(new cb1.x(a17, c17));
        dVar.mo2009xb401a3bb(new cb1.y(a17, c17));
        dVar.mo2007xb0af2a49(new cb1.z(pVar));
        dVar.mo2008x588d8f37(new cb1.c0(a17, component, dVar));
        dVar.mo2012x52ce4bd1(new cb1.f0(a17, component, dVar));
        dVar.mo2013x505f4ddc(new cb1.h0(a17, dVar, component, iVar, c17));
        if (j0Var.C(component, iVar)) {
            dVar.f(true);
            dVar.mo2011x5d5ef7d6(new cb1.w(a17, dVar, component, iVar));
        } else {
            dVar.f(false);
        }
        java.util.ArrayList arrayList = collection instanceof java.util.ArrayList ? (java.util.ArrayList) collection : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        dVar.mo2014xae77f4f4(arrayList);
        if (iVar != null && (pw6Var = iVar.f121788d) != null && pw6Var.f464973d) {
            java.lang.String wording = pw6Var.f464974e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wording, "wording");
            if (!r26.n0.N(wording)) {
                java.lang.String wording2 = pw6Var.f464974e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wording2, "wording");
                dVar.mo2015xf085c78(wording2);
                dVar.mo2005x1f85dcf7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) component.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class));
            }
        }
        dVar.r(component);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("ok", new java.lang.Object[0]);
    }
}
