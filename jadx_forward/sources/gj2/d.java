package gj2;

/* loaded from: classes10.dex */
public final class d extends gj2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // gj2.e, gi2.e
    public android.view.View f(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f353804e;
        lj2.v0 v0Var = this.f353803d;
        android.content.Context context = this.f353802c;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.view.View(context) : new kj2.z(context, v0Var, x0Var) : new kj2.c0(context, v0Var, x0Var) : new kj2.x(context, v0Var, x0Var);
    }

    @Override // gj2.e, gi2.e
    public java.lang.String i() {
        return "MultiFloatVoiceRoomAdapter";
    }
}
