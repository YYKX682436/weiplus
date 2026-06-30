package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class j7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f205375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f205376e = obVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j7(this.f205376e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.String str2;
        java.lang.Object b17;
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f205375d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205376e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.app.Activity context = obVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
            if (p2Var != null) {
                p2Var.f205646p = 2L;
                p2Var.f205643m = c01.id.c();
            }
            obVar.r7(true);
            java.lang.String stringExtra = obVar.m158359x1e885992().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "doHeaderCgi start do cgi");
            android.app.Activity context2 = obVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
            if (p2Var2 != null) {
                p2Var2.O6(9037, 11, 0);
            }
            r45.r13 r13Var = new r45.r13();
            r13Var.f465950d = obVar.m58741x6c03c64c();
            java.lang.String f17 = xy2.c.f(obVar.m58738xfe9224be());
            r13Var.f465956m = f17;
            r13Var.f465952f = (r26.i0.q(r13Var.f465950d, f17, false, 2, null) || ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F1().r()).booleanValue()) ? 1 : 0;
            r13Var.f465954h = obVar.m158354x19263085().getIntent().getStringExtra("key_biz_username");
            r13Var.f465960q = !obVar.A7() ? 1 : 0;
            r13Var.f465961r = (java.lang.String) ((jz5.n) obVar.m58739x93d2800f().f205639f).mo141623x754a37bb();
            java.lang.String str3 = r13Var.f465954h;
            long j17 = 0;
            if ((str3 == null || str3.length() == 0) == false) {
                r13Var.f465953g = obVar.P1 != 0 ? 23 : 24;
            }
            if (r13Var.f465953g == 0) {
                r13Var.f465953g = obVar.m58738xfe9224be().m75939xb282bd08(8);
            }
            r13Var.f465957n = stringExtra;
            if (obVar.m158359x1e885992().getIntExtra("finder_from_feed_type", 0) == 1) {
                r13Var.f465958o = obVar.P1;
            }
            db2.t4 t4Var = db2.t4.f309704a;
            r45.kv0 b18 = t4Var.b(9037, obVar.m58738xfe9224be());
            r13Var.f465951e = b18;
            r45.qt2 m58738xfe9224be = obVar.m58738xfe9224be();
            b18.set(1, java.lang.Integer.valueOf(m58738xfe9224be != null ? m58738xfe9224be.m75939xb282bd08(7) : 0));
            if (t4Var.q()) {
                j17 = obVar.m158359x1e885992().getLongExtra("finder_from_feed_id", 0L);
                str = obVar.m158359x1e885992().getStringExtra("finder_from_feed_dup_flag");
            } else {
                str = null;
            }
            r45.kv0 kv0Var = r13Var.f465951e;
            r45.qt2 m58738xfe9224be2 = obVar.m58738xfe9224be();
            obj2 = "Check failed.";
            r45.kv0 kv0Var2 = r13Var.f465951e;
            t4Var.h(kv0Var, m58738xfe9224be2, kz5.b0.c(new jz5.o(new java.lang.Integer(kv0Var2 != null ? kv0Var2.m75939xb282bd08(1) : 0), new java.lang.Long(j17), str)));
            str2 = "Finder.FinderProfileHeaderUIC";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doHeaderCgi param, username: " + r13Var.f465950d + ", viewer: " + r13Var.f465956m + ", needFans: " + r13Var.f465952f + ", bizName: " + r13Var.f465954h + ", enterType: " + r13Var.f465953g + " noticeId: " + stringExtra + ", refLiveId: " + r13Var.f465958o + ", isExportMode: " + obVar.m58739x93d2800f().P6());
            com.p314xaae8f345.mm.p944x882e457a.i b19 = r13Var.b();
            this.f205375d = 1;
            b17 = rm0.h.b(b19, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
            str2 = "Finder.FinderProfileHeaderUIC";
            obj2 = "Check failed.";
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar3 = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "dealHeaderResp, errCode: " + fVar3.f152149b + ", errType: " + fVar3.f152148a + ", errMsg: " + fVar3.f152150c);
        android.app.Activity context3 = obVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException(obj2.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var3 != null) {
            int i18 = fVar3.f152149b;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar3.f152153f;
            java.lang.Integer num = (iVar == null || (oVar2 = iVar.f152179f) == null || (fVar2 = oVar2.f152243a.f152217a) == null) ? null : new java.lang.Integer(fVar2.mo75928xcd1e8d8());
            com.p314xaae8f345.mm.p944x882e457a.i iVar2 = fVar3.f152153f;
            p2Var3.Q6(9037, i18, new az2.g(num, (iVar2 == null || (oVar = iVar2.f152179f) == null || (fVar = oVar.f152244b.f152233a) == null) ? null : new java.lang.Integer(fVar.mo75928xcd1e8d8()), az2.j.f97666r.a(fVar3)));
        }
        int i19 = fVar3.f152149b;
        int i27 = fVar3.f152148a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar3.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        r45.s13 s13Var = (r45.s13) resp;
        if (i27 == 0 && i19 == 0) {
            obVar.H7(s13Var, false);
            obVar.Q6(s13Var);
        } else if (i19 == -5900) {
            obVar.H7(s13Var, false);
            obVar.Q6(s13Var);
        } else {
            obVar.Q6(null);
        }
        return jz5.f0.f384359a;
    }
}
