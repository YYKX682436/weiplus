package r02;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449870d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5) {
        this.f449870d = activityC13242xdf6880d5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449870d;
        if (!activityC13242xdf6880d5.f178912n) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13242xdf6880d5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jq6), null, activityC13242xdf6880d5, null, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = activityC13242xdf6880d5.f178905d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 n0Var = activityC13242xdf6880d5.f178910i;
        int indexOf = c13250xfa9a7928.f178951f2.f449857d.indexOf((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) ((java.util.HashMap) n0Var.f178840b).get(activityC13242xdf6880d5.f178911m));
        if (indexOf < 0 || indexOf >= activityC13242xdf6880d5.f178905d.m54727xfb854877()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadMainUI", "error position < 0");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a79282 = activityC13242xdf6880d5.f178905d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(indexOf));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c13250xfa9a79282, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$9", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c13250xfa9a79282.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c13250xfa9a79282, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$9", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
