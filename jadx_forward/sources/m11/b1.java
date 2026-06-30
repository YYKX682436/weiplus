package m11;

@j95.b
/* loaded from: classes12.dex */
public class b1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public m11.l0 f404192d;

    /* renamed from: e, reason: collision with root package name */
    public m11.g f404193e;

    /* renamed from: f, reason: collision with root package name */
    public m11.j f404194f = null;

    /* renamed from: g, reason: collision with root package name */
    public m11.l1 f404195g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f404196h = new m11.a1(this);

    /* renamed from: i, reason: collision with root package name */
    public n11.a f404197i = null;

    public static m11.b1 Ai() {
        return (m11.b1) i95.n0.c(m11.b1.class);
    }

    public static n11.a Bi() {
        gm0.j1.b().c();
        if (Ai().f404197i == null) {
            Ai().f404197i = n11.a.b();
        }
        return Ai().f404197i;
    }

    public static m11.l0 Di() {
        gm0.j1.b().c();
        if (Ai().f404192d == null) {
            Ai().f404192d = new m11.l0(gm0.j1.u().f354686f);
        }
        return Ai().f404192d;
    }

    public static m11.l1 Ni() {
        gm0.j1.b().c();
        if (Ai().f404195g == null) {
            Ai().f404195g = new m11.l1();
        }
        return Ai().f404195g;
    }

    public static m11.g wi() {
        gm0.j1.b().c();
        if (Ai().f404193e == null) {
            Ai().f404193e = new m11.g();
        }
        return Ai().f404193e;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        this.f404196h.m43071x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        this.f404196h.m43072x2efc64();
        m11.j jVar = this.f404194f;
        if (jVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "on detach");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "cancel all net scene");
            jVar.f404251h = true;
            jVar.f(jVar.f404249f);
            while (true) {
                java.util.List list = jVar.f404247d;
                if (list.size() <= 0) {
                    break;
                } else {
                    jVar.f((m11.h) list.get(0));
                }
            }
            jVar.f404251h = false;
            jVar.i(-1);
            gm0.j1.n().f354821b.q(109, jVar);
        }
        m11.l1 l1Var = this.f404195g;
        if (l1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "detach");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                ((java.util.LinkedList) l1Var.f404282a).clear();
                l1Var.f404284c = true;
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new m11.g1(l1Var));
            }
        }
        m11.l0 l0Var = Ai().f404192d;
        if (l0Var != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "clearCacheMap stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            ((lt0.f) l0Var.f404271e).mo143584x5a5b64d();
        }
        n11.a aVar = Ai().f404197i;
        if (aVar != null) {
            aVar.c();
        }
        ((java.util.HashMap) um.n.f510223a).put("local_cdn_img_cache", null);
        n11.a aVar2 = this.f404197i;
        if (aVar2 != null) {
            aVar2.c();
            this.f404197i = null;
        }
    }
}
