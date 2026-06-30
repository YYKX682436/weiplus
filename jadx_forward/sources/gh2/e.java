package gh2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f353402a;

    public e(gh2.f fVar, java.lang.String uId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uId, "uId");
        this.f353402a = new java.util.ArrayList();
    }

    public final void a() {
        synchronized (this.f353402a) {
            if (this.f353402a.size() > 10) {
                java.util.List R = kz5.n0.R(this.f353402a, this.f353402a.size() - 10);
                this.f353402a.clear();
                this.f353402a.addAll(R);
            }
        }
    }
}
