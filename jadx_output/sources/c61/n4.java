package c61;

/* loaded from: classes10.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(c61.l7 l7Var) {
        super(0);
        this.f39182d = l7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "Received a bypass notify which contained BYP_MSG_FINDER_KEY before finder init done.");
        ((f92.i) ((jz5.n) this.f39182d.R).getValue()).b("Received_BYP_MSG_FINDER_KEY.");
        pm0.z.b(xy2.b.f458155b, "Received_BYP_MSG_FINDER_KEY", false, null, null, false, false, c61.m4.f39157d, 60, null);
        return jz5.f0.f302826a;
    }
}
