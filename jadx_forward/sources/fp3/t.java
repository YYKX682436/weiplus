package fp3;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd f346864d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd activityC16778x6ec76dfd) {
        this.f346864d = activityC16778x6ec76dfd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd activityC16778x6ec76dfd = this.f346864d;
        if (!activityC16778x6ec76dfd.f234389h) {
            activityC16778x6ec76dfd.f234386e.b();
        } else if (!activityC16778x6ec76dfd.f234393o) {
            activityC16778x6ec76dfd.f234386e.g();
            activityC16778x6ec76dfd.f234386e.setAdapter((android.widget.ListAdapter) activityC16778x6ec76dfd.f234387f);
            activityC16778x6ec76dfd.f234393o = true;
        }
        activityC16778x6ec76dfd.f234387f.notifyDataSetChanged();
    }
}
