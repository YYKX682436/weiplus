package hz4;

/* loaded from: classes12.dex */
public class w extends hz4.h {
    public static final java.util.HashMap M = new java.util.HashMap();
    public boolean A;
    public java.lang.String B;
    public java.lang.String G;
    public java.lang.String K;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f368004u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f368005v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Long f368006w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f368009z;

    /* renamed from: x, reason: collision with root package name */
    public long f368007x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f368008y = 0;
    public r45.ul5 C = null;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public r45.dq0 H = new r45.dq0();
    public byte[] I = null;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f368003J = "";
    public java.lang.String L = null;

    public w() {
        this.f367948f.clear();
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
    }

    @Override // hz4.h
    public boolean a(android.content.Context context, java.lang.String str) {
        iz4.o oVar;
        if (str == null || str.isEmpty() || (oVar = (iz4.o) ((java.util.LinkedHashMap) this.f367950h).get(str)) == null || oVar.f377663n.M == null) {
            return false;
        }
        return ((fo.e) ((le5.e) i95.n0.c(le5.e.class))).aj(context, this.f368006w.longValue(), oVar.f377663n.M);
    }

    @Override // hz4.h
    public void c(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 8;
        eqVar.f88118c = gp0Var;
        eqVar.f88119d = this.f368006w.longValue();
        eqVar.f88120e = this.B;
        eqVar.f88126k = "";
        c5888x4e3b0044.e();
    }

    @Override // hz4.h
    public void d(r45.gp0 gp0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 8;
        eqVar.f88118c = gp0Var;
        eqVar.f88119d = this.f368006w.longValue();
        eqVar.f88120e = this.B;
        eqVar.f88126k = str;
        c5888x4e3b0044.e();
    }

    @Override // hz4.h
    public java.lang.String e(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 1;
        eqVar.f88118c = gp0Var;
        eqVar.f88119d = this.f368006w.longValue();
        eqVar.f88120e = this.B;
        c5888x4e3b0044.e();
        return c5888x4e3b0044.f136197h.f88226b;
    }

    @Override // hz4.h
    public java.lang.String h() {
        if (this.L == null) {
            java.lang.String str = "";
            if (this.f368006w.longValue() != -1) {
                str = pt0.f0.Li(this.B, this.f368006w.longValue()).I0() + "";
            }
            this.L = str;
        }
        return this.L;
    }

    @Override // hz4.h
    public java.lang.String i() {
        return this.f368005v;
    }

    @Override // hz4.h
    public java.lang.String j(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 1;
        eqVar.f88118c = gp0Var;
        eqVar.f88119d = this.f368006w.longValue();
        eqVar.f88120e = this.B;
        c5888x4e3b0044.e();
        return c5888x4e3b0044.f136197h.f88227c;
    }

    @Override // hz4.h
    public void k(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", this.f368006w);
        intent.putExtra("message_talker", this.B);
        intent.putExtra("record_xml", this.f368004u);
        java.util.Map map = this.f367950h;
        intent.putExtra("record_data_id", ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377636a);
        r45.gp0 n17 = bt3.g2.n(this.f368004u, ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377636a);
        java.lang.String str2 = this.B;
        java.lang.Long l17 = this.f368006w;
        if (o72.x1.t0(bw5.ar0.TingScene_Chat, n17, bt3.g2.t(n17, str2, l17 != null ? l17.longValue() : 0L, 1))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteMsgProcess", "goToFile playLocalFile by ting");
        } else {
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "record", ".ui.RecordMsgFileUI", intent, null);
        }
    }

    @Override // hz4.h
    public void l(android.content.Context context, java.lang.String str) {
        if (mz4.m.f414851a.a()) {
            r(context, str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", this.f368006w);
        intent.putExtra("message_talker", this.B);
        intent.putExtra("record_data_id", ((iz4.o) ((java.util.LinkedHashMap) this.f367950h).get(str)).f377636a);
        intent.putExtra("record_xml", this.f368004u);
        intent.putExtra("from_scene", 1);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "record", ".ui.RecordMsgImageUI", intent, null);
    }

    @Override // hz4.h
    public void m(android.content.Context context, java.lang.String str) {
        r45.ip0 ip0Var;
        java.lang.String str2;
        java.util.Map map = this.f367950h;
        r45.gp0 gp0Var = ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377663n;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var != null) {
            hp0Var.getClass();
            ip0Var = gp0Var.J1.f457886d;
        } else {
            ip0Var = null;
        }
        if (ip0Var == null) {
            str2 = null;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ip0Var.f458770o)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str3 = ip0Var.f458764f;
            ((sg3.a) v0Var).getClass();
            str2 = c01.a2.e(str3);
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = ip0Var.f458770o;
            ((sg3.a) v0Var2).getClass();
            str2 = c01.a2.e(str4);
        }
        iz4.s sVar = (iz4.s) ((java.util.LinkedHashMap) map).get(str);
        if (sVar == null) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.e1.T(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cc9));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 12);
        intent.putExtra("kwebmap_slat", sVar.f377682u);
        intent.putExtra("kwebmap_lng", sVar.f377683v);
        intent.putExtra("kPoiName", sVar.f377681t);
        intent.putExtra("Kwebmap_locaion", sVar.f377685x);
        double d17 = sVar.f377684w;
        if (d17 >= 0.0d) {
            intent.putExtra("kwebmap_scale", d17);
        }
        intent.putExtra("kPoiid", sVar.f377686y);
        intent.putExtra("KIsFromPoiList", sVar.f377687z);
        intent.putExtra("KPoiCategoryTips", sVar.A);
        intent.putExtra("kPoiBusinessHour", sVar.B);
        intent.putExtra("KPoiPhone", sVar.C);
        intent.putExtra("KPoiPriceTips", sVar.D);
        intent.putExtra("kBuildingID", sVar.E);
        intent.putExtra("kFloorName", sVar.F);
        intent.putExtra("kisUsername", str2);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }

    @Override // hz4.h
    public boolean n(android.content.Context context, java.lang.String str) {
        if (!mz4.m.f414851a.a()) {
            return false;
        }
        r(context, str);
        return true;
    }

    public final void r(android.content.Context context, java.lang.String str) {
        byte[] bArr;
        android.content.Intent putExtra = new android.content.Intent().addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965).putExtra("message_id", this.f368006w).putExtra("message_talker", this.B);
        java.util.Map map = this.f367950h;
        android.content.Intent putExtra2 = putExtra.putExtra("record_data_id", ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377636a).putExtra("record_xml", this.f368004u).putExtra("from_scene", 1);
        r45.yp0 yp0Var = new r45.yp0();
        for (iz4.o oVar : ((java.util.LinkedHashMap) map).values()) {
            if (oVar instanceof iz4.k) {
                iz4.k kVar = (iz4.k) oVar;
                r45.zp0 zp0Var = new r45.zp0();
                zp0Var.f473794d = kVar.f377668s;
                zp0Var.f473795e = kVar.f377650t;
                zp0Var.f473796f = kVar.f377651u;
                zp0Var.f473797g = kVar.f377636a;
                zp0Var.f473798h = kVar.f377663n.f456964q2;
                zp0Var.f473799i = 4;
                yp0Var.f472802d.add(zp0Var);
            }
        }
        try {
            bArr = yp0Var.mo14344x5f01b1f6();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WNNoteMsgProcess", th6, "to bytes err", new java.lang.Object[0]);
            bArr = null;
        }
        android.content.Intent putExtra3 = putExtra2.putExtra("KEY_MEDIA_FAV_PREVIEW_DATA", bArr);
        if (context instanceof android.app.Activity) {
            j45.l.n((android.app.Activity) context, "record", ".ui.RecordMsgImageUI", putExtra3, 1);
        } else {
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "record", ".ui.RecordMsgImageUI", putExtra3, null);
        }
    }

    public void s(android.content.Context context, hz4.u uVar) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteMsgProcess", "setupWNNoteData, openData: " + uVar);
        o72.r2 r07 = o72.x1.r0(uVar.f367990c);
        this.f368004u = uVar.f367990c;
        this.f368005v = r07 == null ? "" : o72.r2.G0(r07);
        this.f368006w = uVar.f367989b;
        this.B = uVar.f367993f;
        this.f368007x = java.lang.System.currentTimeMillis();
        this.f368008y = uVar.f367996i;
        this.K = uVar.f367997j;
        this.f368009z = uVar.f367991d;
        this.A = uVar.f367992e;
        this.B = uVar.f367993f;
        this.D = uVar.f367994g;
        this.E = uVar.f367995h;
        this.H = uVar.f367998k;
        android.os.Bundle bundle = uVar.f367999l;
        if (bundle != null) {
            this.I = bundle.getByteArray("key_multi_task_common_info");
        }
        k82.c cVar = k82.c.f386420a;
        cVar.c(this.f368007x, 0L, 18, uVar.f367988a, 0);
        java.lang.String str = uVar.f367990c;
        kk.j jVar = qz4.c.f449470a;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 0;
        eqVar.f88117b = str;
        c5888x4e3b0044.e();
        r45.ul5 ul5Var = c5888x4e3b0044.f136197h.f88225a;
        this.C = ul5Var;
        if (ul5Var != null && (linkedList = ul5Var.f468998f) != null && linkedList.size() > 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b00442 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
            am.eq eqVar2 = c5888x4e3b00442.f136196g;
            eqVar2.f88116a = 9;
            eqVar2.f88118c = (r45.gp0) this.C.f468998f.get(0);
            eqVar2.f88119d = this.f368006w.longValue();
            eqVar2.f88120e = this.B;
            c5888x4e3b00442.e();
            this.F = c5888x4e3b00442.f136197h.f88228d;
        }
        r45.ul5 ul5Var2 = this.C;
        if (ul5Var2 == null || ul5Var2.f469000h == null) {
            this.G = null;
        } else {
            this.G = this.C.f469000h.f467424d + ";" + this.C.f469000h.f467425e + ";" + this.C.f469001i;
        }
        if (this.f368006w.longValue() != -1) {
            this.f368003J = te5.p1.a(pt0.f0.Li(this.B, this.f368006w.longValue()));
        }
        int i17 = uVar.f367988a;
        int i18 = i17 == 10 ? 5 : 1;
        if (q()) {
            cVar.b(this.f368007x);
            dz4.y2.f327001a.b();
            java.lang.String l17 = this.f368006w.toString();
            java.lang.String str2 = this.B;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String str4 = this.f368004u;
            dz4.f fVar = new dz4.f(l17, str3, str4 != null ? str4 : "", i18, this.f368007x, this.f368009z);
            fVar.f326829g = false;
            java.lang.String str5 = this.f367955p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
            fVar.f326831i = str5;
            fVar.f326830h = this.f367956q;
            fVar.f326832j = this.I;
            fVar.f326833k = this.f367951i;
            java.lang.String h17 = h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h17, "<set-?>");
            fVar.f326834l = h17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3325xe03a0797.p3326xc267989b.l.d(dz4.y2.f327002b, null, null, new dz4.x2(fVar, context, null), 3, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("note_fav_scene", i17);
            intent.putExtra("note_open_from_scene", i18);
            intent.putExtra("edit_status", this.f367953n);
            intent.putExtra("note_msgid", this.f368006w);
            intent.putExtra("SecurityMsgUsername", this.K);
            intent.putExtra("note_msgtalker", this.B);
            intent.putExtra("Retr_Security_Msg_Id", this.f368006w);
            intent.putExtra("Retr_Security_Msg_Talker", this.B);
            intent.putExtra("note_fav_localid", this.f368007x);
            intent.putExtra("SecurityPreviewType", this.f368008y);
            intent.putExtra("record_show_share", this.f368009z);
            intent.putExtra("show_share", this.f368009z);
            intent.putExtra("show_jump_chat", this.A);
            intent.putExtra("talker", this.B);
            intent.putExtra("fav_note_xml", this.f368004u);
            intent.putExtra("fav_note_out_of_date", this.F);
            intent.putExtra("fav_note_scroll_to_position", this.D);
            intent.putExtra("fav_note_scroll_to_offset", this.E);
            intent.putExtra("fav_note_blacklist_file_md5s", this.f368003J);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
                intent.putExtra("fav_note_link_source_info", this.G);
            }
            intent.putExtra("key_detail_fav_scene", this.H.f454186d);
            intent.putExtra("key_detail_fav_sub_scene", this.H.f454187e);
            intent.putExtra("key_detail_fav_index", this.H.f454188f);
            intent.putExtra("key_multi_task_common_info", this.I);
            com.p314xaae8f345.mm.ui.fj.d(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.class, 0);
            j45.l.j(context, "wenote", ".ui.nativenote.NoteEditorUI", intent, null);
        }
        gm0.j1.e().j(new hz4.v(this, r07, uVar));
    }

    public void t(java.lang.String str, java.lang.Long l17, java.lang.String str2, boolean z17, android.content.Context context, int i17, int i18, r45.dq0 dq0Var, android.os.Bundle bundle) {
        hz4.u uVar = new hz4.u();
        uVar.f367988a = dq0Var.f454186d;
        uVar.f367989b = l17;
        uVar.f367993f = str2;
        uVar.f367990c = str;
        uVar.f367991d = z17;
        uVar.f367994g = i17;
        uVar.f367995h = i18;
        uVar.f367996i = 0;
        uVar.f367998k = dq0Var;
        uVar.f367999l = bundle;
        s(context, uVar);
    }
}
