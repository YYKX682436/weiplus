package androidx.fragment.app;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f11264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m3 f11265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.p f11266f;

    public c(androidx.fragment.app.p pVar, java.util.List list, androidx.fragment.app.m3 m3Var) {
        this.f11266f = pVar;
        this.f11264d = list;
        this.f11265e = m3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f11264d;
        androidx.fragment.app.m3 m3Var = this.f11265e;
        if (list.contains(m3Var)) {
            list.remove(m3Var);
            this.f11266f.getClass();
            m3Var.f11400a.a(m3Var.f11402c.mView);
        }
    }
}
