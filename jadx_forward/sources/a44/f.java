package a44;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f82792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a44.a f82793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f82794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a44.k f82795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82797i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f82798m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f82799n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a44.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, a44.k kVar, android.view.View view, android.view.View view2, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82793e = aVar;
        this.f82794f = c17933xe8d1b226;
        this.f82795g = kVar;
        this.f82796h = view;
        this.f82797i = view2;
        this.f82798m = i17;
        this.f82799n = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        a44.f fVar = new a44.f(this.f82793e, this.f82794f, this.f82795g, this.f82796h, this.f82797i, this.f82798m, this.f82799n, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        java.lang.Object mo150x989b7ca4 = ((a44.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f82792d;
        a44.a adCheckDownloadAppInfo = this.f82793e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestDownloadInfo, packageName is ");
            sb6.append(adCheckDownloadAppInfo.l());
            sb6.append(", channelId is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            java.lang.String str3 = adCheckDownloadAppInfo.f82760c;
            sb6.append(str3);
            sb6.append(", useGameDownloadWidget is ");
            sb6.append(adCheckDownloadAppInfo.p());
            sb6.append(", openSdkAppIdAndroid is ");
            sb6.append(adCheckDownloadAppInfo.k());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", sb6.toString());
            r45.ny nyVar = new r45.ny();
            nyVar.f463277h = adCheckDownloadAppInfo.k();
            nyVar.f463273d = adCheckDownloadAppInfo.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannelId", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            nyVar.f463274e = str3;
            nyVar.f463276g = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(adCheckDownloadAppInfo.p(), java.lang.Boolean.TRUE) ? 1 : 0;
            nyVar.f463275f = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c();
            a44.e eVar = new a44.e(nyVar, 1210, "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo", null);
            this.f82792d = 1;
            c17 = p3325xe03a0797.p3326xc267989b.a4.c(20000L, eVar, this);
            if (c17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        k64.b bVar = (k64.b) c17;
        java.lang.String T = ca4.z0.T(this.f82794f);
        a44.k kVar = this.f82795g;
        android.view.View d17 = kVar.d();
        java.lang.Object tag = d17 != null ? d17.getTag(com.p314xaae8f345.mm.R.id.nug) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", "do request download result, snsId is " + T + ", tagSnsId is " + tag);
        if ((bVar != null && bVar.a() == 0) && bVar.b() == 0 && bVar.c() != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(adCheckDownloadAppInfo, "$adCheckDownloadAppInfo");
            r45.oy oyVar = (r45.oy) bVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                str = "invokeSuspend";
                z17 = false;
            } else {
                a44.b bVar2 = a44.k.f82818g;
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
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                str = "invokeSuspend";
                java.lang.String str4 = adCheckDownloadAppInfo.f82772o;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                sb7.append(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", sb7.toString());
                i64.c i18 = i64.i.f370716d.i();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(T);
                i18.b(T, adCheckDownloadAppInfo);
                z17 = bVar2.c(adCheckDownloadAppInfo);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateCheckDownloadAppInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        } else {
            str = "invokeSuspend";
            z17 = false;
        }
        if ((tag instanceof java.lang.String) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(T, tag) && ((java.lang.String) tag).equals(T)) {
            boolean z18 = bVar != null && bVar.a() == 0;
            android.view.View view = this.f82796h;
            if (!z18 || bVar.b() != 0 || bVar.c() == null) {
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    str2 = bVar.f386118c;
                } else {
                    str2 = null;
                }
                sb8.append(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadHelper", sb8.toString());
            } else if (z17) {
                a44.k.a(this.f82795g, this.f82796h, this.f82797i, this.f82793e, this.f82798m, this.f82799n);
            } else {
                if (view != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1");
        return f0Var;
    }
}
