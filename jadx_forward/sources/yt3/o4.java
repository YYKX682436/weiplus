package yt3;

/* loaded from: classes10.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f547107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yt3.r4 r4Var) {
        super(0);
        this.f547107d = r4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notice: configProvider is null  ");
        yt3.r4 r4Var = this.f547107d;
        sb6.append(r4Var.f547183h);
        sb6.append("  ");
        sb6.append(r4Var.f547182g);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemuxPlugin", sb6.toString());
        return jz5.f0.f384359a;
    }
}
