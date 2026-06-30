package dj5;

/* loaded from: classes.dex */
public final class m extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f314613d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f314614e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f314615f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f314616g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f314617h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f314618i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f314613d = jz5.h.b(dj5.g.f314601d);
        this.f314614e = new java.util.ArrayList();
        this.f314615f = jz5.h.b(new dj5.l(this));
        this.f314616g = jz5.h.b(new dj5.f(this));
        this.f314617h = jz5.h.b(new dj5.e(this));
        this.f314618i = jz5.h.b(new dj5.i(this));
    }

    public static final em.l2 T6(dj5.m mVar) {
        return (em.l2) ((jz5.n) mVar.f314615f).mo141623x754a37bb();
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f314614e;
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
            Q6.L2(m158354x19263085(), new dj5.h(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.ArrayList arrayList = this.f314614e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
