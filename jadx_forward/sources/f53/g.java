package f53;

/* loaded from: classes15.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f53.n f341183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 f341184b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864, f53.n nVar) {
        this.f341184b = c15901xbfc4864;
        this.f341183a = nVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeoneView", "do GetRemindUserListResponse errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        if (fVar2.f152148a == 0 && fVar2.f152149b == 0 && (fVar = fVar2.f152151d) != null) {
            ((java.util.LinkedList) this.f341184b.f221512l2).addAll(((o33.b) fVar).f424259d);
            ((java.util.LinkedList) this.f341184b.f221513m2).addAll(((o33.b) fVar2.f152151d).f424260e);
            if (((o33.b) fVar2.f152151d).f424262g) {
                f53.o oVar = f53.p.f341213d;
                if (oVar.a().size() != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864 = this.f341184b;
                    c15901xbfc4864.o1(c15901xbfc4864.f221512l2, oVar.a());
                    f53.n nVar = this.f341183a;
                    if (nVar != null) {
                        ((f53.c) nVar).a(true);
                    }
                } else {
                    this.f341184b.f221515o2.putByteArray("context", ((o33.b) fVar2.f152151d).f424261f.g());
                    this.f341184b.m1(this.f341183a);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc48642 = this.f341184b;
                c15901xbfc48642.o1(c15901xbfc48642.f221512l2, c15901xbfc48642.f221513m2);
                java.util.List normalFriends = this.f341184b.f221513m2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(normalFriends, "normalFriends");
                if (f53.p.f341214e == null) {
                    synchronized (f53.p.class) {
                        if (f53.p.f341214e == null) {
                            f53.p.f341214e = new f53.p(null);
                        }
                    }
                }
                f53.p pVar = f53.p.f341214e;
                if (pVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instance");
                    throw null;
                }
                pVar.f341215a = gm0.j1.b().h();
                f53.p pVar2 = f53.p.f341214e;
                if (pVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instance");
                    throw null;
                }
                pVar2.f341216b = normalFriends;
                f53.p pVar3 = f53.p.f341214e;
                if (pVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instance");
                    throw null;
                }
                pVar3.f341217c = java.lang.System.currentTimeMillis();
                f53.n nVar2 = this.f341183a;
                if (nVar2 != null) {
                    ((f53.c) nVar2).a(true);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AtSomeoneView", "cgi request fail");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc48643 = this.f341184b;
            c15901xbfc48643.o1(c15901xbfc48643.f221512l2, f53.p.f341213d.a());
        }
        return null;
    }
}
