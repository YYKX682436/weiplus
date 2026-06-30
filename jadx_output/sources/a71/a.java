package a71;

/* loaded from: classes.dex */
public final class a implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1895g;

    public a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f1892d = i17;
        this.f1893e = str;
        this.f1894f = str2;
        this.f1895g = str3;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Account.AccountComplianceReceiver", "onSceneEnd " + aVar.f359285b + ' ' + aVar.f359286c + ' ' + aVar.f359287d);
            z61.c cVar = new z61.c(z61.b.f470322e, this.f1892d, this.f1893e, this.f1894f, this.f1895g);
            ((z61.a) com.tencent.mm.sdk.event.q.f192403a.a(z61.a.class)).O6(cVar);
            java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(z61.h.class)).all()).iterator();
            while (it.hasNext()) {
                fs.q qVar = (fs.q) it.next();
                if (fs.g.d(fs.g.f266086c, qVar)) {
                    z61.h iStaticAccountPolicyAgree = (z61.h) ((fs.n) qVar.get());
                    kotlin.jvm.internal.o.g(iStaticAccountPolicyAgree, "iStaticAccountPolicyAgree");
                    ((b71.i) iStaticAccountPolicyAgree).onChanged(cVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
