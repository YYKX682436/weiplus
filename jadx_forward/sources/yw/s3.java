package yw;

/* loaded from: classes11.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.u3 f547998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f547999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(yw.u3 u3Var, long j17) {
        super(1);
        this.f547998d = u3Var;
        this.f547999e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String draftData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftData, "draftData");
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v vVar = this.f547998d.f548012a;
        if (vVar != null) {
            vVar.E(this.f547999e, draftData);
        }
        return jz5.f0.f384359a;
    }
}
