package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public abstract class sb {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f187398a = new jt0.j(50);

    public static void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, java.util.HashMap hashMap) {
        if (jbVar == null) {
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap != null && hashMap.size() > 0) {
            hashMap2.putAll(hashMap);
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        boolean z17 = true;
        if (jbVar.y0("FinderEntrance")) {
            c19772x1c2cd081.f38869x6ac9171 = "finder_reddot";
            c19767x257d7f.f38864x6ac9171 = 1;
        } else if (jbVar.y0("FinderLiveEntrance")) {
            c19772x1c2cd081.f38869x6ac9171 = "live_reddot";
            c19767x257d7f.f38864x6ac9171 = 2;
        } else if (jbVar.y0("NearbyEntrance")) {
            c19772x1c2cd081.f38869x6ac9171 = "nearby_reddot";
            c19767x257d7f.f38864x6ac9171 = 4;
        } else {
            int Q0 = jbVar.Q0(false);
            if (Q0 == 4) {
                c19772x1c2cd081.f38869x6ac9171 = "newlife_reddot";
                c19767x257d7f.f38864x6ac9171 = 3;
            } else if (Q0 != 6) {
                if (Q0 != 14) {
                    switch (Q0) {
                        case 8:
                            c19772x1c2cd081.f38869x6ac9171 = "long_video_reddot";
                            c19767x257d7f.f38864x6ac9171 = 1;
                            break;
                        case 9:
                            c19772x1c2cd081.f38869x6ac9171 = "websearch_reddot";
                            c19767x257d7f.f38864x6ac9171 = 8;
                            break;
                        case 10:
                            break;
                        default:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RedDotSessionReporter", "can not find businessType [%s]", jbVar.f65882x5364c75d);
                            z17 = false;
                            break;
                    }
                }
                c19772x1c2cd081.f38869x6ac9171 = "tyt_reddot";
                c19767x257d7f.f38864x6ac9171 = 9;
            } else {
                c19772x1c2cd081.f38869x6ac9171 = "k1k_reddot";
                c19767x257d7f.f38864x6ac9171 = 7;
            }
        }
        if (!z17) {
            hashMap2.put("tipsid", jbVar.f65880x11c19d58);
            hashMap2.put("tips_uuid", jbVar.f65882x5364c75d);
            hashMap2.put("ctrl_type", java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap2, 32396);
            return;
        }
        hashMap2.put("view_id", c19772x1c2cd081.f38869x6ac9171);
        hashMap2.put("tipsid", jbVar.f65880x11c19d58);
        hashMap2.put("tips_uuid", jbVar.f65882x5364c75d);
        hashMap2.put("ctrlinfo_business_type", java.lang.Integer.valueOf(jbVar.Q0(false)));
        hashMap2.put("ctrl_type", java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0()));
        hashMap2.put("object_id", pm0.v.u(jbVar.W0().m75942xfb822ef2(0)));
        hashMap2.put("ext_reportinfo", jbVar.f65874xb5f7102a.f470032t);
        hashMap2.put("tab_tips_revoke_id", jbVar.f65878xe8897e6);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, hashMap2, c19767x257d7f.f38864x6ac9171, false);
    }
}
