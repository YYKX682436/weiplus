package zq5;

/* loaded from: classes11.dex */
public final class a implements zq5.j {

    /* renamed from: a, reason: collision with root package name */
    public static final zq5.a f556588a = new zq5.a();

    public void a(zq5.i level, java.lang.String tag, java.lang.String msg, java.lang.Throwable th6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int ordinal = level.ordinal();
        if (ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, msg, th6);
            return;
        }
        if (ordinal == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, msg, th6);
        } else if (ordinal == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, msg, th6);
        } else {
            if (ordinal != 5) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(tag, msg, th6);
        }
    }

    /* renamed from: equals */
    public boolean m179306xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.a)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m179307x8cdac1b() {
        return -1534854491;
    }

    /* renamed from: toString */
    public java.lang.String m179308x9616526c() {
        return "AndroidLogPipeline";
    }
}
