package qg1;

/* loaded from: classes7.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f444310o;

    /* renamed from: p, reason: collision with root package name */
    public final int f444311p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.zd7 f444312q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f444313r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.kb f444314s;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7110x3b3de8f6 f444316u;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f444315t = false;

    /* renamed from: v, reason: collision with root package name */
    public volatile java.util.HashMap f444317v = new java.util.HashMap();

    public m(java.lang.String str, int i17, java.util.List list, boolean z17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 session, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.kb kbVar, r45.y50 y50Var) {
        this.f444310o = str;
        this.f444311p = i17;
        this.f444313r = session;
        this.f444314s = kbVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7110x3b3de8f6 c7110x3b3de8f6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7110x3b3de8f6();
        c7110x3b3de8f6.f144286e = c7110x3b3de8f6.b("AppId", session.f169668e, true);
        c7110x3b3de8f6.f144285d = c7110x3b3de8f6.b("InstanceId", session.f169667d, true);
        int i18 = session.f169669f;
        c7110x3b3de8f6.f144288g = i18 != 1 ? i18 != 2 ? i18 != 3 ? null : cm.l0.demo : cm.l0.debug : cm.l0.release;
        c7110x3b3de8f6.f144289h = session.f169670g;
        c7110x3b3de8f6.f144291j = session.f169671h;
        c7110x3b3de8f6.f144287f = session.f169672i;
        if (0 == c7110x3b3de8f6.f144296o) {
            c7110x3b3de8f6.f144296o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
        }
        this.f444316u = c7110x3b3de8f6;
        c7110x3b3de8f6.f144295n = z17 ? cm.m0.sync : cm.m0.async;
        c7110x3b3de8f6.f144296o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
        this.f444312q = new r45.zd7();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            qg1.p pVar = (qg1.p) it.next();
            r45.be7 be7Var = new r45.be7();
            be7Var.f452245d = pVar.f444321a;
            be7Var.f452246e = pVar.f444322b;
            this.f444312q.f473478d.add(be7Var);
        }
        r45.zd7 zd7Var = this.f444312q;
        java.util.Objects.requireNonNull(y50Var);
        zd7Var.f473479e = y50Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3827;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaattr/wxajsapiinfo";
        lVar.f152197a = this.f444312q;
        lVar.f152198b = new r45.ae7();
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            qg1.p pVar2 = (qg1.p) it6.next();
            sb6.append("{appId:");
            sb6.append(pVar2.f444321a);
            sb6.append(", appType:");
            sb6.append(pVar2.f444322b);
            sb6.append("}");
        }
        sb6.append("]");
        objArr[2] = sb6.toString();
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = str2;
        objArr[5] = session.f169667d;
        objArr[6] = wz0.a.a(y50Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "<init> appId:%s, versionType:%d, appIdList:%s, sync:%b, sessionId:%s, instanceId:%s, source:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public r45.y50 A() {
        return this.f444312q.f473479e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String B() {
        return this.f444313r.f169667d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void x(int i17, int i18, java.lang.String str, r45.ae7 ae7Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7110x3b3de8f6 c7110x3b3de8f6 = this.f444316u;
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c7110x3b3de8f6.f144293l = currentTimeMillis;
            c7110x3b3de8f6.f144290i = currentTimeMillis - c7110x3b3de8f6.f144292k;
            if (th1.a.a(i17, i18, ae7Var)) {
                c7110x3b3de8f6.f144294m = 0L;
            } else {
                c7110x3b3de8f6.f144294m = 1L;
            }
            c7110x3b3de8f6.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CgiWxaJsApiInfo", "quality report e = %s", e17);
        }
        boolean z18 = ((r45.zd7) this.f152179f.f152243a.f152217a).f473479e.f472331e;
        if (ae7Var == null) {
            str2 = "NULL";
        } else if (ae7Var.f451507d == null) {
            str2 = "NULL_API_INFO_LIST";
        } else {
            str2 = "API_INFO_LIST SIZE:" + ae7Var.f451507d.size();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "onCgiBack, errType %d, errCode %d, errMsg %s, req[sync %B], resp[%s], isForPreRender[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(this.f444315t), str2, java.lang.Boolean.valueOf(z18));
        if (i17 != 0 || i18 != 0 || ae7Var == null || (linkedList = ae7Var.f451507d) == null) {
            if (!this.f444315t || z18) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ib.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.b(com.p314xaae8f345.mm.R.C30867xcad56011.f571785pc, java.lang.String.format(java.util.Locale.US, " (%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18))), this.f444314s);
            return;
        }
        try {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ce7 ce7Var = (r45.ce7) it.next();
                if (ce7Var.f453047f == 0) {
                    r45.be7 be7Var = ce7Var.f453045d;
                    java.lang.String str3 = be7Var.f452245d;
                    if (be7Var.f452246e == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q9 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.aj();
                        byte[] mo14344x5f01b1f6 = ce7Var.f453046e.mo14344x5f01b1f6();
                        aj6.getClass();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(mo14344x5f01b1f6)) {
                            if (aj6.D0(str3, mo14344x5f01b1f6)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData appId:%s ok", str3);
                            }
                            this.f444317v.put(str3, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54(ce7Var.f453046e));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "wxaJs plugin AppId:%s,jsApiControlBytes:%d,bg:%d,suspend:%d", str3, java.lang.Integer.valueOf(ce7Var.f453046e.f451958d.f273689a.length), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) ce7Var.f453046e.f451959e.get(0)).f273689a.length), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) ce7Var.f453046e.f451959e.get(1)).f273689a.length));
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid input %s", str3);
                        this.f444317v.put(str3, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54(ce7Var.f453046e));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "wxaJs plugin AppId:%s,jsApiControlBytes:%d,bg:%d,suspend:%d", str3, java.lang.Integer.valueOf(ce7Var.f453046e.f451958d.f273689a.length), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) ce7Var.f453046e.f451959e.get(0)).f273689a.length), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) ce7Var.f453046e.f451959e.get(1)).f273689a.length));
                    }
                }
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.CgiWxaJsApiInfo", e18, "IOException", new java.lang.Object[0]);
        }
        if (this.f444315t) {
            return;
        }
        java.lang.String str4 = this.f444310o;
        int i19 = this.f444311p;
        java.lang.String str5 = this.f444316u.f144285d;
        java.util.HashMap hashMap = this.f444317v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.j(str5);
        if (j17 != null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str4;
            objArr[1] = java.lang.Integer.valueOf(i19);
            objArr[2] = str5;
            objArr[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyPluginPermissionInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr);
            if (j17.f166902n != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) j17.f166902n.a(0);
                if (c11813xf952a195 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyLaunchInfoUpdate null config with appId(%s)", str4);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = str4;
                    objArr2[1] = java.lang.Integer.valueOf(i19);
                    objArr2[2] = str5;
                    objArr2[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%d]", objArr2);
                    c11813xf952a195.B = hashMap;
                    j17.f166902n = nm5.j.d(c11813xf952a195, null, j17.S);
                }
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[4];
                objArr3[0] = str4;
                objArr3[1] = java.lang.Integer.valueOf(i19);
                objArr3[2] = str5;
                objArr3[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate] set mMaybeUpdatedPluginPermissionMap appId[%s] type[%d] instanceId[%s] info[%d]", objArr3);
                j17.f166906p1 = hashMap;
            }
        }
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[4];
            objArr4[0] = str4;
            objArr4[1] = java.lang.Integer.valueOf(i19);
            objArr4[2] = str5;
            objArr4[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyPluginPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12344x29ac6cda c12344x29ac6cda = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12344x29ac6cda();
            c12344x29ac6cda.f165966d = str4;
            c12344x29ac6cda.f165967e = i19;
            c12344x29ac6cda.f165968f = hashMap;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.l.a(str4, c12344x29ac6cda);
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr5 = new java.lang.Object[4];
            objArr5[0] = str4;
            objArr5[1] = java.lang.Integer.valueOf(i19);
            objArr5[2] = str5;
            objArr5[3] = java.lang.Integer.valueOf(hashMap != null ? hashMap.size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", th6, "notifyPluginPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr5);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d, com.p314xaae8f345.mm.p944x882e457a.i
    public final synchronized pq5.g l() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f444316u.f144292k = java.lang.System.currentTimeMillis();
        return super.l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public com.p314xaae8f345.mm.p944x882e457a.f t() {
        this.f444315t = true;
        return com.p314xaae8f345.mm.p944x882e457a.l3.a(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String y() {
        return this.f444310o;
    }
}
