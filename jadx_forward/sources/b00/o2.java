package b00;

/* loaded from: classes11.dex */
public final class o2 implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b00.q2 f98276a;

    public o2(b00.q2 q2Var) {
        this.f98276a = q2Var;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_exp") && ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri() && (L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("MyTab")) != null) {
            r45.f03 I0 = L0.I0("Card.Entrance.Left");
            r45.f03 I02 = L0.I0("Card.Entrance.Right");
            if (I0 == null && I02 == null) {
                return;
            }
            b00.q2 q2Var = this.f98276a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            q2Var.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            map.put("udf_kv", hashMap);
            hashMap.put("page_id", "my_page");
            hashMap.put("element_id", "me_reddot");
            if (this.f98276a.f98286d.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("is_receive_after_enter", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                hashMap.put("ext_info_1", r26.i0.t(jSONObject2, ",", ";", false));
            }
            this.f98276a.getClass();
            java.lang.String field_tips_uuid = L0.f65882x5364c75d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tips_uuid, "field_tips_uuid");
            hashMap.put("reddot_id", field_tips_uuid);
            java.lang.String str2 = L0.f65874xb5f7102a.f470032t;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("reddot_ext_info", str2);
            hashMap.put("reddot_rec_timestamp", java.lang.Long.valueOf(L0.f65879x2261f6f2));
            hashMap.put("reddot_type", java.lang.Integer.valueOf(L0.m55856xfb85f7b0()));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.getClass();
            if (u46.l.e("view_exp") || !aVar.oj()) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(12);
            if (u46.l.e("view_exp") || arrayList.size() <= 0 || !aVar.oj()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[routeCgiEvent] eventId : view_exp, params : " + map + ", cgiBizIds : " + arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                if (num.intValue() > 0) {
                    ky1.d dVar = new ky1.d();
                    dVar.f395032a = 1;
                    dVar.f395033b = num.intValue();
                    dVar.f395035d = false;
                    synchronized (aVar.f306222i) {
                        java.util.Iterator it6 = ((java.util.ArrayList) aVar.f306222i).iterator();
                        while (it6.hasNext()) {
                            gy1.a aVar2 = (gy1.a) it6.next();
                            if (aVar2.b() == dVar.f395032a && aVar2.a(j17, "view_exp", map, dVar)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
