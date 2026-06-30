package a50;

/* loaded from: classes11.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.g1 f1482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(a50.g1 g1Var, long j17) {
        super(1);
        this.f1482d = g1Var;
        this.f1483e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String draftData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(draftData, "draftData");
        com.tencent.wechat.iam.finder_box.j jVar = this.f1482d.f1487a;
        if (jVar != null) {
            jVar.E(this.f1483e, draftData);
        }
        return jz5.f0.f302826a;
    }
}
