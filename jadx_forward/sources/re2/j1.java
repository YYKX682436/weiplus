package re2;

/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile re2.e0 f475971b;

    /* renamed from: a, reason: collision with root package name */
    public static final re2.j1 f475970a = new re2.j1();

    /* renamed from: c, reason: collision with root package name */
    public static final re2.i1 f475972c = new re2.i1();

    public final re2.e0 a() {
        java.lang.String str;
        re2.e0 y0Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        re2.e0 e0Var = f475971b;
        if (e0Var != null) {
            if (!e0Var.d()) {
                e0Var = null;
            }
            if (e0Var != null) {
                return e0Var;
            }
        }
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f410798g) == null) ? null : (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
        if (!(n0Var != null && n0Var.O6()) || f50Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ensureRestoredFromSlice: skip, curLiveContext=");
            sb6.append(dk2.ef.I != null);
            sb6.append(", isInCoLiveInvitation=");
            sb6.append(n0Var != null ? java.lang.Boolean.valueOf(n0Var.O6()) : null);
            sb6.append(", info=");
            sb6.append(f50Var != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", sb6.toString());
            return null;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = f50Var.f455550h;
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        if (n0Var.P6(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: [Initiator] invitationId=" + f50Var.f455546d);
            y0Var = new re2.h1(f50Var.f455548f, e17);
        } else {
            if (str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: invitee but no initiator username, skip");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: [Invitee] invitationId=" + f50Var.f455546d + ", initiator=" + str);
            y0Var = new re2.y0(str);
        }
        if (y0Var.f475922b != re2.a0.f475888d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(y0Var.c(), "restoreFrom: invalid phase=" + y0Var.f475922b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y0Var.c(), "restoreFrom: invitationId=" + f50Var.f455546d + ", status=" + f50Var.f455547e + ", role=" + f50Var.f455552m);
            y0Var.f475923c = f50Var.f455546d;
            y0Var.f475924d = f50Var;
            y0Var.f475925e = f50Var.f455553n;
            y0Var.f475926f = f50Var.f455551i;
            y0Var.j();
            int i17 = f50Var.f455547e;
            if (i17 == 1 || i17 == 4) {
                y0Var.f475922b = re2.a0.f475890f;
            } else if (y0Var.e()) {
                y0Var.f(4);
            } else {
                y0Var.b();
            }
        }
        b(y0Var);
        re2.e0 e0Var2 = y0Var.d() ? y0Var : null;
        if (e0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: restored task not alive, phase=" + y0Var.f475922b + ", invitationId=" + y0Var.f475923c);
        }
        return e0Var2;
    }

    public final void b(re2.e0 e0Var) {
        re2.e0 e0Var2 = f475971b;
        if (e0Var2 == e0Var) {
            return;
        }
        if (e0Var2 != null && e0Var2.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "set: destroy old alive task, invitationId=" + e0Var2.f475923c);
            e0Var2.a();
        }
        f475971b = e0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set: invitationId=");
        sb6.append(e0Var != null ? java.lang.Long.valueOf(e0Var.f475923c) : null);
        sb6.append(", phase=");
        sb6.append(e0Var != null ? e0Var.f475922b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", sb6.toString());
    }
}
