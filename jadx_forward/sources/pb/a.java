package pb;

/* loaded from: classes7.dex */
public final class a implements pb.b {

    /* renamed from: b, reason: collision with root package name */
    public com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 f434644b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 f434643a = new com.p302x1ea3c036.p304x697f145.C2849xa2aadc78();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f434645c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f434646d = new java.util.ArrayList();

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
        java.util.ArrayList arrayList = this.f434646d;
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        arrayList.add(new com.p302x1ea3c036.p304x697f145.C2845x3640af73(c2849xa2aadc78 != null ? c2849xa2aadc78.m21173x25956649() : 0L, j18, d17));
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f434645c.add(new com.p302x1ea3c036.p304x697f145.C2848xa8c46b74(data, d17));
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21179x39469a64(category, name);
        }
    }

    @Override // pb.b
    public void d(long j17, long j18) {
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21175xeb7aeeb0(j17, j18);
        }
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        this.f434644b = c2849xa2aadc78 != null ? c2849xa2aadc78.m21177xa97094b() : null;
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21183x3984cb28(category, name, d17, d18);
        }
    }

    @Override // pb.b
    public void g() {
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21181x4bb6dd56();
        }
    }

    @Override // pb.b
    public com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 h() {
        com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd7 = this.f434644b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2847x6dfc0dd7);
        double startTime = c2847x6dfc0dd7.getStartTime();
        com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd72 = this.f434644b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2847x6dfc0dd72);
        double endTime = c2847x6dfc0dd72.getEndTime();
        com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd73 = this.f434644b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2847x6dfc0dd73);
        java.util.ArrayList<com.p302x1ea3c036.p304x697f145.C2844x40fb94d> m21144x1fe7c0f5 = c2847x6dfc0dd73.m21144x1fe7c0f5();
        com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd74 = this.f434644b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2847x6dfc0dd74);
        return new com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7(startTime, endTime, m21144x1fe7c0f5, c2847x6dfc0dd74.m21143x1492ba2(), this.f434645c, this.f434646d);
    }

    @Override // pb.b
    public void i() {
        this.f434644b = null;
        this.f434645c.clear();
        this.f434646d.clear();
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21176x4849ec39();
        }
    }

    @Override // pb.b
    /* renamed from: init */
    public void mo21138x316510() {
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21174x316510();
        }
    }

    @Override // pb.b
    /* renamed from: isTracing */
    public boolean getF127349a() {
        return true;
    }

    @Override // pb.b
    public void j(int i17) {
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21182x2b24cd9c(i17);
        }
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            return c2849xa2aadc78.m21180xef8cb24e(category, name);
        }
        return -1;
    }

    @Override // pb.b
    /* renamed from: release */
    public void mo21140x41012807() {
        com.p302x1ea3c036.p304x697f145.C2849xa2aadc78 c2849xa2aadc78 = this.f434643a;
        if (c2849xa2aadc78 != null) {
            c2849xa2aadc78.m21178x41012807();
        }
    }
}
