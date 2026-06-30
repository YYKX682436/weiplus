package kb5;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb5.b f387779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kb5.b bVar) {
        super(1);
        this.f387779d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            kb5.b bVar = this.f387779d;
            bVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            java.util.List list = c0Var.f527815b;
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ",");
            intent.putExtra("Select_Conv_User", c17);
            if (list.size() == 1) {
                intent.putExtra("KSelectUserChatType", k01.d.a(c17));
            }
            bVar.m158354x19263085().setResult(-1, intent);
            bVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
