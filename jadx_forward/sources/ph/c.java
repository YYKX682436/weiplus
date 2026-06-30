package ph;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public qh.f0 f435788a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f435789b;

    public c(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f435789b = mContext;
    }

    public final long a() {
        if (!e() && ph.t.f435817l > 0) {
            return android.os.SystemClock.uptimeMillis() - ph.t.f435817l;
        }
        return 0L;
    }

    public final int b() {
        return wh.m.i(this.f435789b);
    }

    public final boolean c() {
        java.lang.Integer num = wh.m.f527363a;
        android.content.Context context = this.f435789b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return wh.e1.c(context);
    }

    public final boolean d() {
        return wh.m.w(this.f435789b);
    }

    public final boolean e() {
        qh.f0 f0Var = this.f435788a;
        if (f0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var);
            if (!f0Var.f444876o) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        java.lang.Integer num = wh.m.f527363a;
        android.content.Context context = this.f435789b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent k17 = wh.m.k(context);
        if (k17 != null) {
            k17.getBooleanExtra("android.intent.action.BATTERY_LOW", false);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m158521x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BatteryState{fg=");
        sb6.append(e());
        sb6.append(", charge=");
        sb6.append(d());
        sb6.append(", screen=");
        android.content.Context context = this.f435789b;
        sb6.append(wh.m.A(context));
        sb6.append(", sysDoze=");
        sb6.append(wh.m.z(context));
        sb6.append(", appStandby=");
        sb6.append(c());
        sb6.append(", bgMillis=");
        sb6.append(a());
        sb6.append('}');
        return sb6.toString();
    }
}
