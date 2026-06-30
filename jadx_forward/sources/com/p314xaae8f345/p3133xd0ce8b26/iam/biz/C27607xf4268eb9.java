package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_idvlmtlKKE */
/* loaded from: classes11.dex */
public class C27607xf4268eb9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299262a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299263b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299264c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299265d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_BI */
    private void m118151x1964d18f() {
        r45.vs2 vs2Var;
        r45.vs2 vs2Var2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299262a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyFetchMeTabRedPointEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyFetchMeTabRedPointEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((t01.a) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.e0) entry.getValue())).f495921a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "onMeTabRegis");
            t01.i iVar = t01.m.f495932d;
            if (((ox.g) t01.i.b(iVar)).vj() && ((ox.g) t01.i.b(iVar)).Ni()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "get ctrlInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = t01.i.c(iVar).L0("FinderMyTab");
                byte[] bArr = null;
                byte[] m75963xebb06ba0 = (L0 == null || (vs2Var2 = L0.f65874xb5f7102a) == null) ? null : vs2Var2.m75963xebb06ba0();
                if (m75963xebb06ba0 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = t01.i.c(iVar).L0("MyTabPhotoProfile");
                    if (L02 != null && (vs2Var = L02.f65874xb5f7102a) != null) {
                        bArr = vs2Var.m75963xebb06ba0();
                    }
                    m75963xebb06ba0 = bArr;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "start fetchMeTabRedPointAsync");
                t01.m.f495936h.d(java.util.Optional.ofNullable(m75963xebb06ba0), java.util.Optional.empty(), t01.l.f495931a);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "shouldShowPhotoWorks is false or canRegisterPhotoAccount is false");
            }
        }
    }

    /* renamed from: ZIDL_CI */
    private void m118152x1964d1ae(int i17, byte[] bArr, long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299263b;
        int i18 = 0;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[i18]);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g0 g0Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g0) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            t01.b bVar = (t01.b) g0Var;
            bVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotUpdated, count: " + i17 + ", wording: " + str + ", timestamp: " + j17);
            t01.m mVar = bVar.f495922a;
            if (i17 <= 0) {
                mVar.Bi();
            } else {
                mVar.getClass();
                if (uh4.c0.m168057xb411027f().mo168058x74219ae7()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotUpdated: teen mode enabled, skip setting red dot");
                } else {
                    t01.i iVar = t01.m.f495932d;
                    if (((ox.g) t01.i.b(iVar)).wj()) {
                        r45.vs2 vs2Var = new r45.vs2();
                        vs2Var.f470020e = 1026;
                        vs2Var.f470019d = 100000;
                        double currentTimeMillis = java.lang.System.currentTimeMillis() / 1000.0d;
                        vs2Var.f470023h = "BizWorksEntryRedDot_" + currentTimeMillis;
                        vs2Var.f470036x = "BizWorksEntryRedDot_" + currentTimeMillis;
                        r45.f03 f03Var = new r45.f03();
                        f03Var.f455424h = 1;
                        f03Var.f455420d = 2;
                        f03Var.f455425i = "MyTab";
                        f03Var.f455421e = i17;
                        r45.f03 f03Var2 = new r45.f03();
                        f03Var2.f455424h = 1;
                        f03Var2.f455420d = 2;
                        f03Var2.f455425i = "FinderMentionMyTab";
                        f03Var2.f455421e = i17;
                        vs2Var.f470022g.add(f03Var);
                        vs2Var.f470022g.add(f03Var2);
                        zy2.fa.D(t01.i.c(iVar), vs2Var, "bizMeTab", null, false, null, 28, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "add works entry red dot success, count: " + i17 + ", wording: " + str);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotUpdated: works entry red dot disabled, skip setting red dot");
                    }
                }
            }
            i18 = 0;
        }
    }

    /* renamed from: ZIDL_DI */
    private void m118153x1964d1cd(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299264c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotEnableChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotEnableChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            t01.c cVar = (t01.c) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.f0) entry.getValue());
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotEnableChanged, enabled: " + z17);
            if (!z17) {
                cVar.f495923a.Bi();
            }
        }
    }

    /* renamed from: ZIDL_KI */
    private void m118154x1964d2a6(byte[] bArr, byte[] bArr2, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299265d;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotificationDigestUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizInteractiveNativeToCppManagerKE", "onNotificationDigestUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d0 d0Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d0) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            ((gr1.g) d0Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated biz: " + str + ", digest: " + str2 + ", timestamp: " + i17);
            jr1.i iVar = jr1.i.f382893a;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.c(0), str);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4 m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY;
            if (b17) {
                hr1.i Di = yq1.u0.Di();
                rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr = tk.s.f501403d;
                ((ox.r) d0Var2).Ni(1).b(m4Var, new gr1.e(Di, str2, i17));
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.c(5), str)) {
                nr1.f Vi = yq1.u0.Vi();
                rm.d0 d0Var3 = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr2 = tk.s.f501403d;
                ((ox.r) d0Var3).Ni(2).b(m4Var, new gr1.f(Vi, str2, i17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated, biz not match, biz: " + str + ", curBiz: " + iVar.c(0));
            }
        }
    }
}
