package cl;

/* loaded from: classes7.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q1 f124231f;

    public m1(cl.q1 q1Var, java.lang.String str, boolean z17) {
        this.f124231f = q1Var;
        this.f124229d = str;
        this.f124230e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778 = this.f124231f.f124276a;
        if (c1460x397c7778 == null) {
            throw new java.lang.IllegalStateException("V8DebuggerHelper v8 null");
        }
        c1460x397c7778.m15881x77a01755(this.f124229d, this.f124230e);
        cl.q1 q1Var = this.f124231f;
        if (q1Var.f124278c != null) {
            return;
        }
        q1Var.f124278c = ((ku5.t0) ku5.t0.f394148d).d(new cl.p1(q1Var), 2000L, 2000L);
    }
}
