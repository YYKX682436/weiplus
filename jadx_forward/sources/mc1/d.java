package mc1;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72822x366c91de = 1032;

    /* renamed from: NAME */
    public static final java.lang.String f72823x24728b = "gameLiveInfoControl";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        mc1.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        switch (jSONObject.optInt("action", 0)) {
            case 1:
                fVar = mc1.f.WAGameLiveInfoControlActionEnableInfo;
                break;
            case 2:
                fVar = mc1.f.WAGameLiveInfoControlActionDisableInfo;
                break;
            case 3:
                fVar = mc1.f.WAGameLiveInfoControlActionGetCurrentRoomMemberInfo;
                break;
            case 4:
                fVar = mc1.f.WAGameLiveInfoControlActionGetCurrentRoomInfo;
                break;
            case 5:
                fVar = mc1.f.WAGameLiveInfoControlActionEnableMic;
                break;
            case 6:
                fVar = mc1.f.WAGameLiveInfoControlActionDisableMic;
                break;
            case 7:
                fVar = mc1.f.WAGameLiveInfoControlActionGetCurrentMicState;
                break;
            case 8:
                fVar = mc1.f.WAGameLiveInfoControlActionEnableMicInfo;
                break;
            case 9:
                fVar = mc1.f.WAGameLiveInfoControlActionDisableMicInfo;
                break;
            case 10:
                fVar = mc1.f.WAGameLiveInfoControlActionSetTopic;
                break;
            default:
                fVar = mc1.f.WAGameLiveInfoControlActionUnknow;
                break;
        }
        switch (fVar) {
            case WAGameLiveInfoControlActionUnknow:
                c0Var.a(i17, o("fail:invalid data,unknown action"));
                return;
            case WAGameLiveInfoControlActionEnableInfo:
                ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).getClass();
                p60.u.f433732g.putBoolean("disableLiveInfo", false);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionDisableInfo:
                ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).getClass();
                p60.u.f433732g.putBoolean("disableLiveInfo", true);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionGetCurrentRoomMemberInfo:
                h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
                mc1.e eVar = new mc1.e(this, c0Var, i17);
                ((h63.v0) r1Var).getClass();
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433710p, null, 0, null, 14, null), p60.q.class, new h63.d0(eVar));
                return;
            case WAGameLiveInfoControlActionGetCurrentRoomInfo:
                h63.r1 r1Var2 = (h63.r1) i95.n0.c(h63.r1.class);
                mc1.C29137x2e00fd c29137x2e00fd = new mc1.C29137x2e00fd(this, c0Var, i17);
                ((h63.v0) r1Var2).getClass();
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433711q, null, 0, null, 14, null), p60.q.class, new h63.c0(c29137x2e00fd));
                return;
            case WAGameLiveInfoControlActionEnableMic:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ni(java.lang.Boolean.TRUE);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionDisableMic:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ni(java.lang.Boolean.FALSE);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionGetCurrentMicState:
                java.util.HashMap hashMap = new java.util.HashMap(1);
                hashMap.put("mute", java.lang.Boolean.valueOf(!java.lang.Boolean.valueOf(((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f360821g).booleanValue()));
                c0Var.a(i17, p("ok", hashMap));
                return;
            case WAGameLiveInfoControlActionEnableMicInfo:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ri(java.lang.Boolean.TRUE, jSONObject.optInt("duration", 0));
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionDisableMicInfo:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ri(java.lang.Boolean.FALSE, 0);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionSetTopic:
                java.lang.String topic = jSONObject.optString("topic");
                h63.r1 r1Var3 = (h63.r1) i95.n0.c(h63.r1.class);
                mc1.C29138x2e00fe c29138x2e00fe = new mc1.C29138x2e00fe(this, c0Var, i17);
                ((h63.v0) r1Var3).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433720z, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170(topic, false, null), 6, null), p60.q.class, new h63.m0(c29138x2e00fe));
                return;
            default:
                return;
        }
    }
}
