package sv2;

/* loaded from: classes10.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sv2.q f494874b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, sv2.q qVar) {
        this.f494873a = c14994x9b99c079;
        this.f494874b = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494873a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76380xa79132f3(fVar.f152148a);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b72 != null) {
            c19783xd9a946b72.m76379xa78951a6(fVar.f152149b);
        }
        cu2.o oVar = cu2.o.f303963a;
        sv2.q qVar = this.f494874b;
        oVar.b(qVar.f494876h);
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            qVar.f494880o = new sv2.c(qVar.f494876h, 2);
            qVar.f494881p.countDown();
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f494878m, "dumpcgi, waitType:" + ((r45.h31) fVar.f152151d).m75939xb282bd08(2) + " url:" + ((r45.h31) fVar.f152151d).m75945x2fec8307(0) + ", thumbUrl:" + ((r45.h31) fVar.f152151d).m75945x2fec8307(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = qVar.f494879n;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c0792.getFeedObject().m76802x2dd01666();
        if (m76802x2dd016662 != null && (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
            java.lang.String m75945x2fec8307 = ((r45.h31) fVar.f152151d).m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c19788xd7cfd73e.m76678xca029dad(m75945x2fec8307);
            java.lang.String m75945x2fec83072 = ((r45.h31) fVar.f152151d).m75945x2fec8307(1);
            c19788xd7cfd73e.m76676xd3f7e23b(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c14994x9b99c0792.getFeedObject().m76802x2dd01666();
        if ((m76802x2dd016663 != null ? m76802x2dd016663.m76943xbb439a28() : null) == null && (m76802x2dd01666 = c14994x9b99c0792.getFeedObject().m76802x2dd01666()) != null) {
            m76802x2dd01666.m76981x8b564c9c(new r45.zw0());
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = c14994x9b99c0792.getFeedObject().m76802x2dd01666();
        r45.zw0 m76943xbb439a28 = m76802x2dd016664 != null ? m76802x2dd016664.m76943xbb439a28() : null;
        if (m76943xbb439a28 != null) {
            m76943xbb439a28.set(0, java.lang.Integer.valueOf(((r45.h31) fVar.f152151d).m75939xb282bd08(2)));
        }
        return java.lang.Boolean.valueOf(qVar.k());
    }
}
