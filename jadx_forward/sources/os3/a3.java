package os3;

/* loaded from: classes8.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 f429566d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056) {
        this.f429566d = activityC16939x74e056;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056.f236441i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056 = this.f429566d;
        java.lang.String stringExtra = activityC16939x74e056.getIntent().getStringExtra("uri");
        java.lang.String[] stringArrayExtra = activityC16939x74e056.getIntent().getStringArrayExtra("params");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i18 = 0; i18 < stringArrayExtra.length; i18++) {
            int indexOf = stringArrayExtra[i18].indexOf("=");
            hashMap.put(stringArrayExtra[i18].substring(0, indexOf), stringArrayExtra[i18].substring(indexOf + 1));
        }
        activityC16939x74e056.f236443e = activityC16939x74e056.getIntent().getStringExtra("baseurl");
        java.lang.String stringExtra2 = activityC16939x74e056.getIntent().getStringExtra(ya.b.f77491x8758c4e1);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra2 == null) {
            stringExtra2 = "get";
        }
        if (stringExtra2.length() == 0 || stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQMail.WebViewUI", "doSend invalid argument.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("qqmail_httpoptions_expired", false);
        bundle.putBoolean("qqmail_httpoptions_needcache", true);
        bundle.putBoolean("qqmail_httpoptions_needparse", false);
        try {
            boolean equals = stringExtra2.equals("get");
            hs3.j jVar = activityC16939x74e056.f236445g;
            k55.k kVar = activityC16939x74e056.f236446h;
            if (equals) {
                ((java.lang.Long) new com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.p1972x3608ae.BinderC16929xaaa42de1(kVar, jVar).m142014x6c2fab7("get", stringExtra, hashMap, bundle)).longValue();
            } else {
                ((java.lang.Long) new com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.p1972x3608ae.BinderC16929xaaa42de1(kVar, jVar).m142014x6c2fab7("post", stringExtra, hashMap, bundle)).longValue();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QQMail.WebViewUI", "get/post, method = %s, ex = %s", stringExtra2, e17.getMessage());
        }
    }
}
