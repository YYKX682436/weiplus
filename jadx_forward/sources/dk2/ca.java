package dk2;

/* loaded from: classes10.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314824a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f314825b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f314826c;

    public ca(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String downloadDir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadDir, "downloadDir");
        this.f314824a = downloadDir;
        this.f314825b = new java.util.LinkedHashMap();
    }

    public final void a(java.lang.String str) {
        java.util.Map map = this.f314825b;
        if (map.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "cancel download, id: " + str);
            dn.o oVar = (dn.o) ((java.util.LinkedHashMap) map).get(str);
            if (oVar != null) {
                oVar.f323348c2 = null;
            }
            map.remove(str);
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().g(str, new java.lang.Object[0]);
        }
    }

    public final void b(java.util.List list, int i17, int i18, java.util.List list2, dk2.t9 t9Var) {
        if (i17 >= i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: all done, downloadedCount=" + list2.size());
            this.f314826c = false;
            pm0.v.X(new dk2.w9(t9Var, list2));
            return;
        }
        dk2.rf rfVar = (dk2.rf) list.get(i17);
        java.lang.String str = rfVar.f315573e;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: url is null or empty at index " + i17);
            b(list, i17 + 1, i18, list2, t9Var);
            return;
        }
        java.lang.String str2 = rfVar.f315572d;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: micReplayId is null or empty at index " + i17);
            b(list, i17 + 1, i18, list2, t9Var);
            return;
        }
        java.lang.Long l17 = rfVar.f315579n;
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Long l18 = rfVar.f315580o;
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        java.lang.String str3 = str2 == null ? "" : str2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(longValue + '_' + longValue2 + '_' + str3) + '_' + currentTimeMillis;
        java.lang.String str5 = this.f314824a + '/' + str4 + ".mp4";
        java.lang.String str6 = str2 == null ? "" : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: start download " + i17 + '/' + i18 + ", fileName=" + str4);
        java.lang.String str7 = str6;
        dk2.y9 y9Var = new dk2.y9(i17, list2, this, list, i18, t9Var, str);
        dk2.z9 z9Var = new dk2.z9(i17, this, list, i18, list2, t9Var);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str5);
        java.lang.String str8 = a17.f294812f;
        if (str8 != null) {
            java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str8, false, false);
            if (!str8.equals(l19)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l19, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "downloadSingleVideo: file already exists, mediaId=".concat(str7));
            y9Var.mo146xb9724478(str5);
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str5));
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_FinderCdnDownloader";
        oVar.f69601xaca5bdda = str7;
        oVar.M1 = str;
        oVar.f69595x6d25b0d9 = str5;
        oVar.E1 = str4 + ".mp4";
        oVar.f69609xd84b8349 = 2;
        oVar.A = 60;
        oVar.B = 60;
        oVar.Y = 0;
        oVar.H1 = 0;
        oVar.Z = 8;
        oVar.f69592xf1ebe47b = 20302;
        oVar.f69610x4f5245a8 = 0;
        oVar.X = 0L;
        oVar.f323342y0 = 4;
        oVar.f323339x0 = 1;
        this.f314825b.put(str7, oVar);
        oVar.f323348c2 = new dk2.v9(this, str5, y9Var, z9Var);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        boolean e17 = t21.o2.Di().e(oVar, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "addDownloadTask: mediaId=" + str7 + ", result=" + e17);
        if (e17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", "addRecvTask failed for mediaId: ".concat(str7));
        a(str7);
        z9Var.mo146xb9724478("Failed to add download task");
    }
}
