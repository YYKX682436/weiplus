package uv2;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f512927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var) {
        super(1);
        this.f512927d = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f512927d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostSpeedUpManager", "[starAdvancedProcess] progress:" + floatValue);
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
