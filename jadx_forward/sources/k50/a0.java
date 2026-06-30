package k50;

/* loaded from: classes.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.b0 f385709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k50.b0 b0Var) {
        super(1);
        this.f385709d = b0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        xi5.g gVar = (xi5.g) state.a(xi5.g.class);
        if (gVar != null && (i17 = gVar.f536277d) == -1) {
            java.util.List<java.lang.String> list = gVar.f536275b;
            k50.b0 b0Var = this.f385709d;
            if (list != null) {
                for (java.lang.String str : list) {
                    j75.f Q6 = b0Var.Q6();
                    if (Q6 != null) {
                        Q6.B3(new xi5.a(str));
                    }
                }
            }
            j75.f Q62 = b0Var.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.b(null, null, null, java.lang.Boolean.valueOf((list != null ? list.size() : 0) > 1), null, false, 55, null));
            }
            android.content.Intent intent = new android.content.Intent();
            android.content.Intent intent2 = b0Var.m158354x19263085().getIntent();
            boolean z17 = intent2 != null && intent2.getBooleanExtra("Select_Send_Card", false);
            kz5.p0 p0Var = kz5.p0.f395529d;
            if (z17) {
                android.content.Intent putExtra = intent.putExtra("received_card_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(list == null ? p0Var : list, ","));
                android.content.Intent intent3 = b0Var.m158354x19263085().getIntent();
                putExtra.putExtra("be_send_card_name", intent3 != null ? intent3.getStringExtra("Select_Talker_Name") : null);
            }
            if (list == null) {
                list = p0Var;
            }
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(list, ","));
            android.content.Intent intent4 = gVar.f536276c;
            if (intent4 != null) {
                intent.putExtras(intent4);
            }
            b0Var.m158354x19263085().setResult(i17, intent);
            b0Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
