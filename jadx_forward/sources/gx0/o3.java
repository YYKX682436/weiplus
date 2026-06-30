package gx0;

/* loaded from: classes5.dex */
public final class o3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f358318d;

    public o3(gx0.y3 y3Var) {
        this.f358318d = y3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ex0.v vVar;
        ex0.v vVar2;
        ex0.v vVar3;
        int itemId = menuItem.getItemId();
        gx0.y3 y3Var = this.f358318d;
        if (itemId == 1) {
            ex0.a0 A7 = y3Var.A7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c17 = (A7 == null || (vVar = A7.f338630g) == null) ? null : vVar.c();
            if (c17 == null) {
                return;
            }
            java.lang.Object V6 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.V6(y3Var, "key_dest_segment_id", null, 2, null);
            ex0.f n76 = y3Var.n7(V6 instanceof com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) V6 : null);
            if (n76 == null) {
                return;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = n76.k().add(n76.j());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(add, "add(...)");
            n76.z(add);
            n76.y(c17);
            p3325xe03a0797.p3326xc267989b.l.d(y3Var.m158345xefc66565(), null, null, new gx0.w2(y3Var, null), 3, null);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ex0.a0 A72 = y3Var.A7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c18 = (A72 == null || (vVar3 = A72.f338630g) == null) ? null : vVar3.c();
        if (c18 == null) {
            return;
        }
        java.lang.Object V62 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.V6(y3Var, "key_dest_segment_id", null, 2, null);
        ex0.f n77 = y3Var.n7(V62 instanceof com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) V62 : null);
        if (n77 == null) {
            return;
        }
        ex0.a0 A73 = y3Var.A7();
        ex0.r f17 = (A73 == null || (vVar2 = A73.f338630g) == null) ? null : vVar2.f(y3Var.z7().h7());
        if (f17 == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add2 = n77.k().add(n77.j());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(add2, "add(...)");
        n77.z(add2);
        n77.y(c18);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = f17.l().m34007xde00a612();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a612, "getEndTime(...)");
        n77.y(m34007xde00a612);
        n77.z(f17.i());
        p3325xe03a0797.p3326xc267989b.l.d(y3Var.m158345xefc66565(), null, null, new gx0.v2(y3Var, null), 3, null);
    }
}
