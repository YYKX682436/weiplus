package fp3;

/* loaded from: classes9.dex */
public class e implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d f346837a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d) {
        this.f346837a = activityC16776x1b9c0a0d;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d = this.f346837a;
        java.lang.String str = activityC16776x1b9c0a0d.f234364h.f234356e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("pay_channel", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC16776x1b9c0a0d, intent);
    }
}
