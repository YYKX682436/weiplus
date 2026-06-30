package yf2;

/* loaded from: classes3.dex */
public final class q extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f543302m;

    /* renamed from: n, reason: collision with root package name */
    public final int f543303n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f543302m = "Finder.FinderStartLiveGameStickerWidget";
        this.f543303n = 2345;
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6;
        r45.z53 z53Var;
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T7() && i17 == this.f543303n && (N6 = N6()) != null) {
            r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) getStore().m56796xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb();
            java.lang.String m75945x2fec8307 = (n73Var == null || (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) == null) ? null : z53Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                ke2.y yVar = new ke2.y(m75945x2fec8307, 0, false, null, false, null, 60, null);
                yVar.t(N6, N6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 800L);
                yVar.l().f(N6).K(new yf2.p(this, m75945x2fec8307));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }
}
