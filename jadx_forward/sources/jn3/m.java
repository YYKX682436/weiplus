package jn3;

/* loaded from: classes8.dex */
public final class m extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jn3.h f382323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f382323f = new jn3.h();
    }

    @Override // jm0.g
    public void N6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).aj();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).Zi();
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotFSC", "onAccountInit");
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f382323f);
        g92.b bVar = g92.b.f351302e;
        bVar.h6().f406519i.add(new jn3.j(this));
        bVar.h6().f406518h.add(new jn3.k(this));
        O6(new jn3.l(this));
    }

    @Override // jm0.g
    public void Q6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        T6(4, 1006, 3, false, null);
    }

    @Override // jm0.g
    public void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotFSC", "onAccountRelease");
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f382323f);
    }

    public final void T6(int i17, int i18, int i19, boolean z17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeSync, bizType: ");
        sb6.append(i17);
        sb6.append(", syncScene: ");
        sb6.append(i18);
        sb6.append(", shouldCheckConfig: ");
        sb6.append(z17);
        sb6.append(", contextBufferSize: ");
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotFSC", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a Bi = this.f381800d.Bi();
        if (Bi != null) {
            v65.i.b(Bi, null, new jn3.i(z17, i17, i19, i18, str, null), 1, null);
        }
    }
}
