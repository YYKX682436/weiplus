package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public abstract class sb {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f105865a = new jt0.j(50);

    public static void a(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, java.util.HashMap hashMap) {
        if (jbVar == null) {
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap != null && hashMap.size() > 0) {
            hashMap2.putAll(hashMap);
        }
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        boolean z17 = true;
        if (jbVar.y0("FinderEntrance")) {
            pString.value = "finder_reddot";
            pInt.value = 1;
        } else if (jbVar.y0("FinderLiveEntrance")) {
            pString.value = "live_reddot";
            pInt.value = 2;
        } else if (jbVar.y0("NearbyEntrance")) {
            pString.value = "nearby_reddot";
            pInt.value = 4;
        } else {
            int Q0 = jbVar.Q0(false);
            if (Q0 == 4) {
                pString.value = "newlife_reddot";
                pInt.value = 3;
            } else if (Q0 != 6) {
                if (Q0 != 14) {
                    switch (Q0) {
                        case 8:
                            pString.value = "long_video_reddot";
                            pInt.value = 1;
                            break;
                        case 9:
                            pString.value = "websearch_reddot";
                            pInt.value = 8;
                            break;
                        case 10:
                            break;
                        default:
                            com.tencent.mars.xlog.Log.w("MicroMsg.RedDotSessionReporter", "can not find businessType [%s]", jbVar.field_tips_uuid);
                            z17 = false;
                            break;
                    }
                }
                pString.value = "tyt_reddot";
                pInt.value = 9;
            } else {
                pString.value = "k1k_reddot";
                pInt.value = 7;
            }
        }
        if (!z17) {
            hashMap2.put("tipsid", jbVar.field_tipsId);
            hashMap2.put("tips_uuid", jbVar.field_tips_uuid);
            hashMap2.put("ctrl_type", java.lang.Integer.valueOf(jbVar.getType()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap2, 32396);
            return;
        }
        hashMap2.put("view_id", pString.value);
        hashMap2.put("tipsid", jbVar.field_tipsId);
        hashMap2.put("tips_uuid", jbVar.field_tips_uuid);
        hashMap2.put("ctrlinfo_business_type", java.lang.Integer.valueOf(jbVar.Q0(false)));
        hashMap2.put("ctrl_type", java.lang.Integer.valueOf(jbVar.getType()));
        hashMap2.put("object_id", pm0.v.u(jbVar.W0().getLong(0)));
        hashMap2.put("ext_reportinfo", jbVar.field_ctrInfo.f388499t);
        hashMap2.put("tab_tips_revoke_id", jbVar.field_revokeId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, hashMap2, pInt.value, false);
    }
}
