package gp2;

/* loaded from: classes10.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.q0 f355823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gp2.q0 q0Var) {
        super(0);
        this.f355823d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gp2.q0 q0Var = this.f355823d;
        q0Var.getClass();
        java.lang.Object obj = -1;
        try {
            obj = new gp2.m0(q0Var).mo152xb9724478();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearbyLiveItemOnTouchEventAdapter", "safelyInvoke exception", th6.getMessage());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            pm0.v.X(new gp2.o0(q0Var, valueOf.intValue()));
        }
        return jz5.f0.f384359a;
    }
}
