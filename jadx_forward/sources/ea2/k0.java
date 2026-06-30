package ea2;

/* loaded from: classes2.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f {
    public long F;
    public int G;
    public java.lang.String H;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.p1427x9da2e250.C13648x75a87560 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        c01.id.c();
        this.H = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public boolean A7(int i17) {
        return i17 == -4081 || i17 == -4080;
    }

    @Override // x92.m
    public void F7(java.lang.String tabName, int i17, int i18) {
        java.lang.String str;
        r45.hj2 hj2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        fa2.a aVar = fa2.a.f342239a;
        android.app.Activity m80379x76847179 = m80379x76847179();
        r45.r03 r03Var = (r45.r03) this.f534244w;
        r45.hj2 hj2Var2 = r03Var != null ? (r45.hj2) r03Var.m75936x14adae67(19) : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        byte[] bytes = tabName.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        jSONObject.put("tab_name", android.util.Base64.encodeToString(bytes, 2));
        r45.r03 r03Var2 = (r45.r03) this.f534244w;
        if (r03Var2 == null || (hj2Var = (r45.hj2) r03Var2.m75936x14adae67(19)) == null || (str = hj2Var.m75945x2fec8307(15)) == null) {
            str = "";
        }
        jSONObject.put("audioId", str);
        fa2.a.a(aVar, m80379x76847179, "music_profile_video_tab", i18, 0, hj2Var2, jSONObject, 8, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public y92.b M7() {
        long longExtra = m158359x1e885992().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        long longExtra2 = m158359x1e885992().getLongExtra("key_feed_id", 0L);
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("key_topic_info_pass_buff");
        return new y92.b(longExtra, str, java.lang.Long.valueOf(longExtra2), byteArrayExtra != null ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(byteArrayExtra) : null, java.lang.Integer.valueOf(longExtra == 0 ? 1 : 0), null, 32, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public boolean Q7(r45.r03 topicInfo) {
        java.lang.String str;
        java.lang.String str2;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var2;
        r45.hj2 hj2Var3;
        r45.zi2 zi2Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        r45.hj2 hj2Var4 = (r45.hj2) topicInfo.m75936x14adae67(19);
        if (hj2Var4 == null) {
            return false;
        }
        z5();
        r45.ij2 ij2Var = (r45.ij2) hj2Var4.m75936x14adae67(6);
        if (ij2Var == null) {
            return false;
        }
        long m75942xfb822ef2 = hj2Var4.m75942xfb822ef2(0);
        java.util.LinkedList m75941xfb821914 = ij2Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("");
        r45.r03 r03Var = (r45.r03) this.f534244w;
        int i17 = 3;
        java.lang.String m75945x2fec8307 = (r03Var == null || (hj2Var3 = (r45.hj2) r03Var.m75936x14adae67(19)) == null || (zi2Var2 = (r45.zi2) hj2Var3.m75936x14adae67(3)) == null) ? null : zi2Var2.m75945x2fec8307(12);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        this.H = m75945x2fec8307;
        m158359x1e885992().putExtra("key_song_id", this.H);
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        r45.r03 r03Var2 = (r45.r03) this.f534244w;
        if (r03Var2 == null || (hj2Var2 = (r45.hj2) r03Var2.m75936x14adae67(19)) == null || (str = hj2Var2.m75945x2fec8307(15)) == null) {
            str = "";
        }
        m158359x1e885992.putExtra("key_audio_id", str);
        android.content.Intent m158359x1e8859922 = m158359x1e885992();
        r45.r03 r03Var3 = (r45.r03) this.f534244w;
        if (r03Var3 == null || (hj2Var = (r45.hj2) r03Var3.m75936x14adae67(19)) == null || (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) == null || (str2 = zi2Var.m75945x2fec8307(0)) == null) {
            str2 = "";
        }
        m158359x1e8859922.putExtra("key_doc_id", str2);
        android.content.Intent intent = m80379x76847179().getIntent();
        long longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
        android.content.Intent intent2 = m80379x76847179().getIntent();
        java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra("key_feed_dup_flag") : null;
        R7();
        int i18 = 0;
        for (java.lang.Object obj : m75941xfb821914) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ys4 ys4Var = (r45.ys4) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.p1427x9da2e250.C13648x75a87560 c13648x75a87560 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.p1427x9da2e250.C13648x75a87560();
            c13648x75a87560.f210798p = ys4Var.m75939xb282bd08(1) - 1;
            c13648x75a87560.f210799q = ys4Var.m75945x2fec8307(0);
            c13648x75a87560.f183286u = m75942xfb822ef2;
            java.lang.String m75945x2fec83072 = ys4Var.m75945x2fec8307(0);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c13648x75a87560.f183287v = m75945x2fec83072;
            m158359x1e885992().putExtra("key_ref_object_id", longExtra);
            m158359x1e885992().putExtra("key_ref_object_dup_flag", stringExtra);
            m158359x1e885992().putExtra("key_feed_ref_id", longExtra);
            m158359x1e885992().putExtra("key_feed_ref_dup_flag", stringExtra);
            int m75939xb282bd08 = ys4Var.m75939xb282bd08(1);
            if (m75939xb282bd08 == 1) {
                m158359x1e885992().putExtra("key_latest_index", i18);
            } else if (m75939xb282bd08 == i17) {
                this.I = c13648x75a87560;
            }
            java.lang.String m75945x2fec83073 = ys4Var.m75945x2fec8307(0);
            java.lang.String str3 = stringExtra;
            long j17 = longExtra;
            int i27 = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new w92.a(-1, m75945x2fec83073 == null ? "" : m75945x2fec83073, z17, 15, 0, 16, null), c13648x75a87560, false, 4, null);
            java.lang.String m75945x2fec83074 = ys4Var.m75945x2fec8307(0);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            F7(m75945x2fec83074, ys4Var.m75939xb282bd08(1), 0);
            i17 = i27;
            stringExtra = str3;
            longExtra = j17;
            i18 = i19;
        }
        r7();
        return true;
    }

    public final void R7() {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        java.lang.String m75945x2fec8307;
        r45.hj2 hj2Var2;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut utVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class);
        utVar.P6("activityid", pm0.v.u(this.F));
        utVar.O6("src_type", this.G);
        utVar.P6("songid", this.H);
        r45.r03 r03Var = (r45.r03) this.f534244w;
        java.lang.String str2 = "";
        if (r03Var == null || (hj2Var2 = (r45.hj2) r03Var.m75936x14adae67(19)) == null || (str = hj2Var2.m75945x2fec8307(15)) == null) {
            str = "";
        }
        utVar.P6("audioId", str);
        r45.r03 r03Var2 = (r45.r03) this.f534244w;
        if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.m75936x14adae67(19)) != null && (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) != null && (m75945x2fec8307 = zi2Var.m75945x2fec8307(0)) != null) {
            str2 = m75945x2fec8307;
        }
        utVar.P6("docid", str2);
        android.content.Intent intent = utVar.m80379x76847179().getIntent();
        utVar.P6("source_feedid", pm0.v.u(intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L));
        android.content.Intent intent2 = utVar.m80379x76847179().getIntent();
        utVar.O6("source_position", intent2 != null ? intent2.getIntExtra("key_source_postion", 0) : 0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = utVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84 activityC13649x64352d84 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84) m158354x19263085 : null;
        utVar.O6("expose_count", activityC13649x64352d84 != null ? activityC13649x64352d84.f183290w : 0);
    }

    @Override // x92.m, x92.q
    public java.lang.String d2() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        this.F = m158359x1e885992().getLongExtra("key_activity_id", 0L);
        this.G = m158359x1e885992().getIntExtra("key_source_type", 0);
        R7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public int w7() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4e;
    }
}
