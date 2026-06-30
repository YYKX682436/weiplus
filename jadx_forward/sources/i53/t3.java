package i53;

/* loaded from: classes12.dex */
public class t3 implements m33.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f370273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 f370274b;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 activityC15912x63e03585, android.view.View view) {
        this.f370274b = activityC15912x63e03585;
        this.f370273a = view;
    }

    public void a(java.lang.String str, int i17, int i18) {
        if (str != null && str.endsWith(".temp")) {
            java.lang.String replace = str.replace(".temp", "");
            com.p314xaae8f345.mm.vfs.w6.w(str, replace);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download videoPath:%s", replace);
            str = replace;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 activityC15912x63e03585 = this.f370274b;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(activityC15912x63e03585.f221606f, 87, 8760, 0, 48, activityC15912x63e03585.f221610m, activityC15912x63e03585.f221615r, lj0.a.a(activityC15912x63e03585.f221608h, activityC15912x63e03585.V6(0)));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i53.s3(this));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(activityC15912x63e03585.getIntent().getExtras());
            intent.putExtra("video_path", str);
            j45.l.n(activityC15912x63e03585.f221606f, "game", ".media.GameVideoEditorProxyUI", intent, 223);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(activityC15912x63e03585.f221606f, 87, 8760, 0, 56, activityC15912x63e03585.f221610m, activityC15912x63e03585.f221615r, lj0.a.a(activityC15912x63e03585.f221608h, activityC15912x63e03585.V6(i18)));
        int i19 = activityC15912x63e03585.f221608h;
        if (i19 == 3) {
            lt.r0 r0Var = (lt.r0) i95.n0.c(lt.r0.class);
            ((kt.s0) r0Var).Ai(activityC15912x63e03585.f221609i, "video download err:" + i18, activityC15912x63e03585.f221610m, -3, "video download err:" + i18);
        } else if (i19 == 5) {
            activityC15912x63e03585.setResult(-1, new android.content.Intent().putExtra("webview_callback_err", 2));
        }
        activityC15912x63e03585.finish();
    }
}
