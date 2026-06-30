package mm2;

/* loaded from: classes3.dex */
public final class n0 extends mm2.e {
    public static volatile boolean A6;

    /* renamed from: u, reason: collision with root package name */
    public static volatile r45.f50 f410793u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile r45.e50 f410794v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile r45.a84 f410795w;

    /* renamed from: x, reason: collision with root package name */
    public static volatile int f410796x;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410797f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410798g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410799h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410800i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410801m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410802n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410803o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410804p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f410805q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f410806r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f410807s;

    /* renamed from: t, reason: collision with root package name */
    public volatile mm2.m0 f410808t;

    /* renamed from: z6, reason: collision with root package name */
    public volatile boolean f410809z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f410797f = a17;
        this.f410798g = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a17);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f410799h = a18;
        this.f410800i = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a18);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a19 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f410801m = a19;
        this.f410802n = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a19);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f410803o = a27;
        this.f410804p = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a27);
        this.f410808t = mm2.m0.f410763d;
        r45.f50 f50Var = f410793u;
        f410793u = null;
        if (f50Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "consume pending invitation info on init, invitationId=" + f50Var.f455546d + ", status=" + f50Var.f455547e);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) a17).k(f50Var);
            java.lang.String str = f50Var.f455553n;
            if (str != null) {
                str = str.length() > 0 ? str : null;
                if (str != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) a18).k(str);
                }
            }
        }
        r45.e50 e50Var = f410794v;
        f410794v = null;
        if (e50Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "consume pending anchor permission on init");
            R6(e50Var);
        }
        r45.a84 a84Var = f410795w;
        f410795w = null;
        if (a84Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consume pending co author info on init, url=");
            java.lang.String m75945x2fec8307 = a84Var.m75945x2fec8307(0);
            sb6.append(m75945x2fec8307 != null ? r26.p0.E0(m75945x2fec8307, 80) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", sb6.toString());
            S6(a84Var);
        }
        int i17 = f410796x;
        f410796x = 0;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        valueOf = valueOf.intValue() > 0 ? valueOf : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "consume pending max invitee count on init, count=" + intValue);
            this.f410805q = intValue;
        }
        boolean z17 = A6;
        A6 = false;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean bool = valueOf2.booleanValue() ? valueOf2 : null;
        if (bool != null) {
            bool.booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "consume pending onlySupportInitiatorSettlement on init");
            this.f410809z6 = true;
        }
    }

    public final void N6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "clearInvitation");
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410797f).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410799h).k(null);
        this.f410808t = mm2.m0.f410763d;
    }

    public final boolean O6() {
        r45.f50 f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410797f).mo144003x754a37bb();
        if (f50Var == null || f50Var.f455546d == 0) {
            return false;
        }
        int i17 = f50Var.f455547e;
        if (i17 != 0 && i17 != 2 && i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "isInCoLiveInvitation=false, status=" + i17);
            return false;
        }
        long j17 = f50Var.f455551i;
        if (j17 <= 0 || java.lang.System.currentTimeMillis() < j17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", "isInCoLiveInvitation=false, expired");
        return false;
    }

    public final boolean P6(java.lang.String myFinderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myFinderUsername, "myFinderUsername");
        r45.f50 f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410797f).mo144003x754a37bb();
        if (f50Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = f50Var.f455550h;
        java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
        return !(m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, myFinderUsername) : f50Var.f455552m == 0;
    }

    public final boolean Q6(java.lang.String myFinderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myFinderUsername, "myFinderUsername");
        if (O6()) {
            return !P6(myFinderUsername);
        }
        return false;
    }

    public final void R6(r45.e50 e50Var) {
        boolean z17 = e50Var != null && e50Var.m75933x41a8a7f2(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAnchorPermission: hasField=");
        sb6.append(e50Var != null);
        sb6.append(", isInviteeAnchor=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410801m).k(e50Var);
        this.f410806r = z17;
    }

    public final void S6(r45.a84 a84Var) {
        java.util.LinkedList m75941xfb821914;
        java.lang.String m75945x2fec8307;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCoAuthorInfo: hasField=");
        sb6.append(a84Var != null);
        sb6.append(", url=");
        java.lang.Integer num = null;
        sb6.append((a84Var == null || (m75945x2fec8307 = a84Var.m75945x2fec8307(0)) == null) ? null : r26.p0.E0(m75945x2fec8307, 80));
        sb6.append(", contactCount=");
        if (a84Var != null && (m75941xfb821914 = a84Var.m75941xfb821914(1)) != null) {
            num = java.lang.Integer.valueOf(m75941xfb821914.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410803o).k(a84Var);
    }

    public final void T6(r45.f50 f50Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFromTask: invitationId=");
        java.lang.Integer num = null;
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f455546d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f455547e) : null);
        sb6.append(", inviteeCount=");
        if (f50Var != null && (linkedList = f50Var.f455549g) != null) {
            num = java.lang.Integer.valueOf(linkedList.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCoLiveSlice", sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410797f).k(f50Var);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410799h).k(str);
    }
}
