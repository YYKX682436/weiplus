package u94;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u94.o f507410e;

    public n(u94.o oVar, android.content.Context context) {
        this.f507410e = oVar;
        this.f507409d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f507409d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$3");
        try {
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                u94.o oVar = this.f507410e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = oVar.f507412e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                db5.t7.g(context, c17702x544f64e9.f244140t);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfSubscribeController", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$3");
    }
}
