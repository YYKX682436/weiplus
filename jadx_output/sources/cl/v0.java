package cl;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42801f;

    public v0(cl.q0 q0Var, java.lang.String str, cl.q0 q0Var2) {
        this.f42801f = q0Var;
        this.f42799d = str;
        this.f42800e = q0Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42801f.f().shareObject(this.f42799d, this.f42800e.f());
    }
}
