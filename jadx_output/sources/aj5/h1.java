package aj5;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.i1 f5439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(aj5.i1 i1Var) {
        super(1);
        this.f5439d = i1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.j jVar = (wi5.j) state.a(wi5.j.class);
        if (jVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CreateGroupStartChattingAction, start: ");
            java.lang.String str = jVar.f446297b;
            sb6.append(str);
            sb6.append(", finishDirectWhenInactive: ");
            sb6.append(jVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateGroupStartChattingUIC", sb6.toString());
            aj5.i1 i1Var = this.f5439d;
            boolean booleanExtra = i1Var.getActivity().getIntent().getBooleanExtra("group_select_need_result", false);
            long j17 = jVar.f446299d;
            if (booleanExtra) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateGroupStartChattingUIC", "finishWithSelectedUsername " + str);
                com.tencent.mm.autogen.mmdata.rpt.NewGroupRecommendStruct newGroupRecommendStruct = new com.tencent.mm.autogen.mmdata.rpt.NewGroupRecommendStruct();
                newGroupRecommendStruct.f59681e = j17;
                newGroupRecommendStruct.f59686j = 20250909L;
                androidx.appcompat.app.AppCompatActivity activity = i1Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                newGroupRecommendStruct.f59683g = newGroupRecommendStruct.b("create_group_sessionid", ((aj5.l1) pf5.z.f353948a.a(activity).a(aj5.l1.class)).T6(), true);
                newGroupRecommendStruct.f59680d = i1Var.getActivity().getIntent().getIntExtra("from_create_group_scene", 0);
                newGroupRecommendStruct.k();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_User", str);
                i1Var.getActivity().setResult(-1, intent);
                i1Var.getActivity().finish();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateGroupStartChattingUIC", "startChatting " + str);
                int intExtra = i1Var.getActivity().getIntent().getIntExtra("from_create_group_scene", 0);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.addFlags(67108864);
                intent2.putExtra("Chat_User", str);
                intent2.putExtra("finish_direct", false);
                if (jVar.f446298c) {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, i1Var.getContext());
                    i1Var.getActivity().finish();
                    com.tencent.mm.autogen.mmdata.rpt.NewGroupRecommendStruct newGroupRecommendStruct2 = new com.tencent.mm.autogen.mmdata.rpt.NewGroupRecommendStruct();
                    newGroupRecommendStruct2.f59681e = 2L;
                    androidx.appcompat.app.AppCompatActivity activity2 = i1Var.getActivity();
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    newGroupRecommendStruct2.f59683g = newGroupRecommendStruct2.b("create_group_sessionid", ((aj5.l1) pf5.z.f353948a.a(activity2).a(aj5.l1.class)).T6(), true);
                    newGroupRecommendStruct2.f59686j = 20250909L;
                    newGroupRecommendStruct2.f59680d = intExtra;
                    newGroupRecommendStruct2.k();
                } else {
                    if (((j17 > 5L ? 1 : (j17 == 5L ? 0 : -1)) == 0 || (j17 > 6L ? 1 : (j17 == 6L ? 0 : -1)) == 0) || j17 == 7) {
                        intent2.putExtra("from_create_group_exit_type", j17);
                        intent2.putExtra("from_create_group_scene", intExtra);
                        androidx.appcompat.app.AppCompatActivity activity3 = i1Var.getActivity();
                        kotlin.jvm.internal.o.g(activity3, "activity");
                        intent2.putExtra("from_create_group_session_id", ((aj5.l1) pf5.z.f353948a.a(activity3).a(aj5.l1.class)).T6());
                        intent2.putExtra("from_create_group_select_num", (java.lang.String) ((java.util.LinkedHashMap) state.F).get("select_num"));
                    }
                    intent2.putExtra("return_to_origin_when_inactive", true);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, i1Var.getContext());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
