package aq4;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94743d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f94744e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f94745f;

    /* renamed from: g, reason: collision with root package name */
    public int f94746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c f94747h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c c18825x1657575c, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94747h = c18825x1657575c;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq4.e(this.f94747h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq4.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean contains;
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94746g;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94747h.f257641o, "deWork start: " + java.lang.Thread.currentThread().getName());
        java.lang.String c17 = this.f94747h.f93992e.f93999b.c("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
        aq4.d dVar = new aq4.d(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c c18825x1657575c = this.f94747h;
        this.f94743d = c17;
        this.f94744e = dVar;
        this.f94745f = c18825x1657575c;
        this.f94746g = 1;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        aq4.c cVar = new aq4.c(c18825x1657575c, nVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18825x1657575c.f257641o, "suspend " + java.lang.Thread.currentThread().getName() + "， workTagId: " + c17);
        aq4.a aVar2 = aq4.a.f94734a;
        synchronized (aVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxBackgroundManager", "isWorkInRunningList >> " + c17);
            contains = c17 == null ? false : aq4.a.f94735b.contains(c17);
        }
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18825x1657575c.f257641o, "work is repeat no to do");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new a5.v()));
        } else {
            jz5.l i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.i(c18825x1657575c, c17);
            boolean booleanValue = ((java.lang.Boolean) i18.f384366d).booleanValue();
            dm.q0 q0Var = (dm.q0) i18.f384367e;
            if (booleanValue) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q0Var);
                int i19 = q0Var.f68035xdb9e6ea3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18825x1657575c.f257641o, "checkWorkIsFinish >> workType: " + i19 + ", workTagId: " + c17);
                if (i19 == 4007 || i19 == 4008) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new a5.v()));
                } else {
                    synchronized (aVar2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxBackgroundManager", "addRunningWorkToList >> ".concat(c17));
                        aq4.a.f94735b.add(c17);
                    }
                    int i27 = q0Var.f68035xdb9e6ea3;
                    java.lang.String field_output_video_path = q0Var.f68019xae81df62;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_video_path, "field_output_video_path");
                    long j17 = q0Var.f68028xa01243b5;
                    java.lang.String str = c18825x1657575c.f257641o;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dealIsReStartWork >> workTagId: " + c17 + ", workType: " + i27 + ", startWorkTime: " + j17);
                    if (j17 == 0 || i27 == 4007) {
                        z17 = false;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "is go to restart work");
                        com.p314xaae8f345.mm.vfs.w6.h(field_output_video_path);
                        z17 = true;
                    }
                    zp4.e eVar = zp4.e.f556487a;
                    long j18 = q0Var.f68028xa01243b5;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    l75.k0 a17 = eVar.a();
                    p75.n0 n0Var = dm.q0.R;
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("is_killed_process_restart", java.lang.Integer.valueOf(z17 ? 1 : 2));
                    contentValues.put("start_remux_time_stamp", java.lang.Long.valueOf(z17 ? j18 : currentTimeMillis));
                    p75.m0 j19 = dm.q0.S.j(c17);
                    p75.h1 j27 = dm.q0.R.j(contentValues);
                    j27.b(j19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateIsKilledProcessRestart >> workTagId: " + c17 + ", isKill: " + z17 + ", result: " + j27.a().f(a17) + ", startMuxTimeStamp: " + j18 + ", startMuxTimeStampCurrent: " + currentTimeMillis);
                    r45.h70 h70Var = new r45.h70();
                    try {
                        h70Var.mo11468x92b714fd(q0Var.f68001x3f4822c8);
                        byte[] field_video_param = q0Var.f68030xbe236004;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_video_param, "field_video_param");
                        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d k17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.k(c18825x1657575c, field_video_param);
                        int b17 = c18825x1657575c.f93992e.f93999b.b("KEY_EXPORT_ABA_FLAG", 0);
                        int b18 = c18825x1657575c.f93992e.f93999b.b("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0);
                        int b19 = c18825x1657575c.f93992e.f93999b.b("KEY_EXPORT_TEC_SCENE", 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18825x1657575c.f257641o, "getEncodeFromDB");
                        st3.r rVar = new st3.r(q0Var.f68007x36c1fe5c, q0Var.f68006x87aed351, q0Var.f68008x7b9ff765, 0, q0Var.f68004x89a5c636, q0Var.f68027x3b56087e, 0, 0, false, false, 0, 0, q0Var.f68005xb932ff10, 0, 12232, null);
                        java.lang.String str2 = q0Var.f68019xae81df62;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624();
                        c16993xacc19624.f237209n = k17;
                        c16993xacc19624.B = str2;
                        c16993xacc19624.F = 2;
                        vp4.s.f520607a.c(h70Var, c16993xacc19624, b19, rVar, b17, b18, cVar, c17, dVar);
                    } catch (java.io.IOException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18825x1657575c.f257641o, "parse byte error");
                        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new a5.v()));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18825x1657575c.f257641o, "checkDataBeforeRemux is false");
                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new a5.v()));
            }
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar3 = pz5.a.f440719d;
        return a18 == aVar ? aVar : a18;
    }
}
