package bs2;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f23932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f23933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f23934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f23935h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bs2.n1 n1Var, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.util.LinkedList linkedList, boolean z17) {
        super(0);
        this.f23931d = n1Var;
        this.f23932e = gVar;
        this.f23933f = qt2Var;
        this.f23934g = linkedList;
        this.f23935h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bs2.n1 n1Var = this.f23931d;
        db2.n3 n3Var = new db2.n3(n1Var.f23907a, 0, this.f23932e, this.f23933f, this.f23934g, true, false, false, 0, false, null, null, null, 8128, null);
        n3Var.f228092t = new bs2.n0(this.f23935h, n1Var);
        n3Var.f228091s = new bs2.o0(n1Var);
        com.tencent.mm.plugin.finder.report.r1 e17 = com.tencent.mm.plugin.finder.report.v1.f125393a.e(n1Var.f23907a);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                e17.f125308i0 = 1;
            }
        }
        return n3Var;
    }
}
