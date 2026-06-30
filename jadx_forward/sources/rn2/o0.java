package rn2;

/* loaded from: classes3.dex */
public final class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479342d;

    public o0(rn2.c1 c1Var) {
        this.f479342d = c1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        gk2.e eVar = gk2.e.f354004n;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T) {
            i17 = 3;
        } else {
            gk2.e eVar2 = gk2.e.f354004n;
            if (eVar2 != null && ((mm2.n0) eVar2.a(mm2.n0.class)).f410806r) {
                z17 = true;
            }
            i17 = z17 ? 16 : 1;
        }
        intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", i17);
        intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", this.f479342d.f479210t);
        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", this.f479342d.f479211u);
        gk2.e eVar3 = gk2.e.f354004n;
        intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).f410385o : null);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, this.f479342d.f479197d, intent, 0L, null, 0, 0, false, 124, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Oj(this.f479342d.f479197d, intent, true);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409132o, "");
        return true;
    }
}
