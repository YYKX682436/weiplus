package r02;

/* loaded from: classes8.dex */
public class n implements r02.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449847a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5) {
        this.f449847a = activityC13242xdf6880d5;
    }

    public boolean a(android.view.View view, int i17) {
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadMainUI", "onOnItemButtonClick isTeenMode: %s", java.lang.Boolean.valueOf(a17));
        if (!a17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.b(this.f449847a);
        return true;
    }
}
