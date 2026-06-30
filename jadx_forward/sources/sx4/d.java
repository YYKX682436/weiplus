package sx4;

/* loaded from: classes8.dex */
public class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19409x49ff443a f495113a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19409x49ff443a activityC19409x49ff443a) {
        this.f495113a = activityC19409x49ff443a;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19409x49ff443a activityC19409x49ff443a = this.f495113a;
        intent.putExtra("rawUrl", activityC19409x49ff443a.A3);
        activityC19409x49ff443a.setResult(activityC19409x49ff443a.C3, intent);
        activityC19409x49ff443a.finish();
    }
}
