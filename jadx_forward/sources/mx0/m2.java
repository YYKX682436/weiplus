package mx0;

/* loaded from: classes5.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f413684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f413685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(java.lang.Float f17, mx0.q2 q2Var) {
        super(1);
        this.f413684d = f17;
        this.f413685e = q2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchMusic completed, push bgm volume=");
            java.lang.Float f17 = this.f413684d;
            sb6.append(f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicEntranceV2Plugin", sb6.toString());
            yx0.b8 b8Var = this.f413685e.f413769g;
            p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.n5(b8Var, f17.floatValue(), null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
