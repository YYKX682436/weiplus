package cl;

/* loaded from: classes7.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.eclipsesource.mmv8.JavaCallback f42748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42750f;

    public r0(cl.q0 q0Var, com.eclipsesource.mmv8.JavaCallback javaCallback, java.lang.String str) {
        this.f42750f = q0Var;
        this.f42748d = javaCallback;
        this.f42749e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42750f.f().registerJavaMethod(this.f42748d, this.f42749e);
    }
}
