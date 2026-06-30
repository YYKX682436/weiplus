package en3;

@j95.b(m140513x1e06fd29 = {e70.q.class})
/* loaded from: classes8.dex */
public final class v extends i95.w implements ra0.v {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f336857d = "MicroMsg.NewLife.NewLifeConfigFeatureService";

    static {
        kz5.c0.i(java.lang.Double.valueOf(0.75d), java.lang.Double.valueOf(1.0d), java.lang.Double.valueOf(1.3333333333333333d));
    }

    public boolean Ai() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U1).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public int Bi(r45.kv2 kv2Var) {
        if (kv2Var == null) {
            return 0;
        }
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_newlife_comment_egg_detail_and, 1) == 1)) {
            return kv2Var.m75939xb282bd08(6);
        }
        int m75939xb282bd08 = kv2Var.m75939xb282bd08(6);
        r45.mv4 mv4Var = (r45.mv4) kv2Var.m75936x14adae67(28);
        return m75939xb282bd08 + (mv4Var != null ? mv4Var.m75939xb282bd08(4) : 0);
    }

    public ra0.y Di() {
        if (wi()) {
            return (ra0.y) i95.n0.c(en3.u.class);
        }
        return null;
    }

    public j75.f Ni() {
        ra0.y Di;
        if (!wi() || (Di = Di()) == null) {
            return null;
        }
        return ((en3.l0) Di).Ai();
    }

    public boolean Ri() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.S1).mo141623x754a37bb()).r()).intValue() > 0;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        Di();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
    }

    public boolean wi() {
        boolean wi6 = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).wi();
        boolean z17 = ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi() && Ri();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f336857d, "canShowNewLifeSyncRedDot: isShowNewLifeEntry:false,isShowLongVide:" + wi6 + " , isShowLookOneLookEntry:" + z17 + ',');
        return z17 || wi6;
    }
}
