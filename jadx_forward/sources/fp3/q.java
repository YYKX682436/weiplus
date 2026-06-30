package fp3;

/* loaded from: classes9.dex */
public class q implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd f346860d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd activityC16778x6ec76dfd) {
        this.f346860d = activityC16778x6ec76dfd;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd activityC16778x6ec76dfd = this.f346860d;
        if (i17 >= ((java.util.ArrayList) activityC16778x6ec76dfd.f234388g).size()) {
            return true;
        }
        db5.e1.e(activityC16778x6ec76dfd, activityC16778x6ec76dfd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kt9), null, activityC16778x6ec76dfd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), new fp3.p(this, i17));
        return true;
    }
}
