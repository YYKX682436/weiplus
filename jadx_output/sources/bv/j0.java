package bv;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv.k0 f24655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(bv.k0 k0Var) {
        super(0);
        this.f24655d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_mp_audio_player_enable_new, 0) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f24655d.f24658d, "openFlutter " + booleanValue);
        return valueOf;
    }
}
