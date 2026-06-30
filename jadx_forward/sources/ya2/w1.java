package ya2;

/* loaded from: classes8.dex */
public abstract class w1 {
    public static final void a(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb localCtrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localCtrlInfo, "localCtrlInfo");
        r45.vs2 vs2Var = localCtrlInfo.f65874xb5f7102a;
        if (vs2Var != null) {
            linkedList.add(vs2Var);
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        boolean Fk = ((c61.l7) ((zy2.b6) c17)).Fk();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("tips_id", localCtrlInfo.f65880x11c19d58);
        jSONObject.put("tips_uuid", localCtrlInfo.f65882x5364c75d);
        jSONObject.put("is_field_ctrInfo_null", localCtrlInfo.f65874xb5f7102a == null);
        r45.vs2 vs2Var2 = localCtrlInfo.f65874xb5f7102a;
        jSONObject.put("field_ctrInfo_tips_id", vs2Var2 != null ? vs2Var2.f470023h : null);
        r45.vs2 vs2Var3 = localCtrlInfo.f65874xb5f7102a;
        jSONObject.put("field_ctrInfo_tips_uuid", vs2Var3 != null ? vs2Var3.f470036x : null);
        jSONObject.put("paths", localCtrlInfo.J0());
        jSONObject.put("stack", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        pm0.z.b(xy2.b.f539688b, "SyncArgs_addCtrlInfo_ctrInfo_null", false, pm0.w.f438339g, null, false, Fk, new ya2.v1(jSONObject), 24, null);
    }
}
