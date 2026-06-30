package rp4;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f480152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(rp4.f0 f0Var) {
        super(0);
        this.f480152d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notice: configProvider is null  ");
        rp4.f0 f0Var = this.f480152d;
        sb6.append(f0Var.f480167i);
        sb6.append("  ");
        sb6.append(f0Var.f480165g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
        nu3.m.f421762a.n(2000);
        f0Var.e(2000);
        return jz5.f0.f384359a;
    }
}
