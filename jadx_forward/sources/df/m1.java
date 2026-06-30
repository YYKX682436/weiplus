package df;

/* loaded from: classes7.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f311048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f311049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(df.w1 w1Var, java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f311048d = w1Var;
        this.f311049e = weakReference;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95771xf7af55c8;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f311048d;
        sb6.append(w1Var.f311113d);
        sb6.append(" attachToActivity platformPlugin:");
        sb6.append(w1Var.B);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        android.app.Activity activity = (android.app.Activity) this.f311049e.get();
        if (activity == null) {
            ff.e eVar = w1Var.B;
            if (eVar != null) {
                eVar.f343113b.m138206xde722b98(null);
            }
            w1Var.B = null;
        } else {
            ff.e eVar2 = w1Var.B;
            if ((eVar2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, eVar2.f343112a)) && (m95771xf7af55c8 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95771xf7af55c8(w1Var.f311113d)) != null) {
                w1Var.B = new ff.e(activity, m95771xf7af55c8.m137436x69aaa6da(), new df.l1());
            }
        }
        return jz5.f0.f384359a;
    }
}
