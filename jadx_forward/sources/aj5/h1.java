package aj5;

/* loaded from: classes.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.i1 f86972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(aj5.i1 i1Var) {
        super(1);
        this.f86972d = i1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.j jVar = (wi5.j) state.a(wi5.j.class);
        if (jVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CreateGroupStartChattingAction, start: ");
            java.lang.String str = jVar.f527830b;
            sb6.append(str);
            sb6.append(", finishDirectWhenInactive: ");
            sb6.append(jVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateGroupStartChattingUIC", sb6.toString());
            aj5.i1 i1Var = this.f86972d;
            boolean booleanExtra = i1Var.m158354x19263085().getIntent().getBooleanExtra("group_select_need_result", false);
            long j17 = jVar.f527832d;
            if (booleanExtra) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateGroupStartChattingUIC", "finishWithSelectedUsername " + str);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6789x657ac4d2 c6789x657ac4d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6789x657ac4d2();
                c6789x657ac4d2.f141214e = j17;
                c6789x657ac4d2.f141219j = 20250909L;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = i1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                c6789x657ac4d2.f141216g = c6789x657ac4d2.b("create_group_sessionid", ((aj5.l1) pf5.z.f435481a.a(activity).a(aj5.l1.class)).T6(), true);
                c6789x657ac4d2.f141213d = i1Var.m158354x19263085().getIntent().getIntExtra("from_create_group_scene", 0);
                c6789x657ac4d2.k();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_User", str);
                i1Var.m158354x19263085().setResult(-1, intent);
                i1Var.m158354x19263085().finish();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateGroupStartChattingUIC", "startChatting " + str);
                int intExtra = i1Var.m158354x19263085().getIntent().getIntExtra("from_create_group_scene", 0);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.addFlags(67108864);
                intent2.putExtra("Chat_User", str);
                intent2.putExtra("finish_direct", false);
                if (jVar.f527831c) {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent2, i1Var.m80379x76847179());
                    i1Var.m158354x19263085().finish();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6789x657ac4d2 c6789x657ac4d22 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6789x657ac4d2();
                    c6789x657ac4d22.f141214e = 2L;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = i1Var.m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                    c6789x657ac4d22.f141216g = c6789x657ac4d22.b("create_group_sessionid", ((aj5.l1) pf5.z.f435481a.a(activity2).a(aj5.l1.class)).T6(), true);
                    c6789x657ac4d22.f141219j = 20250909L;
                    c6789x657ac4d22.f141213d = intExtra;
                    c6789x657ac4d22.k();
                } else {
                    if (((j17 > 5L ? 1 : (j17 == 5L ? 0 : -1)) == 0 || (j17 > 6L ? 1 : (j17 == 6L ? 0 : -1)) == 0) || j17 == 7) {
                        intent2.putExtra("from_create_group_exit_type", j17);
                        intent2.putExtra("from_create_group_scene", intExtra);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = i1Var.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                        intent2.putExtra("from_create_group_session_id", ((aj5.l1) pf5.z.f435481a.a(activity3).a(aj5.l1.class)).T6());
                        intent2.putExtra("from_create_group_select_num", (java.lang.String) ((java.util.LinkedHashMap) state.F).get("select_num"));
                    }
                    intent2.putExtra("return_to_origin_when_inactive", true);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent2, i1Var.m80379x76847179());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
