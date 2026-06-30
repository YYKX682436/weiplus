package vd2;

/* loaded from: classes3.dex */
public final class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f517271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.a0 f517272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f517273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(yl2.g1 g1Var, yl2.a0 a0Var, r45.m84 m84Var) {
        super(0);
        this.f517271d = g1Var;
        this.f517272e = a0Var;
        this.f517273f = m84Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_MODE", 2);
        intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_SUB_MODE", 8);
        intent.putExtra("KEY_PARAMS_POST_RECOVER_LIVE_SIDEBAR", this.f517273f.mo14344x5f01b1f6());
        intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_FROM_SIDEBAR", true);
        this.f517271d.h(intent, ((yl2.y) this.f517272e).f544616a, false);
        return jz5.f0.f384359a;
    }
}
