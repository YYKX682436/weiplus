package ic3;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371927d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371927d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371927d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        java.util.Objects.toString(activityC16419x510d00b7.f229384e);
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        wj.t0 posId = activityC16419x510d00b7.f229384e;
        ((wj.j0) iVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        gk.b bVar = gk.b.f353941a;
        java.lang.String str2 = posId.f528051d;
        java.util.Set c17 = bVar.c(str2);
        java.lang.String str3 = null;
        java.lang.String str4 = c17 != null ? (java.lang.String) kz5.n0.Y(c17) : null;
        if (str4 == null || str4.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicAdCommonFeatureService", "[dumpAdsInfo] no aid for posId: ".concat(str2));
        } else {
            r45.e5 a17 = bVar.a(str4);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicAdCommonFeatureService", "[dumpAdsInfo] adsInfo is null, posId: " + str2 + ", aid: " + str4);
            } else {
                byte[] mo14344x5f01b1f6 = a17.mo14344x5f01b1f6();
                java.lang.String encodeToString = android.util.Base64.encodeToString(mo14344x5f01b1f6, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "================== [dumpAdsInfo] BEGIN posId=" + str2 + " ==================");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] aid=" + str4 + " bytesLen=" + mo14344x5f01b1f6.length);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dumpAdsInfo] hintTxt    = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = a17.m75934xbce7f2f(8);
                sb6.append(m75934xbce7f2f != null ? m75934xbce7f2f.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[dumpAdsInfo] adDesc     = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = a17.m75934xbce7f2f(23);
                sb7.append(m75934xbce7f2f2 != null ? m75934xbce7f2f2.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb7.toString());
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[dumpAdsInfo] imageUrl   = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = a17.m75934xbce7f2f(9);
                sb8.append(m75934xbce7f2f3 != null ? m75934xbce7f2f3.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb8.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] imageUrlDk = " + a17.m75945x2fec8307(10));
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[dumpAdsInfo] urlScheme  = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f4 = a17.m75934xbce7f2f(12);
                sb9.append(m75934xbce7f2f4 != null ? m75934xbce7f2f4.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb9.toString());
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[dumpAdsInfo] apkName    = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f5 = a17.m75934xbce7f2f(14);
                sb10.append(m75934xbce7f2f5 != null ? m75934xbce7f2f5.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb10.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] appId      = " + a17.m75942xfb822ef2(13));
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[dumpAdsInfo] appName    = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f6 = a17.m75934xbce7f2f(26);
                sb11.append(m75934xbce7f2f6 != null ? m75934xbce7f2f6.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb11.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] urlSchemeMinAndroidVersion = " + a17.m75942xfb822ef2(15));
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[dumpAdsInfo] canvasId          = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f7 = a17.m75934xbce7f2f(18);
                sb12.append(m75934xbce7f2f7 != null ? m75934xbce7f2f7.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb12.toString());
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder("[dumpAdsInfo] canvasDynamicInfo = ");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f8 = a17.m75934xbce7f2f(19);
                sb13.append(m75934xbce7f2f8 != null ? m75934xbce7f2f8.i() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", sb13.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] uxinfo            = " + a17.m75945x2fec8307(0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
                java.util.Iterator it = ((java.util.ArrayList) r26.p0.x0(encodeToString, 1024)).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] base64[" + i17 + "]=" + ((java.lang.String) next));
                    i17 = i18;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "================== [dumpAdsInfo] END ==================");
                str3 = encodeToString;
            }
        }
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 当前 posId 无 AdsInfo 缓存，请先调 ExposeAsync 拉取");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "✅ AdsInfo 已 dump 到 logcat（搜 [dumpAdsInfo]），base64 长度: " + str3.length());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
