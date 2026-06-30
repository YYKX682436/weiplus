package hz4;

/* loaded from: classes12.dex */
public class p extends hz4.h implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final java.util.HashMap R = new java.util.HashMap();
    public o72.r2 B;
    public java.lang.String F;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f367977J;
    public java.lang.String K;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f367981x;

    /* renamed from: u, reason: collision with root package name */
    public long f367978u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f367979v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f367980w = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f367982y = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f367983z = false;
    public boolean A = false;
    public boolean C = true;
    public int D = 0;
    public int E = 0;
    public int G = 0;
    public long H = 0;
    public r45.dq0 I = new r45.dq0();
    public byte[] L = null;
    public boolean M = false;
    public java.lang.String N = "";
    public java.lang.String P = "";
    public java.lang.String Q = null;

    public p() {
        this.f367948f.clear();
        this.f367947e = null;
        this.f367953n = false;
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        c01.d9.e().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6, this);
    }

    public static void r(hz4.p pVar, r45.bq0 bq0Var, boolean z17, int i17) {
        pVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(bq0Var == null);
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteFavProcess", "processNoteData: start, favProtoItem null=%b, allowNull=%b, dealScene=%d", objArr);
        if (bq0Var != null || z17) {
            o72.r2 r2Var = new o72.r2();
            r2Var.f67645x88be67a1 = pVar.f367978u;
            r2Var.f67640x5ab01132 = bq0Var;
            pVar.f367954o = bq0Var;
            pVar.f367947e = r2Var;
            pVar.B = r2Var;
        }
        if (pVar.q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteFavProcess", "processNoteData: skip");
            return;
        }
        java.util.HashMap hashMap = R;
        if (hashMap.containsKey(pVar.B)) {
            pVar.f367946d = (iz4.m) hashMap.get(pVar.B);
        } else {
            pVar.u();
        }
        iz4.m mVar = pVar.f367946d;
        if (mVar != null) {
            pVar.b(mVar.f377656a, true, i17);
        }
        mz4.j0 j0Var = mz4.j0.f414823v;
        if (j0Var == null || j0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h;
        activityC19519x7af4daf3.getClass();
        activityC19519x7af4daf3.q7(true, false);
    }

    @Override // hz4.h
    public boolean a(android.content.Context context, java.lang.String str) {
        return false;
    }

    @Override // hz4.h
    public void b(java.util.List list, boolean z17, int i17) {
        o72.r2 r2Var = this.B;
        if (r2Var != null) {
            r2Var.w0("MicroMsg.WNNoteFavProcess", o72.r2.H1);
        }
        super.b(list, z17, i17);
    }

    @Override // hz4.h
    public void c(r45.gp0 gp0Var) {
        iz4.m mVar = this.f367946d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 28;
        z9Var.f90065e = mVar.f377657b.f67645x88be67a1;
        z9Var.f90066f = gp0Var;
        z9Var.f90075o = "";
        z9Var.f90073m = 18;
        c5432x35bb364f.e();
    }

    @Override // hz4.h
    public void d(r45.gp0 gp0Var, java.lang.String str) {
        iz4.m mVar = this.f367946d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 28;
        z9Var.f90065e = mVar.f377657b.f67645x88be67a1;
        z9Var.f90066f = gp0Var;
        z9Var.f90075o = str;
        z9Var.f90073m = 18;
        c5432x35bb364f.e();
    }

    @Override // hz4.h
    public java.lang.String e(r45.gp0 gp0Var) {
        return hz4.l.c(gp0Var);
    }

    @Override // hz4.h
    public java.lang.String h() {
        if (this.Q == null) {
            java.lang.String str = "";
            if (android.text.TextUtils.isEmpty(this.f367981x)) {
                o72.r2 r2Var = this.B;
                if (r2Var != null) {
                    str = java.lang.String.valueOf(r2Var.f67643xc8a07680);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f367981x);
                if (b17 != null) {
                    str = java.lang.String.valueOf(b17.f68891x29d1292e);
                }
            }
            if (android.text.TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.Q = str;
        }
        return this.Q;
    }

    @Override // hz4.h
    public java.lang.String i() {
        return this.f367982y;
    }

    @Override // hz4.h
    public java.lang.String j(r45.gp0 gp0Var) {
        return hz4.l.e(gp0Var);
    }

    @Override // hz4.h
    public void k(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.util.Map map = this.f367950h;
        iz4.u uVar = (iz4.u) ((java.util.LinkedHashMap) map).get(str);
        if (uVar != null && com.p314xaae8f345.mm.vfs.w6.j(uVar.f377668s)) {
            if (((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(uVar.f377691v)) {
                bw5.l80 wi6 = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).wi(uVar.f377668s, uVar.f377691v, uVar.f377689t, null);
                il4.e eVar = new il4.e();
                eVar.f373639c = 1500;
                eVar.f373640d = false;
                ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ni(wi6, eVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteFavProcess", "goToFile playLocalFile by ting");
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("fav_open_from_wnnote", true);
        intent.putExtra("fav_note_xml", this.f367982y);
        if (uVar != null) {
            o72.r2 a17 = hz4.l.a(this.f367978u);
            if (a17 != null) {
                java.util.Iterator it = a17.f67640x5ab01132.f452497f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377636a;
                        break;
                    }
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.P1) && gp0Var.P1.equals(str)) {
                        str2 = gp0Var.T;
                        break;
                    }
                }
            } else {
                str2 = ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377636a;
            }
            intent.putExtra("key_detail_data_id", str2);
        }
        intent.putExtra("key_detail_can_delete", false);
        intent.putExtra("key_detail_info_id", this.f367978u);
        intent.putExtra("key_detail_fav_scene", this.I.f454186d);
        intent.putExtra("key_detail_fav_sub_scene", this.I.f454187e);
        intent.putExtra("key_detail_fav_index", this.I.f454188f);
        o72.x1.M0(context, ".ui.detail.FavoriteFileDetailUI", intent, 1, null);
    }

    @Override // hz4.h
    public void l(android.content.Context context, java.lang.String str) {
        if (mz4.m.f414851a.a()) {
            s(context, str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("fav_open_from_wnnote", true);
        intent.putExtra("fav_note_xml", this.f367982y);
        java.util.Map map = this.f367950h;
        if (((java.util.LinkedHashMap) map).get(str) != null) {
            intent.putExtra("key_detail_data_id", ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f377636a);
        }
        intent.putExtra("key_detail_info_id", this.f367978u);
        intent.putExtra("key_detail_fav_scene", this.I.f454186d);
        intent.putExtra("key_detail_fav_sub_scene", this.I.f454187e);
        intent.putExtra("key_detail_fav_index", this.I.f454188f);
        o72.x1.M0(context, ".ui.FavImgGalleryUI", intent, 1, null);
    }

    @Override // hz4.h
    public void m(android.content.Context context, java.lang.String str) {
        iz4.s sVar = (iz4.s) ((java.util.LinkedHashMap) this.f367950h).get(str);
        if (sVar == null) {
            db5.e1.T(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cc9));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
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
        intent.putExtra("kisUsername", "");
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("map_view_type", 12);
        intent.putExtra("kFavInfoLocalId", this.f367978u);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        j45.l.n(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 1);
    }

    @Override // hz4.h
    public boolean n(android.content.Context context, java.lang.String str) {
        if (!mz4.m.f414851a.a()) {
            return false;
        }
        s(context, str);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 426 && (m1Var instanceof o72.l5)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90076p = m1Var;
            z9Var.f90061a = 31;
            c5432x35bb364f.e();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5432x35bb364f.f135777h.f87669c) && i18 == -435) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteFavProcess", "wenote conflict when commit");
            }
            c01.d9.e().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6, this);
        }
    }

    public final void s(android.content.Context context, java.lang.String str) {
        o72.x1.M0(context, ".ui.gallery.FavMediaGalleryUI", new android.content.Intent().addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965).putExtra("KEY_MEDIA_FAVID_LIST", new long[]{this.f367978u}).putExtra("KEY_MEDIA_SUPPORT_DRAG", true).putExtra("KEY_MEDIA_HIDE_GO_DETAIL", true).putExtra("key_detail_data_id", ((iz4.o) ((java.util.LinkedHashMap) this.f367950h).get(str)).f377636a).putExtra("fav_note_xml", this.f367982y).putExtra("fav_open_from_wnnote", true).putExtra("key_detail_info_id", this.f367978u).putExtra("key_detail_fav_scene", this.I.f454186d).putExtra("key_detail_fav_sub_scene", this.I.f454187e).putExtra("key_detail_fav_index", this.I.f454188f), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0241 A[Catch: Exception -> 0x024f, TRY_LEAVE, TryCatch #0 {Exception -> 0x024f, blocks: (B:57:0x0145, B:61:0x0159, B:63:0x015f, B:67:0x01bb, B:69:0x01ca, B:71:0x01d0, B:75:0x01e7, B:77:0x01ed, B:79:0x023a, B:81:0x0241), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.content.Context r24, int r25) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz4.p.t(android.content.Context, int):void");
    }

    public final void u() {
        r45.bq0 bq0Var;
        iz4.m mVar = new iz4.m();
        this.f367946d = mVar;
        mVar.f377657b = this.B;
        mVar.f377658c = this.f367978u;
        o72.r2 r2Var = this.B;
        if (r2Var == null || (bq0Var = r2Var.f67640x5ab01132) == null) {
            return;
        }
        iz4.m mVar2 = this.f367946d;
        mVar2.f377660e = this.H;
        mVar2.f377656a = bq0Var.f452497f;
        R.put(r2Var, mVar2);
    }

    public final void v() {
        o72.r2 a17 = hz4.l.a(this.f367978u);
        this.B = a17;
        if (a17 == null) {
            return;
        }
        if (this.H <= 0) {
            this.H = a17.f67659xa783a79b;
        }
        this.f367954o = a17.f67640x5ab01132;
        this.f367947e = a17;
    }

    public void w(long j17, android.content.Context context, java.lang.String str, java.lang.Boolean bool, int i17, int i18, r45.dq0 dq0Var, r45.bq0 bq0Var, byte[] bArr, boolean z17) {
        hz4.j jVar = new hz4.j();
        jVar.f367961a = j17;
        jVar.f367962b = context;
        jVar.f367963c = str;
        jVar.f367964d = bool;
        jVar.f367965e = i17;
        jVar.f367966f = i18;
        jVar.f367967g = dq0Var;
        jVar.f367968h = bq0Var;
        jVar.f367969i = bArr;
        jVar.f367970j = z17;
        x(jVar);
    }

    public void x(hz4.j jVar) {
        r45.jq0 jq0Var;
        this.f367983z = jVar.f367970j;
        this.f367978u = jVar.f367961a;
        this.C = jVar.f367964d.booleanValue();
        this.D = jVar.f367965e;
        this.E = jVar.f367966f;
        this.I = jVar.f367967g;
        this.L = jVar.f367969i;
        v();
        if (!this.f367983z && jVar.f367968h == null) {
            o72.r2 r2Var = this.B;
            int i17 = r2Var != null ? r2Var.f67643xc8a07680 : 0;
            this.f367979v = i17;
            int i18 = r2Var != null ? r2Var.f67651x76e81a5a : 0;
            r45.dq0 dq0Var = this.I;
            k82.c.f386420a.c(this.f367978u, i17, 18, dq0Var != null ? dq0Var.f454186d : 0, i18);
        }
        if (this.G == 0 && (jq0Var = this.f367954o.f452495d) != null) {
            this.G = jq0Var.f459567d;
        }
        if (q() && this.f367982y.isEmpty()) {
            if (this.B != null) {
                r72.k kVar = new r72.k();
                r72.l.a(kVar, this.B);
                this.f367982y = kVar.m126747x696739c();
            } else if (jVar.f367963c.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteFavProcess", "setupWNNoteData: favNoteXml empty!");
            } else {
                this.f367982y = jVar.f367963c;
            }
        }
        t(jVar.f367962b, 2);
        ((ku5.t0) ku5.t0.f394148d).g(new hz4.o(this, jVar));
    }
}
