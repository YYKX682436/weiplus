package u94;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u94.k f507400d;

    public j(u94.k kVar) {
        this.f507400d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u94.k kVar = this.f507400d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3$1");
        try {
            u94.p pVar = kVar.f507405h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = pVar.f507417b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            if (u3Var == null) {
                android.content.Context context = kVar.f507404g;
                if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                    u94.p pVar2 = kVar.f507405h;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(kVar.f507404g, "", "加载中", true, true, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    pVar2.f507417b = Q;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfSubscribeController", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3$1");
    }
}
