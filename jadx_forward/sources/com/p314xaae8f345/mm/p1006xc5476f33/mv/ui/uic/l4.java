package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qr4 f232803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 f232804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ um3.b f232805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f232806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(r45.qr4 qr4Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var, um3.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var) {
        super(1);
        this.f232803d = qr4Var;
        this.f232804e = v4Var;
        this.f232805f = bVar;
        this.f232806g = c3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.qr4 qr4Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it6 = it.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            qr4Var = this.f232803d;
            if (!hasNext) {
                break;
            }
            gm3.c cVar = (gm3.c) it6.next();
            hashMap.put(cVar.f355076d, cVar);
            r45.jj2 jj2Var = new r45.jj2();
            jj2Var.set(2, cVar.f355076d);
            int i17 = 0;
            int i18 = cVar.f355077e;
            if (i18 != 1) {
                if (i18 == 2) {
                    jj2Var.set(0, 2);
                    gm3.b bVar = cVar.f355081i;
                    if (bVar != null && (c19792x256d2725 = bVar.f355075b) != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                        i17 = c19788xd7cfd73e.m76629x36bbd779();
                    }
                    jj2Var.set(1, java.lang.Integer.valueOf(i17 * 1000));
                    qr4Var.m75941xfb821914(1).add(jj2Var);
                } else if (i18 != 3) {
                }
            }
            gm3.a aVar = cVar.f355080h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = aVar != null ? aVar.f355071d : null;
            if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                jj2Var.set(0, 2);
                jj2Var.set(1, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219979x));
            } else {
                jj2Var.set(0, 1);
            }
            qr4Var.m75941xfb821914(1).add(jj2Var);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4297;
        lVar.f152199c = "/cgi-bin/micromsg-bin/musiclivegetbeatarrangement";
        lVar.f152197a = qr4Var;
        lVar.f152198b = new r45.rr4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = this.f232804e;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = v4Var.f233031r;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a18 = o01.d.f423424a.a(a17);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = this.f232805f.O6();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        v4Var.f233031r = p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k4(a18, this.f232804e, this.f232806g, hashMap, null), 2, null);
        return jz5.f0.f384359a;
    }
}
