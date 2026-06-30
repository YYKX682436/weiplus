package jq4;

/* loaded from: classes14.dex */
public final class c1 extends jq4.y {
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a B;
    public java.lang.ref.WeakReference C = new java.lang.ref.WeakReference(null);

    @Override // jq4.z0
    public void h() {
        super.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
        if (gVar != null) {
            gVar.x(false);
        }
    }

    @Override // jq4.z0
    public void i(android.content.Intent intent, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        super.i(intent, toUser);
        android.view.View view = this.f382769e;
        if (view == null || !this.f382758z || this.f382782r == 3) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a) view.findViewById(com.p314xaae8f345.mm.R.id.kg9);
        c18930xb402610a.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
        if (gVar != null) {
            gVar.h(c18930xb402610a, 0);
        }
        this.B = c18930xb402610a;
        view.post(new jq4.a1(c18930xb402610a, view));
    }

    @Override // jq4.z0
    public boolean j() {
        return gq4.v.Bi().f258096f;
    }

    @Override // jq4.y, jq4.z0
    public void k(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (this.f382782r == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MircoMsg.VoipFloatCardManager", "onAccept, cardType is null, ignore");
            return;
        }
        super.k(intent);
        if (this.f382758z) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
            if (gVar != null) {
                gVar.i();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
        if (gVar2 != null) {
            gVar2.l();
        }
    }

    @Override // jq4.y, jq4.z0
    public void o() {
        if (this.f382782r == 1) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            jq4.b1 b1Var = new jq4.b1(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b1Var, 200L, false);
        }
    }

    @Override // jq4.z0
    public void r() {
        if (this.f382758z) {
            rq4.s.f480631a.a(this.f382771g, 3, 2);
        } else {
            rq4.s.f480631a.a(this.f382771g, 3, 1);
        }
        if (this.f382758z) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
            if (gVar != null) {
                gVar.r();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
        if (gVar2 != null) {
            gVar2.U();
        }
    }

    @Override // jq4.y
    public void x(android.content.Context context, android.content.Intent intent, long j17, int i17, boolean z17, java.lang.String toUser, boolean z18, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        this.f382782r = i18;
        this.f382758z = z17;
        if (i18 != 3) {
            gq4.v.wi().f447510k = false;
        }
        super.x(context, intent, j17, i17, z17, toUser, z18, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.C.get();
        if (gVar != null) {
            gVar.X(z17, false, toUser);
        }
    }
}
