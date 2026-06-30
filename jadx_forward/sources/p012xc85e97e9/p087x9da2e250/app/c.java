package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f92797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m3 f92798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.p f92799f;

    public c(p012xc85e97e9.p087x9da2e250.app.p pVar, java.util.List list, p012xc85e97e9.p087x9da2e250.app.m3 m3Var) {
        this.f92799f = pVar;
        this.f92797d = list;
        this.f92798e = m3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f92797d;
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var = this.f92798e;
        if (list.contains(m3Var)) {
            list.remove(m3Var);
            this.f92799f.getClass();
            m3Var.f92933a.a(m3Var.f92935c.f3462x628b0b2);
        }
    }
}
