package i53;

/* loaded from: classes12.dex */
public class r3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 f370240d;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 activityC15912x63e03585) {
        this.f370240d = activityC15912x63e03585;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 activityC15912x63e03585 = this.f370240d;
        int i18 = activityC15912x63e03585.f221608h;
        if (i18 == 3) {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(activityC15912x63e03585.f221609i, "video download cancel", activityC15912x63e03585.f221610m, -2, "video download cancel");
        } else if (i18 == 5) {
            activityC15912x63e03585.setResult(-1, new android.content.Intent().putExtra("webview_callback_err", 1));
        }
        activityC15912x63e03585.finish();
    }
}
