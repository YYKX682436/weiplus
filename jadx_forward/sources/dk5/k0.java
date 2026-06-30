package dk5;

/* loaded from: classes.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f316229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f316230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f316231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f316233h;

    public k0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, boolean z17, java.lang.String str, int i17) {
        this.f316229d = u3Var;
        this.f316230e = activityC0065xcd7aa112;
        this.f316231f = z17;
        this.f316232g = str;
        this.f316233h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f316229d.dismiss();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f316230e;
        activityC0065xcd7aa112.finish();
        if (this.f316231f) {
            android.content.Intent intent = new android.content.Intent(activityC0065xcd7aa112, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent.addFlags(67108864);
            intent.putExtra("Chat_User", this.f316232g);
            intent.putExtra("scene_from", this.f316233h);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = this.f316230e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC0065xcd7aa1122, arrayList.toArray(), "com/tencent/mm/ui/transmit/ImgRetransmitLogic$Companion$processImageShareFromSystemGallery$1$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC0065xcd7aa1122.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC0065xcd7aa1122, "com/tencent/mm/ui/transmit/ImgRetransmitLogic$Companion$processImageShareFromSystemGallery$1$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
