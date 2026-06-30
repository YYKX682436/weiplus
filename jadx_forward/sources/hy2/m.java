package hy2;

/* loaded from: classes8.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f367599d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f367600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final boolean O6(int i17, long j17, java.lang.String str) {
        jz5.l lVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        boolean z17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                r4 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (r4 && ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209216eg).mo141623x754a37bb()).r()).booleanValue()) {
                Q6(j17, str);
            }
            return true;
        }
        if (i17 == 17 || i17 == 18 || i17 == 20 || i17 == 155) {
            Q6(j17, str);
            return true;
        }
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 1;
        java.lang.String concat = "finder_feedId_".concat(pm0.v.u(j17));
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
            int m76810x98d986d1 = (h17 == null || (feedObject = h17.getFeedObject()) == null) ? -1 : feedObject.m76810x98d986d1();
            if (((8388608 & m76810x98d986d1) > 0) || m76810x98d986d1 == -1) {
                lVar = m76810x98d986d1 == -1 ? new jz5.l(java.lang.Boolean.TRUE, "本地无feed缓存，先放过") : new jz5.l(java.lang.Boolean.TRUE, "符合规则（青少年内容 && 在安全池内）");
            } else {
                boolean kf6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(4, concat);
                lVar = new jz5.l(java.lang.Boolean.valueOf(kf6), "内容不在安全池内(临时授权：" + kf6 + ')');
            }
        } else {
            boolean kf7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(4, concat);
            lVar = new jz5.l(java.lang.Boolean.valueOf(kf7), "青少年-不可访问(临时授权：" + kf7 + ')');
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms reason=" + ((java.lang.String) lVar.f384367e));
        if (booleanValue) {
            Q6(j17, str);
        }
        return booleanValue;
    }

    public final void P6(long j17, java.lang.String authContent) {
        java.lang.String str;
        r45.kv2 kv2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authContent, "authContent");
        if (this.f367599d || this.f367600e) {
            return;
        }
        this.f367599d = true;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(authContent);
        zy2.i iVar = v17 != null ? (zy2.i) v17.y(zy2.i.class) : null;
        java.lang.String str2 = "<fromusr>" + c01.z1.r() + "</fromusr><type>49</type><content>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(authContent) + "</content>";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
        java.lang.String concat = "finder_feedId_".concat(pm0.v.u(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "jumpToAuthorization to isChecking " + this.f367599d + " isFinishing:" + m158354x19263085().isFinishing() + " activity:" + m158354x19263085());
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.lang.String string = m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7d);
        android.content.res.Resources m158361x893a2f6f = m158361x893a2f6f();
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (iVar == null || (kv2Var = iVar.f558944b) == null || (str = kv2Var.m75945x2fec8307(4)) == null) {
            str = "";
        }
        objArr[0] = str;
        c0Var.Od(m158354x19263085, 10013, 4, concat, string, m158361x893a2f6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7b, objArr), str2, true, new hy2.l(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q6(long r17, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy2.m.Q6(long, java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "requestCode " + i17 + ", resultCode " + i18);
        if (i17 != 10013 || i18 != 0 || m158354x19263085().isFinishing() || m158354x19263085().isDestroyed()) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        if (g1Var != null) {
            g1Var.f215991g = true;
        }
        m158354x19263085().finish();
        m158354x19263085().overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }
}
