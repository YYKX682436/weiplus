package ql2;

/* loaded from: classes10.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj4.e0 f446087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ql2.v f446088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ql2.u f446089c;

    public t(pj4.e0 e0Var, ql2.v vVar, ql2.u uVar) {
        this.f446087a = e0Var;
        this.f446088b = vVar;
        this.f446089c = uVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish get info:");
        pj4.e0 e0Var = this.f446087a;
        sb6.append(e0Var.f436563g);
        sb6.append(" result:");
        sb6.append(fVar.f152149b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder3rdLiveStatusService", sb6.toString());
        if (fVar.b() && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2)) != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            r45.g92 m59239x1309d228 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0).m59239x1309d228();
            ql2.v vVar = this.f446088b;
            java.util.Map map = vVar.f446096e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "access$getLiveShareCache$p(...)");
            map.put(e0Var.f436563g, m59239x1309d228);
            ql2.u uVar = this.f446089c;
            uVar.f446092e = m59239x1309d228;
            java.util.Iterator it = vVar.f446097f.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                jz5.l lVar = (jz5.l) next;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f384366d, e0Var.f436563g)) {
                    ql2.r rVar = (ql2.r) ((java.lang.ref.WeakReference) lVar.f384367e).get();
                    if (rVar != null) {
                        rVar.p(m59239x1309d228);
                    }
                    it.remove();
                }
            }
            uVar.r();
        }
        return jz5.f0.f384359a;
    }
}
