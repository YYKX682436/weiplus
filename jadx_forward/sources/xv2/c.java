package xv2;

/* loaded from: classes10.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f538932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv2.e f538933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ db2.p2 f538934c;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, xv2.e eVar, db2.p2 p2Var) {
        this.f538932a = c14994x9b99c079;
        this.f538933b = eVar;
        this.f538934c = p2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f538932a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76380xa79132f3(fVar.f152148a);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b72 != null) {
            c19783xd9a946b72.m76379xa78951a6(fVar.f152149b);
        }
        cu2.u.f303974a.l(c14994x9b99c079);
        int i17 = fVar.f152148a;
        xv2.e eVar = this.f538933b;
        if (i17 != 0 || fVar.f152149b != 0) {
            eVar.f538939n = new tv2.x(eVar.f538936h, 2);
            eVar.f538940o.countDown();
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f538938m, "dumpcgi, waitType:" + ((r45.h31) fVar.f152151d).m75939xb282bd08(2) + " url:" + ((r45.h31) fVar.f152151d).m75945x2fec8307(0) + ", thumbUrl:" + ((r45.h31) fVar.f152151d).m75945x2fec8307(1));
        db2.p2 p2Var = this.f538934c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56) p2Var.f309647w.m75936x14adae67(2);
        if (c19793xceab7f56 != null && (m76962x74cd162e = c19793xceab7f56.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
            java.lang.String m75945x2fec8307 = ((r45.h31) fVar.f152151d).m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c19788xd7cfd73e.m76678xca029dad(m75945x2fec8307);
            java.lang.String m75945x2fec83072 = ((r45.h31) fVar.f152151d).m75945x2fec8307(1);
            c19788xd7cfd73e.m76676xd3f7e23b(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        }
        p2Var.f309647w.set(23, java.lang.Integer.valueOf(((r45.h31) fVar.f152151d).m75939xb282bd08(2)));
        return java.lang.Boolean.valueOf(eVar.k(p2Var));
    }
}
