package aj4;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj4.i f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f5316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(aj4.i iVar, zi4.r1 r1Var) {
        super(1);
        this.f5315d = iVar;
        this.f5316e = r1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        aj4.n result = (aj4.n) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str = this.f5315d.f5328h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchCapture callback: errCode=");
        long j17 = result.f5340b;
        sb6.append(j17);
        sb6.append(", count=");
        java.util.List list = result.f5339a;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bw5.hb hbVar = new bw5.hb();
        hbVar.f28141d.addAll(list);
        hbVar.f28142e[1] = true;
        this.f5316e.a(hbVar, j17, result.f5341c);
        return jz5.f0.f302826a;
    }
}
