package va2;

/* loaded from: classes2.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // x92.m
    public void F7(java.lang.String tabName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        r45.r03 r03Var = (r45.r03) this.f534244w;
        long m75942xfb822ef2 = r03Var != null ? r03Var.m75942xfb822ef2(1) : 0L;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("topicid", pm0.v.u(m75942xfb822ef2));
            jSONObject.put("topictag", stringExtra);
            jSONObject.put("tabtype", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "topictab", i18, jSONObject, false, null, 48, null);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public void G7() {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        pf5.e.m158343xd39de650(this, null, null, new va2.m(this, m158359x1e885992().getIntExtra("key_topic_type", 1), stringExtra, m158359x1e885992().getLongExtra("key_feed_id", 0L), null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 I7(r45.bo6 tagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250.C13664xb1a014bc c13664xb1a014bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250.C13664xb1a014bc();
        c13664xb1a014bc.f210798p = tagInfo.m75939xb282bd08(1) - 1;
        c13664xb1a014bc.f210799q = tagInfo.m75945x2fec8307(0);
        c13664xb1a014bc.f183286u = tagInfo.m75942xfb822ef2(2);
        java.lang.String m75945x2fec8307 = tagInfo.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        c13664xb1a014bc.f183287v = m75945x2fec8307;
        return c13664xb1a014bc;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 J7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1 mediaTabInfo, java.util.LinkedList tags) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaTabInfo, "mediaTabInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250.C13665xcf02b686 c13665xcf02b686 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250.C13665xcf02b686();
        c13665xcf02b686.f183341w = mediaTabInfo;
        c13665xcf02b686.f183342x = tags;
        c13665xcf02b686.f183343y = this.C;
        return c13665xcf02b686;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public w92.a K7(r45.bo6 tagInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        java.lang.String m75945x2fec8307 = tagInfo.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        return new w92.a(-1, m75945x2fec8307, z17, tagInfo.m75939xb282bd08(1), 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public int N7() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    /* renamed from: O7 */
    public r45.r03 B7() {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        u92.b a17 = u92.a.a(u92.b.f507355e, 0L, null, stringExtra, 3, null);
        if (a17 == null) {
            return null;
        }
        if (!a17.d()) {
            a17 = null;
        }
        if (a17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) a17.f117894b;
        r45.ma1 ma1Var = fVar != null ? (r45.ma1) fVar.f152151d : null;
        if (ma1Var != null) {
            return (r45.r03) ma1Var.m75936x14adae67(1);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public boolean Q7(r45.r03 topicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        r45.q03 q03Var = (r45.q03) topicInfo.m75936x14adae67(20);
        if (q03Var == null) {
            return false;
        }
        z5();
        java.util.LinkedList m75941xfb821914 = q03Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
        P7(m75941xfb821914, false);
        return true;
    }

    @Override // x92.m
    /* renamed from: R7, reason: merged with bridge method [inline-methods] */
    public void E7(r45.r03 r03Var) {
        java.lang.String m75945x2fec8307;
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        r45.r03 r03Var2 = (r45.r03) this.f534244w;
        m158359x1e885992.putExtra("KEY_TOPIC_ID", r03Var2 != null ? r03Var2.m75942xfb822ef2(1) : 0L);
        super.E7(r03Var);
        long longExtra = m158359x1e885992().getLongExtra("key_ref_object_id", 0L);
        long longExtra2 = m158359x1e885992().getLongExtra("KEY_TOPIC_ID", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        r45.r03 r03Var3 = (r45.r03) this.f534244w;
        if (r03Var3 != null) {
            longExtra2 = r03Var3.m75942xfb822ef2(1);
        }
        r45.r03 r03Var4 = (r45.r03) this.f534244w;
        if (r03Var4 != null && (m75945x2fec8307 = r03Var4.m75945x2fec8307(0)) != null) {
            stringExtra = m75945x2fec8307;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut utVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class);
        utVar.P6("feedid", pm0.v.u(longExtra));
        utVar.P6("topicid", pm0.v.u(longExtra2));
        utVar.P6("topicname", stringExtra);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public boolean y7() {
        return this.f534243v != null;
    }

    @Override // x92.q
    public void z5() {
        android.view.View findViewById;
        if (a2() && (findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.nvf)) != null) {
            findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        }
        mo55425x60022348();
    }
}
