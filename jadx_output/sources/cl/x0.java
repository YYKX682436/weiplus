package cl;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f42819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42820f;

    public x0(cl.q0 q0Var, java.lang.String str, java.lang.Object obj) {
        this.f42820f = q0Var;
        this.f42818d = str;
        this.f42819e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42820f.f().add(this.f42818d, (com.eclipsesource.mmv8.V8Value) this.f42819e);
    }
}
