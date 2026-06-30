package cl;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42595f;

    public a1(cl.q0 q0Var, java.lang.String str, java.lang.String str2) {
        this.f42595f = q0Var;
        this.f42593d = str;
        this.f42594e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42595f.f().executeDebugScript(this.f42593d, this.f42594e);
    }
}
