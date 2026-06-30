package f44;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f341078d;

    /* renamed from: e, reason: collision with root package name */
    public final f44.f f341079e;

    /* renamed from: f, reason: collision with root package name */
    public final n64.a f341080f;

    public c(f44.f fVar, java.lang.String str) {
        this.f341079e = fVar;
        this.f341078d = str;
        n64.a aVar = new n64.a();
        this.f341080f = aVar;
        aVar.e(new f44.b(this));
    }

    public final java.lang.String a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        }
        if (c17702x544f64e9.f244104b != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        }
        java.lang.String str = c17702x544f64e9.f244106c;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i17);
        boolean z17 = c17702x544f64e9.f244112f;
        if (m70347x10413e67 != null && !z17) {
            str = ca4.z0.b(str, m70347x10413e67.f38104xce64ddf1);
        }
        java.lang.String b17 = f44.a.b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        return b17;
    }

    public final void b(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDetectClickInfoUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        java.util.List b17 = this.f341080f.b(obj);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDetectClickInfoUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickInfoUrls, clickInfo.size=");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.size());
        sb6.append(", target=");
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5PrefetchTask", sb6.toString());
        try {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n64.f fVar = (n64.f) it.next();
                java.util.Objects.toString(fVar);
                if (fVar instanceof n64.c) {
                    java.lang.String a17 = a(i17, ((n64.c) fVar).c(), c17933xe8d1b226);
                    if (!android.text.TextUtils.isEmpty(a17) && !list.contains(a17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5PrefetchTask", "handleClickInfoUrls, addUrl=" + a17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 10);
                        list.add(a17);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineAdPreloader doDetectClickInfoUrls", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDetectClickInfoUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f44.c.run():void");
    }
}
