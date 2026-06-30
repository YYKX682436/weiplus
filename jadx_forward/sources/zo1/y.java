package zo1;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f556358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f, po1.d dVar) {
        super(0);
        this.f556357d = activityC12867x6b26c82f;
        this.f556358e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556357d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12867x6b26c82f.f174343s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC12867x6b26c82f.f174343s = null;
        fo1.p.f346423a.b(activityC12867x6b26c82f, this.f556358e, new zo1.x(activityC12867x6b26c82f));
        return jz5.f0.f384359a;
    }
}
