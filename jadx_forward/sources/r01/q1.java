package r01;

/* loaded from: classes8.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j16 f449723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f449725f;

    public q1(r01.r1 r1Var, r45.j16 j16Var, java.lang.String str) {
        this.f449725f = r1Var;
        this.f449723d = j16Var;
        this.f449724e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f449725f.e(this.f449723d, this.f449724e);
        this.f449725f.b(this.f449724e, 12, 0, 0.0f, 0.0f, 0, null, 0, this.f449723d, null);
        r01.q3.Zi().f449755d = "";
    }
}
