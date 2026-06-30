package cl;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f124352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124353f;

    public x0(cl.q0 q0Var, java.lang.String str, java.lang.Object obj) {
        this.f124353f = q0Var;
        this.f124351d = str;
        this.f124352e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f124353f.f().add(this.f124351d, (com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) this.f124352e);
    }
}
