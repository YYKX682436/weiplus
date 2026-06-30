package lu5;

/* loaded from: classes12.dex */
public final class g implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f402998d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f402999e;

    public g(java.lang.Runnable runnable, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(runnable, "runnable");
        this.f402998d = runnable;
        this.f402999e = z17;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f402999e;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return m146380x9616526c();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f402998d.run();
    }

    /* renamed from: toString */
    public java.lang.String m146380x9616526c() {
        java.lang.reflect.Field field;
        java.lang.Runnable runnable = this.f402998d;
        if (runnable.getClass() == lu5.c.f402993b && (field = lu5.c.f402994c) != null) {
            return "TPCR-".concat(field.get(runnable).getClass().getName());
        }
        return "TPCR-" + runnable;
    }
}
