package df2;

/* loaded from: classes3.dex */
public final class v0 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public long f313105m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f313106n;

    /* renamed from: o, reason: collision with root package name */
    public r45.yg7 f313107o;

    /* renamed from: p, reason: collision with root package name */
    public az2.j f313108p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f313109q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313106n = "";
        this.f313107o = r45.yg7.FinderLiveImgSource_PhotoAlbum;
    }

    public static final void Z6(df2.v0 v0Var, int i17, df2.k0 k0Var) {
        v0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEditCoverController", "reportEditCoverSheetAction " + i17 + ", " + k0Var);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", k0Var.f312068d);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409914u2, jSONObject.toString(), null, 4, null);
    }

    public static final void a7(df2.v0 v0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = v0Var.f313109q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        v0Var.f313109q = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(v0Var.O6(), v0Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, new df2.u0(v0Var));
    }

    public final java.lang.Object b7(r45.lw1 lw1Var, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z18 = true;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("type", 1);
        jSONObject.put("sub_element", 7);
        jSONObject.put("sub_type", 3);
        java.lang.String str = this.f313106n;
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            jSONObject.put("ai_msg_id", this.f313106n);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        v65.n nVar = new v65.n(rVar);
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m, i17, ek2.r1.f335057u.d(lw1Var));
        pq5.g l17 = r1Var.l();
        l17.K(new df2.m0(nVar, this, z17));
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) O6());
        this.f313108p = r1Var;
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final boolean c7() {
        return (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_force_enable_cover_enhance, 0) == 1) || ((mm2.f1) m56788xbba4bfc0(mm2.f1.class)).f410554g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(java.lang.String r7, r45.yg7 r8, boolean r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.v0.d7(java.lang.String, r45.yg7, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(O6(), 1, true);
        android.content.res.Resources resources = O6().getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        r45.z02 z02Var = ((mm2.f1) m56788xbba4bfc0(mm2.f1.class)).f410553f;
        objArr[0] = java.lang.Integer.valueOf(z02Var != null ? z02Var.m75939xb282bd08(1) : 0);
        r45.z02 z02Var2 = ((mm2.f1) m56788xbba4bfc0(mm2.f1.class)).f410553f;
        objArr[1] = java.lang.Integer.valueOf(z02Var2 != null ? z02Var2.m75939xb282bd08(0) : 0);
        k0Var.q(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e66, objArr), 17);
        k0Var.f293405n = new df2.p0(this);
        k0Var.f293414s = new df2.r0(this);
        k0Var.C = new df2.s0(this);
        k0Var.v();
    }

    public final void f7(java.lang.String str) {
        r45.z02 z02Var = ((mm2.f1) m56788xbba4bfc0(mm2.f1.class)).f410553f;
        if ((z02Var != null ? z02Var.m75939xb282bd08(0) : 0) <= 0) {
            db5.t7.g(N6(), O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e67));
            return;
        }
        if (c01.id.c() - this.f313105m < 60000) {
            db5.t7.g(N6(), O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e68));
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f313106n = str;
        if (U6()) {
            W6(new df2.t0(this));
        } else {
            e7();
        }
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6;
        android.net.Uri data;
        r5 = null;
        java.lang.String str = null;
        if (i17 == 100115) {
            if (i18 != -1) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            if ((c16991x15ced046 != null ? c16991x15ced046.f237195f : null) == null || !com.p314xaae8f345.mm.vfs.w6.j(c16991x15ced046.f237195f)) {
                return;
            }
            java.lang.String str2 = c16991x15ced046.f237195f;
            r45.yg7 yg7Var = this.f313107o;
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("key_extra_data") : null;
            boolean z17 = bundleExtra != null ? bundleExtra.getBoolean("has_apply_hd", false) : false;
            this.f313107o = r45.yg7.FinderLiveImgSource_PhotoAlbum;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.n0(this, str2, yg7Var, z17, null), 3, null);
            return;
        }
        if (i17 == 155001 && i18 == -1) {
            if (intent != null && (data = intent.getData()) != null) {
                str = data.getPath();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = N6();
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l;
                ((ub0.r) oVar).getClass();
                str = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(N62, intent, str3);
            }
            java.lang.String str4 = str;
            if (str4 == null || (N6 = N6()) == null) {
                return;
            }
            zl2.k.f555384a.a(N6, str4, 100115, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? false : c7(), (r17 & 32) != 0 ? r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive : r45.bo1.FinderLiveCoverImageEnhanceScene_ChangeCover, (r17 & 64) != 0 ? false : false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }
}
