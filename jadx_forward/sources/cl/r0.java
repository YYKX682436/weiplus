package cl;

/* loaded from: classes7.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 f124281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124283f;

    public r0(cl.q0 q0Var, com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7, java.lang.String str) {
        this.f124283f = q0Var;
        this.f124281d = interfaceC1456x656040a7;
        this.f124282e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f124283f.f().m16403x1af320a6(this.f124281d, this.f124282e);
    }
}
