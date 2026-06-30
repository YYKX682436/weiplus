package fj5;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj5.i f344780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fj5.i iVar) {
        super(1);
        this.f344780d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            fj5.i iVar = this.f344780d;
            iVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            iVar.m158354x19263085().setResult(-1, intent);
            iVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
