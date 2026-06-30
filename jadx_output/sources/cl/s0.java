package cl;

/* loaded from: classes7.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.eclipsesource.mmv8.JavaVoidCallback f42756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42758f;

    public s0(cl.q0 q0Var, com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback, java.lang.String str) {
        this.f42758f = q0Var;
        this.f42756d = javaVoidCallback;
        this.f42757e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42758f.f().registerJavaMethod(this.f42756d, this.f42757e);
    }
}
