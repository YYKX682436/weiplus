package a44;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a44.a f1260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f1261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a44.k f1262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1264i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1265m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1266n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a44.a aVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, a44.k kVar, android.view.View view, android.view.View view2, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1260e = aVar;
        this.f1261f = snsInfo;
        this.f1262g = kVar;
        this.f1263h = view;
        this.f1264i = view2;
        this.f1265m = i17;
        this.f1266n = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        a44.f fVar = new a44.f(this.f1260e, this.f1261f, this.f1262g, this.f1263h, this.f1264i, this.f1265m, this.f1266n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        java.lang.Object invokeSuspend = ((a44.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        return invokeSuspend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView c18;
        com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView c19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1259d;
        a44.a adCheckDownloadAppInfo = this.f1260e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestDownloadInfo, packageName is ");
            sb6.append(adCheckDownloadAppInfo.l());
            sb6.append(", channelId is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            java.lang.String str3 = adCheckDownloadAppInfo.f1227c;
            sb6.append(str3);
            sb6.append(", useGameDownloadWidget is ");
            sb6.append(adCheckDownloadAppInfo.p());
            sb6.append(", openSdkAppIdAndroid is ");
            sb6.append(adCheckDownloadAppInfo.k());
            com.tencent.mars.xlog.Log.i("AdDownloadHelper", sb6.toString());
            r45.ny nyVar = new r45.ny();
            nyVar.f381744h = adCheckDownloadAppInfo.k();
            nyVar.f381740d = adCheckDownloadAppInfo.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            nyVar.f381741e = str3;
            nyVar.f381743g = kotlin.jvm.internal.o.b(adCheckDownloadAppInfo.p(), java.lang.Boolean.TRUE) ? 1 : 0;
            nyVar.f381742f = com.tencent.mm.sdk.platformtools.a0.c();
            a44.e eVar = new a44.e(nyVar, 1210, "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo", null);
            this.f1259d = 1;
            c17 = kotlinx.coroutines.a4.c(20000L, eVar, this);
            if (c17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        k64.b bVar = (k64.b) c17;
        java.lang.String T = ca4.z0.T(this.f1261f);
        a44.k kVar = this.f1262g;
        android.view.View d17 = kVar.d();
        java.lang.Object tag = d17 != null ? d17.getTag(com.tencent.mm.R.id.nug) : null;
        com.tencent.mars.xlog.Log.i("AdDownloadHelper", "do request download result, snsId is " + T + ", tagSnsId is " + tag);
        if ((bVar != null && bVar.a() == 0) && bVar.b() == 0 && bVar.c() != null) {
            kotlin.jvm.internal.o.f(adCheckDownloadAppInfo, "$adCheckDownloadAppInfo");
            r45.oy oyVar = (r45.oy) bVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            if (com.tencent.mm.sdk.platformtools.t8.K0(T)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                str = "invokeSuspend";
                z17 = false;
            } else {
                a44.b bVar2 = a44.k.f1285g;
                bVar2.f(adCheckDownloadAppInfo, oyVar);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateCheckDownloadAppInfo, useGameDownloadWidget is ");
                sb7.append(adCheckDownloadAppInfo.p());
                sb7.append(", appName is ");
                sb7.append(adCheckDownloadAppInfo.d());
                sb7.append(", appIcon is ");
                sb7.append(adCheckDownloadAppInfo.c());
                sb7.append(", md5 is ");
                sb7.append(adCheckDownloadAppInfo.j());
                sb7.append(", downloadUrl is ");
                sb7.append(adCheckDownloadAppInfo.i());
                sb7.append(", appVersion is ");
                sb7.append(adCheckDownloadAppInfo.e());
                sb7.append(", developer is ");
                sb7.append(adCheckDownloadAppInfo.h());
                sb7.append(", appDescUrl is ");
                sb7.append(adCheckDownloadAppInfo.b());
                sb7.append(", authorityUrl is ");
                sb7.append(adCheckDownloadAppInfo.g());
                sb7.append(", agreementUrl is ");
                sb7.append(adCheckDownloadAppInfo.a());
                sb7.append(", recordNumber is ");
                sb7.append(adCheckDownloadAppInfo.m());
                sb7.append(", suitableAge is ");
                sb7.append(adCheckDownloadAppInfo.o());
                sb7.append(", authorName is ");
                sb7.append(adCheckDownloadAppInfo.f());
                sb7.append(", , recordUrl is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                str = "invokeSuspend";
                java.lang.String str4 = adCheckDownloadAppInfo.f1239o;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                sb7.append(str4);
                com.tencent.mars.xlog.Log.i("AdDownloadHelper", sb7.toString());
                i64.c i18 = i64.i.f289183d.i();
                kotlin.jvm.internal.o.d(T);
                i18.b(T, adCheckDownloadAppInfo);
                z17 = bVar2.c(adCheckDownloadAppInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        } else {
            str = "invokeSuspend";
            z17 = false;
        }
        if ((tag instanceof java.lang.String) && !com.tencent.mm.sdk.platformtools.t8.N0(T, tag) && ((java.lang.String) tag).equals(T)) {
            boolean z18 = bVar != null && bVar.a() == 0;
            android.view.View view = this.f1263h;
            if (!z18 || bVar.b() != 0 || bVar.c() == null) {
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper$doRequestDownloadInfo$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper$doRequestDownloadInfo$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (kVar.c() != null && (c18 = kVar.c()) != null) {
                    c18.setVisibility(8);
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("do request download result not ok ! ");
                sb8.append(bVar != null ? new java.lang.Integer(bVar.a()) : null);
                sb8.append(", ");
                sb8.append(bVar != null ? new java.lang.Integer(bVar.b()) : null);
                sb8.append(", ");
                if (bVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    str2 = bVar.f304585c;
                } else {
                    str2 = null;
                }
                sb8.append(str2);
                com.tencent.mars.xlog.Log.e("AdDownloadHelper", sb8.toString());
            } else if (z17) {
                a44.k.a(this.f1262g, this.f1263h, this.f1264i, this.f1260e, this.f1265m, this.f1266n);
            } else {
                if (view != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper$doRequestDownloadInfo$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper$doRequestDownloadInfo$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (kVar.c() != null && (c19 = kVar.c()) != null) {
                    c19.setVisibility(8);
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        return f0Var;
    }
}
