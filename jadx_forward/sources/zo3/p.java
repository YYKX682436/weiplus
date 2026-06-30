package zo3;

@j95.b
/* loaded from: classes8.dex */
public class p extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e f556397d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l f556398e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y f556399f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z f556400g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0 f556401h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1 f556402i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f f556403m;

    public static java.lang.String Ai() {
        return gm0.j1.u().d() + "openapi/";
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f Bi() {
        gm0.j1.b().c();
        if (Zi().f556403m == null) {
            Zi().f556403m = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f();
        }
        return Zi().f556403m;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l Di() {
        gm0.j1.b().c();
        if (Zi().f556398e == null) {
            Zi().f556398e = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l();
        }
        return Zi().f556398e;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y Ni() {
        gm0.j1.b().c();
        if (Zi().f556399f == null) {
            Zi().f556399f = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y();
        }
        return Zi().f556399f;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri() {
        gm0.j1.b().c();
        if (Zi().f556400g == null) {
            Zi().f556400g = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z(gm0.j1.u().f354686f);
        }
        return Zi().f556400g;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1 Ui() {
        gm0.j1.b().c();
        if (Zi().f556402i == null) {
            Zi().f556402i = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1();
        }
        return Zi().f556402i;
    }

    public static java.lang.String Vi() {
        return gm0.j1.u().d() + "share_img_tmp/";
    }

    public static zo3.p Zi() {
        return (zo3.p) i95.n0.c(zo3.p.class);
    }

    public static void wi() {
        if (com.p314xaae8f345.mm.vfs.w6.j(Ai()) || com.p314xaae8f345.mm.vfs.w6.u(Ai())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XPinOpenApi", "checkAccOpenApiPath mkdirs failed");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y yVar = Zi().f556399f;
        if (yVar != null) {
            Bi().a(7, yVar);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l lVar = Zi().f556398e;
        if (lVar != null) {
            ((java.util.ArrayList) lVar.f270507b).clear();
            ((java.util.ArrayList) lVar.f270508c).clear();
            lVar.f270509d.clear();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1 c1Var = Zi().f556402i;
        if (c1Var != null) {
            c1Var.f270354d.clear();
            Bi().a(1, c1Var);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f fVar = this.f556403m;
        if (fVar != null) {
            fVar.getClass();
            gm0.j1.n().f354821b.q(452, fVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i(fVar));
        }
        if (Zi().f556400g != null) {
            ((lt0.f) Zi().f556400g.f270703d).mo143584x5a5b64d();
        }
        this.f556397d = null;
        this.f556400g = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XPinOpenApi", "onAccountRelease");
    }
}
