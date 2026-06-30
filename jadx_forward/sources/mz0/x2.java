package mz0;

/* loaded from: classes5.dex */
public final class x2 extends mz0.b2 {
    public final java.util.Map I;

    /* renamed from: J, reason: collision with root package name */
    public int f414613J;
    public long K;
    public final boolean L;
    public final jz5.g M;
    public final jz5.g N;
    public final java.lang.String P;
    public final int Q;
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 R;
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 S;
    public final ty0.c T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.I = new java.util.LinkedHashMap();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Maas_SnsSpringOfflineStrategy_Int, -1));
        valueOf = valueOf.intValue() != -1 ? valueOf : null;
        this.L = (valueOf != null ? valueOf.intValue() : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoTemplateCdnDownloadDisabled", 0)) == 1;
        jz5.i iVar = jz5.i.f384364f;
        this.M = jz5.h.a(iVar, new mz0.v2(this));
        this.N = jz5.h.a(iVar, new mz0.n2(this));
        this.P = "moments";
        this.Q = dw3.j0.f325751a.b();
        this.R = new mz0.p2(this);
        this.S = new mz0.r2();
        this.T = new mz0.q2(this);
    }

    public static final void J7(mz0.x2 x2Var, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        x2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "saveSnsBgmExportData mjMusicId:" + str + ", listenId:" + str2 + ", isMajorOwned:" + bool);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.Map map = x2Var.I;
        if (map.containsKey(str) || bool == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = str;
        }
        mz0.m2 m2Var = new mz0.m2(str2, bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        map.put(str, m2Var);
    }

    @Override // mz0.b2
    public void C7(java.util.List defaultTemplateList, r45.rz6 rz6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTemplateList, "defaultTemplateList");
        bz0.j jVar = bz0.j.f118283a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(defaultTemplateList, 10));
        java.util.Iterator it = defaultTemplateList.iterator();
        while (it.hasNext()) {
            r45.rz6 rz6Var2 = (r45.rz6) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tid", rz6Var2.f466853d);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rz6Var2.f466853d, rz6Var != null ? rz6Var.f466853d : null)) {
                jSONObject.put("src", 0);
            } else {
                jSONObject.put("src", 3);
            }
            arrayList.add(jSONObject);
        }
        bz0.j.f118288f = arrayList;
    }

    @Override // mz0.b2
    public void D7(java.util.ArrayList mediaList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        this.f414613J = dx1.f.n(dx1.g.f326022a, "SnsTemplate", "mediadetail", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", null, true, null, null, 208, null);
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new mz0.u2(mediaList, null), 3, null);
    }

    @Override // mz0.b2
    public void E7(java.lang.String curSelectedItemId, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelectedItemId, "curSelectedItemId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.E7(curSelectedItemId, info);
        bz0.j jVar = bz0.j.f118283a;
        java.lang.String musicId = info.C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        java.util.List list2 = bz0.j.f118292j;
        java.util.List list3 = (java.util.List) kz5.n0.k0(list2);
        bz0.g gVar = list3 != null ? (bz0.g) kz5.n0.k0(list3) : null;
        ((java.util.ArrayList) list2).size();
        if (list3 != null) {
            list3.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(curSelectedItemId, gVar != null ? gVar.f118272a : null);
        if (gVar == null || (list = gVar.f118276e) == null) {
            return;
        }
        list.add(musicId);
    }

    @Override // mz0.b2
    public void F7(java.lang.String curSelectedItemId, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelectedItemId, "curSelectedItemId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.F7(curSelectedItemId, info);
        bz0.j jVar = bz0.j.f118283a;
        java.lang.String musicId = info.C;
        java.lang.String musicName = info.f237256t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicName, "musicName");
        java.util.List list = bz0.j.f118292j;
        java.util.List list2 = (java.util.List) kz5.n0.k0(list);
        bz0.g gVar = list2 != null ? (bz0.g) kz5.n0.k0(list2) : null;
        ((java.util.ArrayList) list).size();
        if (list2 != null) {
            list2.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(curSelectedItemId, gVar != null ? gVar.f118272a : null);
        if (gVar != null) {
            java.util.List list3 = gVar.f118274c;
            if (list3.contains(musicId)) {
                return;
            }
            list3.add(musicId);
            gVar.f118275d.add(musicName);
        }
    }

    @Override // mz0.b2
    public void G7(java.lang.String curSelectedItemId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelectedItemId, "curSelectedItemId");
        bz0.j.f118283a.b(o7().a(), str);
    }

    @Override // mz0.b2, dz0.k
    public java.lang.Object H6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        bz0.j jVar = bz0.j.f118283a;
        bz0.j.f118284b.f140531v = ((r45.ib6) this.M.mo141623x754a37bb()) != null ? 2 : 1;
        java.lang.Object V6 = mz0.b2.V6(this, interfaceC29045xdcb5ca57);
        return V6 == pz5.a.f440719d ? V6 : jz5.f0.f384359a;
    }

    @Override // mz0.b2
    public void H7(boolean z17) {
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        if (z17) {
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dz0.x xVar = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151322m;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (xVar == null || (g0Var = xVar.f326586d) == null) ? null : (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) g0Var.mo3195x754a37bb();
            if (c4116xf4b2c356 == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.b(c4116xf4b2c356, 1);
            b17.f237252p = 3;
            b17.f237255s = true;
            wv3.b.f531581a.d(b17, true);
        }
    }

    public final void K7(java.lang.String str) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "refreshFinalReport: ");
        dx1.f fVar = dx1.g.f326022a;
        fVar.i("SnsTemplate", "final_egid", str);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        az0.n7 n7Var = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151316d;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6 m33392xd96d6d9c = n7Var != null ? n7Var.f97275a.m33392xd96d6d9c() : null;
        if (m33392xd96d6d9c != null) {
            java.lang.String m33856x92013dca = m33392xd96d6d9c.m33862x16a99dbd().m33856x92013dca();
            if (m33856x92013dca == null) {
                m33856x92013dca = "";
            }
            fVar.i("SnsTemplate", "final_musicid", m33856x92013dca);
            i17 = java.lang.Integer.valueOf(java.lang.Integer.valueOf(m33392xd96d6d9c.m33863xac019deb().m33867x754a37bb()).intValue());
        } else {
            i17 = 0;
        }
        fVar.i("SnsTemplate", "final_musictype", i17);
    }

    @Override // mz0.b2, dz0.k
    public void Q1() {
        java.lang.Object obj;
        super.Q1();
        java.lang.String a17 = o7().a();
        dx1.f fVar = dx1.g.f326022a;
        fVar.j("SnsTemplate", "egpreviewcnt", 1, bx1.u.f117843e);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "td", java.lang.Integer.valueOf(this.f414613J), null, true, "egtd", null, 144, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "maasSessionKey", bz0.a.f118255a, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "egid", a17, null, false, null, null, 240, null);
        java.util.Iterator it = o7().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj).f151610a, a17)) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
        java.lang.Integer valueOf = m5Var != null ? java.lang.Integer.valueOf(o7().b().indexOf(m5Var)) : null;
        dx1.f fVar2 = dx1.g.f326022a;
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "eglocation", java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0), null, false, null, null, 240, null);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "vediotime", java.lang.Long.valueOf(((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).Y6()), null, false, null, null, 240, null);
        fVar2.i("SnsPublishProcess", "Maaskey", bz0.a.f118255a);
        dx1.f.n(fVar2, "SnsTemplate", "mediadetail", "maasSessionKey", bz0.a.f118255a, null, false, null, null, 240, null);
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "musicSearchFlag", 0, null, false, null, null, 240, null);
        bx1.u uVar = bx1.u.f117843e;
        fVar2.j("SnsTemplate", "musiccnt", 0, uVar);
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "musiccnt", 0, uVar, false, null, null, 224, null);
        bz0.j jVar = bz0.j.f118283a;
        jVar.a(a17, "");
        jVar.b(a17, "");
        K7(a17);
        this.K = java.lang.System.currentTimeMillis();
    }

    @Override // mz0.b2
    public java.lang.Object S6(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return nz0.o.f423063a.b(str, 4, interfaceC29045xdcb5ca57);
    }

    @Override // mz0.b2
    public java.lang.Object T6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return nz0.o.f423063a.c(3, "cache_key_sns", interfaceC29045xdcb5ca57);
    }

    @Override // mz0.b2
    public dz0.e W6() {
        return gz0.j.f359212a;
    }

    @Override // mz0.b2
    public dz0.h X6() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean i76 = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).i7();
        boolean z17 = !i76;
        boolean z18 = !i76;
        int i17 = d11.s.fj().qj().f152728h;
        ez0.o oVar = ez0.o.f339368a;
        java.util.List e17 = oVar.e();
        int i18 = d11.s.fj().qj().f152728h;
        boolean a17 = oVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(oVar.e());
        mz0.a a76 = a7();
        if (a76 != null) {
            arrayList.add(a76.f414404a);
        }
        return new dz0.h("MomentsTemplateRecommendv2", z17, z18, i17, true, e17, i18, a17, arrayList, oVar.b());
    }

    @Override // mz0.b2
    public mz0.a a7() {
        return (mz0.a) this.N.mo141623x754a37bb();
    }

    @Override // mz0.b2
    public java.lang.Object b7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return ez0.o.f339368a.f(interfaceC29045xdcb5ca57);
    }

    @Override // mz0.b2
    public mz0.b c7() {
        return null;
    }

    @Override // mz0.b2
    public java.lang.String d7() {
        return this.P;
    }

    @Override // mz0.b2
    public int e7() {
        return this.Q;
    }

    @Override // mz0.b2
    public com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 g7() {
        return this.R;
    }

    @Override // mz0.b2
    public ty0.c h7() {
        return this.T;
    }

    @Override // mz0.b2
    public com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 i7() {
        return this.S;
    }

    @Override // mz0.b2
    public yz5.q k7() {
        return new mz0.o2(this);
    }

    @Override // mz0.b2
    public boolean m7() {
        return this.L;
    }

    @Override // mz0.b2, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        dx1.f fVar = dx1.g.f326022a;
        fVar.i("SnsTemplate", "moreAction", 2);
        fVar.i("SnsPublishProcess", "ifMiaojian", 1);
        fVar.i("SnsTemplate", "goToMJAppResult", 0);
    }

    @Override // mz0.b2, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        dx1.f fVar = dx1.g.f326022a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        fVar.j("SnsPublishProcess", "egEditTime", java.lang.Long.valueOf(abstractActivityC21394xb3d2c0cf != null ? abstractActivityC21394xb3d2c0cf.mo78509x4b0ac5a2() : 0L), bx1.u.f117843e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        dx1.f.n(dx1.g.f326022a, "SnsTemplate", "editdetail", "egpreviewtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.K), bx1.u.f117843e, false, null, null, 224, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.K = java.lang.System.currentTimeMillis();
    }

    @Override // mz0.b2
    public boolean p7() {
        return !android.text.TextUtils.isEmpty(((r45.ib6) this.M.mo141623x754a37bb()) != null ? r0.f458448m : null);
    }

    @Override // mz0.b2
    public boolean q7() {
        return true;
    }

    @Override // mz0.b2
    public void r7(java.lang.Throwable th6) {
        n0.e5 e5Var;
        n0.e5 e5Var2;
        dx1.f fVar = dx1.g.f326022a;
        ty0.b1 b1Var = this.f414422m;
        int i17 = 0;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musicStatus", java.lang.Integer.valueOf(((b1Var == null || (e5Var2 = b1Var.f504327d) == null || !((java.lang.Boolean) e5Var2.mo128745x754a37bb()).booleanValue()) ? 0 : 1) ^ 1), null, false, null, null, 240, null);
        ty0.b1 b1Var2 = this.f414422m;
        if (b1Var2 != null && (e5Var = b1Var2.f504328e) != null && ((java.lang.Boolean) e5Var.mo128745x754a37bb()).booleanValue()) {
            i17 = 1;
        }
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "oriMusicStatus", java.lang.Integer.valueOf(i17 ^ 1), null, false, null, null, 240, null);
        if (th6 == null) {
            fVar.i("SnsTemplate", "egendcnt", 1);
        }
    }

    @Override // mz0.b2
    public void s7(java.lang.Throwable th6, java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        if (th6 == null) {
            dx1.f fVar = dx1.g.f326022a;
            bx1.u uVar = bx1.u.f117843e;
            fVar.j("SnsTemplate", "musiccnt", 1, uVar);
            dx1.f.n(fVar, "SnsTemplate", "editdetail", "musiccnt", 1, uVar, false, null, null, 224, null);
            K7(o7().a());
        }
    }

    @Override // mz0.b2
    public void t7(dw3.o0 launchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchType, "launchType");
        dw3.o0 o0Var = dw3.o0.f325778i;
        nu3.g gVar = nu3.g.f421749a;
        if (launchType == o0Var) {
            gVar.b(m80379x76847179(), launchType);
            return;
        }
        bz0.j jVar = bz0.j.f118283a;
        bz0.j.f118284b.f140522m = 1;
        gVar.b(m80379x76847179(), launchType);
    }

    @Override // mz0.b2
    public void u7(java.lang.Throwable th6, java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        this.K = java.lang.System.currentTimeMillis();
        dx1.f fVar = dx1.g.f326022a;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "vediotime", java.lang.Long.valueOf(((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).Y6()), null, false, null, null, 240, null);
        K7(templateId);
    }

    @Override // mz0.b2
    public void w7() {
        n0.e5 e5Var;
        ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
        boolean c17 = ez0.o.f339368a.c();
        ty0.b1 b1Var = this.f414422m;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (b1Var == null || (e5Var = b1Var.f504325b) == null) ? null : (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var.mo128745x754a37bb();
        if (c4116xf4b2c356 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.b(c4116xf4b2c356, 1);
            b17.f237252p = 3;
            b17.f237255s = true;
            wv3.b bVar = wv3.b.f531581a;
            wv3.c cVar = wv3.b.f531582b.contains(b17.C) ? wv3.c.f531584f : wv3.c.f531583e;
            wv3.d dVar = wv3.d.f531588f;
            bVar.b(b17, dVar, cVar);
            java.lang.String a17 = bVar.a(b17, dVar, cVar);
            dx1.g.f326022a.i("SnsPublishProcess", "musicInfo", a17);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsMusicInfo", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.n(a17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsMusicInfo", "com.tencent.mm.feature.sns.SnsFeatureService");
        }
        if (c17) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new mz0.s2(this, null), 2, null);
        } else {
            super.w7();
        }
    }

    @Override // mz0.b2
    public void x7(az0.b0 exportInfoHolder) {
        java.lang.String str;
        java.lang.Object obj;
        n0.e5 e5Var;
        n0.e5 e5Var2;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356;
        java.lang.String m33856x92013dca;
        n0.e5 e5Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportInfoHolder, "exportInfoHolder");
        java.lang.String str2 = exportInfoHolder.f96871a;
        java.lang.String str3 = exportInfoHolder.f96872b;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dx1.g.f326022a.i("SnsTemplate", "installMiaojian", java.lang.Integer.valueOf(dw3.c.f325714a.b(context, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2));
        dw3.c0.f325715a.v(true, "", str2, true, false, true);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_export_video_path", str2);
        intent.putExtra("key_export_video_cover_path", str3);
        r45.ib6 ib6Var = new r45.ib6();
        ib6Var.f458442d = "miaojian";
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = o7().f151633r;
        java.lang.String str4 = "";
        if (m5Var == null || (str = m5Var.f151610a) == null) {
            str = "";
        }
        ib6Var.f458443e = str;
        java.lang.String str5 = exportInfoHolder.f96877g;
        if (str5 == null) {
            str5 = "";
        }
        ib6Var.f458447i = str5;
        java.lang.String str6 = exportInfoHolder.f96878h;
        if (str6 == null) {
            str6 = "";
        }
        ib6Var.f458448m = str6;
        java.util.Iterator it = o7().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj).f151610a, o7().a())) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var2 = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
        java.lang.Integer valueOf = m5Var2 != null ? java.lang.Integer.valueOf(o7().b().indexOf(m5Var2)) : null;
        dx1.f fVar = dx1.g.f326022a;
        int i17 = 0;
        fVar.i("SnsPublishProcess", "egLocation", java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        java.lang.String templateId = ib6Var.f458443e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templateId, "templateId");
        fVar.i("SnsPublishProcess", "egID", templateId);
        ty0.b1 b1Var = this.f414422m;
        if ((b1Var == null || (e5Var3 = b1Var.f504327d) == null || ((java.lang.Boolean) e5Var3.mo128745x754a37bb()).booleanValue()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "performPost has music id");
            ty0.b1 b1Var2 = this.f414422m;
            if (b1Var2 != null && (e5Var2 = b1Var2.f504325b) != null && (c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var2.mo128745x754a37bb()) != null && (m33856x92013dca = c4116xf4b2c356.m33856x92013dca()) != null) {
                str4 = m33856x92013dca;
            }
            ib6Var.f458444f = str4;
            fVar.i("SnsPublishProcess", "musicID", str4);
        }
        ty0.b1 b1Var3 = this.f414422m;
        if (b1Var3 != null && (e5Var = b1Var3.f504328e) != null && ((java.lang.Boolean) e5Var.mo128745x754a37bb()).booleanValue()) {
            i17 = 1;
        }
        fVar.i("SnsPublishProcess", "ifVoice", java.lang.Integer.valueOf(i17 ^ 1));
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 k5Var = m5Var instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 ? (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5) m5Var : null;
        if (k5Var != null) {
            ib6Var.f458446h = k5Var.f151563g;
            ib6Var.f458445g = k5Var.f151564h;
        }
        intent.putExtra("key_video_template_info", ib6Var.mo14344x5f01b1f6());
        m158354x19263085.setResult(-1, intent);
        m158354x19263085.finish();
    }

    @Override // mz0.b2
    public void y7() {
        nz0.o.f423063a.f(3, "cache_key_sns");
    }
}
