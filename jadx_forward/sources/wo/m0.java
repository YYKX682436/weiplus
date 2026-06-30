package wo;

/* loaded from: classes12.dex */
public class m0 extends wo.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final wo.q0 f529269d;

    public m0(wo.q0 q0Var) {
        super(q0Var);
        this.f529269d = new wo.s0(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4);
    }

    @Override // wo.r0
    public java.lang.String b() {
        java.lang.String a17 = this.f529269d.a(null);
        if (a17 != null) {
            wo.x0.a(1064, 10, 1, true);
            return a17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Build.MANUFACTURER);
        sb6.append(wo.w0.m());
        if (wo.t.f529332a == null) {
            wo.t.f529332a = wo.t.a();
        }
        sb6.append(": " + wo.t.h(wo.t.f529332a, "Features") + ": " + wo.t.h(wo.t.f529332a, "Processor") + ": " + wo.t.h(wo.t.f529332a, "CPU architecture") + ": " + wo.t.h(wo.t.f529332a, "Hardware") + ": " + wo.t.h(wo.t.f529332a, "Serial"));
        return sb6.toString();
    }

    @Override // wo.r0
    public void c() {
    }

    @Override // wo.r0
    public void d() {
        wo.x0.a(1064, 13, 1, true);
    }
}
