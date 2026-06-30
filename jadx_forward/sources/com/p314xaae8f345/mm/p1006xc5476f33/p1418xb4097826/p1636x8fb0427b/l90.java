package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class l90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f208655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        super(1);
        this.f208655d = c14994x9b99c079;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context;
        java.lang.String nickname = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f208655d;
        java.lang.ref.WeakReference weakReference = c14994x9b99c079.getTopicClickExtra().f184008d;
        android.content.Context context2 = weakReference != null ? (android.content.Context) weakReference.get() : null;
        cl0.g gVar = new cl0.g();
        gVar.o("entry_mode", 1);
        gVar.p("remind_feedid", c14994x9b99c079.getFeedObject().m76784x5db1b11());
        c61.p2 p2Var = (c61.p2) ybVar;
        p2Var.getClass();
        if (context2 != null) {
            java.util.HashMap hashMap = p2Var.f120749f;
            if (hashMap.containsKey(nickname)) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) hashMap.get(nickname);
                java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m76197x6c03c64c) || m76197x6c03c64c == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "username nil");
                    db5.t7.m123882x26a183b(context2, com.p314xaae8f345.mm.R.C30867xcad56011.clo, 0).show();
                } else {
                    p2Var.vj(m76197x6c03c64c, context2, c14994x9b99c079, context2, gVar);
                }
                context = context2;
            } else {
                context = context2;
                new db2.u1(kz5.b0.c(nickname), null).l().K(new c61.j2(p2Var, nickname, context2, c14994x9b99c079, gVar));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("nickname", nickname);
            } catch (org.json.JSONException unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "link_at_profile", 1, jSONObject, false, null, 48, null);
        }
        return jz5.f0.f384359a;
    }
}
