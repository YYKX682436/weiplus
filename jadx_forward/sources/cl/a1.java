package cl;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124128f;

    public a1(cl.q0 q0Var, java.lang.String str, java.lang.String str2) {
        this.f124128f = q0Var;
        this.f124126d = str;
        this.f124127e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f124128f.f().mo16355x7828ee49(this.f124126d, this.f124127e);
    }
}
