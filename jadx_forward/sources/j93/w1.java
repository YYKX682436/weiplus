package j93;

/* loaded from: classes.dex */
public final class w1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f380060d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f380061e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f380062f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f380063g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f380060d = jz5.h.b(j93.q1.f380016d);
        this.f380061e = new java.util.ArrayList();
        this.f380062f = jz5.h.b(new j93.u1(this));
        this.f380063g = jz5.h.b(new j93.v1(this));
    }

    public static final em.l2 T6(j93.w1 w1Var) {
        return (em.l2) ((jz5.n) w1Var.f380062f).mo141623x754a37bb();
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f380061e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new j93.r1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.ArrayList arrayList = this.f380061e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
