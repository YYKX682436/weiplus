package a50;

/* loaded from: classes11.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.g1 f83015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f83016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(a50.g1 g1Var, long j17) {
        super(1);
        this.f83015d = g1Var;
        this.f83016e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String draftData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftData, "draftData");
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.j jVar = this.f83015d.f83020a;
        if (jVar != null) {
            jVar.E(this.f83016e, draftData);
        }
        return jz5.f0.f384359a;
    }
}
