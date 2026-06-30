package zk3;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 f555005e;

    public j(zk3.g0 g0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var) {
        this.f555004d = g0Var;
        this.f555005e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f555004d.f554987i;
        if (c22849x81a93d25 == null) {
            return;
        }
        c22849x81a93d25.m7964x8d4ad49c(this.f555005e);
    }
}
