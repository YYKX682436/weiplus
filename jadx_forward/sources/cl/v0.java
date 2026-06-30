package cl;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124334f;

    public v0(cl.q0 q0Var, java.lang.String str, cl.q0 q0Var2) {
        this.f124334f = q0Var;
        this.f124332d = str;
        this.f124333e = q0Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f124334f.f().mo16409xfc013bfe(this.f124332d, this.f124333e.f());
    }
}
