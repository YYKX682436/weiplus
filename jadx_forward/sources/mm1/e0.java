package mm1;

/* loaded from: classes11.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ il4.e f410189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm1.f0 f410191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(il4.e eVar, java.lang.String str, mm1.f0 f0Var) {
        super(0);
        this.f410189d = eVar;
        this.f410190e = str;
        this.f410191f = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        il4.e eVar = this.f410189d;
        if (eVar.f373639c == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizAudioServicesImpl", "play with fromScene 0", new java.lang.Object[0]);
        }
        int i17 = jm4.m3.f381931e;
        java.lang.String str = this.f410190e;
        jm4.k3 k3Var = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30437x21b323b2.m168976x21b902b8(new java.lang.String[]{str});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskServiceCpp");
        jm4.m3 m3Var = (jm4.m3) k3Var;
        m3Var.e(eVar.f373639c);
        eVar.f373655s.f373668g = str;
        mm1.f0.wi(this.f410191f, m3Var, eVar, 0);
        return jz5.f0.f384359a;
    }
}
