package qp1;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long f447279a;

    /* renamed from: b, reason: collision with root package name */
    public long f447280b;

    /* renamed from: c, reason: collision with root package name */
    public long f447281c;

    /* renamed from: d, reason: collision with root package name */
    public long f447282d;

    /* renamed from: e, reason: collision with root package name */
    public long f447283e;

    /* renamed from: f, reason: collision with root package name */
    public long f447284f;

    /* renamed from: g, reason: collision with root package name */
    public long f447285g;

    /* renamed from: h, reason: collision with root package name */
    public long f447286h;

    /* renamed from: i, reason: collision with root package name */
    public gp1.w f447287i;

    public void a(gp1.w action, java.lang.Long l17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        long longValue = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
        gp1.w wVar = this.f447287i;
        boolean z18 = true;
        if (wVar == null && action == gp1.w.f355719d) {
            this.f447280b = longValue;
            z17 = true;
        } else {
            z17 = false;
        }
        gp1.w wVar2 = gp1.w.f355720e;
        if (action != wVar2) {
            gp1.w wVar3 = gp1.w.f355722g;
            if (action != wVar3) {
                gp1.w wVar4 = gp1.w.f355724i;
                if (action == wVar4) {
                    if (wVar != wVar4) {
                        this.f447286h = longValue;
                        z17 = true;
                    }
                } else if (action == gp1.w.f355726n) {
                    long j17 = this.f447280b;
                    if (j17 != 0) {
                        this.f447279a = longValue - j17;
                    }
                    z17 = true;
                }
            } else if (wVar != wVar3) {
                this.f447285g = longValue;
                z17 = true;
            }
        } else if (wVar != wVar2) {
            this.f447284f = longValue;
            z17 = true;
        }
        if (wVar == wVar2) {
            if (action == gp1.w.f355721f || action == gp1.w.f355726n) {
                long j18 = this.f447284f;
                if (j18 != 0) {
                    this.f447283e += longValue - j18;
                }
            }
            z18 = z17;
        } else if (wVar == gp1.w.f355722g) {
            if (action == gp1.w.f355723h || action == gp1.w.f355726n) {
                long j19 = this.f447285g;
                if (j19 != 0) {
                    this.f447281c += longValue - j19;
                }
            }
            z18 = z17;
        } else {
            if (wVar == gp1.w.f355724i && (action == gp1.w.f355725m || action == gp1.w.f355726n)) {
                long j27 = this.f447286h;
                if (j27 != 0) {
                    this.f447282d += longValue - j27;
                }
            }
            z18 = z17;
        }
        java.util.Objects.toString(wVar);
        action.toString();
        if (z18) {
            this.f447287i = action;
        }
        if (action == gp1.w.f355719d || action == gp1.w.f355726n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallTimeCollector", "onAction action: " + action + ", currentTimestamp: " + longValue);
        }
    }
}
