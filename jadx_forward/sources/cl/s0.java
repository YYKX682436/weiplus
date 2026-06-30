package cl;

/* loaded from: classes7.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p159x477cd522.p160x333422.InterfaceC1457xf776215b f124289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124291f;

    public s0(cl.q0 q0Var, com.p159x477cd522.p160x333422.InterfaceC1457xf776215b interfaceC1457xf776215b, java.lang.String str) {
        this.f124291f = q0Var;
        this.f124289d = interfaceC1457xf776215b;
        this.f124290e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f124291f.f().m16404x1af320a6(this.f124289d, this.f124290e);
    }
}
