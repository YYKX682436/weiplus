package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class l8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 f166290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f166291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f166292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f166293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f166294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f166295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        super(0);
        this.f166290d = r8Var;
        this.f166291e = list;
        this.f166292f = map;
        this.f166293g = c11667xc7e59dd6;
        this.f166294h = atomicReference;
        this.f166295i = countDownLatch;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p944x882e457a.f fVar;
        r45.nb5 nb5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var = this.f166290d;
        java.lang.String instanceId = r8Var.f166645m.f169667d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(instanceId, "instanceId");
        af.c b17 = af.d.f85977a.b(instanceId, false);
        if (b17 != null) {
            af.b bVar = (af.b) b17.f85975a.get(1);
            if (bVar == null) {
                bVar = null;
            }
            if (bVar != null && (fVar = (com.p314xaae8f345.mm.p944x882e457a.f) bVar.a(100)) != null && (nb5Var = (r45.nb5) fVar.f152151d) != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.LinkedList<r45.s35> package_info_list = nb5Var.f462764f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(package_info_list, "package_info_list");
                for (r45.s35 s35Var : package_info_list) {
                    if (!s35Var.f467005m) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6();
                        java.lang.String appid = s35Var.f466999d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appid, "appid");
                        z6Var.f166994d = appid;
                        z6Var.f166995e = s35Var.f467000e;
                        z6Var.f166996f = s35Var.f467001f;
                        z6Var.f166997g = 0;
                        z6Var.f166998h = s35Var.f467002g;
                        z6Var.f167000m = s35Var.f467007o;
                        r45.me3[] me3VarArr = (r45.me3[]) hashMap.get(z6Var);
                        if (me3VarArr == null) {
                            me3VarArr = new r45.me3[3];
                            hashMap.put(z6Var, me3VarArr);
                        }
                        r45.me3 me3Var = new r45.me3();
                        me3Var.f461932e = s35Var.f467003h;
                        me3Var.f461933f = s35Var.f467004i;
                        r45.jr5 jr5Var = new r45.jr5();
                        me3Var.f461938n = jr5Var;
                        jr5Var.f459603d = s35Var.f466999d;
                        jr5Var.f459605f = s35Var.f467000e;
                        jr5Var.f459606g = s35Var.f467001f;
                        jr5Var.f459607h = 0;
                        if (s35Var.f467006n) {
                            me3Var.f461936i = false;
                            me3Var.f461937m = true;
                            me3VarArr[1] = me3Var;
                        } else {
                            me3Var.f461936i = false;
                            me3Var.f461937m = false;
                            me3VarArr[0] = me3Var;
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5 x5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a;
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "addPreGetDownloadUrlResult " + entry.getKey() + " -> " + ((java.lang.Object[]) entry.getValue()).length);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166944b.putAll(hashMap);
                    b17.f85976b.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r7(hashMap));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u3.f166745a;
        java.lang.String str = r8Var.f166639d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = r8Var.f166644i;
        int i17 = r8Var.f166640e;
        java.util.List list = this.f166291e;
        java.util.Map map = this.f166292f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = r8Var.f166645m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f166293g;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f166294h;
        java.util.concurrent.CountDownLatch countDownLatch = this.f166295i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h8 h8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h8(r8Var, c11667xc7e59dd6, atomicReference, countDownLatch);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i8 i8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i8(r8Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j8 j8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j8(r8Var, countDownLatch);
        boolean z17 = r8Var.f166648p || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5.f166636b.a(k91.l3.a(r8Var.f166641f));
        r45.y50 y50Var = r8Var.f166646n;
        boolean z18 = y50Var.f472331e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k8 k8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k8(r8Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 reportQualitySession = r8Var.f166645m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportQualitySession, "reportQualitySession");
        r45.y50 y50Var2 = new r45.y50();
        y50Var2.f472330d = reportQualitySession.f169671h;
        y50Var2.f472331e = z18;
        y50Var2.f472332f = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u3.b(u3Var, str, c11829x68027553, i17, list, map, c12566x87f2d8b7, h8Var, i8Var, j8Var, z17, y50Var, reportQualitySession.f169670g == 1004 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y7(true, reportQualitySession, y50Var2, k8Var) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d8(reportQualitySession, y50Var2, k8Var), null, null, null, 28672, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parallel: [");
        java.lang.String str2 = r8Var.f166639d;
        sb6.append(str2);
        sb6.append("]: start...");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", sb6.toString());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_parallel_download_subpackage, 0) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "parallel: [" + str2 + "]: x config, fast return");
        } else {
            pm0.v.M("parallelDownload[" + str2 + '|' + r8Var.f166640e + ']', false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q8(str2, r8Var.f166644i, r8Var, this.f166292f), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
