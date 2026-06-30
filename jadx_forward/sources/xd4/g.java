package xd4;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static volatile xd4.g f535173b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f535174a = new java.util.HashSet();

    public static xd4.g a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        if (f535173b == null) {
            synchronized (xd4.g.class) {
                try {
                    if (f535173b == null) {
                        f535173b = new xd4.g();
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
                    throw th6;
                }
            }
        }
        xd4.g gVar = f535173b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        return gVar;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayViewManager", "onUIPause");
        java.util.Iterator it = ((java.util.HashSet) this.f535174a).iterator();
        while (it.hasNext()) {
            ((xd4.d) it.next()).e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        java.util.Iterator it = ((java.util.HashSet) this.f535174a).iterator();
        while (it.hasNext()) {
            ((xd4.d) it.next()).mo69495x65825f6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    public void d(xd4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        java.util.Set set = this.f535174a;
        ((java.util.HashSet) set).add(dVar);
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            xd4.d dVar2 = (xd4.d) it.next();
            if (dVar2 != dVar) {
                dVar2.mo69495x65825f6();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }
}
