package je3;

@j95.b
/* loaded from: classes15.dex */
public final class m extends i95.w implements je3.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f380834d = jz5.h.b(je3.l.f380833d);

    @Override // je3.i
    public boolean Ii(float f17) {
        return ((f17 > 1.0f ? 1 : (f17 == 1.0f ? 0 : -1)) == 0) || f17 > ((c06.e) ((jz5.n) this.f380834d).mo141623x754a37bb()).b();
    }

    @Override // je3.i
    public boolean Nb() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mb_performance_report_use_scl_base_biz, false);
    }

    @Override // je3.i
    public void Rg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed scene, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6716x110d769e c6716x110d769e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6716x110d769e();
        c6716x110d769e.f140555d = c6716x110d769e.b("PkgId", str, true);
        c6716x110d769e.f140556e = c6716x110d769e.b("BaseId", str2, true);
        c6716x110d769e.f140557f = c6716x110d769e.b("Version", str3, true);
        c6716x110d769e.f140558g = c6716x110d769e.b("Md5", str4, true);
        c6716x110d769e.f140559h = i17;
        c6716x110d769e.f140560i = scene.getValue();
        c6716x110d769e.f140561j = i18;
        c6716x110d769e.f140562k = i19;
        c6716x110d769e.k();
    }

    @Override // je3.i
    public void Sc(java.lang.String key, int i17, java.lang.String str, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (Ii(f17)) {
            long a17 = c01.id.a();
            if (a17 <= 0) {
                a17 = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushMonitor", "MagicBrushMonitor kvReport key[" + key + "] value[" + i17 + "] extra[" + str + "] time[" + a17 + ']');
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6719x5235fd22 c6719x5235fd22 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6719x5235fd22();
            c6719x5235fd22.f140587d = c6719x5235fd22.b("key", key, true);
            c6719x5235fd22.f140588e = i17;
            c6719x5235fd22.f140589f = c6719x5235fd22.b("extra", str != null ? r26.i0.u(str, ',', ';', false, 4, null) : null, true);
            c6719x5235fd22.f140590g = a17;
            c6719x5235fd22.k();
        }
    }

    @Override // je3.i
    public void T5(java.lang.String bizName, java.lang.String type, java.lang.String content, java.lang.String extras, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        if (Ii(f17)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6720xd3579e0c c6720xd3579e0c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6720xd3579e0c();
            c6720xd3579e0c.f140591d = c6720xd3579e0c.b("BizName", bizName, true);
            c6720xd3579e0c.f140592e = c6720xd3579e0c.b("Type", type, true);
            c6720xd3579e0c.f140593f = c6720xd3579e0c.b("Content", r26.i0.t(content, ",", " ", false), false);
            c6720xd3579e0c.f140594g = c6720xd3579e0c.b("Extras", r26.i0.t(extras, ",", " ", false), false);
            c6720xd3579e0c.k();
        }
    }

    @Override // je3.i
    public boolean W7() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mb_scl_click_report_android, false);
    }

    @Override // je3.i
    public void qa(java.lang.String sessionId, java.lang.String bizName, java.lang.String cardName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c scene, long j17, java.util.List list, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardName, "cardName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6717x1f65835c c6717x1f65835c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6717x1f65835c();
        c6717x1f65835c.f140563d = c6717x1f65835c.b("SessionID", sessionId, true);
        c6717x1f65835c.f140564e = c6717x1f65835c.b("CardName", cardName, true);
        c6717x1f65835c.f140565f = scene.getValue();
        c6717x1f65835c.f140566g = j17;
        c6717x1f65835c.f140574o = c6717x1f65835c.b("BizName", r26.n0.s0(bizName, "-", bizName), true);
        if (list != null) {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 == 0) {
                    c6717x1f65835c.f140567h = c6717x1f65835c.b("Extra0", (java.lang.String) list.get(i17), true);
                } else if (i17 == 1) {
                    c6717x1f65835c.f140568i = c6717x1f65835c.b("Extra1", (java.lang.String) list.get(i17), true);
                } else if (i17 == 2) {
                    c6717x1f65835c.f140569j = c6717x1f65835c.b("Extra2", (java.lang.String) list.get(i17), true);
                } else if (i17 == 3) {
                    c6717x1f65835c.f140570k = c6717x1f65835c.b("Extra3", (java.lang.String) list.get(i17), true);
                } else if (i17 == 4) {
                    c6717x1f65835c.f140571l = c6717x1f65835c.b("Extra4", (java.lang.String) list.get(i17), true);
                }
            }
        }
        if (jSONObject != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6717x1f65835c.f140572m = c6717x1f65835c.b("Extra5", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        }
        c6717x1f65835c.k();
    }

    @Override // je3.i
    public void t6(java.lang.String sessionId, java.lang.String bizName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72 scene, long j17, java.lang.String extras, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        if (Ii(f17)) {
            long j18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d() ? 1L : 2L;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6721x99869c50 c6721x99869c50 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6721x99869c50();
            c6721x99869c50.f140595d = c6721x99869c50.b("SessionID", sessionId, true);
            c6721x99869c50.f140596e = c6721x99869c50.b("BizName", bizName, true);
            c6721x99869c50.f140597f = scene.getValue();
            c6721x99869c50.f140598g = j17;
            c6721x99869c50.f140599h = c6721x99869c50.b("Extras", extras, false);
            c6721x99869c50.f140600i = j18;
            c6721x99869c50.k();
        }
    }

    @Override // je3.i
    public void vb(java.lang.String bizName, int i17, long j17, java.lang.String clickId, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446 role, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e eventType, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86 action, int i18, int i19, java.lang.String extraInfo, java.lang.String cardName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(role, "role");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardName, "cardName");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6718x4525583a c6718x4525583a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6718x4525583a();
        c6718x4525583a.f140575d = c6718x4525583a.b("BizName", bizName, true);
        c6718x4525583a.f140576e = i17;
        c6718x4525583a.f140577f = 0L;
        c6718x4525583a.f140578g = c6718x4525583a.b("ClickId", clickId, true);
        c6718x4525583a.f140579h = role.getValue();
        c6718x4525583a.f140580i = eventType.getValue();
        c6718x4525583a.f140581j = action.getValue();
        c6718x4525583a.f140582k = i18;
        c6718x4525583a.f140583l = i19;
        c6718x4525583a.f140584m = c6718x4525583a.b("ExtraInfo", extraInfo, true);
        c6718x4525583a.f140585n = j17;
        c6718x4525583a.f140586o = c6718x4525583a.b("CardName", cardName, true);
        c6718x4525583a.k();
    }
}
