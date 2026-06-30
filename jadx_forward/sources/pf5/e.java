package pf5;

/* loaded from: classes5.dex */
public class e extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: lifecycleScope */
    private final p3325xe03a0797.p3326xc267989b.y0 f76418xa75f790a = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: mainScope */
    private final p3325xe03a0797.p3326xc267989b.y0 f76419xf058f41b = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));

    /* renamed from: launch$default */
    public static /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 m158343xd39de650(pf5.e eVar, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        return eVar.m158346xbdd923b3(lVar, a1Var, pVar);
    }

    /* renamed from: launchUI$default */
    public static /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 m158344xbe96bc24(pf5.e eVar, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchUI");
        }
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        return eVar.m158347xac1f0d87(lVar, a1Var, pVar);
    }

    /* renamed from: getLifecycleScope */
    public p3325xe03a0797.p3326xc267989b.y0 mo144225x95f74600() {
        return this.f76418xa75f790a;
    }

    /* renamed from: getMainScope */
    public p3325xe03a0797.p3326xc267989b.y0 m158345xefc66565() {
        return this.f76419xf058f41b;
    }

    /* renamed from: launch */
    public final p3325xe03a0797.p3326xc267989b.r2 m158346xbdd923b3(oz5.l context, p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.c(mo144225x95f74600(), context, start, block);
    }

    /* renamed from: launchUI */
    public final p3325xe03a0797.p3326xc267989b.r2 m158347xac1f0d87(oz5.l context, p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.c(m158345xefc66565(), context, start, block);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        p3325xe03a0797.p3326xc267989b.z0.d(mo144225x95f74600(), this + " onCleared.", null, 2, null);
        p3325xe03a0797.p3326xc267989b.z0.d(m158345xefc66565(), this + " onCleared.", null, 2, null);
    }
}
